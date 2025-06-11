package com.abhi_prep.services;

import com.abhi_prep.entities.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
public interface VehiclesService {
    List<Vehicle> fetchVehicles(boolean availability);
    Vehicle saveVehicleDetails(Vehicle vehicle);

    void deleteVehicle(Long id);
}
