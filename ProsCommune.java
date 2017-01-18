package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_COMMUNES database table.
 * 
 */
@Entity
@Table(name="PROS_COMMUNES")
//@NamedQuery(name="ProsCommune.findAll", query="SELECT p FROM ProsCommune p")
public class ProsCommune implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="PROS_COMMUNES_ID")
	private int prosCommunesId;

	@Column(name="PROS_COMMUNES_CP")
	private String prosCommunesCp;

	@Column(name="PROS_COMMUNES_ID_CODE_INSEE")
	private String prosCommunesIdCodeInsee;

	@Column(name="PROS_COMMUNES_NOM_VILLE")
	private String prosCommunesNomVille;

	//bi-directional many-to-one association to ProsAdresse
	@OneToMany(mappedBy="prosCommune")
	private List<ProsAdresse> prosAdresses;

	public ProsCommune() {
	}

	public int getProsCommunesId() {
		return this.prosCommunesId;
	}

	public void setProsCommunesId(int prosCommunesId) {
		this.prosCommunesId = prosCommunesId;
	}

	public String getProsCommunesCp() {
		return this.prosCommunesCp;
	}

	public void setProsCommunesCp(String prosCommunesCp) {
		this.prosCommunesCp = prosCommunesCp;
	}

	public String getProsCommunesIdCodeInsee() {
		return this.prosCommunesIdCodeInsee;
	}

	public void setProsCommunesIdCodeInsee(String prosCommunesIdCodeInsee) {
		this.prosCommunesIdCodeInsee = prosCommunesIdCodeInsee;
	}

	public String getProsCommunesNomVille() {
		return this.prosCommunesNomVille;
	}

	public void setProsCommunesNomVille(String prosCommunesNomVille) {
		this.prosCommunesNomVille = prosCommunesNomVille;
	}

	public List<ProsAdresse> getProsAdresses() {
		return this.prosAdresses;
	}

	public void setProsAdresses(List<ProsAdresse> prosAdresses) {
		this.prosAdresses = prosAdresses;
	}

	public ProsAdresse addProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().add(prosAdress);
		prosAdress.setProsCommune(this);

		return prosAdress;
	}

	public ProsAdresse removeProsAdress(ProsAdresse prosAdress) {
		getProsAdresses().remove(prosAdress);
		prosAdress.setProsCommune(null);

		return prosAdress;
	}

}