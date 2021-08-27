
package com.sartvas.spring.mvc;

import java.net.http.HttpRequest;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
    
    @RequestMapping("/")
    public String showFirsView(){
        return "first-view";
    }
    @RequestMapping("askdetails")
    public String askDetails(){
        return "askdetails";
    }
    
//    @RequestMapping("showdetails")
//    public String showAskDetails(){
//        return "showdetails";
//    }
    
//    @RequestMapping("/showdetails")
//    public String showAskDetails(HttpServletRequest request, Model model){
//        String empName = request.getParameter("empoyeeName");
//        empName = "Mr. " + empName;
//        model.addAttribute("nameAtribute", empName);
//        return "showdetails";
//    }
    
        @RequestMapping("/showdetails")
    public String showAskDetails(@RequestParam("empoyeeName") String empName, Model model){
        empName = "Mr. " + empName;
        model.addAttribute("nameAtribute", empName);
        return "showdetails";
    }

}
