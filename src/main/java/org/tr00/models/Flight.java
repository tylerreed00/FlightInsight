package org.tr00.models;

import java.sql.Date;

public class Flight implements iFlight {
    String Airlines;
    String flightNumber;
    Date departureTime;
    Date arrivalTime;
    String departureGate;
    String ArrivalGate;
}
