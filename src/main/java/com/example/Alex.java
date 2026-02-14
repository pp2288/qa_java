package com.example;

import java.util.List;

public class Alex extends Lion {

    // Конструктор: Алекс всегда самец, поэтому передаём "Самец"
    public Alex(Feline feline) throws Exception {
        super("Самец", feline);
    }

    // У Алекса нет львят
    @Override
    public int getKittens() {
        return 0;
    }

    // Друзья Алекса
    public List<String> getFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }

    // Место жительства Алекса
    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}