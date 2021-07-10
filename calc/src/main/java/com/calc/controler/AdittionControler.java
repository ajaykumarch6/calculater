package com.calc.controler;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/add")

public class AdittionControler {
	
	@PostMapping("/addition")
	public int addingTwoNumbers (int number1,int number2) {
		int answer=number1+number2;
		return answer;
	}
	@PostMapping("/addition3")
		public  int addingThree(int number1,int number2,int number3) {
			int ansewr=number1+number2+number3;
		return ansewr;
	}

	@PostMapping("/addition4")
	public int addingfour(int number1, int number2,int number3, int number4) {
		int answer=number1+number2+number3+number4;
		return answer;
	}
}
