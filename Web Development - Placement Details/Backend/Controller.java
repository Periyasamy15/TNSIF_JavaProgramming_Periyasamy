package com.example.placement.controller;

import com.example.placement.Placement;
import com.example.placement.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/placements")

public class PlacementController {

	
	 @Autowired
	    private PlacementService placementService;

	    @PostMapping
	    public Placement savePlacement(@RequestBody Placement placement) {
	        return placementService.savePlacement(placement);
	    }

	    @GetMapping("/{id}")
	    public Placement getPlacementById(@PathVariable Long id) {
	        return placementService.getPlacementById(id);
	    }

	    @GetMapping
	    public List<Placement> getAllPlacements() {
	        return placementService.getAllPlacements();
	    }

	    @PutMapping("/{id}")
	    public Placement updatePlacement(@PathVariable Long id, @RequestBody Placement updated) {
	        return placementService.updatePlacement(id, updated);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePlacement(@PathVariable Long id) {
	        placementService.deletePlacement(id);
	    }
	}

