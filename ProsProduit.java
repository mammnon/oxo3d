package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;

/**
 * The persistent class for the PROS_PRODUIT database table.
 * 
 */
@Entity
@Table(name = "PROS_PRODUIT")
// //@NamedQuery(name="ProsProduit.findAll", query="SELECT p FROM ProsProduit p")
public class ProsProduit implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PROS_PRODUIT_ID")
	private int prosProduitId;

	@Column(name = "PROS_PRODUIT_NOM")
	private String prosProduitNom;

	@Column(name = "PROS_PRODUIT_REF_PRODUIT")
	private String prosProduitRefProduit;

	@Column(name = "PROS_PRODUIT_TYPE_PRODUIT")
	private int prosProduitTypeProduit;

	// bi-directional many-to-one association to ProsContrat
	@OneToMany(mappedBy = "prosProduit")
	private List<ProsContrat> prosContrats;

	public ProsProduit() {
	}

	public int getProsProduitId() {
		return this.prosProduitId;
	}

	public void setProsProduitId(int prosProduitId) {
		this.prosProduitId = prosProduitId;
	}

	public String getProsProduitNom() {
		return this.prosProduitNom;
	}

	public void setProsProduitNom(String prosProduitNom) {
		this.prosProduitNom = prosProduitNom;
	}

	public String getProsProduitRefProduit() {
		return this.prosProduitRefProduit;
	}

	public void setProsProduitRefProduit(String prosProduitRefProduit) {
		this.prosProduitRefProduit = prosProduitRefProduit;
	}

	public int getProsProduitTypeProduit() {
		return this.prosProduitTypeProduit;
	}

	public void setProsProduitTypeProduit(int prosProduitTypeProduit) {
		this.prosProduitTypeProduit = prosProduitTypeProduit;
	}

	public List<ProsContrat> getProsContrats() {
		return this.prosContrats;
	}

	public void setProsContrats(List<ProsContrat> prosContrats) {
		this.prosContrats = prosContrats;
	}

	public ProsContrat addProsContrat(ProsContrat prosContrat) {
		getProsContrats().add(prosContrat);
		prosContrat.setProsProduit(this);

		return prosContrat;
	}

	public ProsContrat removeProsContrat(ProsContrat prosContrat) {
		getProsContrats().remove(prosContrat);
		prosContrat.setProsProduit(null);

		return prosContrat;
	}

}