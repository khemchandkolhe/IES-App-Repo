package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "eligibility_details ")
public class EligibilityDetailsEntity {

	@Id
	@Column(name ="ed_trace_id" )
	private Integer edTraceId;
	
	@Column(name ="benefit_amt" )
	private String benefitAmt;

	@Column(name ="case_num" )
	private Integer caseNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "create_dt")
	private Date createdDate;

	@Column(name = "denial_reason")
	private String denialReason;

	@Column(name = "plan_end_dt")
	private String planEnddate;

	@Column(name = "plan_name")
	private String planName;

	@Column(name = " plan_start_dt")
	private String planStartDate;

	@Column(name = "plan_status")
	private String planStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "update_dt")
	private Date updatedDate;

}
