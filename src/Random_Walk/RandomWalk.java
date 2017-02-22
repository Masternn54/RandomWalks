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
    private int maxsteps;
    private int steps;
    private int edge;
    private int maxDistance;

    RandomWalk(int max, int edge) {
        this.maxsteps = maxsteps;
        this.edge = edge;
        xstart = 0;
        ystart = 0;
        steps = 0;
        maxDistance = 0;
    }

    RandomWalk(int maxsteps, int edge, int xstart, int ystart) {
        this.maxsteps = maxsteps;
        this.edge = edge;
        this.xstart = xstart;
        this.ystart = ystart;
        this.maxDistance = maxDistance;
    }

    public String toString() {
        return "steps: " + steps + "\n" + "position: " + "(" + xstart + "," + ystart + ")";

    }
// a switch statement that chooses which way the person walks.

    public void takeStep() {
        // up = 1 down = 2 left = 3 right = 4  
        Random rand = new Random();

        int n = rand.nextInt(4) + 1;

        switch (n) {
            case 1://right
                xstart++;
                System.out.println(steps++);
                System.out.println("you walked to the Right");
                break;

            case 2://left
                xstart--;
                System.out.println(steps++);
                System.out.println("you walked to the Left");
                break;
            case 3://up
                ystart++;
                System.out.println(steps++);
                System.out.println("you walked Forward");
                break;
            case 4://down
                ystart--;
                System.out.println(steps++);
                System.out.println("you walked Backwards");
                break;

        }
        maxDistance = max(maxDistance, (Math.max(Math.abs(xstart), Math.abs(ystart))));
    }

    //finds the largest of the 2 numbers.
    private int max(int num1, int num2) {
        int largest = 0;
        if (num1 > num2) {
            largest = num1;

        } else {
            largest = num2;
        }
        return largest;
    }

    //returns the max distance.
    public int getmaxDistance() {
        return maxDistance;
    }
//returns true if the number of steps taken is less than the maximum number; '
//return false otherwise

    public boolean moreSteps() {
        if (steps < maxsteps) {
            return true;
        } else {
            return false;
        }

    }

//returns true if the current position is on the square (include the boundary as part of the
//square); returns false otherwise
    public boolean inBounds() {
        if (xstart + ystart < edge) {
            return true;
        } else {
            return false;
        }

    }
//Add to the RandomWalk class a method named walk that has no parameters and returns nothing. Its job is to
//simulate a complete random walk. That is, it should generate a sequence of steps as long the maximum number of
//steps has not been taken and it is still in bounds (inside the square). This should be a very simple loop (while or do...
//while) --- you will need to call the methods takeStep, moreSteps, and inBounds.

    void walk() {
        while (moreSteps() && inBounds()) {
            takeStep();
            System.out.println(this.toString());

        }
        if (!moreSteps()) {
            System.out.println("Out of steps");
        }
        if (!inBounds()) {
            System.out.println("Out of bounds");
        }
    }

    public int getX() {
        return xstart;
    }

    public int getY() {
        return ystart;
    }

}
