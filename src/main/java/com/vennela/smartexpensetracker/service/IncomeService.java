package com.vennela.smartexpensetracker.service;

import com.vennela.smartexpensetracker.model.Income;
import com.vennela.smartexpensetracker.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeService {

    @Autowired
    private IncomeRepository incomeRepository;

    public Income addIncome(Income income) {
        return incomeRepository.save(income);
    }

    public List<Income> getAllIncome() {
        return incomeRepository.findAll();
    }

    public void deleteIncome(Long id) {
        incomeRepository.deleteById(id);
    }

    public double getTotalIncome() {
        return incomeRepository.findAll()
                .stream()
                .mapToDouble(Income::getAmount)
                .sum();
    }
}
