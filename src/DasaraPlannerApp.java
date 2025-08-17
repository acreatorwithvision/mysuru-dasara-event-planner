//Using ArrayList to store the collection of events.
import java.util.ArrayList;
import java.util.Scanner; //Scanner class for user input
import java.io.FileWriter; // to write on files
import java.io.IOException; //to handle errors on files

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
            System.out.println("1. View all events"); //view events
            System.out.println("2. Register for an event"); //register to an event
            System.out.println("2. Exit"); //exit from main menu and program
            System.out.println("Enter your choice");


            //Asking for an int input 1 or 2 from user
            int choice = scanner.nextInt();
            scanner.nextLine(); //consume the leftover newline character

            System.out.println("\n");
            if (choice == 1) {
                System.out.println("All the Dasara events this year\n");
                for (int i=0;i<events.size();i++) {
                    System.out.println("Event #"+(i+1));
                    events.get(i).displayDetails();
                    System.out.println("--------------");
                }
            }
            else if(choice==2){
                //Registration block
                System.out.println("Enter your name");
                String visitorName=scanner.nextLine();

                //takes input for the event number to register to
                System.out.println("Enter the Event # you want to register for:");
                int eventNumber = scanner.nextInt();

                //This block favors a condition where it checks the event to register is within the created rang
                if (eventNumber>0 && eventNumber <=events.size()){
                    Event selectedEvent=events.get(eventNumber-1);

                    //Using try-with-resource helps write to a file making sure the writer is closed
                    //after used once.
                    //"true" flag sets the program to append to the file not overwrite it.

                    try(FileWriter writer=new FileWriter("registrations.txt",true)){
                        writer.write("Visitor: "+ visitorName +", Event: "+ selectedEvent.EventName +"\n");
                        System.out.println("Registration complete..! Your details are saved.");
                    }
                    catch(IOException e){
                        //this block will execute when the try block fails with an exception
                        System.out.println("Error! Could not register to the event.");
                        e.printStackTrace();
                    }
                }else{
                    //If the choice exceeds out of the range, then this else executes
                    System.out.println("Invalid Event number");

                }
            }
            else if(choice==3){
                isRunning=false;
                System.out.println("Thanks for using Namma Mysuru Dasara Planner. GoodBye!")
            }
            else {
                System.out.println("Invalid option, try again");
            }
        }
        scanner.close();
    }
}