package oneToOneRelation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userid;
@Column(length=40,nullable=false)
private String username;
@OneToOne
@JoinColumn(name="vehicleid")
Vehicle vehicle;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User( String username) {
	super();
	this.username = username;
}
public int getUserid() {
	return userid;
}
public void setUserid(int userid) {
	this.userid = userid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

public Vehicle getVehicle() {
	return vehicle;
}
public void setVehicle(Vehicle vehicle) {
	this.vehicle = vehicle;
}
@Override
public String toString() {
	return "User [userid=" + userid + ", username=" + username + "]";
}

}
