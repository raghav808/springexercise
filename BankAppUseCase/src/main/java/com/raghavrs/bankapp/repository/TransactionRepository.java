package com.raghavrs.bankapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.raghavrs.bankapp.dto.response.AccountMonthlySummaryDTO;
import com.raghavrs.bankapp.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}
