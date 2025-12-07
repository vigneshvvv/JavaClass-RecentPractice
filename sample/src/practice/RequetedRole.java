package practice;

public class RequetedRole {
	

	String role;
	String roleSource;
	String roleDescription;
	Integer roleID;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getRoleSource() {
		return roleSource;
	}
	public void setRoleSource(String roleSource) {
		this.roleSource = roleSource;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	public Integer getRoleID() {
		return roleID;
	}
	public void setRoleID(Integer roleID) {
		this.roleID = roleID;
	}
	
	@Override
	public String toString() {
		return "RequetedRole [role=" + role + ", roleSource=" + roleSource + ", roleDescription=" + roleDescription
				+ ", roleID=" + roleID + "]";
	}

}
