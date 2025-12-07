package practice;

import java.util.List;

public class SampleJson {
	
	
	Integer id;
	String vin;
	List<Mfls> mfls;
	RequetedRole requetedRole;
	String createdUser;
	boolean provisioned;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	public List<Mfls> getMfls() {
		return mfls;
	}
	public void setMfls(List<Mfls> mfls) {
		this.mfls = mfls;
	}
	public RequetedRole getRequetedRole() {
		return requetedRole;
	}
	public void setRequetedRole(RequetedRole requetedRole) {
		this.requetedRole = requetedRole;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public boolean isProvisioned() {
		return provisioned;
	}
	public void setProvisioned(boolean provisioned) {
		this.provisioned = provisioned;
	}


	@Override
	public String toString() {
		return "SampleJson [id=" + id + ", vin=" + vin + ", mfls=" + mfls + ", requetedRole=" + requetedRole
				+ ", createdUser=" + createdUser + ", provisioned=" + provisioned + "]";
	}
}
