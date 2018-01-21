package com.netflixOss.study.rest;

import com.netflixOss.study.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public Employee getFakeEmployee() {
        Employee emp = new Employee();
        emp.setName("Henrique");
        emp.setDesignation("developer");
        emp.setEmpId("1");
        emp.setSalary(8000);

        return emp;
    }
}
