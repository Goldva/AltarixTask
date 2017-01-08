package com.altarix.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.altarix.users.service.FriendService;
import com.altarix.users.service.MessageService;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.Collection;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private FriendService friendService;

//    @RequestMapping(value = {"/", "/index"})
//    public ModelAndView indexPage(Map<String, Object> map){
//        ModelAndView model = new ModelAndView();
//        model.addObject("messages", messageService.getMessages());
//        model.addObject("friends", friendService.getAllFriends());
//
//        model.setViewName("index");
//
//        return model;
//
////        map.put("messages", messageService.getMessages());
////        map.put("friends", friendService.getAllFriends());
////        return "index";
//    }

    @RequestMapping(value = {"/", "/index"})
    public ModelAndView profile() throws IOException {
        ModelAndView model = new ModelAndView();
        model.addObject("messages", messageService.getMessages());
        model.addObject("friends", friendService.getAllFriends());
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        Collection collection = authentication.getAuthorities();
        if (collection.contains("Role_ADMIN")) {
            model.addObject("admin", "true");
        }
        model.setViewName("index");

        return model;
    }

}
