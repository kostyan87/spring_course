package com.ignatev.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/")
    public String getInfoForAllEmployees() {
        return "view_for_all_employees";
    }

    @GetMapping("/hr_info")
    public String getInfoForHr() {
        return "view_for_hr";
    }

    @GetMapping("/manager_info")
    public String getInfoForManagers() {
        return "view_for_managers";
    }
}
