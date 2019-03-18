package AnnotaionBased;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAnnotationController {
    @RequestMapping("/")
    ModelAndView index(){
        System.out.println("Student");
        ModelAndView modelAndView =new ModelAndView("index");
        return modelAndView;
    }
}