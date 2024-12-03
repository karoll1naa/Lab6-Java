package Gemstone;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Necklace {
    private final List<Stone> stones;

    public Necklace() {
        this.stones = new ArrayList<>();
    }

    public void addStone(Stone stone) {
        if (stone == null) {
            throw new IllegalArgumentException("Камінь не може бути null");
        }
        stones.add(stone);
    }

    public double calculateWeight() {
        return stones.stream().mapToDouble(Stone::getWeight).sum();
    }

    public double calculateCost() {
        return stones.stream().mapToDouble(Stone::getCost).sum();
    }

    public void sortByCost() {
        stones.sort(Comparator.comparingDouble(Stone::getCost));
    }

    public List<Stone> findByTransparency(double minTransparency, double maxTransparency) {
        if (minTransparency < 0 || maxTransparency > 1 || minTransparency > maxTransparency) {
            throw new IllegalArgumentException("Невірний діапазон прозорості");
        }
        return stones.stream()
                .filter(stone -> stone.getTransparency() >= minTransparency && stone.getTransparency() <= maxTransparency)
                .toList();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Намисто:\n");
        stones.forEach(stone -> sb.append(stone).append("\n"));
        return sb.toString();
    }
}