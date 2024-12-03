package Main;

import Gemstone.*;

public class Main {
    public static void main(String[] args) {
        CollectionSet<Stone> gemstoneSet = new CollectionSet<Stone>();
        gemstoneSet.add(new Gemstone("Рубін", 1.2, 3000, 0.8));
        gemstoneSet.add(new SemiPreciousStone("Діамант", 1.5, 5000, 0.95));
        gemstoneSet.add(new SemiPreciousStone("Аметист", 2.0, 1500, 0.7));

        //Виведення усієї колекції
        System.out.println("Камені в наборі: ");
        System.out.println(gemstoneSet);

        //Перевірка конструктора
        CollectionSet<Stone> singleStoneSet = new CollectionSet<>(new Gemstone("Сапфір", 2.5, 7000, 0.85));
        System.out.println("\nНабір з одного каменя: " + singleStoneSet);

        //Використання колекції для ініціалізації
        CollectionSet<Stone> collectionSet = new CollectionSet<>(gemstoneSet);
        System.out.println("\nНабір, створений з іншої колекції: " + collectionSet);
    }
}