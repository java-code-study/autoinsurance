package com.kosta.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity @Data
public class InsurancePolicy {

	@Id @GeneratedValue
	private long ID;
	private String state;
	private Date coveageStartDate;
	private BigDecimal insurancePremium;
	private String billPlan;
	private char[] signature;

	@OneToMany(mappedBy = "insurancePolicy")
	private List<PremiumPayment> premiumPayment;

	@ManyToOne
	private Policyholder policyholder;

	@OneToOne
	@JoinColumn(name = "VehicleID")
	private Vehicle vehicle;

	@ManyToMany
	@JoinTable(
			name = "insurance_policy_coverage_item_option",
			inverseJoinColumns = @JoinColumn(name = "coverage_item_optionid"),
			joinColumns = @JoinColumn(name = "insurance_policy_id")
	)
	private Collection<CoverageItemOption> coverageItemOptions;

	@OneToMany(mappedBy = "insurancePolicy")
	Collection<InsuredDriver> insuredDrivers;



	/**
	 * Returns .InsurancePolicy.ID
	 * @param CustomerID
	 * @param VehicleID
	 */
	public String createPolicy(int CustomerID, String VehicleID) {
		// TODO - implement InsurancePolicy.createPolicy
		throw new UnsupportedOperationException();
	}

	public void updatePolicy() {
		// TODO - implement InsurancePolicy.updatePolicy
		throw new UnsupportedOperationException();
	}

	public void producePolicyDocument() {
		// TODO - implement InsurancePolicy.producePolicyDocument
		throw new UnsupportedOperationException();
	}

}