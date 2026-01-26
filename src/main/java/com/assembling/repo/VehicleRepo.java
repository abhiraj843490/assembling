package com.assembling.repo;

import com.assembling.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findAllByAvailability(boolean availability);

    void deleteById(Long id);
}
