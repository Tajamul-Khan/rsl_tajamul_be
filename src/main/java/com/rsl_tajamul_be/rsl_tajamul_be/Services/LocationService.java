package com.rsl_tajamul_be.rsl_tajamul_be.Services;

import com.rsl_tajamul_be.rsl_tajamul_be.Entity.Location;

import java.util.ArrayList;

public interface LocationService {
    Location saveLocation(Location location);

    ArrayList<Location> getLocation();

    Location getLocationById(Long locationId);

    void deleteLocation(Long locationId);

    Location updateLocation(Long locationId, Location location);
}
