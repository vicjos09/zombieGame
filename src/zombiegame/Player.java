/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;


public class Player {
    String name; 

    
    int hp;
    int positionX;
    int positionY;
    int attack;
    int speed;
    //image  skin;
    int direction;
    //Sonidos
    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getDirection() {
        return direction;
    }
    
     public String toString() {
        return  ": name:" + getName() ;
    }
    
    
     public Player() {
        name = "";
        positionX= 0;
        positionY=0;
        attack=0;
        speed=0;
        direction=0;
   
      }
      public Player(String name,int positionX,int positionY, int attack, int speed,
                            int direction) {
          
         this.name = name;
         this.positionX=positionX;
         this.positionY=positionY;
         this.attack=attack;
         this.speed=speed;
         this.direction=direction;
         
 
      }
    
}
