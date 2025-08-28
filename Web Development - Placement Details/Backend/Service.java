package com.example.placement.service;

import com.example.placement.Placement;
import java.util.List;


public interface PlacementService {
	
	Placement savePlacement(Placement placement);
    Placement getPlacementById(Long id);
    List<Placement> getAllPlacements();
    Placement updatePlacement(Long id, Placement updated);
    void deletePlacement(Long id);

}
