package com.ping.mapper;

import com.ping.mapper.entities.Employee;
import com.ping.mapper.service.EmployeeService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 测试通用mapper自定义接口
 */
public class MapperTest {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		EmployeeService employeeServiceImpl = (EmployeeService) applicationContext.getBean("employeeServiceImpl");
		List<Employee> employeeList = employeeServiceImpl.findAll();
		for (Employee employee:employeeList) {
			System.out.println(employee);
		}

	}
	
}
