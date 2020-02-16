package com.ping.mapper.service.impl;

import com.ping.mapper.entities.Employee;
import com.ping.mapper.mappers.EmployeeMapper;
import com.ping.mapper.service.EmployeeService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author:lyp
 * @date 2020/2/14-20:54
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    @Override
    public List<Employee> findAll() {
        List<Employee> employees = employeeMapper.selectAll();
        return employees;
    }
}
