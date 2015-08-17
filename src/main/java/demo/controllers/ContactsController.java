package demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;
import java.util.Objects;

@Controller
@RequestMapping("/")
public class ContactsController {

    @RequestMapping(method=RequestMethod.GET)
    public String get(Map<String, Object> model){
        model.put("greeting", "Hello");
        return "home";
    }
}
