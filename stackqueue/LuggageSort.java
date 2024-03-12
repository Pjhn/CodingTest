package codingtst.stackqueue;

import java.util.*;

public class LuggageSort {
    static class Luggage {

        String name;
        int weight;

        public Luggage(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

    }

    public static void main(String[] args) {
        List<Luggage> luggages = new ArrayList<>(Arrays.asList(
                new Luggage("A", 12),
                new Luggage("B", 12),
                new Luggage("C", 25),
                new Luggage("D", 7),
                new Luggage("E", 15),
                new Luggage("F", 6),
                new Luggage("G", 22),
                new Luggage("H", 16),
                new Luggage("I", 5),
                new Luggage("J", 18)
        ));


        List<Stack<Luggage>> stacks = new ArrayList<>();
        Stack<Luggage> currentStack = new Stack<>();
        int currentWeight = 0;

        for (Luggage luggage : luggages) {
            if (currentWeight + luggage.weight <= 30) {
                currentWeight += luggage.weight;
                currentStack.push(luggage);
            } else {

                stacks.add(currentStack);
                currentStack = new Stack<>();
                currentStack.push(luggage);
                currentWeight = luggage.weight;

            }
        }
        stacks.add(currentStack);

        //comparator 람다식 구현
        stacks.sort((o1, o2) -> getTotalWeight(o1)-getTotalWeight(o2));

        System.out.println("짐 나오는 순서:");
        for (int i = stacks.size() - 1; i >= 0; i--) {
            Stack<Luggage> stack = stacks.get(i);
            while (!stack.isEmpty()) {
                System.out.print(stack.pop().name + " ");
            }
        }
    }

    private static int getTotalWeight(Stack<Luggage> stack) {
        int sum = 0;
        for (Luggage luggage : stack) {
            sum += luggage.weight;
        }
        return sum;
    }
}

