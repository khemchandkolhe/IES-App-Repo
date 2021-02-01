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
@Table(name = "co_triggers")
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name = "trg_id")
	private Integer triggerId;

	@Column(name = "case_num")
	private Integer caseNumber;

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "create_dt")
	private Date createdDate;

	@Column(name = "trg_status ")
	private String triggerStatus;

	@Temporal(TemporalType.TIMESTAMP)
	@UpdateTimestamp
	@Column(name = "update_dt")
	private Date updatedDate;

}
