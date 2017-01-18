package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_INDICATEUR database table.
 * 
 */
//@Entity
@Table(name="PROS_NATURE_INDICATEUR")
////@NamedQuery(name="ProsNatureIndicateur.findAll", query="SELECT p FROM ProsNatureIndicateur p")
public class ProsNatureIndicateur implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_NATURE_INDICATEUR_ID")
	private int prosNatureIndicateurId;

	@Column(name="PROS_NATURE_INDICATEUR_LIBELLE")
	private String prosNatureIndicateurLibelle;

	@Column(name="PROS_NATURE_INDICATEUR_TYPE_DATA")
	private int prosNatureIndicateurTypeData;

	//bi-directional many-to-one association to ProsIndicateur
	@OneToMany(mappedBy="prosNatureIndicateur")
	private List<ProsIndicateur> prosIndicateurs;

	public ProsNatureIndicateur() {
	}

	public int getProsNatureIndicateurId() {
		return this.prosNatureIndicateurId;
	}

	public void setProsNatureIndicateurId(int prosNatureIndicateurId) {
		this.prosNatureIndicateurId = prosNatureIndicateurId;
	}

	public String getProsNatureIndicateurLibelle() {
		return this.prosNatureIndicateurLibelle;
	}

	public void setProsNatureIndicateurLibelle(String prosNatureIndicateurLibelle) {
		this.prosNatureIndicateurLibelle = prosNatureIndicateurLibelle;
	}

	public int getProsNatureIndicateurTypeData() {
		return this.prosNatureIndicateurTypeData;
	}

	public void setProsNatureIndicateurTypeData(int prosNatureIndicateurTypeData) {
		this.prosNatureIndicateurTypeData = prosNatureIndicateurTypeData;
	}

	public List<ProsIndicateur> getProsIndicateurs() {
		return this.prosIndicateurs;
	}

	public void setProsIndicateurs(List<ProsIndicateur> prosIndicateurs) {
		this.prosIndicateurs = prosIndicateurs;
	}

	public ProsIndicateur addProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().add(prosIndicateur);
		prosIndicateur.setProsNatureIndicateur(this);

		return prosIndicateur;
	}

	public ProsIndicateur removeProsIndicateur(ProsIndicateur prosIndicateur) {
		getProsIndicateurs().remove(prosIndicateur);
		prosIndicateur.setProsNatureIndicateur(null);

		return prosIndicateur;
	}

}