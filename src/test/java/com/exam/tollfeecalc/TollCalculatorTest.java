package com.exam.tollfeecalc;

import static org.junit.Assert.*;

import org.junit.Test;

import com.exam.tollfeecalc.model.Car;
import com.exam.tollfeecalc.utility.TollFeeDateUntil;

public class TollCalculatorTest {

	@Test
	public void testCalculateTollFee() {
		 assertEquals(0, TollCalculator.calculateTollFee(new Car(), TollFeeDateUntil.toLocalDateTime("2020-04-04T09:00:00")));//Free day
		 assertEquals(0, TollCalculator.calculateTollFee(new Car(), TollFeeDateUntil.toLocalDateTime("2020-10-17T06:59:00")));//Weekend
		 assertEquals(13, TollCalculator.calculateTollFee(new Car(), TollFeeDateUntil.toLocalDateTime("2020-10-16T06:59:00")));		 
		 assertEquals(0, TollCalculator.calculateTollFee(new Car(), TollFeeDateUntil.toLocalDateTimes(new String[]{"2020-04-16T00:30:00","2020-04-16T06:00:00"})));		 
		 assertEquals(8, TollCalculator.calculateTollFee(new Car(), TollFeeDateUntil.toLocalDateTimes(new String[]{"2020-04-16T10:30:00","2020-04-16T11:00:00"})));		 
	}

	@Test
	public void testIsOnSameDay() {
		assertTrue(TollCalculator.isOnSameDay(TollFeeDateUntil.toLocalDateTime("2020-10-18T00:00:00"),
				TollFeeDateUntil.toLocalDateTime("2020-10-18T14:00:00"),
				TollFeeDateUntil.toLocalDateTime("2020-10-18T19:00:00"))

		);
	}

}
