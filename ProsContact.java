package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_CONTACT database table.
 * 
 */
@Entity
@Table(name="PROS_CONTACT")
//@NamedQuery(name="ProsContact.findAll", query="SELECT p FROM ProsContact p")
public class ProsContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_CONTACT_ID")
	private int prosContactId;

	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_CONTACT_DATE_NAISSANCE")
	private Date prosContactDateNaissance;

	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_CONTACT_DATE_PUBLICATION")
	private Date prosContactDatePublication;

	@Column(name="PROS_CONTACT_DECISIONNAIRE")
	private short prosContactDecisionnaire;

	@Column(name="PROS_CONTACT_NOM")
	private String prosContactNom;

	@Column(name="PROS_CONTACT_PRENOM")
	private String prosContactPrenom;

	@Column(name="PROS_CONTACT_STATUS")
	private int prosContactStatus;

	@Column(name="PROS_CONTACT_TEXT_LIBRE")
	private String prosContactTextLibre;

	@Column(name="PROS_CONTACT_TIMESTAMP")
	private Timestamp prosContactTimestamp;

	//bi-directional many-to-one association to ProsEtablissement
	@ManyToOne
	@JoinColumn(name="PROS_CONTACT_ID_ETAB")
	private ProsEtablissement prosEtablissement;

	//bi-directional many-to-one association to ProsNatureContact
	@ManyToOne
	@JoinColumn(name="PROS_CONTACT_ID_NATURE_CONTACT")
	private ProsNatureContact prosNatureContact;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_CONTACT_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_CONTACT_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_CONTACT_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	//bi-directional many-to-one association to ProsMediaContact
	@OneToMany(mappedBy="prosContact")
	private List<ProsMediaContact> prosMediaContacts;

	public ProsContact() {
	}

	public int getProsContactId() {
		return this.prosContactId;
	}

	public void setProsContactId(int prosContactId) {
		this.prosContactId = prosContactId;
	}

	public Date getProsContactDateNaissance() {
		return this.prosContactDateNaissance;
	}

	public void setProsContactDateNaissance(Date prosContactDateNaissance) {
		this.prosContactDateNaissance = prosContactDateNaissance;
	}

	public Date getProsContactDatePublication() {
		return this.prosContactDatePublication;
	}

	public void setProsContactDatePublication(Date prosContactDatePublication) {
		this.prosContactDatePublication = prosContactDatePublication;
	}

	public short getProsContactDecisionnaire() {
		return this.prosContactDecisionnaire;
	}

	public void setProsContactDecisionnaire(short prosContactDecisionnaire) {
		this.prosContactDecisionnaire = prosContactDecisionnaire;
	}

	public String getProsContactNom() {
		return this.prosContactNom;
	}

	public void setProsContactNom(String prosContactNom) {
		this.prosContactNom = prosContactNom;
	}

	public String getProsContactPrenom() {
		return this.prosContactPrenom;
	}

	public void setProsContactPrenom(String prosContactPrenom) {
		this.prosContactPrenom = prosContactPrenom;
	}

	public int getProsContactStatus() {
		return this.prosContactStatus;
	}

	public void setProsContactStatus(int prosContactStatus) {
		this.prosContactStatus = prosContactStatus;
	}

	public String getProsContactTextLibre() {
		return this.prosContactTextLibre;
	}

	public void setProsContactTextLibre(String prosContactTextLibre) {
		this.prosContactTextLibre = prosContactTextLibre;
	}

	public Timestamp getProsContactTimestamp() {
		return this.prosContactTimestamp;
	}

	public void setProsContactTimestamp(Timestamp prosContactTimestamp) {
		this.prosContactTimestamp = prosContactTimestamp;
	}

	public ProsEtablissement getProsEtablissement() {
		return this.prosEtablissement;
	}

	public void setProsEtablissement(ProsEtablissement prosEtablissement) {
		this.prosEtablissement = prosEtablissement;
	}

	public ProsNatureContact getProsNatureContact() {
		return this.prosNatureContact;
	}

	public void setProsNatureContact(ProsNatureContact prosNatureContact) {
		this.prosNatureContact = prosNatureContact;
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

	public List<ProsMediaContact> getProsMediaContacts() {
		return this.prosMediaContacts;
	}

	public void setProsMediaContacts(List<ProsMediaContact> prosMediaContacts) {
		this.prosMediaContacts = prosMediaContacts;
	}

	public ProsMediaContact addProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().add(prosMediaContact);
		prosMediaContact.setProsContact(this);

		return prosMediaContact;
	}

	public ProsMediaContact removeProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().remove(prosMediaContact);
		prosMediaContact.setProsContact(null);

		return prosMediaContact;
	}

}