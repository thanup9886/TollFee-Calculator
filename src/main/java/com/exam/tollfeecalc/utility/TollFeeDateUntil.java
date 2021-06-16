package com.exam.tollfeecalc.utility;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TollFeeDateUntil {

	/**
	 * To convert the String type to LocalTime type
	 * 
	 * @param date
	 * @return
	 */
	public static LocalTime toTime(String date) {
		return LocalTime.parse(date);
	}

	/**
	 * To convert the String type to LocalDateTime type
	 * 
	 * @param date
	 * @return
	 */
	public static LocalDateTime toLocalDateTime(String date) {
		return LocalDateTime.parse(date);
	}

	/**
	 * To convert the String type array to LocalDateTime along with TimeZone type
	 * array
	 * 
	 * @param dates
	 * @return
	 */
	public static Date[] toDates(String... dates) {
		List<Date> results = new ArrayList<>();
		for (String date : dates) {
			LocalDateTime dateTime = LocalDateTime.parse(date);
			results.add(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()));
		}
		return results.toArray(new Date[results.size()]);
	}

	public static LocalDateTime[] toLocalDateTimes(String... dates) {
		List<LocalDateTime> results = new ArrayList<>();
		for (String date : dates) {
			results.add(LocalDateTime.parse(date));
		}
		return results.toArray(new LocalDateTime[results.size()]);
	}

}
