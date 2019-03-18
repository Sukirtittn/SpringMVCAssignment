package XmlBasedControllers;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("Sukirti");
        //the index passed as view name in model and view is a jsp file
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
        //the name of view should be same as view name, jsp file and bean file
    }
}