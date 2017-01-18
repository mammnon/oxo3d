package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.Date;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_MEDIA_CONTACTS database table.
 * 
 */
//@Entity
@Table(name="PROS_MEDIA_CONTACTS")
////@NamedQuery(name="ProsMediaContact.findAll", query="SELECT p FROM ProsMediaContact p")
public class ProsMediaContact implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_MEDIA_CONTACTS_ID_")
	private int prosMediaContactsId;

	@Column(name="PROS_MEDIA_CONTACTS_ACCORD_EMAIL")
	private short prosMediaContactsAccordEmail;

	@Column(name="PROS_MEDIA_CONTACTS_ACCORD_FAX")
	private short prosMediaContactsAccordFax;

	@Column(name="PROS_MEDIA_CONTACTS_ACCORD_TEL1")
	private short prosMediaContactsAccordTel1;

	@Column(name="PROS_MEDIA_CONTACTS_ACCORD_TEL2")
	private short prosMediaContactsAccordTel2;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_MEDIA_CONTACTS_DATE_PUBLICATION")
	private Date prosMediaContactsDatePublication;

	@Column(name="PROS_MEDIA_CONTACTS_EMAIL")
	private String prosMediaContactsEmail;

	@Column(name="PROS_MEDIA_CONTACTS_FAX")
	private String prosMediaContactsFax;

	@Column(name="PROS_MEDIA_CONTACTS_STATUS")
	private int prosMediaContactsStatus;

	@Column(name="PROS_MEDIA_CONTACTS_TELEPHONE_1")
	private String prosMediaContactsTelephone1;

	@Column(name="PROS_MEDIA_CONTACTS_TELEPHONE_2")
	private String prosMediaContactsTelephone2;

	@Column(name="PROS_MEDIA_CONTACTS_TIMESTAMP")
	private Date prosMediaContactsTimestamp;

	//bi-directional many-to-one association to ProsContact
	@ManyToOne
	@JoinColumn(name="PROS_MEDIA_CONTACTS_ID_CONTACT")
	private ProsContact prosContact;

	//bi-directional many-to-one association to ProsEtablissement
	@ManyToOne
	@JoinColumn(name="PROS_MEDIA_CONTACTS_ID_ETAB")
	private ProsEtablissement prosEtablissement;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_MEDIA_CONTACTS_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_MEDIA_CONTACTS_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_MEDIA_CONTACTS_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsMediaContact() {
	}

	public int getProsMediaContactsId() {
		return this.prosMediaContactsId;
	}

	public void setProsMediaContactsId(int prosMediaContactsId) {
		this.prosMediaContactsId = prosMediaContactsId;
	}

	public short getProsMediaContactsAccordEmail() {
		return this.prosMediaContactsAccordEmail;
	}

	public void setProsMediaContactsAccordEmail(short prosMediaContactsAccordEmail) {
		this.prosMediaContactsAccordEmail = prosMediaContactsAccordEmail;
	}

	public short getProsMediaContactsAccordFax() {
		return this.prosMediaContactsAccordFax;
	}

	public void setProsMediaContactsAccordFax(short prosMediaContactsAccordFax) {
		this.prosMediaContactsAccordFax = prosMediaContactsAccordFax;
	}

	public short getProsMediaContactsAccordTel1() {
		return this.prosMediaContactsAccordTel1;
	}

	public void setProsMediaContactsAccordTel1(short prosMediaContactsAccordTel1) {
		this.prosMediaContactsAccordTel1 = prosMediaContactsAccordTel1;
	}

	public short getProsMediaContactsAccordTel2() {
		return this.prosMediaContactsAccordTel2;
	}

	public void setProsMediaContactsAccordTel2(short prosMediaContactsAccordTel2) {
		this.prosMediaContactsAccordTel2 = prosMediaContactsAccordTel2;
	}

	public Date getProsMediaContactsDatePublication() {
		return this.prosMediaContactsDatePublication;
	}

	public void setProsMediaContactsDatePublication(Date prosMediaContactsDatePublication) {
		this.prosMediaContactsDatePublication = prosMediaContactsDatePublication;
	}

	public String getProsMediaContactsEmail() {
		return this.prosMediaContactsEmail;
	}

	public void setProsMediaContactsEmail(String prosMediaContactsEmail) {
		this.prosMediaContactsEmail = prosMediaContactsEmail;
	}

	public String getProsMediaContactsFax() {
		return this.prosMediaContactsFax;
	}

	public void setProsMediaContactsFax(String prosMediaContactsFax) {
		this.prosMediaContactsFax = prosMediaContactsFax;
	}

	public int getProsMediaContactsStatus() {
		return this.prosMediaContactsStatus;
	}

	public void setProsMediaContactsStatus(int prosMediaContactsStatus) {
		this.prosMediaContactsStatus = prosMediaContactsStatus;
	}

	public String getProsMediaContactsTelephone1() {
		return this.prosMediaContactsTelephone1;
	}

	public void setProsMediaContactsTelephone1(String prosMediaContactsTelephone1) {
		this.prosMediaContactsTelephone1 = prosMediaContactsTelephone1;
	}

	public String getProsMediaContactsTelephone2() {
		return this.prosMediaContactsTelephone2;
	}

	public void setProsMediaContactsTelephone2(String prosMediaContactsTelephone2) {
		this.prosMediaContactsTelephone2 = prosMediaContactsTelephone2;
	}

	public Date getProsMediaContactsTimestamp() {
		return this.prosMediaContactsTimestamp;
	}

	public void setProsMediaContactsTimestamp(Date prosMediaContactsTimestamp) {
		this.prosMediaContactsTimestamp = prosMediaContactsTimestamp;
	}

	public ProsContact getProsContact() {
		return this.prosContact;
	}

	public void setProsContact(ProsContact prosContact) {
		this.prosContact = prosContact;
	}

	public ProsEtablissement getProsEtablissement() {
		return this.prosEtablissement;
	}

	public void setProsEtablissement(ProsEtablissement prosEtablissement) {
		this.prosEtablissement = prosEtablissement;
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