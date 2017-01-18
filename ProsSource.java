package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_SOURCE database table.
 * 
 */
//@Entity
@Table(name="PROS_SOURCE")
////@NamedQuery(name="ProsSource.findAll", query="SELECT p FROM ProsSource p")
public class ProsSource implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_SOURCE_ID")
	private int prosSourceId;

	@Column(name="PROS_SOURCE_RANKING")
	private int prosSourceRanking;

	@Column(name="PROS_SOURCE_SOURCE_NAME")
	private String prosSourceSourceName;

	@Column(name="PROS_SOURCE_SOURCE_REF")
	private String prosSourceSourceRef;

	//bi-directional many-to-one association to ProsAdresse
	@OneToMany(mappedBy="prosSource")
	private List<ProsAdresse> prosAdresses;

	//bi-directional many-to-one association to ProsContact
	@OneToMany(mappedBy="prosSource")
	private List<ProsContact> prosContacts;

	//bi-directional many-to-one association to ProsContrat
	@OneToMany(mappedBy="prosSource")
	private List<ProsContrat> prosContrats;

	//bi-directional many-to-one association to ProsDataRaw
	@OneToMany(mappedBy="prosSource")
	private List<ProsDataRaw> prosDataRaws;

	//bi-directional many-to-one association to ProsDateCle
	@OneToMany(mappedBy="prosSource")
	private List<ProsDateCle> prosDateCles;

	//bi-directional many-to-one association to ProsEtablissement
	@OneToMany(mappedBy="prosSource")
	private List<ProsEtablissement> prosEtablissements;

	//bi-directional many-to-one association to ProsIndicateur
	@OneToMany(mappedBy="prosSource")
	private List<ProsIndicateur> prosIndicateurs;

	//bi-directional many-to-one association to ProsMediaContact
	@OneToMany(mappedBy="prosSource")
	private List<ProsMediaContact> prosMediaContacts;

	//bi-directional many-to-one association to ProsProspect
	@OneToMany(mappedBy="prosSource")
	private List<ProsProspect> prosProspects;

	//bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy="prosSource")
	private List<ProsRgx> prosRgxs;

	//bi-directional many-to-one association to ProsTransaction
	@OneToMany(mappedBy="prosSource")
	private List<ProsTransaction> prosTransactions;

	public ProsSource() {
	}

	public int getProsSourceId() {
		return this.prosSourceId;
	}

	public void setProsSourceId(int prosSourceId) {
		this.prosSourceId = prosSourceId;
	}

	public int getProsSourceRanking() {
		return this.prosSourceRanking;
	}

	public void setProsSourceRanking(int prosSourceRanking) {
		this.prosSourceRanking = prosSourceRanking;
	}

	public String getProsSourceSourceName() {
		return this.prosSourceSourceName;
	}

	public void setProsSourceSourceName(String prosSourceSourceName) {
		this.prosSourceSourceName = prosSourceSourceName;
	}

	public String getProsSourceSourceRef() {
		return this.prosSourceSourceRef;
	}

	public void setProsSourceSourceRef(String prosSourceSourceRef) {
		this.prosSourceSourceRef = prosSourceSourceRef;
	}

	public List<ProsAdresse> getProsAdresses() {
		return this.prosAdresses;
	}

	public void setProsAdresses(List<ProsAdresse> prosAdresses) {
		this.prosAdresses = prosAdresses;
	}

	public ProsAdresse addProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().add(prosAdress);
		prosAdress.setProsSource(this);

		return prosAdress;
	}

	public ProsAdresse removeProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().remove(prosAdress);
		prosAdress.setProsSource(null);

		return prosAdress;
	}

	public List<ProsContact> getProsContacts() {
		return this.prosContacts;
	}

	public void setProsContacts(List<ProsContact> prosContacts) {
		this.prosContacts = prosContacts;
	}

	public ProsContact addProsContact(ProsContact prosContact) {
		getProsContacts().add(prosContact);
		prosContact.setProsSource(this);

		return prosContact;
	}

	public ProsContact removeProsContact(ProsContact prosContact) {
		getProsContacts().remove(prosContact);
		prosContact.setProsSource(null);

		return prosContact;
	}

	public List<ProsContrat> getProsContrats() {
		return this.prosContrats;
	}

	public void setProsContrats(List<ProsContrat> prosContrats) {
		this.prosContrats = prosContrats;
	}

	public ProsContrat addProsContrat(ProsContrat prosContrat) {
		getProsContrats().add(prosContrat);
		prosContrat.setProsSource(this);

		return prosContrat;
	}

	public ProsContrat removeProsContrat(ProsContrat prosContrat) {
		getProsContrats().remove(prosContrat);
		prosContrat.setProsSource(null);

		return prosContrat;
	}

	public List<ProsDataRaw> getProsDataRaws() {
		return this.prosDataRaws;
	}

	public void setProsDataRaws(List<ProsDataRaw> prosDataRaws) {
		this.prosDataRaws = prosDataRaws;
	}

	public ProsDataRaw addProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().add(prosDataRaw);
		prosDataRaw.setProsSource(this);

		return prosDataRaw;
	}

	public ProsDataRaw removeProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().remove(prosDataRaw);
		prosDataRaw.setProsSource(null);

		return prosDataRaw;
	}

	public List<ProsDateCle> getProsDateCles() {
		return this.prosDateCles;
	}

	public void setProsDateCles(List<ProsDateCle> prosDateCles) {
		this.prosDateCles = prosDateCles;
	}

	public ProsDateCle addProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().add(prosDateCle);
		prosDateCle.setProsSource(this);

		return prosDateCle;
	}

	public ProsDateCle removeProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().remove(prosDateCle);
		prosDateCle.setProsSource(null);

		return prosDateCle;
	}

	public List<ProsEtablissement> getProsEtablissements() {
		return this.prosEtablissements;
	}

	public void setProsEtablissements(List<ProsEtablissement> prosEtablissements) {
		this.prosEtablissements = prosEtablissements;
	}

	public ProsEtablissement addProsEtablissement(ProsEtablissement prosEtablissement) {
		getProsEtablissements().add(prosEtablissement);
		prosEtablissement.setProsSource(this);

		return prosEtablissement;
	}

	public ProsEtablissement removeProsEtablissement(ProsEtablissement prosEtablissement) {
		getProsEtablissements().remove(prosEtablissement);
		prosEtablissement.setProsSource(null);

		return prosEtablissement;
	}

	public List<ProsIndicateur> getProsIndicateurs() {
		return this.prosIndicateurs;
	}

	public void setProsIndicateurs(List<ProsIndicateur> prosIndicateurs) {
		this.prosIndicateurs = prosIndicateurs;
	}

	public ProsIndicateur addProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().add(prosIndicateur);
		prosIndicateur.setProsSource(this);

		return prosIndicateur;
	}

	public ProsIndicateur removeProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().remove(prosIndicateur);
		prosIndicateur.setProsSource(null);

		return prosIndicateur;
	}

	public List<ProsMediaContact> getProsMediaContacts() {
		return this.prosMediaContacts;
	}

	public void setProsMediaContacts(List<ProsMediaContact> prosMediaContacts) {
		this.prosMediaContacts = prosMediaContacts;
	}

	public ProsMediaContact addProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().add(prosMediaContact);
		prosMediaContact.setProsSource(this);

		return prosMediaContact;
	}

	public ProsMediaContact removeProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().remove(prosMediaContact);
		prosMediaContact.setProsSource(null);

		return prosMediaContact;
	}

	public List<ProsProspect> getProsProspects() {
		return this.prosProspects;
	}

	public void setProsProspects(List<ProsProspect> prosProspects) {
		this.prosProspects = prosProspects;
	}

	public ProsProspect addProsProspect(ProsProspect prosProspect) {
		getProsProspects().add(prosProspect);
		prosProspect.setProsSource(this);

		return prosProspect;
	}

	public ProsProspect removeProsProspect(ProsProspect prosProspect) {
		getProsProspects().remove(prosProspect);
		prosProspect.setProsSource(null);

		return prosProspect;
	}

	public List<ProsRgx> getProsRgxs() {
		return this.prosRgxs;
	}

	public void setProsRgxs(List<ProsRgx> prosRgxs) {
		this.prosRgxs = prosRgxs;
	}

	public ProsRgx addProsRgx(ProsRgx prosRgx) {
		getProsRgxs().add(prosRgx);
		prosRgx.setProsSource(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsSource(null);

		return prosRgx;
	}

	public List<ProsTransaction> getProsTransactions() {
		return this.prosTransactions;
	}

	public void setProsTransactions(List<ProsTransaction> prosTransactions) {
		this.prosTransactions = prosTransactions;
	}

	public ProsTransaction addProsTransaction(ProsTransaction prosTransaction) {
		getProsTransactions().add(prosTransaction);
		prosTransaction.setProsSource(this);

		return prosTransaction;
	}

	public ProsTransaction removeProsTransaction(ProsTransaction prosTransaction) {
		getProsTransactions().remove(prosTransaction);
		prosTransaction.setProsSource(null);

		return prosTransaction;
	}

}