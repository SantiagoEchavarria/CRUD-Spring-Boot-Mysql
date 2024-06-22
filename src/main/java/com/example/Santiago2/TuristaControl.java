package com.example.Santiago2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("turista")
public class TuristaControl {
	@Autowired
	private TuristaInterface turistaServicio;
	
	
	@GetMapping(value="/turistaInsertar")
	public String turistaInsertar(Model model) {
		
		Turista turista = new Turista();
		model.addAttribute("turista", turista);
		model.addAttribute("mensaje", "Nuevo Registro");
		return "turistaInsertar";
	}
	
	@PostMapping ("/insertar")
	public String insertar(@ModelAttribute (name="turista") Turista turista, Model model,SessionStatus status) {
		turistaServicio.guardar(turista);
		status.setComplete();
		return "redirect:/turistaListar";
	}
	@GetMapping(value="/turistaListar")
	public String turistaListar(Model model) {
		
		List<Turista> turista = turistaServicio.listado();
		model.addAttribute("turista", turista);
		model.addAttribute("mensaje", "listado");
		return "/turistaListar";
	}
	@GetMapping ("/consultar/(id)")
	public String consultar(@PathVariable (name="Id") Integer id, Model model) {
		
		Turista turista = turistaServicio.consultar(id);
		model.addAttribute("turista", turista);
		model.addAttribute("mensaje","consultar");
		return "redirect:/turistaListar";
	}
	@GetMapping("/eliminar/{id}")
	public String eliminar (@PathVariable(name="id") Integer id, Model model) {
		//Turista turista = turistaServicio.consultar(id);
		turistaServicio.eliminar(id);
		return "redirect:/turistaListar";
	}
	@GetMapping("/modificar/{id}")
	public String modificar (@PathVariable(name="id")Integer id,Model model) {
		Turista turista = turistaServicio.consultar(id);
		model.addAttribute("turista", turista);
		model.addAttribute("mensaje","editar");
		return "turistaInsertar";
	}
}
