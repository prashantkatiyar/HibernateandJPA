// default package
// Generated Feb 28, 2016 12:05:34 AM by Hibernate Tools 4.3.1.Final

/**
 * Userdetails generated by hbm2java
 */
public class Userdetails implements java.io.Serializable {

	private int userid;
	private String name;

	public Userdetails() {
	}

	public Userdetails(int userid) {
		this.userid = userid;
	}

	public Userdetails(int userid, String name) {
		this.userid = userid;
		this.name = name;
	}

	public int getUserid() {
		return this.userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
