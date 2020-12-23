package com.qf.service.impl;

import com.qf.mapper.SubjectMapper;
import com.qf.pojo.Subject;
import com.qf.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName SubjectServiceImpl
 * @Description:
 * @Author: WanAn
 * @Date 2020/12/23 15:50
 * @Version: 1.0
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;
    @Override
    public List<Subject> findAll() {
        return subjectMapper.selectByExample(null);
    }
}
