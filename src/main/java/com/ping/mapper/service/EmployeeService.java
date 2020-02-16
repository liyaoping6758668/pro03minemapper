package com.ping.mapper.service;

import com.ping.mapper.entities.Employee;
import org.apache.ibatis.session.RowBounds;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author:lyp
 * @date 2020/2/14-20:53
 */
public interface EmployeeService {
    List<Employee> findAll();
}
