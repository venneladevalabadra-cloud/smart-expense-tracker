package com.vennela.smartexpensetracker.repository;

import com.vennela.smartexpensetracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}