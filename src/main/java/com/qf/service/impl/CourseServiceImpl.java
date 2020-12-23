package com.qf.service.impl;

import com.qf.mapper.CourseMapper;
import com.qf.pojo.Course;
import com.qf.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName CourseServiceImpl
 * @Description:
 * @Author: WanAn
 * @Date 2020/12/23 17:55
 * @Version: 1.0
 */

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> findAll() {
        return courseMapper.findAll();
    }
}
