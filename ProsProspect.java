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
 * The persistent class for the PROS_PROSPECT database table.
 * 
 */
//@Entity
@Table(name="PROS_PROSPECT")
////@NamedQuery(name="ProsProspect.findAll", query="SELECT p FROM ProsProspect p")
public class ProsProspect implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_PROSPECT_ID")
	private int prosProspectId;

	@Column(name="PROS_PROSPECT_ETAT")
	private String prosProspectEtat;

	@Column(name="PROS_PROSPECT_PRIORITE")
	private int prosProspectPriorite;

	@Column(name="PROS_PROSPECT_TIMESTAMP")
	private Timestamp prosProspectTimestamp;

	//bi-directional many-to-one association to ProsAction
	@OneToMany(mappedBy="prosProspect")
	private List<ProsAction> prosActions;

	//bi-directional many-to-one association to ProsAdresse
	@OneToMany(mappedBy="prosProspect")
	private List<ProsAdresse> prosAdresses;

	//bi-directional many-to-one association to ProsContact
	@OneToMany(mappedBy="prosProspect")
	private List<ProsContact> prosContacts;

	//bi-directional many-to-one association to ProsDataRaw
	@OneToMany(mappedBy="prosProspect")
	private List<ProsDataRaw> prosDataRaws;

	//bi-directional many-to-one association to ProsEtablissement
	@OneToMany(mappedBy="prosProspect")
	private List<ProsEtablissement> prosEtablissements;

	//bi-directional many-to-one association to ProsIndicateur
	@OneToMany(mappedBy="prosProspect")
	private List<ProsIndicateur> prosIndicateurs;

	//bi-directional many-to-one association to ProsLienDossier
	@OneToMany(mappedBy="prosProspect")
	private List<ProsLienDossier> prosLienDossiers;

	//bi-directional many-to-one association to ProsListeContract
	@OneToMany(mappedBy="prosProspect")
	private List<ProsListeContract> prosListeContracts;

	//bi-directional many-to-one association to ProsMediaContact
	@OneToMany(mappedBy="prosProspect")
	private List<ProsMediaContact> prosMediaContacts;

	//bi-directional many-to-one association to ProsOffre
	@OneToMany(mappedBy="prosProspect")
	private List<ProsOffre> prosOffres;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_PROSPECT_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy="prosProspect")
	private List<ProsRgx> prosRgxs;

	//bi-directional many-to-one association to ProsTransaction
	@OneToMany(mappedBy="prosProspect")
	private List<ProsTransaction> prosTransactions;

	public ProsProspect() {
	}

	public int getProsProspectId() {
		return this.prosProspectId;
	}

	public void setProsProspectId(int prosProspectId) {
		this.prosProspectId = prosProspectId;
	}

	public String getProsProspectEtat() {
		return this.prosProspectEtat;
	}

	public void setProsProspectEtat(String prosProspectEtat) {
		this.prosProspectEtat = prosProspectEtat;
	}

	public int getProsProspectPriorite() {
		return this.prosProspectPriorite;
	}

	public void setProsProspectPriorite(int prosProspectPriorite) {
		this.prosProspectPriorite = prosProspectPriorite;
	}

	public Timestamp getProsProspectTimestamp() {
		return this.prosProspectTimestamp;
	}

	public void setProsProspectTimestamp(Timestamp prosProspectTimestamp) {
		this.prosProspectTimestamp = prosProspectTimestamp;
	}

	public List<ProsAction> getProsActions() {
		return this.prosActions;
	}

	public void setProsActions(List<ProsAction> prosActions) {
		this.prosActions = prosActions;
	}

	public ProsAction addProsAction(ProsAction prosAction) {
		getProsActions().add(prosAction);
		prosAction.setProsProspect(this);

		return prosAction;
	}

	public ProsAction removeProsAction(ProsAction prosAction) {
		getProsActions().remove(prosAction);
		prosAction.setProsProspect(null);

		return prosAction;
	}

	public List<ProsAdresse> getProsAdresses() {
		return this.prosAdresses;
	}

	public void setProsAdresses(List<ProsAdresse> prosAdresses) {
		this.prosAdresses = prosAdresses;
	}

	public ProsAdresse addProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().add(prosAdress);
		prosAdress.setProsProspect(this);

		return prosAdress;
	}

	public ProsAdresse removeProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().remove(prosAdress);
		prosAdress.setProsProspect(null);

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
		prosContact.setProsProspect(this);

		return prosContact;
	}

	public ProsContact removeProsContact(ProsContact prosContact) {
		getProsContacts().remove(prosContact);
		prosContact.setProsProspect(null);

		return prosContact;
	}

	public List<ProsDataRaw> getProsDataRaws() {
		return this.prosDataRaws;
	}

	public void setProsDataRaws(List<ProsDataRaw> prosDataRaws) {
		this.prosDataRaws = prosDataRaws;
	}

	public ProsDataRaw addProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().add(prosDataRaw);
		prosDataRaw.setProsProspect(this);

		return prosDataRaw;
	}

	public ProsDataRaw removeProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().remove(prosDataRaw);
		prosDataRaw.setProsProspect(null);

		return prosDataRaw;
	}

	public List<ProsEtablissement> getProsEtablissements() {
		return this.prosEtablissements;
	}

	public void setProsEtablissements(List<ProsEtablissement> prosEtablissements) {
		this.prosEtablissements = prosEtablissements;
	}

	public ProsEtablissement addProsEtablissement(ProsEtablissement prosEtablissement) {
		getProsEtablissements().add(prosEtablissement);
		prosEtablissement.setProsProspect(this);

		return prosEtablissement;
	}

	public ProsEtablissement removeProsEtablissement(ProsEtablissement prosEtablissement) {
		getProsEtablissements().remove(prosEtablissement);
		prosEtablissement.setProsProspect(null);

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
		prosIndicateur.setProsProspect(this);

		return prosIndicateur;
	}

	public ProsIndicateur removeProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().remove(prosIndicateur);
		prosIndicateur.setProsProspect(null);

		return prosIndicateur;
	}

	public List<ProsLienDossier> getProsLienDossiers() {
		return this.prosLienDossiers;
	}

	public void setProsLienDossiers(List<ProsLienDossier> prosLienDossiers) {
		this.prosLienDossiers = prosLienDossiers;
	}

	public ProsLienDossier addProsLienDossier(ProsLienDossier prosLienDossier) {
		getProsLienDossiers().add(prosLienDossier);
		prosLienDossier.setProsProspect(this);

		return prosLienDossier;
	}

	public ProsLienDossier removeProsLienDossier(ProsLienDossier prosLienDossier) {
		getProsLienDossiers().remove(prosLienDossier);
		prosLienDossier.setProsProspect(null);

		return prosLienDossier;
	}

	public List<ProsListeContract> getProsListeContracts() {
		return this.prosListeContracts;
	}

	public void setProsListeContracts(List<ProsListeContract> prosListeContracts) {
		this.prosListeContracts = prosListeContracts;
	}

	public ProsListeContract addProsListeContract(ProsListeContract prosListeContract) {
		getProsListeContracts().add(prosListeContract);
		prosListeContract.setProsProspect(this);

		return prosListeContract;
	}

	public ProsListeContract removeProsListeContract(ProsListeContract prosListeContract) {
		getProsListeContracts().remove(prosListeContract);
		prosListeContract.setProsProspect(null);

		return prosListeContract;
	}

	public List<ProsMediaContact> getProsMediaContacts() {
		return this.prosMediaContacts;
	}

	public void setProsMediaContacts(List<ProsMediaContact> prosMediaContacts) {
		this.prosMediaContacts = prosMediaContacts;
	}

	public ProsMediaContact addProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().add(prosMediaContact);
		prosMediaContact.setProsProspect(this);

		return prosMediaContact;
	}

	public ProsMediaContact removeProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().remove(prosMediaContact);
		prosMediaContact.setProsProspect(null);

		return prosMediaContact;
	}

	public List<ProsOffre> getProsOffres() {
		return this.prosOffres;
	}

	public void setProsOffres(List<ProsOffre> prosOffres) {
		this.prosOffres = prosOffres;
	}

	public ProsOffre addProsOffre(ProsOffre prosOffre) {
		getProsOffres().add(prosOffre);
		prosOffre.setProsProspect(this);

		return prosOffre;
	}

	public ProsOffre removeProsOffre(ProsOffre prosOffre) {
		getProsOffres().remove(prosOffre);
		prosOffre.setProsProspect(null);

		return prosOffre;
	}

	public ProsSource getProsSource() {
		return this.prosSource;
	}

	public void setProsSource(ProsSource prosSource) {
		this.prosSource = prosSource;
	}

	public List<ProsRgx> getProsRgxs() {
		return this.prosRgxs;
	}

	public void setProsRgxs(List<ProsRgx> prosRgxs) {
		this.prosRgxs = prosRgxs;
	}

	public ProsRgx addProsRgx(ProsRgx prosRgx) {
		getProsRgxs().add(prosRgx);
		prosRgx.setProsProspect(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsProspect(null);

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
		prosTransaction.setProsProspect(this);

		return prosTransaction;
	}

	public ProsTransaction removeProsTransaction(ProsTransaction prosTransaction) {
		getProsTransactions().remove(prosTransaction);
		prosTransaction.setProsProspect(null);

		return prosTransaction;
	}

}