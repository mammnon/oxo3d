package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_DATE_CLE database table.
 * 
 */
@Entity
@Table(name="PROS_DATE_CLE")
//@NamedQuery(name="ProsDateCle.findAll", query="SELECT p FROM ProsDateCle p")
public class ProsDateCle implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_DATE_CLE_ID")
	private int prosDateCleId;

	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_DATE_CLE_DATE")
	private Date prosDateCleDate;

	@Column(name="PROS_DATE_CLE_STATUS")
	private int prosDateCleStatus;

	@Column(name="PROS_DATE_CLE_TIMESTAMP")
	private Timestamp prosDateCleTimestamp;

	//bi-directional many-to-one association to ProsNatureDate
	@ManyToOne
	@JoinColumn(name="PROS_DATE_CLE_ID_TYPE")
	private ProsNatureDate prosNatureDate;

	//bi-directional many-to-one association to ProsRgx
	@ManyToOne
	@JoinColumn(name="PROS_DATE_CLE_ID_RGX")
	private ProsRgx prosRgx;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_DATE_CLE_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_DATE_CLE_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsDateCle() {
	}

	public int getProsDateCleId() {
		return this.prosDateCleId;
	}

	public void setProsDateCleId(int prosDateCleId) {
		this.prosDateCleId = prosDateCleId;
	}

	public Date getProsDateCleDate() {
		return this.prosDateCleDate;
	}

	public void setProsDateCleDate(Date prosDateCleDate) {
		this.prosDateCleDate = prosDateCleDate;
	}

	public int getProsDateCleStatus() {
		return this.prosDateCleStatus;
	}

	public void setProsDateCleStatus(int prosDateCleStatus) {
		this.prosDateCleStatus = prosDateCleStatus;
	}

	public Timestamp getProsDateCleTimestamp() {
		return this.prosDateCleTimestamp;
	}

	public void setProsDateCleTimestamp(Timestamp prosDateCleTimestamp) {
		this.prosDateCleTimestamp = prosDateCleTimestamp;
	}

	public ProsNatureDate getProsNatureDate() {
		return this.prosNatureDate;
	}

	public void setProsNatureDate(ProsNatureDate prosNatureDate) {
		this.prosNatureDate = prosNatureDate;
	}

	public ProsRgx getProsRgx() {
		return this.prosRgx;
	}

	public void setProsRgx(ProsRgx prosRgx) {
		this.prosRgx = prosRgx;
	}

	public ProsSource getProsSource() {
		return this.prosSource;
	}

	public void setProsSource(ProsSource prosSource) {
		this.prosSource = prosSource;
	}

	public ProsTransaction getProsTransaction() {
		return this.prosTransaction;
	}

	public void setProsTransaction(ProsTransaction prosTransaction) {
		this.prosTransaction = prosTransaction;
	}

}