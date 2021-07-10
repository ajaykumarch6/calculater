package com.calc.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mult")
public class MultiplicationControler {
	@PostMapping("/multipication")
	public int multiplicationTwo(int number1,int number2) {
		int answer=number1*number2;
		return answer;
	}
	
	
	
}
