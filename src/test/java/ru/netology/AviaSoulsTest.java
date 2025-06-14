package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.comparators.TicketTimeComparator;

public class AviaSoulsTest {

    Ticket ticket1 = new Ticket("Москва", "Калининград", 6_800, 12, 15);
    Ticket ticket2 = new Ticket("Москва", "Калининград", 13_982, 13, 23);
    Ticket ticket3 = new Ticket("Томск", "Новосибирск", 12_652, 14, 22);
    Ticket ticket4 = new Ticket("Москва", "Калининград", 15_122, 15, 21);
    Ticket ticket5 = new Ticket("Москва", "Калининград", 8_994, 16, 24);

    AviaSouls tickets = new AviaSouls();

    @BeforeEach
    public void start() {
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
    }

    @Test  // Должен вернуть список в порядке возрастания цены
    public void shouldListSortedInAscendingOrder() {

        Ticket[] expected = tickets.search("Москва", "Калининград");
        Ticket[] actual = { ticket1, ticket5, ticket2, ticket4 };

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test  // Должен вернуть список сортированный по времени полета
    public void shouldListSortedByFlightTime() {

        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] expected = tickets.searchAndSortBy("Москва", "Калининград", comparator);
        Ticket[] actual = { ticket1, ticket4, ticket5, ticket2 };

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test  // Должен выбирать билет с меньшей стоимостью
    public void shouldChooseTicketWithLowerPrice() {

        int expected = ticket2.compareTo(ticket4);
        int actual = -1;

        Assertions.assertEquals(expected, actual);

    }
}
