public class TicketedEvent extends Event{
    double ticketPrice;

    //contructor for class TicketedEvent
    public TicketedEvent(String eventName, String venue, String eventDate, EventType type,double ticketPrice){
        super(eventName,venue,eventDate,type); //call parent contructor
        this.ticketPrice=ticketPrice;
    }

    @Override //provied specific version of parent method
    public void displayDetails(){
        super.displayDetails();//call the parent method first and then add specific details
        System.out.println(" Price: Rs."+this.ticketPrice);
    }
}
