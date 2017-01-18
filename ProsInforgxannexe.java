package com.probtp.prospects.model.pros;

import java.io.Serializable;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_INFORGXANNEXES database table.
 * 
 */
//@Entity
@Table(name="PROS_INFORGXANNEXES")
////@NamedQuery(name="ProsInforgxannexe.findAll", query="SELECT p FROM ProsInforgxannexe p")
public class ProsInforgxannexe implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_INFORGXANNEXES_ID")
	private int prosInforgxannexesId;

	@Column(name="PROS_INFORGXANNEXES_VALUE")
	private String prosInforgxannexesValue;

	//bi-directional many-to-one association to ProsNatureInforgxannexe
	@ManyToOne
	@JoinColumn(name="PROS_INFORGXANNEXES_ID_PROS_NATURE_INFORGXANNEXE")
	private ProsNatureInforgxannexe prosNatureInforgxannexe;

	//bi-directional many-to-one association to ProsRgx
	@ManyToOne
	@JoinColumn(name="PROS_INFORGXANNEXES_ID_RGX")
	private ProsRgx prosRgx;

	public ProsInforgxannexe() {
	}

	public int getProsInforgxannexesId() {
		return this.prosInforgxannexesId;
	}

	public void setProsInforgxannexesId(int prosInforgxannexesId) {
		this.prosInforgxannexesId = prosInforgxannexesId;
	}

	public String getProsInforgxannexesValue() {
		return this.prosInforgxannexesValue;
	}

	public void setProsInforgxannexesValue(String prosInforgxannexesValue) {
		this.prosInforgxannexesValue = prosInforgxannexesValue;
	}

	public ProsNatureInforgxannexe getProsNatureInforgxannexe() {
		return this.prosNatureInforgxannexe;
	}

	public void setProsNatureInforgxannexe(ProsNatureInforgxannexe prosNatureInforgxannexe) {
		this.prosNatureInforgxannexe = prosNatureInforgxannexe;
	}

	public ProsRgx getProsRgx() {
		return this.prosRgx;
	}

	public void setProsRgx(ProsRgx prosRgx) {
		this.prosRgx = prosRgx;
	}

}