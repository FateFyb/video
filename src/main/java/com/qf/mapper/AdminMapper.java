package com.qf.mapper;

import com.qf.pojo.Admin;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AdminMapper {

    Admin select(Admin admin);

}