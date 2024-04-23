package ratio.softserve.academy;

import ratio.softserve.academy.hw.Homework1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Consumer<Integer>> steps = new HashMap<>();
        steps.put(1, new Homework1());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the homework you want to run:");
        int homeworkNumber = scanner.nextInt();
        System.out.println("Enter the number of the homework part you want to run:");
        int homeworkNumberStep = scanner.nextInt();

        Consumer<Integer> step = steps.get(homeworkNumber);
        if (step != null) {
            step.accept(homeworkNumberStep);
        } else {
            System.out.println("Invalid homework number.");
        }
    }
}