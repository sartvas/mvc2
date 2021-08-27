
package com.sartvas.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    
    @RequestMapping("/")
    public String showFirsView(){
        return "first-view";
    }
    @RequestMapping("askdetails")
    public String askDetails(Model model){
        
       model.addAttribute("employee", new Employee());
       
        return "askdetails";
    }
    
    @RequestMapping("/showdetails")
    public String showAskDetails(@ModelAttribute("employee") Employee emp){
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAtribute", empName);
        return "showdetails";
    }
    
    //RequestMapping

}
