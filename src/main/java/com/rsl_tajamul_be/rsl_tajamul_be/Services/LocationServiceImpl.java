package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.Location;
import com.rsl_tajamul_be.rsl_tajamul_be.Entity.News;
import com.rsl_tajamul_be.rsl_tajamul_be.Repository.LocationRepository;

import java.util.ArrayList;
import java.util.Objects;

public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;
    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public ArrayList<Location> getLocation() {
        return (ArrayList<Location>) locationRepository.findAll();
    }

    @Override
    public Location getLocationById(Long locationId) {
        return locationRepository.findById(locationId).get();
    }

    @Override
    public void deleteLocation(Long locationId) {
        locationRepository.deleteById(locationId);
    }

    @Override
    public Location updateLocation(Long locationId, Location location) {
        Location updateLocation = locationRepository.findById(locationId).get();

        if (Objects.nonNull(location.getLocationName()) && !" ".equalsIgnoreCase(location.getLocationName())) {
            updateLocation.setLocationName(location.getLocationName());

        }
        return locationRepository.save(updateLocation);
    }


}
