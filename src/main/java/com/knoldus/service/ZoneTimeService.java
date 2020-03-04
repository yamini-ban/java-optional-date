package com.knoldus.service;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class ZoneTimeService {
    public String getZonedTime(String timeZone) {
        ZoneId zoneId = ZoneId.of(timeZone);
        ZonedDateTime currentZonedDateTime = ZonedDateTime.now(zoneId);
        return currentZonedDateTime.format(DateTimeFormatter.ofPattern("hh-mm-ss VV, O"));
    }
}
