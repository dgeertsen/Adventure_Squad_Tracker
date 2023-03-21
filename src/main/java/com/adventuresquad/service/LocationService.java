package com.adventuresquad.service;

import java.util.List;
import com.adventuresquad.model.Location;


public interface LocationService {
  //Our CRUD Methods
  
  //Get all locations READ
  List<Location> getAllLocations();
  
  //Post a location, CREATE
  public Location saveLocation(Location location);
  

  

}
