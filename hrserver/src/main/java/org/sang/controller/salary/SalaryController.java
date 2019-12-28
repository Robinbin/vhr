package org.sang.controller.salary;

import org.sang.bean.RespBean;
import org.sang.bean.Salary;
import org.sang.common.RespBeanUtils;
import org.sang.service.EmpService;
import org.sang.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 工资账套配置
 */
@RestController
@RequestMapping("/salary/sob")
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @Autowired
    EmpService empService;

    @RequestMapping(value = "/salary", method = RequestMethod.POST)
    public RespBean addSalaryCfg(Salary salary) {
        if (salaryService.addSalary(salary) == 1) {
            return RespBeanUtils.ADD_SUCCESS;
        }
        return RespBeanUtils.ADD_ERROR;
    }

    @RequestMapping(value = "/salary", method = RequestMethod.GET)
    public List<Salary> salaries() {
        return salaryService.getAllSalary();
    }

    @RequestMapping(value = "/salary", method = RequestMethod.PUT)
    public RespBean updateSalary(Salary salary) {
        if (salaryService.updateSalary(salary) == 1) {
            return RespBeanUtils.UPDATE_SUCCESS;
        }
        return RespBeanUtils.UPDATE_ERROR;
    }

    @RequestMapping(value = "/salary/{ids}", method = RequestMethod.DELETE)
    public RespBean deleteSalary(@PathVariable String ids) {
        if (salaryService.deleteSalary(ids) == 1) {
            return RespBeanUtils.DELETE_SUCCESS;
        }
        return RespBeanUtils.DELETE_ERROR;
    }

}
