package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchRunSeq;

	@Column(name = "BATCH_NAME ")
	private String batchName;


	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;


	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "END_DATE")
	private Date endDate;

	@Column(name = "INSTANCE_NUM")
	private Integer instanceNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "START_DATE")
	private Date startDate;

}
