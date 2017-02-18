/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random_Walk;

import java.util.Random;

/**
 *
 * @author Nichlas
 */
public class DrunkenWalk {

    private static int xstart;
    private static int ystart;
    private static int max;
    private static int steps;
    private static int edge;
    private static int outofBounds;

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            DrunkenWalk Walk = new DrunkenWalk(max, edge);

            Walk.takeStep();

            System.out.println(Walk.toString());
        }

        if (inBounds() == true) {
            System.out.println("Still inside square");
        } else {
            outofBounds++;
            System.out.println("Out of Square");
        }

     
    }

    DrunkenWalk(int max, int edge) {
        DrunkenWalk.max = max;
        DrunkenWalk.edge = edge;
        xstart = 0;
        ystart = 0;
        steps = 0;
        outofBounds = 0;
    }

    DrunkenWalk(int max, int edge, int xstart, int ystart, int outofBounds) {
        DrunkenWalk.max = max;
        DrunkenWalk.edge = edge;
        DrunkenWalk.xstart = xstart;
        DrunkenWalk.ystart = ystart;
        DrunkenWalk.outofBounds = outofBounds;
    }
    @Override
     public String toString() {
        return "steps: " + steps + "\n" + "position: " + "(" + xstart + "," + ystart + ")";

    }

    public void takeStep() {
        // up = 1 down = 2 left = 3 right = 4  
        Random rand = new Random();

        int n = rand.nextInt(4) + 1;

        switch (n) {
            case 1://right
                xstart++;
                System.out.println(steps++);
                System.out.println("you Stumbled Right");
                break;

            case 2://left
                xstart--;
                System.out.println(steps++);
                System.out.println("you Stumbled Left");
                break;
            case 3://up
                ystart++;
                System.out.println(steps++);
                System.out.println("you Stumbled Forwards");
                break;
            case 4://down
                ystart--;
                System.out.println(steps++);
                System.out.println("you Stumbled Backwards");
                break;

        }
    }

    public boolean moreSteps() {
        if (steps < max) {
            return true;
        } else {
            return false;
        }

    }

    /**
     *
     * @return
     */
    public static boolean inBounds() {
        if (xstart + ystart < edge) {
            return true;
        } else {
            
            return false;

        }
        

    }
   
     
    
}
