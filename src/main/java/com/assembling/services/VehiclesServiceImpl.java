package com.assembling.services;

import com.assembling.entities.Vehicle;
import com.assembling.repo.VehicleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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
