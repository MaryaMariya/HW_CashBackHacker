package ru.netology.service;


public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldSuggestAddingOn500() {
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldSuggestAddingOn900() {
        int amount = 100;

        int actual = service.remain(amount);
        int expected = 900;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldSuggestAddingOn0() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldSuggestAddingOn1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldSuggestAddingOn1() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        org.testng.Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldSuggestAddingOn100IfAmountMoreThen1000() {
        int amount = 1900;

        int actual = service.remain(amount);
        int expected = 100;

        org.testng.Assert.assertEquals(actual, expected);
    }

}