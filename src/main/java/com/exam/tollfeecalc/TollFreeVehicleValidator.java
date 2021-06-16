package com.exam.tollfeecalc;

import java.util.HashSet;
import java.util.Set;

import com.exam.tollfeecalc.model.Vehicle;
import com.exam.tollfeecalc.model.VehicleType;

public class TollFreeVehicleValidator {

	private static final Set<VehicleType> TOLL_FREE_VEHICLES = new HashSet<VehicleType>();

	static {
		TOLL_FREE_VEHICLES.add(VehicleType.MOTORBIKE);
		TOLL_FREE_VEHICLES.add(VehicleType.TRACTOR);
		TOLL_FREE_VEHICLES.add(VehicleType.EMERGENCY);
		TOLL_FREE_VEHICLES.add(VehicleType.DIPLOMAT);
		TOLL_FREE_VEHICLES.add(VehicleType.MILITARY);
	}

	/**
	 * To know if the vehicle is set to toll free
	 * @param vehicle
	 * @return whether vehicle is toll free or not
	 */
	public static boolean isTollFreeVehicle(Vehicle vehicle) {

		if (vehicle != null) {
			return TOLL_FREE_VEHICLES.contains(vehicle.getVehicleType());
		}
		return false;

	}
}
