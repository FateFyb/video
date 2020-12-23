package com.qf.controller;

import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName SubjectController
 * @Description:
 * @Author: WanAn
 * @Date 2020/12/23 16:20
 * @Version: 1.0
 */
@Controller
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("selectAll")
    public String findAll(HttpServletRequest request) {
        ServletContext servletContext = request.getSession().getServletContext();
        List<Subject> subjectList=subjectService.findAll();
        servletContext.setAttribute("subjectList",subjectList);
        return "before/index";
    }
}
