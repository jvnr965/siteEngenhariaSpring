package br.com.joaovictorrodrigues.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/projects")
public class ProjectsPageController {

	@GetMapping
	public String projects() {
		return "projects";
	}
	
	@GetMapping("/projeto1")
	public String project1() {
		return "projects/projeto1";
	}

	@GetMapping("/projeto2")
	public String project2() {
		return "projects/projeto2";
	}
	@GetMapping("/projeto3")
	public String project3() {
		return "projects/projeto3";
	}
}
