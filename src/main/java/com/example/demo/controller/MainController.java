package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/main")
	public String main() {
		return "/main";
	}
	
	@GetMapping("/map")
	public String map() {
		return "/map";
	}
	
	@GetMapping("/part1")
	public String layout() {
		return "page/home";
	}
	
	@GetMapping("/part2")
	public String layout2() {
		return "page/part2";
	}
	
	@GetMapping("/part3")
	public String layout3() {
		return "page/part3";
	}
}
