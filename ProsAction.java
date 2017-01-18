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
 * The persistent class for the PROS_ACTION database table.
 * 
 */
@Entity
@Table(name="PROS_ACTION")
////@NamedQuery(name="ProsAction.findAll", query="SELECT p FROM ProsAction p")
public class ProsAction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_ACTION_ID")
	private int prosActionId;

	@Column(name="PROS_ACTION_TEXT_LIBRE")
	private String prosActionTextLibre;

	//bi-directional many-to-one association to ProsNatureAction
	@ManyToOne
	@JoinColumn(name="PROS_ACTION_ID_NATURE_ACTION")
	private ProsNatureAction prosNatureAction;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_ACTION_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsAffectation
	@OneToMany(mappedBy="prosAction")
	private List<ProsAffectation> prosAffectations;

	public ProsAction() {
	}

	public int getProsActionId() {
		return this.prosActionId;
	}

	public void setProsActionId(int prosActionId) {
		this.prosActionId = prosActionId;
	}

	public String getProsActionTextLibre() {
		return this.prosActionTextLibre;
	}

	public void setProsActionTextLibre(String prosActionTextLibre) {
		this.prosActionTextLibre = prosActionTextLibre;
	}

	public ProsNatureAction getProsNatureAction() {
		return this.prosNatureAction;
	}

	public void setProsNatureAction(ProsNatureAction prosNatureAction) {
		this.prosNatureAction = prosNatureAction;
	}

	public ProsProspect getProsProspect() {
		return this.prosProspect;
	}

	public void setProsProspect(ProsProspect prosProspect) {
		this.prosProspect = prosProspect;
	}

	public List<ProsAffectation> getProsAffectations() {
		return this.prosAffectations;
	}

	public void setProsAffectations(List<ProsAffectation> prosAffectations) {
		this.prosAffectations = prosAffectations;
	}

	public ProsAffectation addProsAffectation(ProsAffectation prosAffectation) {
		getProsAffectations().add(prosAffectation);
		prosAffectation.setProsAction(this);

		return prosAffectation;
	}

	public ProsAffectation removeProsAffectation(ProsAffectation prosAffectation) {
		getProsAffectations().remove(prosAffectation);
		prosAffectation.setProsAction(null);

		return prosAffectation;
	}

}