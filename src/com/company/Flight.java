package com.company;

public class Flight {

    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    //Constructor
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
    //setters and getters

    //methods to get Flight Details
    public String getFlightDetails(){
        return "Flight number: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    //method to setFlightDetails
    public void setFlightDetails(String[] flightDetails, int capacity, int bookedSeats){
        flightNumber = flightDetails[0];
        airline = flightDetails[1];
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

    // Checking Availability
    boolean checkAvailability(){
        boolean availability = false;
        if(bookedSeats < capacity) {
            availability = true;
        }
        return availability;
    }

    void incrementBookingCounter(){
        ++bookedSeats;
    }
}
