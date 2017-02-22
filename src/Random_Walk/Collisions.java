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
public class Collisions {

    private int largeBoundary = 2000000;
    private static int largeMaxSteps = 10000;
    private static int counter = 0;
    
    public static void main(String[] args) {
        RandomWalk particle1 = new RandomWalk(-3, 0);
        RandomWalk particle2 = new RandomWalk(3, 0);
        samePosition(particle1, particle2); 
        
        for (int i = 0; i < 100; i++) {

            particle1.takeStep();
            particle2.takeStep();
            boolean isCollided = samePosition(particle1, particle2);
            if(isCollided) 
            System.out.println("they have collided");
            
              
             System.out.println(particle1.toString());
             System.out.println(particle2.toString());
            
          //   it does return the number of collisions   
            if ((particle1.getX() == particle2.getX()) && (particle1.getY() == particle2.getY())) {
                System.out.println("number of collisions " + ++counter);

           }
            
            
        }

    }
    public static boolean samePosition (RandomWalk particle1, RandomWalk particle2){

        if((particle1.getX() == particle2.getX()) && (particle1.getY() == particle2.getY())){
          
            return true;}
        else return false;
        
        
      
        }
            
    }
    
    

