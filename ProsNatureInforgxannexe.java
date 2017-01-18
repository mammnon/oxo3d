package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_INFORGXANNEXES database table.
 * 
 */
//@Entity
@Table(name="PROS_NATURE_INFORGXANNEXES")
////@NamedQuery(name="ProsNatureInforgxannexe.findAll", query="SELECT p FROM ProsNatureInforgxannexe p")
public class ProsNatureInforgxannexe implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_NATURE_INFORGXANNEXES_ID")
	private int prosNatureInforgxannexesId;

	@Column(name="PROS_NATURE_INFORGXANNEXES_LIBELLE")
	private String prosNatureInforgxannexesLibelle;

	@Column(name="PROS_NATURE_INFORGXANNEXES_TYPE_DATA")
	private int prosNatureInforgxannexesTypeData;

	//bi-directional many-to-one association to ProsInforgxannexe
	@OneToMany(mappedBy="prosNatureInforgxannexe")
	private List<ProsInforgxannexe> prosInforgxannexes;

	public ProsNatureInforgxannexe() {
	}

	public int getProsNatureInforgxannexesId() {
		return this.prosNatureInforgxannexesId;
	}

	public void setProsNatureInforgxannexesId(int prosNatureInforgxannexesId) {
		this.prosNatureInforgxannexesId = prosNatureInforgxannexesId;
	}

	public String getProsNatureInforgxannexesLibelle() {
		return this.prosNatureInforgxannexesLibelle;
	}

	public void setProsNatureInforgxannexesLibelle(String prosNatureInforgxannexesLibelle) {
		this.prosNatureInforgxannexesLibelle = prosNatureInforgxannexesLibelle;
	}

	public int getProsNatureInforgxannexesTypeData() {
		return this.prosNatureInforgxannexesTypeData;
	}

	public void setProsNatureInforgxannexesTypeData(int prosNatureInforgxannexesTypeData) {
		this.prosNatureInforgxannexesTypeData = prosNatureInforgxannexesTypeData;
	}

	public List<ProsInforgxannexe> getProsInforgxannexes() {
		return this.prosInforgxannexes;
	}

	public void setProsInforgxannexes(List<ProsInforgxannexe> prosInforgxannexes) {
		this.prosInforgxannexes = prosInforgxannexes;
	}

	public ProsInforgxannexe addProsInforgxannexe(ProsInforgxannexe prosInforgxannexe) {
		getProsInforgxannexes().add(prosInforgxannexe);
		prosInforgxannexe.setProsNatureInforgxannexe(this);

		return prosInforgxannexe;
	}

	public ProsInforgxannexe removeProsInforgxannexe(ProsInforgxannexe prosInforgxannexe) {
		getProsInforgxannexes().remove(prosInforgxannexe);
		prosInforgxannexe.setProsNatureInforgxannexe(null);

		return prosInforgxannexe;
	}

}