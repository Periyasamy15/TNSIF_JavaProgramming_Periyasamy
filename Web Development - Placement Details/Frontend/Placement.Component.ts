import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { PlacementService } from './placement.service';
export interface Placement {
  id: number;
  companyName: string;
  role: string;
  location: string;
  date: string;
  packageOffered: string;
}
@Component({
  selector: 'app-placement-root',
  templateUrl: './placement.component.html',
  styleUrls: ['./placement.component.scss']
})
export class PlacementComponent implements OnInit {
  title = 'Placement Details';

  constructor(private placementService: PlacementService) {}

  placementDetails: any[] = [];
  placementToUpdate = {
    id: null,
    companyName: '',
    role: '',
    location: '',
    date: '',
    packageOffered: ''
  };

  ngOnInit(): void {
    this.getPlacementDetails();
  }

  // Register new placement
  register(registerForm: NgForm): void {
    this.placementService.registerPlacement(registerForm.value).subscribe(
      (response: any) => {
        console.log('Placement registered:', response);
        registerForm.reset();
        this.getPlacementDetails();
      },
      (error: any) => {
        console.error('Error registering placement:', error);
      }
    );
  }

  // Get all placements
  getPlacementDetails(): void {
    this.placementService.getAllPlacements().subscribe(
      (response: any) => {
        console.log('Fetched placement details:', response);
        if (Array.isArray(response)) {
          this.placementDetails = response.map(placement => ({
            ...placement,
            id: placement.id || placement.placementId
          }));
        } else {
          console.error('Unexpected response structure:', response);
        }
      },
      (error: any) => {
        console.error('Error fetching placement details:', error);
      }
    );
  }

  // Delete a placement
  deletePlacement(placement: any): void {
    if (!placement.id) {
      console.error('Placement ID is undefined. Cannot delete placement.');
      return;
    }
    console.log('Deleting placement with ID:', placement.id);
    this.placementService.deletePlacement(placement.id).subscribe(
      (response: any) => {
        console.log('Placement deleted:', response);
        this.getPlacementDetails();
      },
      (error: any) => {
        console.error('Error deleting placement:', error);
      }
    );
  }

  // Edit a placement
  edit(placement: any): void {
    this.placementToUpdate = { ...placement };
  }

  // Update a placement
  updatePlacement(): void {
    this.placementService.updatePlacement(this.placementToUpdate).subscribe(
      (response: any) => {
        console.log('Placement updated:', response);
        this.getPlacementDetails();
      },
      (error: any) => {
        console.error('Error updating placement:', error);
      }
    );
  }
  }
