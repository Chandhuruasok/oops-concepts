package com.oops.encap;

public class BusTicket {

	String customerName;
	String boardingPoint,Destination;
	double pickupTime,dropTime;
	public BusTicket()
	{
		
	}
	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getBoardingPoint() {
		return boardingPoint;
	}
	public void setBoardingPoint(String boardingPoint) {
		this.boardingPoint = boardingPoint;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public double getPickupTime() {
		return pickupTime;
	}
	public void setPickupTime(double pickupTime) {
		this.pickupTime = pickupTime;
	}
	public double getDropTime() {
		return dropTime;
	}
	public void setDropTime(double dropTime) {
		this.dropTime = dropTime;
	}
	
	public BusTicket(String customerName, String boardingPoint, String destination, double pickupTime,
			double dropTime) {
		this.customerName = customerName;
		this.boardingPoint = boardingPoint;
		this.Destination = destination;
		this.pickupTime = pickupTime;
		this.dropTime = dropTime;
	}

	@Override
	public String toString() {
		return "BusTicket [customerName=" + customerName + ", boardingPoint=" + boardingPoint + ", Destination="
				+ Destination + ", pickupTime=" + pickupTime + ", dropTime=" + dropTime + "]";
	}

}
