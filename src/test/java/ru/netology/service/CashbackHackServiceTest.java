package ru.netology.service;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void testRemainBoundaryValuesTwo() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        org.junit.Assert.assertEquals(1000, service.remain(0));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesThree() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        org.junit.Assert.assertEquals(999, service.remain(1));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesFour() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;
        org.junit.Assert.assertEquals(1, service.remain(999));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesFive() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        org.junit.Assert.assertEquals(0, service.remain(1000));
    }

    @org.junit.Test
    public void testRemainBoundaryValuesSix() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;
        org.junit.Assert.assertEquals(999, service.remain(1001));
    }

    @org.junit.Test
    public void testRemainCriticalPath() {
        int amount = 400;

        int actual = service.remain(amount);
        int expected = 600;
        org.junit.Assert.assertEquals(600, service.remain(400));
    }
}