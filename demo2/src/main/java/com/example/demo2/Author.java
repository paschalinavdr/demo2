

package com.example.demo2;
import java.time.LocalDate;

public class Author {

	 private int id;
	    private String firstname;
	    private String lastname;
	    private LocalDate birthdate;

	    // Constructor
	    public Author(int id, String firstname, String lastname, LocalDate birthdate) {
	        this.id = id;
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.birthdate = birthdate;
	    }

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getFirstname() {
	        return firstname;
	    }

	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }

	    public String getLastname() {
	        return lastname;
	    }

	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }

	    public LocalDate getBirthdate() {
	        return birthdate;
	    }

	    public void setBirthdate(LocalDate birthdate) {
	        this.birthdate = birthdate;
	    }

	    // Method to get the full name
	    public String getFullName() {
	        return firstname + " " + lastname;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        return "Author{" +
	                "id=" + id +
	                ", firstname='" + firstname + '\'' +
	                ", lastname='" + lastname + '\'' +
	                ", birthdate=" + birthdate +
	                '}';
	    }
	}
	
	
	
	
	

