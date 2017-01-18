package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_INDICATEURS database table.
 * 
 */
//@Entity
@Table(name="PROS_INDICATEURS")
////@NamedQuery(name="ProsIndicateur.findAll", query="SELECT p FROM ProsIndicateur p")
public class ProsIndicateur implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_INDICATEURS_ID")
	private int prosIndicateursId;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_INDICATEURS_DATE_PUBLICATION")
	private Date prosIndicateursDatePublication;

	@Column(name="PROS_INDICATEURS_STATUS")
	private int prosIndicateursStatus;

	@Column(name="PROS_INDICATEURS_TIMESTAMP")
	private Timestamp prosIndicateursTimestamp;

	@Column(name="PROS_INDICATEURS_VALUE")
	private String prosIndicateursValue;

	//bi-directional many-to-one association to ProsEtablissement
	@ManyToOne
	@JoinColumn(name="PROS_INDICATEURS_ID_ETAB")
	private ProsEtablissement prosEtablissement;

	//bi-directional many-to-one association to ProsNatureIndicateur
	@ManyToOne
	@JoinColumn(name="PROS_INDICATEURS_ID_TYPE")
	private ProsNatureIndicateur prosNatureIndicateur;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_INDICATEURS_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_INDICATEURS_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_INDICATEURS_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsIndicateur() {
	}

	public int getProsIndicateursId() {
		return this.prosIndicateursId;
	}

	public void setProsIndicateursId(int prosIndicateursId) {
		this.prosIndicateursId = prosIndicateursId;
	}

	public Date getProsIndicateursDatePublication() {
		return this.prosIndicateursDatePublication;
	}

	public void setProsIndicateursDatePublication(Date prosIndicateursDatePublication) {
		this.prosIndicateursDatePublication = prosIndicateursDatePublication;
	}

	public int getProsIndicateursStatus() {
		return this.prosIndicateursStatus;
	}

	public void setProsIndicateursStatus(int prosIndicateursStatus) {
		this.prosIndicateursStatus = prosIndicateursStatus;
	}

	public Timestamp getProsIndicateursTimestamp() {
		return this.prosIndicateursTimestamp;
	}

	public void setProsIndicateursTimestamp(Timestamp prosIndicateursTimestamp) {
		this.prosIndicateursTimestamp = prosIndicateursTimestamp;
	}

	public String getProsIndicateursValue() {
		return this.prosIndicateursValue;
	}

	public void setProsIndicateursValue(String prosIndicateursValue) {
		this.prosIndicateursValue = prosIndicateursValue;
	}

	public ProsEtablissement getProsEtablissement() {
		return this.prosEtablissement;
	}

	public void setProsEtablissement(ProsEtablissement prosEtablissement) {
		this.prosEtablissement = prosEtablissement;
	}

	public ProsNatureIndicateur getProsNatureIndicateur() {
		return this.prosNatureIndicateur;
	}

	public void setProsNatureIndicateur(ProsNatureIndicateur prosNatureIndicateur) {
		this.prosNatureIndicateur = prosNatureIndicateur;
	}

	public ProsProspect getProsProspect() {
		return this.prosProspect;
	}

	public void setProsProspect(ProsProspect prosProspect) {
		this.prosProspect = prosProspect;
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