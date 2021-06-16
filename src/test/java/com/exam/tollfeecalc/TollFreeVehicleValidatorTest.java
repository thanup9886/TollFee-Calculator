package com.exam.tollfeecalc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.exam.tollfeecalc.model.Car;

import static com.exam.tollfeecalc.TollFreeVehicleValidator.isTollFreeVehicle;

public class TollFreeVehicleValidatorTest {

	@Test
	public void testIsTollFreeVehicle() {
		assertFalse(isTollFreeVehicle(new Car()));
		assertFalse(isTollFreeVehicle(null));
	}

}
