package com.adventuresquad.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adventuresquad.exception.AdventureException;
import com.adventuresquad.model.Adventure;
import com.adventuresquad.model.Location;
import com.adventuresquad.repository.AdventureRepository;
import com.adventuresquad.repository.LocationRepository;


@Service
public class LocationServiceImplemented implements LocationService {
  private LocationRepository locationRepository;
  
  @Autowired
  public LocationServiceImplemented(LocationRepository locationRepository)
  {
    this.locationRepository=locationRepository;
  }
  
  //Get All Locations
  @Override
  public List<Location> getAllLocations() {
    return locationRepository.findAll();
    
  }

  //Create a new location
  @Override
  public Location saveLocation(Location location) {
    return  locationRepository.save(location);
    
  }

  
}
