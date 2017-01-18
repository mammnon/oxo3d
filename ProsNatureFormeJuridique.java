package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Entity;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;

/**
 * The persistent class for the PROS_NATURE_FORME_JURIDIQUE database table.
 * 
 */
@Entity
@Table(name = "PROS_NATURE_FORME_JURIDIQUE")
// //@NamedQuery(name="ProsNatureFormeJuridique.findAll", query="SELECT p FROM
// ProsNatureFormeJuridique p")
public class ProsNatureFormeJuridique implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "PROS_NATURE_FORME_JURIDIQUE_ID")
	private int prosNatureFormeJuridiqueId;

	@Column(name = "PROS_NATURE_FORME_JURIDIQUE_CODE")
	private String prosNatureFormeJuridiqueCode;

	@Column(name = "PROS_NATURE_FORME_JURIDIQUE_LIBELLE")
	private String prosNatureFormeJuridiqueLibelle;

	// bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy = "prosNatureFormeJuridique")
	private List<ProsRgx> prosRgxs;

	public ProsNatureFormeJuridique() {
	}

	public int getProsNatureFormeJuridiqueId() {
		return this.prosNatureFormeJuridiqueId;
	}

	public void setProsNatureFormeJuridiqueId(int prosNatureFormeJuridiqueId) {
		this.prosNatureFormeJuridiqueId = prosNatureFormeJuridiqueId;
	}

	public String getProsNatureFormeJuridiqueCode() {
		return this.prosNatureFormeJuridiqueCode;
	}

	public void setProsNatureFormeJuridiqueCode(String prosNatureFormeJuridiqueCode) {
		this.prosNatureFormeJuridiqueCode = prosNatureFormeJuridiqueCode;
	}

	public String getProsNatureFormeJuridiqueLibelle() {
		return this.prosNatureFormeJuridiqueLibelle;
	}

	public void setProsNatureFormeJuridiqueLibelle(String prosNatureFormeJuridiqueLibelle) {
		this.prosNatureFormeJuridiqueLibelle = prosNatureFormeJuridiqueLibelle;
	}

	public List<ProsRgx> getProsRgxs() {
		return this.prosRgxs;
	}

	public void setProsRgxs(List<ProsRgx> prosRgxs) {
		this.prosRgxs = prosRgxs;
	}

	public ProsRgx addProsRgx(ProsRgx prosRgx) {
		getProsRgxs().add(prosRgx);
		prosRgx.setProsNatureFormeJuridique(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsNatureFormeJuridique(null);

		return prosRgx;
	}

}