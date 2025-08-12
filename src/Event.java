public class Event{
    String eventName; //name of the event
    String venue; // venue of the event
    String eventDate; // date of the event
    EventType type; //added type for categorisation

    //contructor of Event
    public Event(String eventName, String venue, String eventDate, EventType type){
        this.eventName=eventName;
        this.venue=venue;
        this.eventDate=eventDate;
        this.type=type;
    }

    //Method to display details
    public void displayDetails(){
        System.out.println("Event: "+this.eventName + "("+this.type+")");
        System.out.println(" Venue: "+this.venue);
        System.out.println(" Date: "+this.eventDate);
        System.out.println("Type: "+this.type);
    }
}


