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
                case "1" -> ticket();
                case "2" -> serveCustomer();
                case "3" -> printQueue();
                case "4" -> quit();
                default -> System.out.println("Invalid menu choice, please choose 1-4.");
            }
        }
    }
    public void ticket(){
        new TicketSystem.Ticket();

    }
    public void serveCustomer() {
        new TicketSystem.ServeCustomer();

    }
    public void printQueue() {
        new TicketSystem.PrintQueue();
    }
    public void quit() {
        System.out.println("System is shutting down...");
        System.exit(0);
    }
}
