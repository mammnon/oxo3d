package com.probtp.prospects.model.pros;

import java.io.Serializable;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_APE_REFERENCE database table.
 * 
 */
@Entity
@Table(name="PROS_APE_REFERENCE")
//@NamedQuery(name="ProsApeReference.findAll", query="SELECT p FROM ProsApeReference p")
public class ProsApeReference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_APE_REFERENCE_ID")
	private String prosApeReferenceId;

	@Column(name="PROS_APE_REFERENCE_CODE_IDCC")
	private int prosApeReferenceCodeIdcc;

	@Column(name="PROS_APE_REFERENCE_LIBELLE_APE")
	private String prosApeReferenceLibelleApe;

	@Column(name="PROS_APE_REFERENCE_LIBELLE_IDCC")
	private String prosApeReferenceLibelleIdcc;

	public ProsApeReference() {
	}

	public String getProsApeReferenceId() {
		return this.prosApeReferenceId;
	}

	public void setProsApeReferenceId(String prosApeReferenceId) {
		this.prosApeReferenceId = prosApeReferenceId;
	}

	public int getProsApeReferenceCodeIdcc() {
		return this.prosApeReferenceCodeIdcc;
	}

	public void setProsApeReferenceCodeIdcc(int prosApeReferenceCodeIdcc) {
		this.prosApeReferenceCodeIdcc = prosApeReferenceCodeIdcc;
	}

	public String getProsApeReferenceLibelleApe() {
		return this.prosApeReferenceLibelleApe;
	}

	public void setProsApeReferenceLibelleApe(String prosApeReferenceLibelleApe) {
		this.prosApeReferenceLibelleApe = prosApeReferenceLibelleApe;
	}

	public String getProsApeReferenceLibelleIdcc() {
		return this.prosApeReferenceLibelleIdcc;
	}

	public void setProsApeReferenceLibelleIdcc(String prosApeReferenceLibelleIdcc) {
		this.prosApeReferenceLibelleIdcc = prosApeReferenceLibelleIdcc;
	}

}