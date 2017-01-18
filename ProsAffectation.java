package com.probtp.prospects.model.pros;

import java.io.Serializable;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_AFFECTATION database table.
 * 
 */
@Entity
@Table(name="PROS_AFFECTATION")
//@NamedQuery(name="ProsAffectation.findAll", query="SELECT p FROM ProsAffectation p")
public class ProsAffectation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_AFFECTATION_ID")
	private int prosAffectationId;

	//bi-directional many-to-one association to ProsAction
	@ManyToOne
	@JoinColumn(name="PROS_AFFECTATION_ID_ACTION")
	private ProsAction prosAction;

	//bi-directional many-to-one association to ProsAgent
	@ManyToOne
	@JoinColumn(name="PROS_AFFECTATION_ID_AGENT")
	private ProsAgent prosAgent;

	public ProsAffectation() {
	}

	public int getProsAffectationId() {
		return this.prosAffectationId;
	}

	public void setProsAffectationId(int prosAffectationId) {
		this.prosAffectationId = prosAffectationId;
	}

	public ProsAction getProsAction() {
		return this.prosAction;
	}

	public void setProsAction(ProsAction prosAction) {
		this.prosAction = prosAction;
	}

	public ProsAgent getProsAgent() {
		return this.prosAgent;
	}

	public void setProsAgent(ProsAgent prosAgent) {
		this.prosAgent = prosAgent;
	}

}