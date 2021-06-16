package com.exam.tollfeecalc;

import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

import com.exam.tollfeecalc.dto.TimeRangeDto;

import static com.exam.tollfeecalc.utility.TollFeeDateUntil.toTime;

public class TimeRangeFeeCalculator {
	private static final Map<TimeRangeDto, Integer> TIME_RANGE = new LinkedHashMap<>();

	static {
		TIME_RANGE.put(new TimeRangeDto(toTime("06:00"), toTime("06:29")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("06:30"), toTime("06:59")), 13);
		TIME_RANGE.put(new TimeRangeDto(toTime("07:00"), toTime("08:29")), 18);
		TIME_RANGE.put(new TimeRangeDto(toTime("08:30"), toTime("09:39")), 13);
		TIME_RANGE.put(new TimeRangeDto(toTime("09:30"), toTime("09:59")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("10:30"), toTime("10:59")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("11:30"), toTime("11:59")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("12:30"), toTime("12:59")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("13:30"), toTime("13:59")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("14:30"), toTime("14:59")), 8);
		TIME_RANGE.put(new TimeRangeDto(toTime("15:00"), toTime("15:29")), 13);
		TIME_RANGE.put(new TimeRangeDto(toTime("15:30"), toTime("16:59")), 18);
		TIME_RANGE.put(new TimeRangeDto(toTime("17:00"), toTime("17:59")), 13);
		TIME_RANGE.put(new TimeRangeDto(toTime("18:00"), toTime("18:29")), 8);

	}

	/**
	 * Fees calculation depending on the time of day
	 * Rush-hour traffic will render the highest fee
	 * 
	 * @param localTime
	 * @return fee of the time range
	 */
	public static int calculate(LocalTime localTime) {
		for (Map.Entry<TimeRangeDto, Integer> range : TIME_RANGE.entrySet()) {
			if (localTime.isAfter(range.getKey().getStartTime().minusMinutes(1))
					&& localTime.isBefore(range.getKey().getEndTime().plusMinutes(1))) {
				return range.getValue();
			}
		}
		// To return 0 if no range is specified
		return 0;
	}

}
