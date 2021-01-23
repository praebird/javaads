package recursion;

public class Buddy {

	
	String name;
	int idN;
	String email;
	
	public Buddy(String name, int idN, String email) {
		super();
		this.name = name;
		this.idN = idN;
		this.email = email;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIdN() {
		return idN;
	}
	public void setIdN(int idN) {
		this.idN = idN;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "Friend [name=" + name + ", idN=" + idN + ", email=" + email + "]";
	}
	
}
