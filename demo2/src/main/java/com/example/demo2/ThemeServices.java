package com.example.demo2;

import java.util.ArrayList;
import java.util.List;

public class ThemeServices {
       
	
	   //Lista pou exei ola ta theme mas 
	   private List<Theme> themes = new ArrayList<>();

	    // Add a new Theme
	    public void addTheme(Theme theme) {
	        themes.add(theme);
	        System.out.println("Theme added: " + theme);
	    }

	    // methods
	    
	    public Theme findThemeByName(String name) {
	        for (Theme theme : themes) {
	            if (theme.getName().equalsIgnoreCase(name)) {
	                return theme;
	            }
	        }
	        return null;
	    }
	    
	    
	    
	    // Update a Theme
	    public boolean updateTheme(String name, String newDescription) {
	        Theme theme = findThemeByName(name);
	        if (theme != null) {
	            theme.setDescription(newDescription);
	            System.out.println("Theme updated: " + theme);
	            return true;
	        }
	        return false;
	    }
	   
	    
	    //delete theme
	    public boolean deleteTheme(String name){
	    Theme theme = findThemeByName(name);
	     if(theme != null) {
	    	 themes.remove(theme);
	    	 System.out.println("Theme deleted" + theme);
	    	 return true;
	     }
	    	
	    	
	    	return false;
	    	
	    }
	
	
	
	
	
	
}
