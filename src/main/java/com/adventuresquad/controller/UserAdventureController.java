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
import com.adventuresquad.model.UserAdventure;
import com.adventuresquad.service.AdventureService;
import com.adventuresquad.service.LocationService;
import com.adventuresquad.service.UserAdventureService;



@RestController
@RequestMapping("/adventure_squad/user_adventure")
public class UserAdventureController {
  
  private UserAdventureService userAdventureService;
  @Autowired
  public UserAdventureController(UserAdventureService userAdventureService) {
    super();
    this.userAdventureService=userAdventureService;
  }

  @GetMapping
  public List<UserAdventure> getAllUserAdventures(){
      return userAdventureService.getAllUserAdventures();
  }
  

  
}
