package com.example.Restaurant.weekly.test.controller;

import com.example.Restaurant.weekly.test.model.Rest;
import com.example.Restaurant.weekly.test.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestuController {
    @Autowired
    RestService restService;
    @PostMapping(value="/addRest")
    public void addRes(@RequestBody Rest rest){
   restService.addRest(rest);

    }
    @GetMapping(value="/getRest")
public List<Rest>findAll(){
       return restService.getAll();

    }
    @GetMapping(value="/findById/{id}")
    public Rest rest(@PathVariable int id){
        return restService.getById(id);
    }
    @DeleteMapping(value="delete/{id}")
    public void deleteRest(@PathVariable int id){
restService.deleteRest(id);
    }
    @PutMapping(value="/update/{id}")
    public void updateRest(@PathVariable int id, @RequestBody Rest rest){
restService.updateRest(id,rest);
    }

}
