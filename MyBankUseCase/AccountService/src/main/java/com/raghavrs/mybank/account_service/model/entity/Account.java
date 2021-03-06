package com.raghavrs.mybank.account_service.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long accountNumber;
	private BigDecimal accountBalance;
	private Long customerId;

	@CreatedDate
	private LocalDateTime whenCreated;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public LocalDateTime getWhenCreated() {
		return whenCreated;
	}

	public void setWhenCreated(LocalDateTime whenCreated) {
		this.whenCreated = whenCreated;
	}

	public Account() {
		super();
	}

	public Account(Long id, Long accountNumber, BigDecimal accountBalance, Long customerId, LocalDateTime whenCreated) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.customerId = customerId;
		this.whenCreated = whenCreated;
	}

	
}
