/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiegame;

/**
 *
 * @author Joseph
 */
public class Human extends Player {
    int score;
    
    
    
    public int getScore() {
        return score;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    
    public Human() {
        super();
        name="";
        score= 0;
        
   
        }
   
    public Human (String name,int positionX,int positionY, int attack, int speed,int direction) {
         super(name, positionX, positionY,attack,speed,direction); 
         
         this.score=score;

    }
     public String toString() {
        return  ": name:" + getName() + ": score:" + getScore();
    }
    
    
}
