package com.tfry.spring;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml"})
								 
public class EmployeeTest {
	
	@Autowired
    ApplicationContext ctx;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before : start");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After: Down");
	}

	@Test
	public void testGetName() {
		Employee employee =(Employee) ctx.getBean("employee");
        assertEquals("zhangsan",employee.getName());
        System.out.println(employee.getName());
	}
	
	@Test
	public void testGetAge() {
		Employee employee =(Employee) ctx.getBean("employee");
		assertEquals("20",employee.getAge());
	    System.out.println(employee.getAge());
	}
}
