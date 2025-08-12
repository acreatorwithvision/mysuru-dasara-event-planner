//Using ArrayList to store the collection of events.
import java.util.ArrayList;
import java.util.Scanner; //Scanner class for user input

public class DasaraPlannerApp{
    public static void main(String[] args){
        //Initialize ArrayList for Event class to hold its objects as collections
        ArrayList<Event> events=new ArrayList<>();

        //Add different types of events to the same list
        events.add(new FreeEvent("Jamboo Savari","Mysore Palace to Bannimantap","2025-10-12",EventType.PROCESSION));
        events.add(new TicketedEvent("Dasara Flower Show","Nishad Bagh","2025-10-03 to 2025-10-12",EventType.CULTURAL,50.00));
        events.add(new TicketedEvent("Yuva Dasara Concerts","Maharaja's Ground","2025-10-04 to 2025-10-10",EventType.CULTURAL,20.00));
        events.add(new FreeEvent("Ahara Mela","Scouts and Guides Ground","2025-10-03 to 2025-10-11",EventType.FOOD));

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