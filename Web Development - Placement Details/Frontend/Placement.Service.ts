import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PlacementService {
  API = "http://localhost:8082/api/placements";

  constructor(private http: HttpClient) {}

  // Register a placement
  public registerPlacement(placementData: any) {
    return this.http.post(`${this.API}`, placementData);
  }

  // Get all placements
  public getAllPlacements() {
    return this.http.get(`${this.API}`);
  }

  // Delete a placement by ID
  public deletePlacement(placementId: number) {
    return this.http.delete(`${this.API}/${placementId}`);
  }

  // Update a placement
  public updatePlacement(placement: any) {
    const placementId = placement.id || placement.placementId;
    return this.http.put(`${this.API}/${placementId}`, placement);
  }
}
