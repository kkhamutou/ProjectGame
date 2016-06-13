package com;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class GuessGame {

    public static void main(String[] args) {
        String input;
        int guess = 0, num;
        List highList = new ArrayList();
        highList.addAll("Too High. Try again","Think again. ",
                "This number is too high",
                "Well, my dear, try one more time. The number is too high" );

        Random r = new Random();
        num = r.nextInt(100);
        //System.out.println(num);

        input = JOptionPane.showInputDialog("Guess the number I an thinking");


        do {
            try {

                guess = Integer.parseInt(input);
                if (guess > num) {
                    input = JOptionPane.showInputDialog("Too High. Try again");

                } else if (guess < num) {
                    input = JOptionPane.showInputDialog("Too low. Try again");

                }
            } catch ( Exception e) {
                e.printStackTrace();
                return;
                //JOptionPane.showMessageDialog(null, "Wrong Character");
                //break;
                //JOptionPane.showMessageDialog(1, "Wrong character");
                //guess = Integer.parseInt(input);
            }
        }

        while (guess != num);

        if (guess == num) {
            JOptionPane.showMessageDialog(null, "Correct");
        }

    }
}
