/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random_Walk;

import java.util.Scanner;

/**
 *
 * @author Nichlas
 */

public class TestWalk {

    public static void main(String[] args) {
        RandomWalk walk1 = new RandomWalk(5, 10);
        RandomWalk walk3 = new RandomWalk(15, 200);

        int maxSteps;   // maximum number of steps in a walk
        int maxCoord;   // the maximum x and y coordinate
        int x, y;       // starting x and y coordinates for a walk

        Scanner scan = new Scanner(System.in);
        System.out.println("\nRandom Walk Test Program");
        System.out.println();
        System.out.print("Enter the boundary for the square: ");
        maxCoord = scan.nextInt();
        System.out.print("Enter the maximum number of steps: ");
        maxSteps = scan.nextInt();
        System.out.print("Enter the starting x and y coordinates with "
                + "a space between: ");
        x = scan.nextInt();
        y = scan.nextInt();

        RandomWalk walk2 = new RandomWalk(maxCoord, maxSteps, x, y);

        
        for (int i = 1; i < 6; i++) {
            walk1.takeStep();
            walk2.takeStep();
             // this will print out the steps taken and max distance however since the person 
             // can walk backwards some of the numbers may remain the same.
            System.out.println(" \n walk1 steps taken " + walk1);
            System.out.println(" \n walk2 steps taken is " + walk2);
            System.out.println(" \n walk1 maximum distance is " + walk1.getmaxDistance());
            System.out.println(" \n walk2 maximum distance is " + walk2.getmaxDistance());
        }

        walk3.walk();
        System.out.println(walk3);
    }

    public TestWalk() {

    }

}
