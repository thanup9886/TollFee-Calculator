package com.exam.tollfeecalc.utility;

public class TollFeeUtil {

    /**
     * checks for not null on given object
     * 
     * @param anyObject
     * @return true, if the given object is not null. Otherwise, false
     */
    public static boolean isNotNull(Object anyObject) {
        return null != anyObject ? true : false;
    }
    
    /**
     * Help method to check if an array is NOT empty
     * 
     * @param array
     *            The Object[] to check
     * @return True if array is NOT null and length > 0 , else false will be returned.
     */
    public static boolean isArrayNotEmpty(Object[] array) {
        return array != null && array.length > 0;
    }
}
