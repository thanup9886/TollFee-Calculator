package com.exam.tollfeecalc.dto;

import java.time.LocalTime;

public class TimeRangeDto {

	private LocalTime startTime = null;
	private LocalTime endTime = null;

	/**
	 * Constructor to set the Time Range
	 * 
	 * @param startTime
	 * @param endTime
	 */
	public TimeRangeDto(LocalTime startTime, LocalTime endTime) {
		this.startTime = startTime;
		this.endTime = endTime;
	}

	/**
	 * 
	 * @return startTime from the Time Range
	 */
	public LocalTime getStartTime() {
		return startTime;
	}

	/**
	 * 
	 * @param startTime to the Time Range
	 */
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	/**
	 * 
	 * @return endTime from the Time Range
	 */
	public LocalTime getEndTime() {
		return endTime;
	}

	/**
	 * 
	 * @param endTime to the Time Range
	 */
	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

}
