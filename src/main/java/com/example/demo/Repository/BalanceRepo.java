package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Balance;


@Repository
public interface BalanceRepo extends JpaRepository<Balance,Long>{

}
