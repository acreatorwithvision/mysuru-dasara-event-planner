//Using ArrayList to store the collection of events.
import java.util.ArrayList;


public class DasaraPlannerApp{
    public static void main(String[] args){
        System.out.println("--- Mysuru Dasara 2025 Event Planner ---");

        //Initialize ArrayList for Event class to hold its objects as collections
        ArrayList<Event> events=new ArrayList<>();

        //Add events to Event Object.
        Event event1 = new Event();
        event1.eventName="Jumbo Savari(Procession)";
        event1.venue="Mysuru Palace to Bannimantapa";
        event1.eventDate="15-10-2025";
        events.add(event1); //Push event1 object to events collection


        Event event2 = new Event();
        event2.eventName="Torch Light Parade";
        event2.venue="Bannimantapa";
        event2.eventDate="15-10-2025";
        events.add(event2); //Push event2 object to events collection

        Event event3 = new Event();
        event3.eventName="Yuva Dasara";
        event3.venue="Maharaja Grounds";
        event3.eventDate="10-10-2025";
        events.add(event3);

        Event event4=new Event();
        event4.eventName="Flower Show";
        event4.venue="Palace Gate";
        event4.eventDate="11-10-2025";
        events.add(event4);

        Event event5=new Event();
        event5.eventName="Ahara Mela";
        event5.venue="Lalitha Mahal Grounds";
        event5.eventDate="12-10-2025";
        events.add(event5);

        //printing the collections of object in ArrayList
        System.out.println("\n List of major events");
        for(Event event:events){
            System.out.println("-"+event.eventName);
        }
    }
}