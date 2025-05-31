package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {

    Ticket ticket1 = new Ticket("Москва", "Калининград", 6_800, 12, 15);
    Ticket ticket2 = new Ticket("Москва", "Томск", 13_982, 13, 23);
    Ticket ticket3 = new Ticket("Томск", "Новосибирск", 12_652, 14, 22);
    Ticket ticket4 = new Ticket("Новосибирск", "Екатеринбург", 15_122, 15, 21);
    Ticket ticket5 = new Ticket("Екатеринбург", "Краснодар", 8_994, 16, 25);

    @Test  // Должен выбирать билет с меньшей стоимостью
    public void shouldChooseTicketWithLowerPrice() {

        int expected = ticket2.compareTo(ticket4);
        int actual = -1;

        Assertions.assertEquals(expected, actual);

    }

}
