import java.util.ArrayList;

public class TicketSystem {
    static int nextTicketIndex = 0;
    static int ticketIndex;
    static ArrayList<Integer> tickets = new ArrayList<>();


    TicketSystem() {

    }

    public static class Ticket {
        public Ticket() {
            ticketIndex = nextTicketIndex++;
            tickets.add(ticketIndex);
            System.out.println("Added ticket # " + ticketIndex);
            System.out.println("-----------------");
        }
    }

    public static class ServeCustomer {
        public ServeCustomer() {
            System.out.println("Ticket served " + tickets.get(0) + ", next ticket: " + tickets.get(1));

            tickets.remove(0);
            System.out.println("-----------------");

        }
    }
    public static class PrintQueue {
        public PrintQueue() {
            System.out.println("Tickets left: ");
            for (int i = 0; i < tickets.size();i++)
            {
                System.out.println(tickets.get(i));
            }
            System.out.println("-----------------");
        }
    }
}
