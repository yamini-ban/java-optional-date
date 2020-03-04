package com.knoldus.service;

import java.time.Duration;
import java.time.LocalDateTime;

public class SecondsAManLived {
    public long getSecondsAManLived(LocalDateTime birthDate, LocalDateTime deathDate) {
        Duration period = Duration.between(birthDate, deathDate);
        return period.getSeconds();
    }
}
