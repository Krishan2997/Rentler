package com.main.vehicle.Controller;

import com.main.vehicle.Model.Vehicle;
import com.main.vehicle.Service.IVehicleRegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    IVehicleRegistrationService vehicleRegistrationService;

    @RequestMapping(value = "addVehicle", method = RequestMethod.POST)
    public String addVehicle(@RequestBody Vehicle vehicle){
        try{
            vehicleRegistrationService.addVehicle(vehicle);
            return vehicle.toString() +"\nadded success";
        }
        catch (Exception e){
            return "Error in adding vehicle :"+e.getMessage();
        }
    }

    @RequestMapping(value = "getAllVehicles", method = RequestMethod.POST)
    public List<Vehicle> getAllVehicles(){
        try{
            return vehicleRegistrationService.getAllVehicles();
        }
        catch (Exception e){
            return null;
        }
    }

    @RequestMapping(value = "getVehicle", method = RequestMethod.GET)
    public Vehicle getVehicle(@RequestParam String id){
        try{
            return vehicleRegistrationService.getVehicleById(id);
        }
        catch (Exception e){
            return null;
        }
    }
}
