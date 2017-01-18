package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_TRANSACTION database table.
 * 
 */
//@Entity
@Table(name="PROS_TRANSACTION")
////@NamedQuery(name="ProsTransaction.findAll", query="SELECT p FROM ProsTransaction p")
public class ProsTransaction implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_TRANSACTION_ID")
	private int prosTransactionId;

	@Column(name="PROS_TRANSACTION_AGENT_CREATION")
	private String prosTransactionAgentCreation;

	@Column(name="PROS_TRANSACTION_TIMESTAMP")
	private Timestamp prosTransactionTimestamp;

	//bi-directional many-to-one association to ProsAdresse
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsAdresse> prosAdresses;

	//bi-directional many-to-one association to ProsContact
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsContact> prosContacts;

	//bi-directional many-to-one association to ProsContrat
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsContrat> prosContrats;

	//bi-directional many-to-one association to ProsDataRaw
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsDataRaw> prosDataRaws;

	//bi-directional many-to-one association to ProsDateCle
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsDateCle> prosDateCles;

	//bi-directional many-to-one association to ProsEtablissement
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsEtablissement> prosEtablissements;

	//bi-directional many-to-one association to ProsIndicateur
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsIndicateur> prosIndicateurs;

	//bi-directional many-to-one association to ProsMediaContact
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsMediaContact> prosMediaContacts;

	//bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy="prosTransaction")
	private List<ProsRgx> prosRgxs;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_TRANSACTION_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_TRANSACTION_ID_SOURCE")
	private ProsSource prosSource;

	public ProsTransaction() {
	}

	public int getProsTransactionId() {
		return this.prosTransactionId;
	}

	public void setProsTransactionId(int prosTransactionId) {
		this.prosTransactionId = prosTransactionId;
	}

	public String getProsTransactionAgentCreation() {
		return this.prosTransactionAgentCreation;
	}

	public void setProsTransactionAgentCreation(String prosTransactionAgentCreation) {
		this.prosTransactionAgentCreation = prosTransactionAgentCreation;
	}

	public Timestamp getProsTransactionTimestamp() {
		return this.prosTransactionTimestamp;
	}

	public void setProsTransactionTimestamp(Timestamp prosTransactionTimestamp) {
		this.prosTransactionTimestamp = prosTransactionTimestamp;
	}

	public List<ProsAdresse> getProsAdresses() {
		return this.prosAdresses;
	}

	public void setProsAdresses(List<ProsAdresse> prosAdresses) {
		this.prosAdresses = prosAdresses;
	}

	public ProsAdresse addProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().add(prosAdress);
		prosAdress.setProsTransaction(this);

		return prosAdress;
	}

	public ProsAdresse removeProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().remove(prosAdress);
		prosAdress.setProsTransaction(null);

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
		prosContact.setProsTransaction(this);

		return prosContact;
	}

	public ProsContact removeProsContact(ProsContact prosContact) {
		getProsContacts().remove(prosContact);
		prosContact.setProsTransaction(null);

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
		prosContrat.setProsTransaction(this);

		return prosContrat;
	}

	public ProsContrat removeProsContrat(ProsContrat prosContrat) {
		getProsContrats().remove(prosContrat);
		prosContrat.setProsTransaction(null);

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
		prosDataRaw.setProsTransaction(this);

		return prosDataRaw;
	}

	public ProsDataRaw removeProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().remove(prosDataRaw);
		prosDataRaw.setProsTransaction(null);

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
		prosDateCle.setProsTransaction(this);

		return prosDateCle;
	}

	public ProsDateCle removeProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().remove(prosDateCle);
		prosDateCle.setProsTransaction(null);

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
		prosEtablissement.setProsTransaction(this);

		return prosEtablissement;
	}

	public ProsEtablissement removeProsEtablissement(ProsEtablissement prosEtablissement) {
		getProsEtablissements().remove(prosEtablissement);
		prosEtablissement.setProsTransaction(null);

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
		prosIndicateur.setProsTransaction(this);

		return prosIndicateur;
	}

	public ProsIndicateur removeProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().remove(prosIndicateur);
		prosIndicateur.setProsTransaction(null);

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
		prosMediaContact.setProsTransaction(this);

		return prosMediaContact;
	}

	public ProsMediaContact removeProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().remove(prosMediaContact);
		prosMediaContact.setProsTransaction(null);

		return prosMediaContact;
	}

	public List<ProsRgx> getProsRgxs() {
		return this.prosRgxs;
	}

	public void setProsRgxs(List<ProsRgx> prosRgxs) {
		this.prosRgxs = prosRgxs;
	}

	public ProsRgx addProsRgx(ProsRgx prosRgx) {
		getProsRgxs().add(prosRgx);
		prosRgx.setProsTransaction(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsTransaction(null);

		return prosRgx;
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

}