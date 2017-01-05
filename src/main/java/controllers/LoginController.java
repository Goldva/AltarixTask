package controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.MessageService;

@Controller
public class LoginController {
    @Autowired
    private MessageService messageService;

    @RequestMapping("/login")
    public String loginPage(){
        return "loginView";
    }
}
