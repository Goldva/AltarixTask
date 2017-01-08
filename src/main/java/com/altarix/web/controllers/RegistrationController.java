package com.altarix.web.controllers;

import com.altarix.users.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.altarix.users.service.LoginService;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private LoginService loginService;
    @RequestMapping("/registration")
    public ModelAndView registrationPage(Map<String, Object> map){
        ModelAndView model = new ModelAndView();
        model.addObject("user", new User());
        model.setViewName("registrationView");

        return model;
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public ModelAndView registrationPage(@ModelAttribute("user") User user){
        loginService.addUser(user);
        ModelAndView model = new ModelAndView();
        model.setViewName("loginView");

        return model;
    }
}
