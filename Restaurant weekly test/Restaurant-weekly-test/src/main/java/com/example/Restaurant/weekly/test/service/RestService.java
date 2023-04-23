package com.example.Restaurant.weekly.test.service;

import com.example.Restaurant.weekly.test.model.Rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class RestService {
    private static int RestCount=0;
    private static ArrayList<Rest>list=new ArrayList<>();
    static{
        list.add(new Rest(++RestCount,"Barawachi","Ranchi","98765432","Dosa",12));

        list.add(new Rest(++RestCount,"Raj","Delhi","98765432","Dosa",12));
        list.add(new Rest(++RestCount,"Shyamlal","Patna","98765432","Dosa",12));
    }

    public void addRest(Rest rest) {
        list.add(rest);
    }

    public ArrayList<Rest> getAll() {
        return list;
    }

    public Rest getById(int id) {

            // java logic
            Predicate<? super Rest> predicate= rest -> rest.getId()==id;   // business logic
            Rest rest=list.stream().filter(predicate).findFirst().get();
            return rest;
        }

    public void deleteRest(int id) {

            Predicate<? super Rest> predicate=rest -> rest.getId()==id;
            list.removeIf(predicate);
        }


    public void updateRest(int id, Rest newRest) {
Rest rest=getById(id);
rest.setId(newRest.getId());
rest.setName(newRest.getName());
rest.setAddress(newRest.getAddress());
rest.setSpeciality(newRest.getSpeciality());
rest.setTotal_staff(newRest.getTotal_staff());



    }
}


