package com.example;

import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class LionTest {

    // Тест: конструктор бросает исключение при некорректном поле
    @Test(expected = Exception.class)
    public void constructorWithInvalidSexThrowsException() throws Exception {
        Feline mockFeline = mock(Feline.class);
        new Lion("Неизвестно", mockFeline);
    }

    // Тест: getKittens() возвращает результат от feline
    @Test
    public void getKittensReturnsFelineKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        when(mockFeline.getKittens()).thenReturn(3);

        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(3, lion.getKittens());
    }

    // Тест: getFood() возвращает еду хищника
    @Test
    public void getFoodReturnsMeatList() throws Exception {
        Feline mockFeline = mock(Feline.class);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Хищник")).thenReturn(expected);

        Lion lion = new Lion("Самец", mockFeline);
        assertEquals(expected, lion.getFood());
    }
}