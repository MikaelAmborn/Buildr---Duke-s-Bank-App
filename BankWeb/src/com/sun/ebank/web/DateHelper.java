/*
 * Copyright (c) 2006 Sun Microsystems, Inc.  All rights reserved.  U.S.
 * Government Rights - Commercial software.  Government users are subject
 * to the Sun Microsystems, Inc. standard license agreement and
 * applicable provisions of the FAR and its supplements.  Use is subject
 * to license terms.
 *
 * This distribution may include materials developed by third parties.
 * Sun, Sun Microsystems, the Sun logo, Java and J2EE are trademarks
 * or registered trademarks of Sun Microsystems, Inc. in the U.S. and
 * other countries.
 *
 * Copyright (c) 2006 Sun Microsystems, Inc. Tous droits reserves.
 *
 * Droits du gouvernement americain, utilisateurs gouvernementaux - logiciel
 * commercial. Les utilisateurs gouvernementaux sont soumis au contrat de
 * licence standard de Sun Microsystems, Inc., ainsi qu'aux dispositions
 * en vigueur de la FAR (Federal Acquisition Regulations) et des
 * supplements a celles-ci.  Distribue par des licences qui en
 * restreignent l'utilisation.
 *
 * Cette distribution peut comprendre des composants developpes par des
 * tierces parties. Sun, Sun Microsystems, le logo Sun, Java et J2EE
 * sont des marques de fabrique ou des marques deposees de Sun
 * Microsystems, Inc. aux Etats-Unis et dans d'autres pays.
 */


package com.sun.ebank.web;

import java.util.*;
import java.text.SimpleDateFormat;


/**
 * This class contains helper methods for dealing with
 * Date objects.
 */
public class DateHelper {
    private Calendar cal = null;

    public DateHelper() {
        Date date = new Date();
        cal = new GregorianCalendar();
        cal.setTime(date);
    }

    public void setTime(Date date) {
        cal.setTime(date);
    }

    public int getYear() {
        return cal.get(Calendar.YEAR);
    } // getYear 

    public int getMonth() {
        int calendarMonth = cal.get(Calendar.MONTH);

        return calendarMonthToInt(calendarMonth);
    } // getMonth

    public int getDay() {
        return cal.get(Calendar.DAY_OF_MONTH);
    } // getDay

    public int getHour() {
        return cal.get(Calendar.HOUR_OF_DAY);
    } // geHour

    public int getMinute() {
        return cal.get(Calendar.MINUTE);
    } // geMinute

    private int calendarMonthToInt(int calendarMonth) {
        if (calendarMonth == Calendar.JANUARY) {
            return 1;
        } else if (calendarMonth == Calendar.FEBRUARY) {
            return 2;
        } else if (calendarMonth == Calendar.MARCH) {
            return 3;
        } else if (calendarMonth == Calendar.APRIL) {
            return 4;
        } else if (calendarMonth == Calendar.MAY) {
            return 5;
        } else if (calendarMonth == Calendar.JUNE) {
            return 6;
        } else if (calendarMonth == Calendar.JULY) {
            return 7;
        } else if (calendarMonth == Calendar.AUGUST) {
            return 8;
        } else if (calendarMonth == Calendar.SEPTEMBER) {
            return 9;
        } else if (calendarMonth == Calendar.OCTOBER) {
            return 10;
        } else if (calendarMonth == Calendar.NOVEMBER) {
            return 11;
        } else if (calendarMonth == Calendar.DECEMBER) {
            return 12;
        } else {
            return 1;
        }
    } // calendarMonthToInt
} // class 
