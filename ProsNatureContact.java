package com.probtp.prospects.model.pros;

import java.io.Serializable;
import java.util.List;

import com.probtp.prospects.model.descriptors.Column;
import com.probtp.prospects.model.descriptors.Id;
import com.probtp.prospects.model.descriptors.OneToMany;
import com.probtp.prospects.model.descriptors.Table;


/**
 * The persistent class for the PROS_NATURE_CONTACT database table.
 * 
 */
//@Entity
@Table(name="PROS_NATURE_CONTACT")
////@NamedQuery(name="ProsNatureContact.findAll", query="SELECT p FROM ProsNatureContact p")
public class ProsNatureContact implements Serializable {
	private static final long serialVersionUID = 1L;

@Id
	@Column(name="PROS_NATURE_CONTACT_ID")
	private int prosNatureContactId;

	@Column(name="PROS_NATURE_CONTACT_LIBELLE")
	private String prosNatureContactLibelle;

	//bi-directional many-to-one association to ProsContact
	@OneToMany(mappedBy="prosNatureContact")
	private List<ProsContact> prosContacts;

	public ProsNatureContact() {
	}

	public int getProsNatureContactId() {
		return this.prosNatureContactId;
	}

	public void setProsNatureContactId(int prosNatureContactId) {
		this.prosNatureContactId = prosNatureContactId;
	}

	public String getProsNatureContactLibelle() {
		return this.prosNatureContactLibelle;
	}

	public void setProsNatureContactLibelle(String prosNatureContactLibelle) {
		this.prosNatureContactLibelle = prosNatureContactLibelle;
	}

	public List<ProsContact> getProsContacts() {
		return this.prosContacts;
	}

	public void setProsContacts(List<ProsContact> prosContacts) {
		this.prosContacts = prosContacts;
	}

	public ProsContact addProsContact(ProsContact prosContact) {
		getProsContacts().add(prosContact);
		prosContact.setProsNatureContact(this);

		return prosContact;
	}

	public ProsContact removeProsContact(ProsContact prosContact) {
		getProsContacts().remove(prosContact);
		prosContact.setProsNatureContact(null);

		return prosContact;
	}

}