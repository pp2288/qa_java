package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CatTest {

    // Тест: getSound() возвращает "Мяу"
    @Test
    public void getSoundReturnsMeow() {
        Cat cat = new Cat(new Feline());
        assertEquals("Мяу", cat.getSound());
    }

    // Тест: getFood() возвращает еду хищника (через мок)
    @Test
    public void getFoodReturnsMeatList() throws Exception {
        // Создаём мок — подставной объект Feline
        Feline mockFeline = mock(Feline.class);

        // мок: когда вызовут eatMeat(), вернуть список еды
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.eatMeat()).thenReturn(expected);

        // Создаём Cat с моком
        Cat cat = new Cat(mockFeline);

        // Проверяем результат
        assertEquals(expected, cat.getFood());
    }
}