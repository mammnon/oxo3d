package com.probtp.prospects.model.pros;

import java.io.Serializable;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_LIEN_DOSSIER database table.
 * 
 */
//@Entity
@Table(name="PROS_LIEN_DOSSIER")
////@NamedQuery(name="ProsLienDossier.findAll", query="SELECT p FROM ProsLienDossier p")
public class ProsLienDossier implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_LIEN_DOSSIER_ID")
	private int prosLienDossierId;

	@Column(name="PROS_LIEN_DOSSIER_NATURE_LIEN")
	private short prosLienDossierNatureLien;

	@Column(name="PROS_LIEN_DOSSIER_NOM")
	private String prosLienDossierNom;

	@Column(name="PROS_LIEN_DOSSIER_PRENOM")
	private String prosLienDossierPrenom;

	@Column(name="PROS_LIEN_DOSSIER_RS")
	private String prosLienDossierRs;

	@Column(name="PROS_LIEN_DOSSIER_TYPE_LIEN")
	private short prosLienDossierTypeLien;

	@Column(name="PROS_LIEN_DOSSIER_TYPE_REF")
	private short prosLienDossierTypeRef;

	@Column(name="PROS_LIEN_DOSSIER_VALUE_REF")
	private String prosLienDossierValueRef;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_LIEN_DOSSIER_ID_PROSPECT")
	private ProsProspect prosProspect;

	public ProsLienDossier() {
	}

	public int getProsLienDossierId() {
		return this.prosLienDossierId;
	}

	public void setProsLienDossierId(int prosLienDossierId) {
		this.prosLienDossierId = prosLienDossierId;
	}

	public short getProsLienDossierNatureLien() {
		return this.prosLienDossierNatureLien;
	}

	public void setProsLienDossierNatureLien(short prosLienDossierNatureLien) {
		this.prosLienDossierNatureLien = prosLienDossierNatureLien;
	}

	public String getProsLienDossierNom() {
		return this.prosLienDossierNom;
	}

	public void setProsLienDossierNom(String prosLienDossierNom) {
		this.prosLienDossierNom = prosLienDossierNom;
	}

	public String getProsLienDossierPrenom() {
		return this.prosLienDossierPrenom;
	}

	public void setProsLienDossierPrenom(String prosLienDossierPrenom) {
		this.prosLienDossierPrenom = prosLienDossierPrenom;
	}

	public String getProsLienDossierRs() {
		return this.prosLienDossierRs;
	}

	public void setProsLienDossierRs(String prosLienDossierRs) {
		this.prosLienDossierRs = prosLienDossierRs;
	}

	public short getProsLienDossierTypeLien() {
		return this.prosLienDossierTypeLien;
	}

	public void setProsLienDossierTypeLien(short prosLienDossierTypeLien) {
		this.prosLienDossierTypeLien = prosLienDossierTypeLien;
	}

	public short getProsLienDossierTypeRef() {
		return this.prosLienDossierTypeRef;
	}

	public void setProsLienDossierTypeRef(short prosLienDossierTypeRef) {
		this.prosLienDossierTypeRef = prosLienDossierTypeRef;
	}

	public String getProsLienDossierValueRef() {
		return this.prosLienDossierValueRef;
	}

	public void setProsLienDossierValueRef(String prosLienDossierValueRef) {
		this.prosLienDossierValueRef = prosLienDossierValueRef;
	}

	public ProsProspect getProsProspect() {
		return this.prosProspect;
	}

	public void setProsProspect(ProsProspect prosProspect) {
		this.prosProspect = prosProspect;
	}

}