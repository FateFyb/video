package com.qf.service;

import com.qf.pojo.Course;

import java.util.List;

/**
 * @ClassName CourseService
 * @Description:
 * @Author: WanAn
 * @Date 2020/12/23 17:54
 * @Version: 1.0
 */
public interface CourseService {
    List<Course> findAll();
}
