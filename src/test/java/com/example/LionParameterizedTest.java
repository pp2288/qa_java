package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    // Набор параметров: пол и есть ли грива
    @Parameterized.Parameters
    public static Object[][] getData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false},
        };
    }

    // Тест: doesHaveMane() возвращает значение в зависимости от пола
    @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion(sex, mockFeline);
        assertEquals(expectedHasMane, lion.doesHaveMane());
    }
}