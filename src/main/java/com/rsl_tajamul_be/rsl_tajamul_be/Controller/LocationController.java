package com.rsl_tajamul_be.rsl_tajamul_be.Controller;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.Location;
import com.rsl_tajamul_be.rsl_tajamul_be.Services.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/saveLocation")
    public Location saveLocation(@RequestBody Location location){
        return locationService.saveLocation(location);
    }
    @GetMapping("/getLocation")
    public ArrayList<Location> getLocation(){
        return locationService.getLocation();
    }

    @GetMapping("/getLocation/{id}")
    public Location getLocationById(@PathVariable("id")Long locationId){
        return locationService.getLocationById(locationId);
    }
    @DeleteMapping("/deleteLocation/{id}")
    public String deleteLocation(@PathVariable("id")Long locationId){
        locationService.deleteLocation(locationId);
        return "locationDeleted";
    }
    @PutMapping("/updateLocation/{id}")
    public Location updateLocation(@PathVariable("id")Long locationId,@RequestBody Location location){
        return locationService.updateLocation(locationId, location);
    }







}
