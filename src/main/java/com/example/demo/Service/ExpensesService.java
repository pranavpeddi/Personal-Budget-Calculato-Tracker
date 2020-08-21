package com.example.demo.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Balance;
import com.example.demo.Model.DailyExp;
import com.example.demo.Repository.BalanceRepo;
import com.example.demo.Repository.DailyExpenseRepo;


@Service
public class ExpensesService {
	
	@Autowired
	BalanceRepo balanceRepo;
	
	
	@Autowired
	DailyExpenseRepo dailyExpenseRepo;
	
	
	public void saveDailyExpense(DailyExp dailyExp)
	{
	
	Optional<Balance> optbal=balanceRepo.findById(0l);
	 Balance bal=optbal.get();	
	 Balance bulbul=new Balance();
		double finalbal=bal.getBalance()-dailyExp.getDebit();
		double myfinalbal=0d;
		if(dailyExp.getCredit()==0)
		{
			myfinalbal=finalbal;
		}
		else
		{
			myfinalbal=finalbal+dailyExp.getCredit();
		}
		bulbul.setBalance(myfinalbal);
	   
		bulbul.setBalanceDate(LocalDate.now());
		balanceRepo.save(bulbul);
		dailyExp.setBalance(bulbul);
		dailyExp.setDateOfExpense(LocalDate.now());
		dailyExpenseRepo.save(dailyExp);
	}
	
	
	
	public void saveBalance(Balance balance)
	{
		balanceRepo.save(balance);
	}
	
	
	
	
	public List<DailyExp> getDailyExpenses()
	{
		return dailyExpenseRepo.findAll();
	}
	
	public List<Balance> getBalanceRepos()
	{
		return balanceRepo.findAll();
	}
	
	
	
	

}
