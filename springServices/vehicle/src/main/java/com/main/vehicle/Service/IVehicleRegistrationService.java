package com.main.vehicle.Service;

import com.main.vehicle.Model.Vehicle;

import java.util.List;

public interface IVehicleRegistrationService {
    public boolean addVehicle(Vehicle vehicle);
    public List<Vehicle> getAllVehicles();
    public Vehicle getVehicleById(String id);
    public Vehicle getVehicleByName(String vehicleName);
}
