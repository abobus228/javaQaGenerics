package ru.netology.comparators;

import java.util.Comparator;
import ru.netology.Ticket;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        if ((o1.getTimeTo() - o1.getTimeFrom()) < (o2.getTimeTo() - o2.getTimeFrom())) {
             return -1;
        } else if ((o1.getTimeTo() - o1.getTimeFrom()) > (o2.getTimeTo() - o2.getTimeFrom())) {
            return 1;
        } else {
            return 0;
        }
    }

}
