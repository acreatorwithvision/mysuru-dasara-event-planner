public class FreeEvent extends Event{
    //contructor for FreeEvent
    public FreeEvent(String eventName, String venue, String eventDate, EventType type){
        super(eventName, venue, eventDate, type); // super calls the contructor of parent class
    }
}