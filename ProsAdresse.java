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
 * The persistent class for the PROS_ADRESSE database table.
 * 
 */
@Entity
@Table(name="PROS_ADRESSE")
////@NamedQuery(name="ProsAdresse.findAll", query="SELECT p FROM ProsAdresse p")
public class ProsAdresse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_ADRESSE_ID")
	private int prosAdresseId;

	@Column(name="PROS_ADRESSE_ADRESSE")
	private String prosAdresseAdresse;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_ADRESSE_DATE_PUBLICATION")
	private Date prosAdresseDatePublication;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_ADRESSE_DATE_VALIDITE_AU")
	private Date prosAdresseDateValiditeAu;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_ADRESSE_DATE_VALIDITE_DU")
	private Date prosAdresseDateValiditeDu;

	@Column(name="PROS_ADRESSE_GEOLOCALISATION")
	private Object prosAdresseGeolocalisation;

	@Column(name="PROS_ADRESSE_ISNORMALIZED")
	private short prosAdresseIsnormalized;

	@Column(name="PROS_ADRESSE_NPAI")
	private short prosAdresseNpai;

	@Column(name="PROS_ADRESSE_PND")
	private short prosAdressePnd;

	@Column(name="PROS_ADRESSE_STATUS")
	private int prosAdresseStatus;

	@Column(name="PROS_ADRESSE_TIMESTAMP")
	private Timestamp prosAdresseTimestamp;

	//bi-directional many-to-one association to ProsCommune
	@ManyToOne
	@JoinColumn(name="PROS_ADRESSE_ID_COMMUNES")
	private ProsCommune prosCommune;

	//bi-directional many-to-one association to ProsEtablissement
	@ManyToOne
	@JoinColumn(name="PROS_ADRESSE_ID_ETAB")
	private ProsEtablissement prosEtablissement;

	//bi-directional many-to-one association to ProsNatureAdresse
	@ManyToOne
	@JoinColumn(name="PROS_ADRESSE_ID_TYPE")
	private ProsNatureAdresse prosNatureAdresse;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_ADRESSE_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_ADRESSE_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_ADRESSE_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsAdresse() {
	}

	public int getProsAdresseId() {
		return this.prosAdresseId;
	}

	public void setProsAdresseId(int prosAdresseId) {
		this.prosAdresseId = prosAdresseId;
	}

	public String getProsAdresseAdresse() {
		return this.prosAdresseAdresse;
	}

	public void setProsAdresseAdresse(String prosAdresseAdresse) {
		this.prosAdresseAdresse = prosAdresseAdresse;
	}

	public Date getProsAdresseDatePublication() {
		return this.prosAdresseDatePublication;
	}

	public void setProsAdresseDatePublication(Date prosAdresseDatePublication) {
		this.prosAdresseDatePublication = prosAdresseDatePublication;
	}

	public Date getProsAdresseDateValiditeAu() {
		return this.prosAdresseDateValiditeAu;
	}

	public void setProsAdresseDateValiditeAu(Date prosAdresseDateValiditeAu) {
		this.prosAdresseDateValiditeAu = prosAdresseDateValiditeAu;
	}

	public Date getProsAdresseDateValiditeDu() {
		return this.prosAdresseDateValiditeDu;
	}

	public void setProsAdresseDateValiditeDu(Date prosAdresseDateValiditeDu) {
		this.prosAdresseDateValiditeDu = prosAdresseDateValiditeDu;
	}

	public Object getProsAdresseGeolocalisation() {
		return this.prosAdresseGeolocalisation;
	}

	public void setProsAdresseGeolocalisation(Object prosAdresseGeolocalisation) {
		this.prosAdresseGeolocalisation = prosAdresseGeolocalisation;
	}

	public short getProsAdresseIsnormalized() {
		return this.prosAdresseIsnormalized;
	}

	public void setProsAdresseIsnormalized(short prosAdresseIsnormalized) {
		this.prosAdresseIsnormalized = prosAdresseIsnormalized;
	}

	public short getProsAdresseNpai() {
		return this.prosAdresseNpai;
	}

	public void setProsAdresseNpai(short prosAdresseNpai) {
		this.prosAdresseNpai = prosAdresseNpai;
	}

	public short getProsAdressePnd() {
		return this.prosAdressePnd;
	}

	public void setProsAdressePnd(short prosAdressePnd) {
		this.prosAdressePnd = prosAdressePnd;
	}

	public int getProsAdresseStatus() {
		return this.prosAdresseStatus;
	}

	public void setProsAdresseStatus(int prosAdresseStatus) {
		this.prosAdresseStatus = prosAdresseStatus;
	}

	public Timestamp getProsAdresseTimestamp() {
		return this.prosAdresseTimestamp;
	}

	public void setProsAdresseTimestamp(Timestamp prosAdresseTimestamp) {
		this.prosAdresseTimestamp = prosAdresseTimestamp;
	}

	public ProsCommune getProsCommune() {
		return this.prosCommune;
	}

	public void setProsCommune(ProsCommune prosCommune) {
		this.prosCommune = prosCommune;
	}

	public ProsEtablissement getProsEtablissement() {
		return this.prosEtablissement;
	}

	public void setProsEtablissement(ProsEtablissement prosEtablissement) {
		this.prosEtablissement = prosEtablissement;
	}

	public ProsNatureAdresse getProsNatureAdresse() {
		return this.prosNatureAdresse;
	}

	public void setProsNatureAdresse(ProsNatureAdresse prosNatureAdresse) {
		this.prosNatureAdresse = prosNatureAdresse;
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