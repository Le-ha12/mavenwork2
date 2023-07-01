package ru.netology.services;

import org.junit.jupiter.api.Test;

public class ServiceRestTest {
    @Test
    public void testServiseRestIncome() {
        Service service = new Service();
        int expected = 3;
        int income = 100_000; //доход
        int expenses = 60_000; //обязательные месячные траты
        int threshold = 150_000; //есть возможность отдохнуть
        int actual = service.calculate(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха: " + actual);
    }
}
