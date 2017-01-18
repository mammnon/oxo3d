package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_AGENT database table.
 * 
 */
@Entity
@Table(name="PROS_AGENT")
//@NamedQuery(name="ProsAgent.findAll", query="SELECT p FROM ProsAgent p")
public class ProsAgent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_AGENT_ID")
	private int prosAgentId;

	@Column(name="PROS_AGENT_LIBELLE")
	private String prosAgentLibelle;

	//bi-directional many-to-one association to ProsAffectation
	@OneToMany(mappedBy="prosAgent")
	private List<ProsAffectation> prosAffectations;

	public ProsAgent() {
	}

	public int getProsAgentId() {
		return this.prosAgentId;
	}

	public void setProsAgentId(int prosAgentId) {
		this.prosAgentId = prosAgentId;
	}

	public String getProsAgentLibelle() {
		return this.prosAgentLibelle;
	}

	public void setProsAgentLibelle(String prosAgentLibelle) {
		this.prosAgentLibelle = prosAgentLibelle;
	}

	public List<ProsAffectation> getProsAffectations() {
		return this.prosAffectations;
	}

	public void setProsAffectations(List<ProsAffectation> prosAffectations) {
		this.prosAffectations = prosAffectations;
	}

	public ProsAffectation addProsAffectation(ProsAffectation prosAffectation) {
		getProsAffectations().add(prosAffectation);
		prosAffectation.setProsAgent(this);

		return prosAffectation;
	}

	public ProsAffectation removeProsAffectation(ProsAffectation prosAffectation) {
		getProsAffectations().remove(prosAffectation);
		prosAffectation.setProsAgent(null);

		return prosAffectation;
	}

}