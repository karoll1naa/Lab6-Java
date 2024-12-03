package Main;

import Gemstone.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            CollectionSet<Stone> gemstoneSet = new CollectionSet<Stone>();
            gemstoneSet.add(new Gemstone("Сапфір", 2.5, 7000, 0.85));
            gemstoneSet.add(new SemiPreciousStone("Смарагд", 1.0, 4000, 0.9));
            gemstoneSet.add(new SemiPreciousStone("Опал", 1.8, 2000, 0.6));

            System.out.println("Камені в наборі: ");
            System.out.println(gemstoneSet);

            Necklace necklace = new Necklace();
            necklace.addStone(new Gemstone("Сапфір", 2.5, 7000, 0.85));
            necklace.addStone(new Gemstone("Смарагд", 1.0, 4000, 0.9));
            necklace.addStone(new SemiPreciousStone("Опал", 1.5, 2000, 0.6));

            System.out.println("\nЗагальна вага намиста: " + necklace.calculateWeight() + " каратів");
            System.out.println("Загальна вартість намиста: " + necklace.calculateCost());

            System.out.println("\nДо сортування:");
            System.out.println(necklace);
            necklace.sortByCost();
            System.out.println("\nПісля сортування:");
            System.out.println(necklace);

            System.out.println("\nКамені з прозорістю від 0.75 до 1.0:");
            List<Stone> filteredStone = necklace.findByTransparency(0.75, 1.0);
            filteredStone.forEach(System.out::println);
        } catch (IllegalArgumentException e) {
            System.err.println("Помилка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непередбачена помилка: " + e.getMessage());
        }
    }
}
