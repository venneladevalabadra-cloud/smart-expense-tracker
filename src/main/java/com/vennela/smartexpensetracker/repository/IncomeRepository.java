package com.vennela.smartexpensetracker.repository;

import com.vennela.smartexpensetracker.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncomeRepository extends JpaRepository<Income, Long> {
}
