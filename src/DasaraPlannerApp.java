//Using ArrayList to store the collection of events.
import java.util.ArrayList;
import java.util.Scanner; //Scanner class for user input

public class DasaraPlannerApp{
    public static void main(String[] args){
        System.out.println("--- Welcome to Mysuru Dasara 2025 ---");

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

        //Scanner object creation to read input from user
        Scanner scanner=new Scanner(System.in);
        boolean isRunning=true;

        //By default since isRunning is true, the program runs with the choice selector
        while(isRunning) {
            System.out.println("1. View all events");
            System.out.println("2. Exit");
            System.out.println("Enter your choice");


            //Asking for an int input 1 or 2 from user
            int choice = scanner.nextInt();
            System.out.println("\n");
            if (choice == 1) {
                System.out.println("All the Dasara events this year\n");
                for (Event event : events) {
                    System.out.println("Event Name:" + event.eventName);
                    System.out.println("Event Venue:" + event.venue);
                    System.out.println("Event Date:" + event.eventDate);
                    System.out.println("--------------");
                }
            }
            else if(choice==2){
                System.out.println("Thanks for using Dasara Planner, Goodbye");
                isRunning=false;
            }
            else {
                System.out.println("Invalid option, try again");
            }
        }
        scanner.close();
    }
}