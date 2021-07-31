package com.company;

public class Main {

    public static void main(String[] args) {

            Ticket ticket1 = new RegularTicket("Lunch", "9876TYGH", "KOTLA", "Shanghai", "6", "12", "14D", 110.0f, false, "TKL7624", "Kingfisher AIRLINES", 120, 90, "Street", "Kolkata", "China", "Sam", "9037172317", "samthomas@outlook.com");


            Ticket ticket2 = new TouristTicket("Yacht", new String[]{"Singapore", "Indonesia", "Thailand", null, null}, "0287KNSM", "Tokyo", "Singapore", "5", "12", "19D", 250.0f, false, "IHGN0987", "SigaporeAirlines", 110, 90, "Street2", "Tokyo", "Japan", "sanjay", "9878238780", "sanjay@gamil.com");
            printTicketDetails(ticket1);
            printTicketDetails(ticket2);
        }
        public static void printTicketDetails(Ticket ticket){
            ticket.printDetails(ticket);

    }
}
