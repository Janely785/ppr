package com.fing.app.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;

import com.fing.app.models.Bounce;
import com.fing.app.models.User;
import com.fing.app.models.Visitor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fing.app.models.Orden;


@Controller
public class MainCtr{

	@GetMapping("/index")
	public String raiz(Model model) {

		ArrayList<String> lista=new ArrayList<>();
		lista.add("Computadora");
		lista.add("Mouse");
		lista.add("Teclado");
		lista.add("CPU");
		lista.add("Pantalla");
		
		ArrayList<Boolean> bounce=new ArrayList<>();
		 bounce.add(true);
		 bounce.add(false);
		 bounce.add(true);
		 bounce.add(true);
		 bounce.add(false);

		int total=bounce.size();
		long entro=bounce.stream().filter(b->b).count();
		int porcentaje=(int)((entro*100.0)/total);

		model.addAttribute("bounce",bounce);
      	model.addAttribute("bouncePorcentaje",porcentaje);
		
		ArrayList<String> listaU=new ArrayList<>();
		listaU.add("Jan");
		listaU.add("Omar");
		listaU.add("Isa");
		listaU.add("Italia");
		listaU.add("Habana");
		listaU.add("Karol");
		listaU.add("Sofi");
		
		ArrayList<String> listaN=new ArrayList<>();
		     listaN.add("Fundamentos de bases de datos");
		     listaN.add("Investigacion de operaciones");
		     listaN.add("Ingles");
		     listaN.add("Paradigmas de la programacion");
		     listaN.add("Desarrollo basado en plataformas");
		     listaN.add("Sistemas de busqueda y razonamiento");
		
		     String usuario="Janelyyy";
		
		model.addAttribute("listaU",listaU);

		model.addAttribute("listaN",listaN);

		model.addAttribute("usuario",usuario);

		model.addAttribute("msg","hola");
		model.addAttribute("lista",lista);

	return "index";
	}
}