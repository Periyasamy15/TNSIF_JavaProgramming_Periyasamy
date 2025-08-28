package com.example.placement.service;

import com.example.placement.Placement;
import com.example.placement.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PlacementServiceImpl implements PlacementService {

	
	 @Autowired
	    private PlacementRepository placementRepository;

	    public Placement savePlacement(Placement placement) {
	        return placementRepository.save(placement);
	    }

	    public Placement getPlacementById(Long id) {
	        return placementRepository.findById(id).orElse(null);
	    }

	    public List<Placement> getAllPlacements() {
	        return placementRepository.findAll();
	    }

	    public Placement updatePlacement(Long id, Placement updated) {
	        Optional<Placement> optional = placementRepository.findById(id);
	        if (optional.isPresent()) {
	            Placement placement = optional.get();
	            placement.setCompanyName(updated.getCompanyName());
	            placement.setRole(updated.getRole());
	            placement.setDate(updated.getDate());
                placement.setlocation(updated.getlocation());
	            return placementRepository.save(placement);
	        }
	        return null;
	    }

	    public void deletePlacement(Long id) {
	        placementRepository.deleteById(id);
	    }
	}

                
