package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_DATA_RAW database table.
 * 
 */
//@Entity
@Table(name="PROS_NATURE_DATA_RAW")
////@NamedQuery(name="ProsNatureDataRaw.findAll", query="SELECT p FROM ProsNatureDataRaw p")
public class ProsNatureDataRaw implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_NATURE_DATA_RAW_ID")
	private int prosNatureDataRawId;

	@Column(name="PROS_NATURE_DATA_RAW_LIBELLE")
	private String prosNatureDataRawLibelle;

	//bi-directional many-to-one association to ProsDataRaw
	@OneToMany(mappedBy="prosNatureDataRaw")
	private List<ProsDataRaw> prosDataRaws;

	public ProsNatureDataRaw() {
	}

	public int getProsNatureDataRawId() {
		return this.prosNatureDataRawId;
	}

	public void setProsNatureDataRawId(int prosNatureDataRawId) {
		this.prosNatureDataRawId = prosNatureDataRawId;
	}

	public String getProsNatureDataRawLibelle() {
		return this.prosNatureDataRawLibelle;
	}

	public void setProsNatureDataRawLibelle(String prosNatureDataRawLibelle) {
		this.prosNatureDataRawLibelle = prosNatureDataRawLibelle;
	}

	public List<ProsDataRaw> getProsDataRaws() {
		return this.prosDataRaws;
	}

	public void setProsDataRaws(List<ProsDataRaw> prosDataRaws) {
		this.prosDataRaws = prosDataRaws;
	}

	public ProsDataRaw addProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().add(prosDataRaw);
		prosDataRaw.setProsNatureDataRaw(this);

		return prosDataRaw;
	}

	public ProsDataRaw removeProsDataRaw(ProsDataRaw prosDataRaw) {
		getProsDataRaws().remove(prosDataRaw);
		prosDataRaw.setProsNatureDataRaw(null);

		return prosDataRaw;
	}

}