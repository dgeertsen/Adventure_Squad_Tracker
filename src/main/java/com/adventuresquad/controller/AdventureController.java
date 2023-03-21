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
import com.adventuresquad.model.User;
import com.adventuresquad.service.AdventureService;



@RestController
@RequestMapping("/adventure_squad/adventure")
public class AdventureController {
  
  private AdventureService adventureService;
  @Autowired
  public AdventureController(AdventureService adventureService) {
    super();
    this.adventureService=adventureService;
  }

  @GetMapping
  public List<Adventure> getAllAdventures(){
      return adventureService.getAllAdventures();
  }
  
  @PostMapping
  public ResponseEntity<Adventure> saveAdventure(@RequestBody Adventure adventure){
      return new ResponseEntity<Adventure>(adventureService.saveAdventure(adventure), HttpStatus.CREATED);
  }
  
  @PutMapping("{adventure_id}")
  public ResponseEntity<Adventure> updateAdventure(@PathVariable("adventure_id") int adventureId, @RequestBody Adventure adventure){
   
    return new ResponseEntity<Adventure>(adventureService.updateAdventure(adventure, adventureId), HttpStatus.OK);
  }
  

  
}
