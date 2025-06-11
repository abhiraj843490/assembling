package com.abhi_prep.controller;

import com.abhi_prep.entities.Vehicle;
import com.abhi_prep.services.VehiclesService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
@RequestMapping("/vehicle")
@Slf4j
public class VehiclesController {

    private final VehiclesService vehiclesService;

    @GetMapping
    public List<Vehicle> fetchVehicles(@RequestParam boolean availability) {
        log.info("availability {}",availability);
        return ResponseEntity.ok(vehiclesService.fetchVehicles(availability)).getBody();
    }

    @PostMapping
    public Vehicle saveVehiclesDetails(@RequestBody Vehicle vehicle) {
        log.info("vehicle {}",vehicle.getBrandName());
        return ResponseEntity.ok(vehiclesService.saveVehicleDetails(vehicle)).getBody();
    }

    @DeleteMapping("/{id}")
    @CrossOrigin
    public ResponseEntity<?> deleteVehicle(@PathVariable Long id) {
        log.info("vehicle id {}",id);
        vehiclesService.deleteVehicle(id);
        return ResponseEntity.ok().body("Vehicle deleted successfully");
    }
}