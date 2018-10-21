package com.spring.henallux.JavaWebLaboSpring2.controller;

import com.spring.henallux.JavaWebLaboSpring2.model.User;
import com.spring.henallux.JavaWebLaboSpring2.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/inscription")
public class InscriptionController {

    private HobbiesService hobbiesService;

    @Autowired
    public InscriptionController(HobbiesService hobbiesService) {
        this.hobbiesService = hobbiesService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String inscription(Model model) {
        model.addAttribute("userForm", new User());
        model.addAttribute("hobbies", hobbiesService.getHobbies());
        return "integrated:userInscription";

    }

    @RequestMapping(value="/sendForm", method = RequestMethod.POST)
    public String getUser(Model model, @Valid @ModelAttribute(value = "userForm") User user, final BindingResult errors) {

        if(!errors.hasErrors())
        {
            System.out.println(user.getName());
            String userTxt = "Nom : " + user.getName() + " </br>";
            userTxt += "Age : " + user.getAge() + " </br>";
            userTxt += "Genre : " + (user.getMale() ? "male" : "female") + " </br>";
            userTxt += "Hobby : " + user.getHobby() + " </br>";

            model.addAttribute("userMessage", userTxt);
            return "integrated:userInfo";
        }
        else {
            return "redirect:/inscription";
        }




    }


}
