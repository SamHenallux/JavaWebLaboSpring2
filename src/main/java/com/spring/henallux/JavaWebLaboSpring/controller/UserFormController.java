package com.spring.henallux.JavaWebLaboSpring.controller;


import com.spring.henallux.JavaWebLaboSpring.model.MagicKeyForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/form")
public class UserFormController {

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model) {
        model.addAttribute("userForm", new MagicKeyForm());
        return "integrated:formulaire";
    }

    @RequestMapping(value="/userInscription", method = RequestMethod.POST)
    public String getFormData(Model model, @ModelAttribute(value = "userForm") MagicKeyForm inscriptionForm) {
        String welcomeMessage = "Welcome " + inscriptionForm.getMagicKey() + " !</br>";
        welcomeMessage += "Votre code postal est le " + inscriptionForm.getZipCode();

        model.addAttribute("message", welcomeMessage);
        return "integrated:userInscription";
    }

}
