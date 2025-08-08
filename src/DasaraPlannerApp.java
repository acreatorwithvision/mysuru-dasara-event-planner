//Using ArrayList to store the collection of events.
import java.util.ArrayList;


public class DasaraPlannerApp{
    public static void main(String[] args){
        //create Event object
        Event jumbooSavari = new Event();
        jumbooSavari.eventName="Jumbo Savari(Procession)";
        jumbooSavari.venue="Mysore Palace to Bannimantap";
        jumbooSavari.eventDate="15-10-2025";

        //create visitor object to add a person
        Visitor firstVisitor=new Visitor();
        firstVisitor.visitorName="Suhas G";
        firstVisitor.phoneNumber="8928734644";

        //Print all the details to the console
        System.out.println("--Mysore Dasara Event Planner 2025--");
        System.out.println("\nFeatured Event Details: ");
        System.out.println("Event Name: "+jumbooSavari.eventName);
        System.out.println("Event Venue: "+jumbooSavari.venue);
        System.out.println("Event Date: "+jumbooSavari.eventDate);

        //Print registered users to the console
        System.out.println("\nRegistered Visitor Details");
        System.out.println("Visitor Name: "+firstVisitor.visitorName);
        System.out.println("Visitor Contact Number: "+firstVisitor.phoneNumber);
    }
}