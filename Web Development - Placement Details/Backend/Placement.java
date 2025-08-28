package com.example.placement;


import jakarta.persistence.*;
import java.time.LocalDate;

	
	@Entity
	@Table(name = "placements")
	public class Placement {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String companyName;
	    private String role;
	    private LocalDate Date;
	    private Double packageOffered;
	    private String location;
	    
	    // Getters and Setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }

	    public String getCompanyName() { return companyName; }
	    public void setCompanyName(String companyName) { this.companyName = companyName; }

	    public String getRole() { return role; }
	    public void setRole(String role) { this.role = role; }

	    public String getlocation() { return location; }
	    public void setlocation(String location) { this.location = location; }

	    
	    public LocalDate getDate() { return Date; }
	    public void setDate(LocalDate Date) { this.Date = Date; }

	    public Double getPackageOffered() { return packageOffered; }
	    public void setPackageOffered(Double packageOffered) { this.packageOffered = packageOffered; }

		}
		
	
		


