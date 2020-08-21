package com.example.demo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Model.Balance;
import com.example.demo.Model.DailyExp;
import com.example.demo.Service.ExpensesService;

@SpringBootApplication
public class PersonalexpensecalculatorApplication implements CommandLineRunner {

	
	@Autowired
	ExpensesService expensesService;
	
	public static void main(String[] args) {
		SpringApplication.run(PersonalexpensecalculatorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	  /* Balance bal=new Balance();
	   bal.setBalance(19000d);
	   bal.setBalanceDate(LocalDate.now());
	  
	   expensesService.saveBalance(bal);
	   */
	  DailyExp de=new DailyExp();
	   de.setExpenseName("fruits");
	  de.setModeOfPayment("cash");
	  de.setDebit(5000);
	   
	   expensesService.saveDailyExpense(de);
		
	}
	
	

}
