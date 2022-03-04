package com.example.demo.serviceImpl;


import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	public String getRandomPassword() {
//		int length =10;
//		String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
//	      String specialCharacters = "!@#$";
//	      String numbers = "1234567890";
//	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
//	      Random random = new Random();
//	      char[] password = new char[length];
//
//	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
//	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
//	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
//	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
//	   
//	      for(int i = 4; i< length ; i++) {
//	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
//	      }
		 String lower_cases="qwertyuiopasdfghjklzxcvbnm";
			String upper_cases="QWERTYUIOPASDFGHJKLZXCVBNM";
		    String number="1234567890";
			String special_characters = "!@#$";
			  String password="";
			  for(int i=0;i<12;i++) {
				  int rand=(int)(4*Math.random());
				  switch(rand) {
				  case 0: 
					 rand=(int)(number.length()*Math.random());
					  password+=String.valueOf(number.charAt(rand));
					  break;
					  
				  case 1:
					  rand=(int)(lower_cases.length()*Math.random());
					  password+=String.valueOf(lower_cases.charAt(rand));
					  break;
				  case 2:
					  rand=(int)(upper_cases.length()*Math.random());
					  password+=String.valueOf(upper_cases.charAt(rand));
					  break;
				  case 3:
					  rand=(int)(special_characters.length()*Math.random());
					  password+=String.valueOf(special_characters.charAt(rand));
					  break;
				  }
			  }
	      return password;
		
	}
}

  


















