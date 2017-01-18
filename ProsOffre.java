package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.Date;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_OFFRES database table.
 * 
 */
//@Entity
@Table(name="PROS_OFFRES")
////@NamedQuery(name="ProsOffre.findAll", query="SELECT p FROM ProsOffre p")
public class ProsOffre implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_OFFRES_ID")
	private int prosOffresId;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_OFFRES_DATE_VALIDE_AU")
	private Date prosOffresDateValideAu;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_OFFRES_DATE_VALIDE_DU")
	private Date prosOffresDateValideDu;

	@Column(name="PROS_OFFRES_LIBELLE")
	private String prosOffresLibelle;

	@Column(name="PROS_OFFRES_REF_OFFRE")
	private String prosOffresRefOffre;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_OFFRES_ID_PROSPECT")
	private ProsProspect prosProspect;

	public ProsOffre() {
	}

	public int getProsOffresId() {
		return this.prosOffresId;
	}

	public void setProsOffresId(int prosOffresId) {
		this.prosOffresId = prosOffresId;
	}

	public Date getProsOffresDateValideAu() {
		return this.prosOffresDateValideAu;
	}

	public void setProsOffresDateValideAu(Date prosOffresDateValideAu) {
		this.prosOffresDateValideAu = prosOffresDateValideAu;
	}

	public Date getProsOffresDateValideDu() {
		return this.prosOffresDateValideDu;
	}

	public void setProsOffresDateValideDu(Date prosOffresDateValideDu) {
		this.prosOffresDateValideDu = prosOffresDateValideDu;
	}

	public String getProsOffresLibelle() {
		return this.prosOffresLibelle;
	}

	public void setProsOffresLibelle(String prosOffresLibelle) {
		this.prosOffresLibelle = prosOffresLibelle;
	}

	public String getProsOffresRefOffre() {
		return this.prosOffresRefOffre;
	}

	public void setProsOffresRefOffre(String prosOffresRefOffre) {
		this.prosOffresRefOffre = prosOffresRefOffre;
	}

	public ProsProspect getProsProspect() {
		return this.prosProspect;
	}

	public void setProsProspect(ProsProspect prosProspect) {
		this.prosProspect = prosProspect;
	}

}