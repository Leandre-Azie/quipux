package com.quipux.vehicule.controller;

import com.quipux.vehicule.service.VehiculeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiculeController {
    @Autowired
    VehiculeService vehiculeService;

    @GetMapping(value = "/vehicules")
    public String getVehicules() {
        return vehiculeService.getVehicules();
    }
}
