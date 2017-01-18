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
 * The persistent class for the PROS_DATA_RAW database table.
 * 
 */
@Entity
@Table(name="PROS_DATA_RAW")
//@NamedQuery(name="ProsDataRaw.findAll", query="SELECT p FROM ProsDataRaw p")
public class ProsDataRaw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_DATA_RAW_ID")
	private int prosDataRawId;

	//@Lob
	@Column(name="PROS_DATA_RAW_BLOB")
	private byte[] prosDataRawBlob;

	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_DATA_RAW_DATE_PUBLICATION")
	private Date prosDataRawDatePublication;

	@Column(name="PROS_DATA_RAW_JSON")
	private short prosDataRawJson;

	@Column(name="PROS_DATA_RAW_STATUS")
	private int prosDataRawStatus;

	@Column(name="PROS_DATA_RAW_TEXT")
	private String prosDataRawText;

	@Column(name="PROS_DATA_RAW_TIMESTAMP")
	private Timestamp prosDataRawTimestamp;

	//bi-directional many-to-one association to ProsEtablissement
	@ManyToOne
	@JoinColumn(name="PROS_DATA_RAW_ID_ETAB")
	private ProsEtablissement prosEtablissement;

	//bi-directional many-to-one association to ProsNatureDataRaw
	@ManyToOne
	@JoinColumn(name="PROS_DATA_RAW_ID_TYPE")
	private ProsNatureDataRaw prosNatureDataRaw;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_DATA_RAW_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_DATA_RAW_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_DATA_RAW_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsDataRaw() {
	}

	public int getProsDataRawId() {
		return this.prosDataRawId;
	}

	public void setProsDataRawId(int prosDataRawId) {
		this.prosDataRawId = prosDataRawId;
	}

	public byte[] getProsDataRawBlob() {
		return this.prosDataRawBlob;
	}

	public void setProsDataRawBlob(byte[] prosDataRawBlob) {
		this.prosDataRawBlob = prosDataRawBlob;
	}

	public Date getProsDataRawDatePublication() {
		return this.prosDataRawDatePublication;
	}

	public void setProsDataRawDatePublication(Date prosDataRawDatePublication) {
		this.prosDataRawDatePublication = prosDataRawDatePublication;
	}

	public short getProsDataRawJson() {
		return this.prosDataRawJson;
	}

	public void setProsDataRawJson(short prosDataRawJson) {
		this.prosDataRawJson = prosDataRawJson;
	}

	public int getProsDataRawStatus() {
		return this.prosDataRawStatus;
	}

	public void setProsDataRawStatus(int prosDataRawStatus) {
		this.prosDataRawStatus = prosDataRawStatus;
	}

	public String getProsDataRawText() {
		return this.prosDataRawText;
	}

	public void setProsDataRawText(String prosDataRawText) {
		this.prosDataRawText = prosDataRawText;
	}

	public Timestamp getProsDataRawTimestamp() {
		return this.prosDataRawTimestamp;
	}

	public void setProsDataRawTimestamp(Timestamp prosDataRawTimestamp) {
		this.prosDataRawTimestamp = prosDataRawTimestamp;
	}

	public ProsEtablissement getProsEtablissement() {
		return this.prosEtablissement;
	}

	public void setProsEtablissement(ProsEtablissement prosEtablissement) {
		this.prosEtablissement = prosEtablissement;
	}

	public ProsNatureDataRaw getProsNatureDataRaw() {
		return this.prosNatureDataRaw;
	}

	public void setProsNatureDataRaw(ProsNatureDataRaw prosNatureDataRaw) {
		this.prosNatureDataRaw = prosNatureDataRaw;
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