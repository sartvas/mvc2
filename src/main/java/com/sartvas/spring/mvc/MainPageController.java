
package com.sartvas.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPageController {
    
    @RequestMapping("/")
    public String mainPageShowView(){
        
       return "mainpage";
    }
    
}
