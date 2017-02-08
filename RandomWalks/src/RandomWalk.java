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
public class RandomWalk {

    private int xstart;
    private int ystart;
    private int max;
    private int steps;
    private int edge;

    RandomWalk(int max, int edge) {
        this.max = max;
        this.edge = edge;
        xstart = 0;
        ystart = 0;
        steps = 0;
    }

    RandomWalk(int max, int edge, int xstart, int ystart) {
        this.max = max;
        this.edge = edge;
        this.xstart = xstart;
        this.ystart = ystart;
    }

    public String toString() {
        return "steps: " + steps + "\n" + "position: " + "(" + xstart + "," + ystart + ")";

    }

    public void takeStep() {
        // up = 1 down = 2 left = 3 right = 4  
        Random rand = new Random();

        int n = rand.nextInt(4) + 1;
        System.out.println(n);

        switch (n) {
            case 1://right
                xstart++;
                break;
            
            case 1://right
                xstart++;
                break;
            case 1://right
                xstart++;
                break;
            case 1://right
                xstart++;
                break;

        }
    }

}
