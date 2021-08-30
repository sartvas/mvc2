
package com.sartvas.spring.mvc;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
    public String showAskDetails(@Valid @ModelAttribute("employee") Employee emp
            , BindingResult bindingResult){
        
        if(bindingResult.hasErrors()){
            return "askdetails";
        }
        else {
        return "showdetails";
        }
        
    }
    
    //RequestMapping

}
