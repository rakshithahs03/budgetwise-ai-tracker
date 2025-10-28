package com.budgetwise.backend.repository;

import com.budgetwise.backend.model.Transaction;
import com.budgetwise.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    List<Transaction> findByUserAndDateBetween(User user, LocalDate startDate, LocalDate endDate);
}