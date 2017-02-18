/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random_Walk;

/**
 *
 * @author Nichlas
 */
public class DrunkenWalk {
    private static int outofBounds;

    public static void main(String[] args) {
        
         for (int i = 0; i < 100; i++)
        {
            RandomWalk DrunkWalk = new RandomWalk(200, 50);
            
            DrunkWalk.walk();
            
            System.out.println(DrunkWalk.toString());
            
            
             if (DrunkWalk.inBounds() == false)
            {
                outofBounds++;
                System.out.println("You went outside the square");
            }
            
        }
        
        System.out.println("the number of times he fell off: " + outofBounds);
        
    }
    
}
    


