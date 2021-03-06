package com.qf.service.Impl;

import com.qf.mapper.AdminMapper;
import com.qf.pojo.Admin;
import com.qf.pojo.User;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin select(Admin admin) {
        return adminMapper.select(admin);
    }
}
