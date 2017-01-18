package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_ADRESSE database table.
 * 
 */
//@Entity
@Table(name="PROS_NATURE_ADRESSE")
////@NamedQuery(name="ProsNatureAdresse.findAll", query="SELECT p FROM ProsNatureAdresse p")
public class ProsNatureAdresse implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_NATURE_ADRESSE_ID")
	private int prosNatureAdresseId;

	@Column(name="PROS_NATURE_ADRESSE_LIBELLE")
	private String prosNatureAdresseLibelle;

	//bi-directional many-to-one association to ProsAdresse
	@OneToMany(mappedBy="prosNatureAdresse")
	private List<ProsAdresse> prosAdresses;

	public ProsNatureAdresse() {
	}

	public int getProsNatureAdresseId() {
		return this.prosNatureAdresseId;
	}

	public void setProsNatureAdresseId(int prosNatureAdresseId) {
		this.prosNatureAdresseId = prosNatureAdresseId;
	}

	public String getProsNatureAdresseLibelle() {
		return this.prosNatureAdresseLibelle;
	}

	public void setProsNatureAdresseLibelle(String prosNatureAdresseLibelle) {
		this.prosNatureAdresseLibelle = prosNatureAdresseLibelle;
	}

	public List<ProsAdresse> getProsAdresses() {
		return this.prosAdresses;
	}

	public void setProsAdresses(List<ProsAdresse> prosAdresses) {
		this.prosAdresses = prosAdresses;
	}

	public ProsAdresse addProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().add(prosAdress);
		prosAdress.setProsNatureAdresse(this);

		return prosAdress;
	}

	public ProsAdresse removeProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().remove(prosAdress);
		prosAdress.setProsNatureAdresse(null);

		return prosAdress;
	}

}