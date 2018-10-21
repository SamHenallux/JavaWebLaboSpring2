package com.spring.henallux.JavaWebLaboSpring2.service;

import com.spring.henallux.JavaWebLaboSpring2.model.Hobby;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HobbiesService {
    private ArrayList<Hobby> hobbies = new ArrayList<>();

    public HobbiesService() {
        hobbies.add(new Hobby(1, "Skate"));
        hobbies.add(new Hobby(2, "Break"));
        hobbies.add(new Hobby(3, "Jambé"));
        hobbies.add(new Hobby(4, "Trotinnette"));



    }

    public ArrayList<Hobby> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
}
