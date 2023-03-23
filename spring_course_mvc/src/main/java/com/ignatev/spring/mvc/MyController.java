package com.ignatev.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {

        Employee employee = new Employee();
        employee.setName("Kostya");
        employee.setSurname("Ignatev");
        employee.setSalary(800);

        model.addAttribute("employee", employee);

        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showEmpDetails(
            @Valid @ModelAttribute("employee") Employee employee,
            BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        }

        employee.setName("Mr. " + employee.getName());

        return "show-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(
//            @RequestParam("employeeName") String empName,
//            @RequestParam("employeeSurname") String empSurname,
//            @RequestParam("employeeSalary") String empSalary,
//            Model model) {
//
//        model.addAttribute("name", "Mr. " + empName);
//        model.addAttribute("surname", empSurname);
//        model.addAttribute("salary", empSalary);
//        model.addAttribute("description", "human");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(
//            @RequestParam("employeeName") String empName,
//            Model model) {
//
//        model.addAttribute("name", "Mr. " + empName);
//        model.addAttribute("description", "human");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//
//        String empName = "Mr. " + request.getParameter("employeeName");
//        model.addAttribute("name", empName);
//        model.addAttribute("description", "human");
//
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }
}
