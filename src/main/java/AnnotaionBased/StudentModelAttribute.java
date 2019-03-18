package AnnotaionBased;

import Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
// Question 10  Use @ModelAttribute annotation to add Heading "Spring MVC Demo" in every model.
@Controller
@RequestMapping("/studentModel")
public class StudentModelAttribute {
    @ModelAttribute
    void addingModel(Model model) {
        model.addAttribute("input", "this is student details");
    }

    @RequestMapping(value = "/submitform.html", method = RequestMethod.GET)
    ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("submitform");
        return modelAndView;
    }
    @RequestMapping(value = "/student.html", method = RequestMethod.POST)
    ModelAndView submitForm(@ModelAttribute("user") User user) {
        ModelAndView modelAndView = new ModelAndView("submittedData");
        return modelAndView;
    }
}