package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_ETAT_ADMIN database table.
 * 
 */
//@Entity
@Table(name="PROS_ETAT_ADMIN")
////@NamedQuery(name="ProsEtatAdmin.findAll", query="SELECT p FROM ProsEtatAdmin p")
public class ProsEtatAdmin implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_ETAT_ADMIN_ID")
	private int prosEtatAdminId;

	@Column(name="PROS_ETAT_ADMIN_LIBELLE")
	private String prosEtatAdminLibelle;

	//bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy="prosEtatAdmin")
	private List<ProsRgx> prosRgxs;

	public ProsEtatAdmin() {
	}

	public int getProsEtatAdminId() {
		return this.prosEtatAdminId;
	}

	public void setProsEtatAdminId(int prosEtatAdminId) {
		this.prosEtatAdminId = prosEtatAdminId;
	}

	public String getProsEtatAdminLibelle() {
		return this.prosEtatAdminLibelle;
	}

	public void setProsEtatAdminLibelle(String prosEtatAdminLibelle) {
		this.prosEtatAdminLibelle = prosEtatAdminLibelle;
	}

	public List<ProsRgx> getProsRgxs() {
		return this.prosRgxs;
	}

	public void setProsRgxs(List<ProsRgx> prosRgxs) {
		this.prosRgxs = prosRgxs;
	}

	public ProsRgx addProsRgx(ProsRgx prosRgx) {
		getProsRgxs().add(prosRgx);
		prosRgx.setProsEtatAdmin(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsEtatAdmin(null);

		return prosRgx;
	}

}