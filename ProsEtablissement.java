package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_ETABLISSEMENT database table.
 * 
 */
@Entity
@Table(name="PROS_ETABLISSEMENT")
//@NamedQuery(name="ProsEtablissement.findAll", query="SELECT p FROM ProsEtablissement p")
public class ProsEtablissement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_ETABLISSEMENT_ID")
	private int prosEtablissementId;

	@Column(name="PROS_ETABLISSEMENT_MUNA")
	private String prosEtablissementMuna;

	@Column(name="PROS_ETABLISSEMENT_SIREN")
	private String prosEtablissementSiren;

	@Column(name="PROS_ETABLISSEMENT_SIRET")
	private String prosEtablissementSiret;

	@Column(name="PROS_ETABLISSEMENT_TIMESTAMP")
	private Timestamp prosEtablissementTimestamp;

	//bi-directional many-to-one association to ProsAdresse
	@OneToMany(mappedBy="prosEtablissement")
	private List<ProsAdresse> prosAdresses;

	//bi-directional many-to-one association to ProsContact
	@OneToMany(mappedBy="prosEtablissement")
	private List<ProsContact> prosContacts;

	//bi-directional many-to-one association to ProsDataRaw
	@OneToMany(mappedBy="prosEtablissement")
	private List<ProsDataRaw> prosDataRaws;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_ETABLISSEMENT_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_ETABLISSEMENT_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_ETABLISSEMENT_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	//bi-directional many-to-one association to ProsIndicateur
	@OneToMany(mappedBy="prosEtablissement")
	private List<ProsIndicateur> prosIndicateurs;

	//bi-directional many-to-one association to ProsMediaContact
	@OneToMany(mappedBy="prosEtablissement")
	private List<ProsMediaContact> prosMediaContacts;

	//bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy="prosEtablissement")
	private List<ProsRgx> prosRgxs;

	public ProsEtablissement() {
	}

	public int getProsEtablissementId() {
		return this.prosEtablissementId;
	}

	public void setProsEtablissementId(int prosEtablissementId) {
		this.prosEtablissementId = prosEtablissementId;
	}

	public String getProsEtablissementMuna() {
		return this.prosEtablissementMuna;
	}

	public void setProsEtablissementMuna(String prosEtablissementMuna) {
		this.prosEtablissementMuna = prosEtablissementMuna;
	}

	public String getProsEtablissementSiren() {
		return this.prosEtablissementSiren;
	}

	public void setProsEtablissementSiren(String prosEtablissementSiren) {
		this.prosEtablissementSiren = prosEtablissementSiren;
	}

	public String getProsEtablissementSiret() {
		return this.prosEtablissementSiret;
	}

	public void setProsEtablissementSiret(String prosEtablissementSiret) {
		this.prosEtablissementSiret = prosEtablissementSiret;
	}

	public Timestamp getProsEtablissementTimestamp() {
		return this.prosEtablissementTimestamp;
	}

	public void setProsEtablissementTimestamp(Timestamp prosEtablissementTimestamp) {
		this.prosEtablissementTimestamp = prosEtablissementTimestamp;
	}

	public List<ProsAdresse> getProsAdresses() {
		return this.prosAdresses;
	}

	public void setProsAdresses(List<ProsAdresse> prosAdresses) {
		this.prosAdresses = prosAdresses;
	}

	public ProsAdresse addProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().add(prosAdress);
		prosAdress.setProsEtablissement(this);

		return prosAdress;
	}

	public ProsAdresse removeProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().remove(prosAdress);
		prosAdress.setProsEtablissement(null);

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
		prosContact.setProsEtablissement(this);

		return prosContact;
	}

	public ProsContact removeProsContact(ProsContact prosContact) {
		getProsContacts().remove(prosContact);
		prosContact.setProsEtablissement(null);

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
		prosDataRaw.setProsEtablissement(this);

		return prosDataRaw;
	}

	public ProsDataRaw removeProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().remove(prosDataRaw);
		prosDataRaw.setProsEtablissement(null);

		return prosDataRaw;
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

	public List<ProsIndicateur> getProsIndicateurs() {
		return this.prosIndicateurs;
	}

	public void setProsIndicateurs(List<ProsIndicateur> prosIndicateurs) {
		this.prosIndicateurs = prosIndicateurs;
	}

	public ProsIndicateur addProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().add(prosIndicateur);
		prosIndicateur.setProsEtablissement(this);

		return prosIndicateur;
	}

	public ProsIndicateur removeProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().remove(prosIndicateur);
		prosIndicateur.setProsEtablissement(null);

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
		prosMediaContact.setProsEtablissement(this);

		return prosMediaContact;
	}

	public ProsMediaContact removeProsMediaContact(ProsMediaContact prosMediaContact) {
		getProsMediaContacts().remove(prosMediaContact);
		prosMediaContact.setProsEtablissement(null);

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
		prosRgx.setProsEtablissement(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsEtablissement(null);

		return prosRgx;
	}

}