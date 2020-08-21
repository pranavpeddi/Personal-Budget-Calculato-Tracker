package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.DailyExp;


@Repository
public interface DailyExpenseRepo extends JpaRepository<DailyExp, Long> {

}
