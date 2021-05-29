package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestApi {

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }

   @Test
   void shouldReturn100IfAmountIs900() {
       CashbackHackService service = new CashbackHackService();
       int amount = 900;
       int actual = service.remain(amount);
       int expected = 100;
       assertEquals(expected, actual);
   }

   @Test
    void shouldReturn200IfAmountIs800() {
       CashbackHackService service = new CashbackHackService();
       int amount = 800;
       int actual = service.remain(amount);
       int expected = 200;
       assertEquals(expected, actual);
   }

}