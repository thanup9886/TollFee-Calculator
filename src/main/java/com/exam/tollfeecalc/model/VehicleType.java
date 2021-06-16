package com.exam.tollfeecalc.model;

public enum VehicleType {

	CAR("Car"), MOTORBIKE("Motorbike"), TRACTOR("Tractor"), EMERGENCY("Emergency"), DIPLOMAT("Diplomat"),
	FOREIGN("Foreign"), MILITARY("Military");

	private final String vehicleType;

	VehicleType(String vehicleType) {
		// TODO Auto-generated constructor stub
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}

}
