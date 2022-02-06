package com.sip.ams.controllers;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class HomeController {
	
	@RequestMapping("/information") // ce que je tape dans l'url
	public String info(Model model)
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("OCA");
		names.add("OCP"); 
		names.add("Spring"); 
		names.add("Angular");
        
        model.addAttribute("names",names);
        
		String formation = "Fullstack";
		System.out.println("Méthode info");
		
		model.addAttribute("workshop",formation);
		
		return "home/info";  // le nom de la vue sous template /home
	}
	
	@RequestMapping("/affichage") // %
	public String affichage() {
		return "home/affichage";
	}
}
