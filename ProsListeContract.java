package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;

/**
 * The persistent class for the PROS_LISTE_CONTRACTS database table.
 * 
 */
@Entity
@Table(name = "PROS_LISTE_CONTRACTS")
//// @NamedQuery(name="ProsListeContract.findAll", query="SELECT p FROM
//// ProsListeContract p")
public class ProsListeContract implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PROS_LISTE_CONTRACTS_ID")
	private int prosListeContractsId;

	@Column(name = "PROS_LISTE_CONTRACTS_LIBELLE")
	private String prosListeContractsLibelle;

	// bi-directional many-to-one association to ProsContrat
	@OneToMany(mappedBy = "prosListeContract")
	private List<ProsContrat> prosContrats;

	// bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name = "PROS_LISTE_CONTRACTS_ID_PROSPECT")
	private ProsProspect prosProspect;

	public ProsListeContract() {
	}

	public int getProsListeContractsId() {
		return this.prosListeContractsId;
	}

	public void setProsListeContractsId(int prosListeContractsId) {
		this.prosListeContractsId = prosListeContractsId;
	}

	public String getProsListeContractsLibelle() {
		return this.prosListeContractsLibelle;
	}

	public void setProsListeContractsLibelle(String prosListeContractsLibelle) {
		this.prosListeContractsLibelle = prosListeContractsLibelle;
	}

	public List<ProsContrat> getProsContrats() {
		return this.prosContrats;
	}

	public void setProsContrats(List<ProsContrat> prosContrats) {
		this.prosContrats = prosContrats;
	}

	public ProsContrat addProsContrat(ProsContrat prosContrat) {
		getProsContrats().add(prosContrat);
		prosContrat.setProsListeContract(this);

		return prosContrat;
	}

	public ProsContrat removeProsContrat(ProsContrat prosContrat) {
		getProsContrats().remove(prosContrat);
		prosContrat.setProsListeContract(null);

		return prosContrat;
	}

	public ProsProspect getProsProspect() {
		return this.prosProspect;
	}

	public void setProsProspect(ProsProspect prosProspect) {
		this.prosProspect = prosProspect;
	}

}