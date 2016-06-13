package com;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class GuessGame {

    public static void main(String[] args) {
        String input;
        int guess = 0;
        List<String> highList = fillList(true);
        List<String> lowList = fillList(false);

        Random r = new Random();
        int number = r.nextInt(100);


        System.out.println(number);

        input = JOptionPane.showInputDialog("Guess the number I am thinking about");


        do {
            try {
                if (input == null || input.isEmpty()) {
                    System.out.println("Cancel");
                    return;
                }
                guess = Integer.parseInt(input);
                if (guess > number) {
                    int textIndexHigh = r.nextInt(highList.size());
                    input = JOptionPane.showInputDialog(highList.get(textIndexHigh));
                } else if (guess < number) {
                    int textIndexLow = r.nextInt(lowList.size());
                    input = JOptionPane.showInputDialog(lowList.get(textIndexLow));
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                input = JOptionPane.showInputDialog("Noob");
            }
        } while (guess != number);

        JOptionPane.showMessageDialog(null, "Correct");
    }

    public static List<String> fillList (boolean isHigh) {
        List<String> list = new ArrayList<>();
        if (isHigh) {
            list.add("Too High. Try again");
            list.add("This number is too high");
            list.add("Well, my dear, try one more time. The number is too high");
            list.add("You must be kidding me! This number is too large");
            list.add("No, you are wrong! This number is higher then I think");
            list.add("Jack, think again. The number is too high");
            list.add("You guessed the number too small. Try better!");
        } else {
            list.add("Too Low. Try again");
            list.add("The number is too low. Think again!");
            list.add("My buddy, you should try one more time. The number is too low");
            list.add("Try to think higher. The number is too low");
            list.add("You should want more. The number is too small");
            list.add("You have no idea what the number is. Try more!");
        }
        return list;
    }

}
