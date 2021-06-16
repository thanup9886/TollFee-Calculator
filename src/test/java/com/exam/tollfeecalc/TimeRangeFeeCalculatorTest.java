package com.exam.tollfeecalc;

import static org.junit.Assert.*;

import java.time.LocalTime;

import org.junit.Test;

import com.exam.tollfeecalc.utility.TollFeeDateUntil;

import static com.exam.tollfeecalc.TimeRangeFeeCalculator.calculate;

public class TimeRangeFeeCalculatorTest {

	@Test
	public void testTimeRange() {
		assertEquals(8, calculate(TollFeeDateUntil.toTime("06:00")));
		assertEquals(18, calculate(TollFeeDateUntil.toTime("07:00")));
		assertEquals(13, calculate(TollFeeDateUntil.toTime("17:59")));
	}


}
