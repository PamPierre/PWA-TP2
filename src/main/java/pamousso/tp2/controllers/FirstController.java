package pamousso.tp2.controllers;


import javax.lang.model.element.Name;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

//* Q9
@Controller
public class FirstController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    //@ResponseBody
    public String getHome(Model model)
    {
        model.addAttribute("hi", "helowwww");
        return "simple";

    }
    
}
