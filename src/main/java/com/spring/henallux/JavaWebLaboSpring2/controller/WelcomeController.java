package com.spring.henallux.JavaWebLaboSpring2.controller;

import com.spring.henallux.JavaWebLaboSpring2.model.MagicKeyForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/hello")
public class WelcomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String home (Model model) {
        model.addAttribute("magicKeyForm", new MagicKeyForm());
        return "integrated:welcome";
    }

    @RequestMapping(value="/send", method = RequestMethod.POST)
    public String getFormData(Model model, @ModelAttribute(value = "magicKeyForm") MagicKeyForm form) {
        if (form.getMagicKey().equals("MaMaMagic")) {
            String welcomeMessage = "Welcome " + form.getMagicKey() + " !</br>";
            model.addAttribute("message", welcomeMessage);

            return "redirect:/inscription";
        }
        else {
            return "integrated:keyError";
        }

    }
}
