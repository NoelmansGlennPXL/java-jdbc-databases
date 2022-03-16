package com.pluralsight.order.util;

import java.io.Console;
import java.sql.SQLException;

/**
 * Utility class to handle exceptions
 */
public class ExceptionHandler {

    /**
     * Method to extract and print information from a SQLException
     * @param sqlException Exception from which information will be extracted
     */
    public static void handleException(SQLException sqlException) {
        System.out.println("Error code: " + sqlException.getErrorCode());
        System.out.println("SQL state: " + sqlException.getSQLState());
        System.out.println("Messgae: " + sqlException.getMessage());
        System.out.println("Stack trace: ");
        sqlException.printStackTrace();


    }
}
