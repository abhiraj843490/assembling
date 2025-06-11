package com.abhi_prep.services;

import com.abhi_prep.entities.Vehicle;
import com.abhi_prep.repo.VehicleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class VehiclesServiceImpl implements VehiclesService {

    private final VehicleRepo vehicleRepo;
    @Override
    public List<Vehicle> fetchVehicles(boolean availability) {
        return vehicleRepo.findAllByAvailability(availability);
    }

    @Override
    public Vehicle saveVehicleDetails(Vehicle vehicle){
        return vehicleRepo.save(vehicle);
    }

    @Override
    public void deleteVehicle(Long id){
        vehicleRepo.deleteById(id);
    }
}
