package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.JoinColumn;
import com.probtp.prospects.model.descriptors.ManyToOne;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_RGX database table.
 * 
 */
//@Entity
@Table(name="PROS_RGX")
////@NamedQuery(name="ProsRgx.findAll", query="SELECT p FROM ProsRgx p")
public class ProsRgx implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_RGX_ID")
	private int prosRgxId;

//	//@Temporal(TemporalType.DATE)
	@Column(name="PROS_RGX_DATE_PUBLICATION")
	private Date prosRgxDatePublication;

	@Column(name="PROS_RGX_FK_ACTIVITE")
	private int prosRgxFkActivite;

	@Column(name="PROS_RGX_GEREREGIMEEST")
	private int prosRgxGereregimeest;

	@Column(name="PROS_RGX_NATUREETAB")
	private int prosRgxNatureetab;

	@Column(name="PROS_RGX_RAISON_SOCIAL")
	private String prosRgxRaisonSocial;

	@Column(name="PROS_RGX_SITEWEB")
	private String prosRgxSiteweb;

	@Column(name="PROS_RGX_STATUS")
	private int prosRgxStatus;

	@Column(name="PROS_RGX_TIMESTAMP")
	private Date prosRgxTimestamp;

	//bi-directional many-to-one association to ProsDateCle
	@OneToMany(mappedBy="prosRgx")
	private List<ProsDateCle> prosDateCles;

	//bi-directional many-to-one association to ProsInforgxannexe
	@OneToMany(mappedBy="prosRgx")
	private List<ProsInforgxannexe> prosInforgxannexes;

	//bi-directional many-to-one association to ProsEtablissement
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_ETAB")
	private ProsEtablissement prosEtablissement;

	//bi-directional many-to-one association to ProsEtatAdmin
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_ETATADMIN")
	private ProsEtatAdmin prosEtatAdmin;

	//bi-directional many-to-one association to ProsNatureFormeJuridique
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_FORME_JURIDIQUE")
	private ProsNatureFormeJuridique prosNatureFormeJuridique;

	//bi-directional many-to-one association to ProsProspect
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_PROSPECT")
	private ProsProspect prosProspect;

	//bi-directional many-to-one association to ProsRgx
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_RGX_1")
	private ProsRgx prosRgx;

	//bi-directional many-to-one association to ProsRgx
	@OneToMany(mappedBy="prosRgx")
	private List<ProsRgx> prosRgxs;

	//bi-directional many-to-one association to ProsSource
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_SOURCE")
	private ProsSource prosSource;

	//bi-directional many-to-one association to ProsTransaction
	@ManyToOne
	@JoinColumn(name="PROS_RGX_ID_TRANSACTION")
	private ProsTransaction prosTransaction;

	public ProsRgx() {
	}

	public int getProsRgxId() {
		return this.prosRgxId;
	}

	public void setProsRgxId(int prosRgxId) {
		this.prosRgxId = prosRgxId;
	}

	public Date getProsRgxDatePublication() {
		return this.prosRgxDatePublication;
	}

	public void setProsRgxDatePublication(Date prosRgxDatePublication) {
		this.prosRgxDatePublication = prosRgxDatePublication;
	}

	public int getProsRgxFkActivite() {
		return this.prosRgxFkActivite;
	}

	public void setProsRgxFkActivite(int prosRgxFkActivite) {
		this.prosRgxFkActivite = prosRgxFkActivite;
	}

	public int getProsRgxGereregimeest() {
		return this.prosRgxGereregimeest;
	}

	public void setProsRgxGereregimeest(int prosRgxGereregimeest) {
		this.prosRgxGereregimeest = prosRgxGereregimeest;
	}

	public int getProsRgxNatureetab() {
		return this.prosRgxNatureetab;
	}

	public void setProsRgxNatureetab(int prosRgxNatureetab) {
		this.prosRgxNatureetab = prosRgxNatureetab;
	}

	public String getProsRgxRaisonSocial() {
		return this.prosRgxRaisonSocial;
	}

	public void setProsRgxRaisonSocial(String prosRgxRaisonSocial) {
		this.prosRgxRaisonSocial = prosRgxRaisonSocial;
	}

	public String getProsRgxSiteweb() {
		return this.prosRgxSiteweb;
	}

	public void setProsRgxSiteweb(String prosRgxSiteweb) {
		this.prosRgxSiteweb = prosRgxSiteweb;
	}

	public int getProsRgxStatus() {
		return this.prosRgxStatus;
	}

	public void setProsRgxStatus(int prosRgxStatus) {
		this.prosRgxStatus = prosRgxStatus;
	}

	public Date getProsRgxTimestamp() {
		return this.prosRgxTimestamp;
	}

	public void setProsRgxTimestamp(Date prosRgxTimestamp) {
		this.prosRgxTimestamp = prosRgxTimestamp;
	}

	public List<ProsDateCle> getProsDateCles() {
		return this.prosDateCles;
	}

	public void setProsDateCles(List<ProsDateCle> prosDateCles) {
		this.prosDateCles = prosDateCles;
	}

	public ProsDateCle addProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().add(prosDateCle);
		prosDateCle.setProsRgx(this);

		return prosDateCle;
	}

	public ProsDateCle removeProsDateCle(ProsDateCle prosDateCle) {
		getProsDateCles().remove(prosDateCle);
		prosDateCle.setProsRgx(null);

		return prosDateCle;
	}

	public List<ProsInforgxannexe> getProsInforgxannexes() {
		return this.prosInforgxannexes;
	}

	public void setProsInforgxannexes(List<ProsInforgxannexe> prosInforgxannexes) {
		this.prosInforgxannexes = prosInforgxannexes;
	}

	public ProsInforgxannexe addProsInforgxannexe(ProsInforgxannexe prosInforgxannexe) {
		getProsInforgxannexes().add(prosInforgxannexe);
		prosInforgxannexe.setProsRgx(this);

		return prosInforgxannexe;
	}

	public ProsInforgxannexe removeProsInforgxannexe(ProsInforgxannexe prosInforgxannexe) {
		getProsInforgxannexes().remove(prosInforgxannexe);
		prosInforgxannexe.setProsRgx(null);

		return prosInforgxannexe;
	}

	public ProsEtablissement getProsEtablissement() {
		return this.prosEtablissement;
	}

	public void setProsEtablissement(ProsEtablissement prosEtablissement) {
		this.prosEtablissement = prosEtablissement;
	}

	public ProsEtatAdmin getProsEtatAdmin() {
		return this.prosEtatAdmin;
	}

	public void setProsEtatAdmin(ProsEtatAdmin prosEtatAdmin) {
		this.prosEtatAdmin = prosEtatAdmin;
	}

	public ProsNatureFormeJuridique getProsNatureFormeJuridique() {
		return this.prosNatureFormeJuridique;
	}

	public void setProsNatureFormeJuridique(ProsNatureFormeJuridique prosNatureFormeJuridique) {
		this.prosNatureFormeJuridique = prosNatureFormeJuridique;
	}

	public ProsProspect getProsProspect() {
		return this.prosProspect;
	}

	public void setProsProspect(ProsProspect prosProspect) {
		this.prosProspect = prosProspect;
	}

	public ProsRgx getProsRgx() {
		return this.prosRgx;
	}

	public void setProsRgx(ProsRgx prosRgx) {
		this.prosRgx = prosRgx;
	}

	public List<ProsRgx> getProsRgxs() {
		return this.prosRgxs;
	}

	public void setProsRgxs(List<ProsRgx> prosRgxs) {
		this.prosRgxs = prosRgxs;
	}

	public ProsRgx addProsRgx(ProsRgx prosRgx) {
		getProsRgxs().add(prosRgx);
		prosRgx.setProsRgx(this);

		return prosRgx;
	}

	public ProsRgx removeProsRgx(ProsRgx prosRgx) {
		getProsRgxs().remove(prosRgx);
		prosRgx.setProsRgx(null);

		return prosRgx;
	}

	public ProsSource getProsSource() {
		return this.prosSource;
	}

	public void setProsSource(ProsSource prosSource) {
		this.prosSource = prosSource;
	}

	public ProsTransaction getProsTransaction() {
		return this.prosTransaction;
	}

	public void setProsTransaction(ProsTransaction prosTransaction) {
		this.prosTransaction = prosTransaction;
	}

}