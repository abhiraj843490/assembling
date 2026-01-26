package com.assembling.services;

import com.assembling.entities.Vehicle;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface VehiclesService {
    List<Vehicle> fetchVehicles(boolean availability);
    Vehicle saveVehicleDetails(Vehicle vehicle);

    void deleteVehicle(Long id);
}
