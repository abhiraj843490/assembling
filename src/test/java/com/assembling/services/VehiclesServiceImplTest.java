package com.assembling.services;

import com.assembling.entities.Vehicle;
import com.assembling.repo.VehicleRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class VehiclesServiceImplTest {
    @InjectMocks
    private VehiclesServiceImpl vehiclesServiceImpl;
    @Mock
    private VehicleRepo vehicleRepo;
    private Vehicle testVehicle;
    @BeforeEach
    public void setUp() {
        testVehicle = new Vehicle(1L, "Mahindra Thar", true);
    }

    @Test
    public void fetchVehicles_whenAvailable_returnsVehicleList() {
        boolean availability = true;
        List<Vehicle> mockVehicles = List.of(testVehicle);
        when(vehicleRepo.findAllByAvailability(availability)).thenReturn(mockVehicles);
        List<Vehicle> result = vehiclesServiceImpl.fetchVehicles(availability);
        Assertions.assertNotNull(result);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("Mahindra Thar", result.get(0).getBrandName());
        Assertions.assertTrue(result.get(0).isAvailability());
        verify(vehicleRepo, times(1)).findAllByAvailability(availability);
    }

    @Test
    public void saveVehicleDetailsTest(){
        when(vehicleRepo.save(testVehicle)).thenReturn(testVehicle);
        Vehicle res = vehiclesServiceImpl.saveVehicleDetails(testVehicle);
        Assertions.assertNotNull(res);
    }

    @Test
    public void deleteVehicleTest(){
        vehiclesServiceImpl.deleteVehicle(1L);
        verify(vehicleRepo, times(1)).deleteById(1L);
    }


}