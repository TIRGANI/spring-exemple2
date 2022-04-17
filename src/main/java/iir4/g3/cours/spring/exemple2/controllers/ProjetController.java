package iir4.g3.cours.spring.exemple2.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import iir4.g3.cours.spring.exemple2.model.Projet;
import iir4.g3.cours.spring.exemple2.services.ProjetService;

@RestController
public class ProjetController {
	@Autowired
	ProjetService projetService;

	@GetMapping("/projets")
	public List<Projet> get()
	{
		return projetService.get();
	}
	
	@GetMapping("/projets/{id}")
	public Projet get(@PathVariable int id)
	{
		return projetService.get(id);
	}
	
	@PostMapping("/projets")
	public void ajouter(@RequestBody Projet p)
	{
		System.out.print("Projet "+p.getDescription());
		projetService.ajouter(p);
	}
	
	@PutMapping("/projets")
	public void modifier(@RequestBody Projet p)
	{
		projetService.modifier(p);
	}
	
	@DeleteMapping("/projets/{id}")
	public void supprimer(@PathVariable int id)
	{
		projetService.supprimer(id);
	}
}
