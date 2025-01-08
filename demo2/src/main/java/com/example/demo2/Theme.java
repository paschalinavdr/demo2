package com.example.demo2;

public class Theme {

	   private String name;
	    private String description;

	    // Constructor
	    public Theme(String name, String description) {
	        this.name = name;
	        this.description = description;
	    }

	    // Getters and Setters
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Theme{" +
	                "name='" + name + '\'' +
	                ", description='" + description + '\'' +
	                '}';
	    }
	}
	
	
	
