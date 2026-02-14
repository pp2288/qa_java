package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class FelineTest {

    // Тест: eatMeat() возвращает список еды для хищника
    @Test
    public void eatMeatReturnsListOfMeat() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    // Тест: getFamily() возвращает "Кошачьи"
    @Test
    public void getFamilyReturnsCatFamily() {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    // Тест: getKittens() без аргументов возвращает 1
    @Test
    public void getKittensWithoutArgsReturnsOne() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }

    // Тест: getKittens(int) возвращает переданное число
    @Test
    public void getKittensWithArgsReturnsCount() {
        Feline feline = new Feline();
        assertEquals(5, feline.getKittens(5));
    }
}