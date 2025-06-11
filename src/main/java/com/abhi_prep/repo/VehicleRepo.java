package com.abhi_prep.repo;

import com.abhi_prep.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Long> {

    List<Vehicle> findAllByAvailability(boolean availability);

    void deleteById(Long id);
}
