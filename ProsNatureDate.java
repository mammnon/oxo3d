package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_DATE database table.
 * 
 */
@Entity
@Table(name="PROS_NATURE_DATE")
////@NamedQuery(name="ProsNatureDate.findAll", query="SELECT p FROM ProsNatureDate p")
public class ProsNatureDate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_NATURE_DATE_ID")
	private int prosNatureDateId;

	@Column(name="PROS_NATURE_DATE_LIBELLE")
	private String prosNatureDateLibelle;

	//bi-directional many-to-one association to ProsDateCle
	@OneToMany(mappedBy="prosNatureDate")
	private List<ProsDateCle> prosDateCles;

	public ProsNatureDate() {
	}

	public int getProsNatureDateId() {
		return this.prosNatureDateId;
	}

	public void setProsNatureDateId(int prosNatureDateId) {
		this.prosNatureDateId = prosNatureDateId;
	}

	public String getProsNatureDateLibelle() {
		return this.prosNatureDateLibelle;
	}

	public void setProsNatureDateLibelle(String prosNatureDateLibelle) {
		this.prosNatureDateLibelle = prosNatureDateLibelle;
	}

	public List<ProsDateCle> getProsDateCles() {
		return this.prosDateCles;
	}

	public void setProsDateCles(List<ProsDateCle> prosDateCles) {
		this.prosDateCles = prosDateCles;
	}

	public ProsDateCle addProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().add(prosDateCle);
		prosDateCle.setProsNatureDate(this);

		return prosDateCle;
	}

	public ProsDateCle removeProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().remove(prosDateCle);
		prosDateCle.setProsNatureDate(null);

		return prosDateCle;
	}

}