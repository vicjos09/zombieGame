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
public class Board {
    int size;
    public Square squares[][];

    public Square[][] getSquares() {
        return squares;
    }

   
    public int getSize() {
        return size;
    }

    public void setSquares(Square[][] squares) {
        this.squares = squares;
    }
    public Board(){
        size=0;
    }
    public Board(int size) {
        
         this.size=size;
         this.squares = new Square[size][size];
         
            for(int i=0;i<10;i++){
             for(int j=0;j<10;j++){
                squares[i][j]= new Square("vacio");
                 } 
                }
               }
    @Override
    public String toString(){
      String str = "";
      for(int i=0;i<10;i++){
          str += "|";
         for(int j=0;j<10;j++){
                
                if(squares[i][j].getItis()=="vacio"){
                   str += "." ;   
                }
                else if(squares[i][j].getItis()=="human"){
                   str += "H" ; 
                }
               
                else if(squares[i][j].getItis()=="FlashZ"){
                   str += "f" ; 
                }
                else if(squares[i][j].getItis()=="NormalZ"){
                   str += "N" ; 
                }
                else if(squares[i][j].getItis()=="CamouflageZ"){
                   str += "C" ; 
                }
             }
         str += "|\n";
       }
      return str;
    }
    
   
}
