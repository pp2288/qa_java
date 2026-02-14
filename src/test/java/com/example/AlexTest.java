package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class AlexTest {

    // Тест: getKittens() возвращает 0
    @Test
    public void getKittensReturnsZero() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Alex alex = new Alex(mockFeline);
        assertEquals(0, alex.getKittens());
    }

    // Тест: getFriends() возвращает список друзей
    @Test
    public void getFriendsReturnsCorrectList() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Alex alex = new Alex(mockFeline);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alex.getFriends());
    }

    // Тест: getPlaceOfLiving() возвращает Нью-Йоркский зоопарк
    @Test
    public void getPlaceOfLivingReturnsNewYorkZoo() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Alex alex = new Alex(mockFeline);
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    // Тест: doesHaveMane() возвращает true (Алекс — жто самец)
    @Test
    public void doesHaveManeReturnsTrue() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Alex alex = new Alex(mockFeline);
        assertTrue(alex.doesHaveMane());
    }
}