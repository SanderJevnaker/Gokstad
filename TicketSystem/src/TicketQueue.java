import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;

public class TicketQueue {

    public TicketQueue() {

    }

    public void ticketMenu() {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("1 - Add Ticket");
            System.out.println("2 - Serve Customer");
            System.out.println("3 - Print Queue");
            System.out.println("4 - Quit");

            String choice = scan.nextLine();


            switch (choice) {
                case "1":
                    ticket();
                    break;
                case "2":
                    serveCustomer();
                    break;
                case "3":
                    printQueue();
                    break;
                case "4":
                    quit();
                    break;
                default:
                    System.out.println("Invalid menu Choice. Please choose 1-4.");
                    break;
            }
        }
    }
    public void ticket(){
        TicketSystem.Ticket addTicket = new TicketSystem.Ticket();

    }
    public void serveCustomer() {
        TicketSystem.ServeCustomer testServe = new TicketSystem.ServeCustomer();

    }
    public void printQueue() {
        TicketSystem.PrintQueue testPrint = new TicketSystem.PrintQueue();
    }
    public void quit() {
        System.out.println("System is shutting down...");
        System.exit(0);
    }
}
