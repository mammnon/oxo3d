package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_ACTION database table.
 * 
 */
//@Entity
@Table(name="PROS_NATURE_ACTION")
////@NamedQuery(name="ProsNatureAction.findAll", query="SELECT p FROM ProsNatureAction p")
public class ProsNatureAction implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_NATURE_ACTION_ID")
	private int prosNatureActionId;

	@Column(name="PROS_NATURE_ACTION_LIBELLE")
	private String prosNatureActionLibelle;

	@Column(name="PROS_NATURE_ACTION_PRIORITE")
	private int prosNatureActionPriorite;

	//bi-directional many-to-one association to ProsAction
	@OneToMany(mappedBy="prosNatureAction")
	private List<ProsAction> prosActions;

	public ProsNatureAction() {
	}

	public int getProsNatureActionId() {
		return this.prosNatureActionId;
	}

	public void setProsNatureActionId(int prosNatureActionId) {
		this.prosNatureActionId = prosNatureActionId;
	}

	public String getProsNatureActionLibelle() {
		return this.prosNatureActionLibelle;
	}

	public void setProsNatureActionLibelle(String prosNatureActionLibelle) {
		this.prosNatureActionLibelle = prosNatureActionLibelle;
	}

	public int getProsNatureActionPriorite() {
		return this.prosNatureActionPriorite;
	}

	public void setProsNatureActionPriorite(int prosNatureActionPriorite) {
		this.prosNatureActionPriorite = prosNatureActionPriorite;
	}

	public List<ProsAction> getProsActions() {
		return this.prosActions;
	}

	public void setProsActions(List<ProsAction> prosActions) {
		this.prosActions = prosActions;
	}

	public ProsAction addProsAction(ProsAction prosAction) {
		getProsActions().add(prosAction);
		prosAction.setProsNatureAction(this);

		return prosAction;
	}

	public ProsAction removeProsAction(ProsAction prosAction) {
		getProsActions().remove(prosAction);
		prosAction.setProsNatureAction(null);

		return prosAction;
	}

}