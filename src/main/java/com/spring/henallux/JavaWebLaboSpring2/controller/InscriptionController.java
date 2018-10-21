package com.spring.henallux.JavaWebLaboSpring2.controller;

import com.spring.henallux.JavaWebLaboSpring2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/inscription")
public class InscriptionController {

    @RequestMapping(method = RequestMethod.GET)
    public String inscription(Model model) {
        model.addAttribute("userForm", new User());
        return "integrated:userInscription";

    }

    @RequestMapping(value="/sendForm", method = RequestMethod.POST)
    public String getUser(Model model, @ModelAttribute(value = "userForm") User user) {

        String userTxt = "Nom : " + user.getName() + " </br>";
        userTxt += "Age : " + user.getAge() + " </br>";
        userTxt += "Genre : " + (user.getMale() ? "male" : "female") + " </br>";
        userTxt += "Hobby : " + user.getHobby() + " </br>";

        model.addAttribute("userMessage", userTxt);
        return "integrated:userInfo";



    }


}
