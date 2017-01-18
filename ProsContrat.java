package com.probtp.prospects.model.pros;

import java.io.Serializable;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_CONTRAT database table.
 * 
 */
@Entity
@Table(name="PROS_CONTRAT")
//@NamedQuery(name="ProsContrat.findAll", query="SELECT p FROM ProsContrat p")
public class ProsContrat implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_CONTRAT_ID")
	private int prosContratId;

	@Column(name="PROS_CONTRAT_STATUS")
	private int prosContratStatus;

	//bi-directional many-to-one association to ProsListeContract
	@ManyToOne
	@JoinColumn(name="PROS_CONTRAT_ID_LISTE_CONTRACT")
	private ProsListeContract prosListeContract;

	//bi-directional many-to-one association to ProsProduit
	@ManyToOne
	@JoinColumn(name="PROS_CONTRAT_ID_PRODUIT")
	private ProsProduit prosProduit;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_CONTRAT_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_CONTRAT_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsContrat() {
	}

	public int getProsContratId() {
		return this.prosContratId;
	}

	public void setProsContratId(int prosContratId) {
		this.prosContratId = prosContratId;
	}

	public int getProsContratStatus() {
		return this.prosContratStatus;
	}

	public void setProsContratStatus(int prosContratStatus) {
		this.prosContratStatus = prosContratStatus;
	}

	public ProsListeContract getProsListeContract() {
		return this.prosListeContract;
	}

	public void setProsListeContract(ProsListeContract prosListeContract) {
		this.prosListeContract = prosListeContract;
	}

	public ProsProduit getProsProduit() {
		return this.prosProduit;
	}

	public void setProsProduit(ProsProduit prosProduit) {
		this.prosProduit = prosProduit;
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