package com.adventuresquad.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.adventuresquad.model.Adventure;
import com.adventuresquad.model.Location;
import com.adventuresquad.service.AdventureService;
import com.adventuresquad.service.LocationService;



@RestController
@RequestMapping("/adventure_squad/location")
public class LocationController {
  
  private LocationService locationService;
  @Autowired
  public LocationController(LocationService locationService) {
    super();
    this.locationService=locationService;
  }

  @GetMapping
  public List<Location> getAllAdventures(){
      return locationService.getAllLocations();
  }
  
  @PostMapping
  public ResponseEntity<Location> saveLocation(@RequestBody Location location){
      return new ResponseEntity<Location>(locationService.saveLocation(location), HttpStatus.CREATED);
  }
  

  

  
}
