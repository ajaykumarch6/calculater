package com.calc.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dev")

public class DevisionControler {
	@PostMapping
public int devision(int number1, int number2) {
		int answer=number1/number2;
		return answer;
	}


}
