package com.raghavrs.mybank.transaction_service.service;

import java.util.List;

import com.raghavrs.mybank.transaction_service.model.dto.response.AccountMonthlySummaryDTO;

public interface StatementService {

	List<AccountMonthlySummaryDTO> monthlyStatement(Long accountNumber, int year, int month);
//
//	List<AccountMonthlySummaryDTO> monthlyStatementWithPhoneNumber(Long phoneNumber, int year, int month);

}
