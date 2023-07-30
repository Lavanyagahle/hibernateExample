package oneToOneRelation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)

private int vehicleid;
	@Column(length=40,nullable=false)
private String vehiclename;
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String vehiclename) {
		super();
		this.vehiclename = vehiclename;
	}

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public String getVehiclename() {
		return vehiclename;
	}

	public void setVehiclename(String vehiclename) {
		this.vehiclename = vehiclename;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleid=" + vehicleid + ", vehiclename=" + vehiclename + "]";
	}
	
}
