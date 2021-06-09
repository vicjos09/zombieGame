package zombiegame;

import com.sun.tools.javac.Main;
import java.awt.Image;
import java.util.ArrayList;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Joseph
 */
public class ZombieGame {

    Player human;
    Player zombie;
    Zombie flashZombie;
    Zombie strongZombie;
    Zombie fatZombie;
    Zombie camuflageZombie;
    public Board board;
    ArrayList<Zombie> zombies;

    public ArrayList<Zombie> getZombies() {

        return zombies;

    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public Player getHuman() {
        return human;
    }

    public Player getZombie() {
        return zombie;
    }

    public Zombie getFlashZombie() {
        return flashZombie;
    }

    public Zombie getStrongZombie() {
        return strongZombie;
    }

    public Zombie getFatZombie() {
        return fatZombie;
    }

    public Zombie getCamuflageZombie() {
        return camuflageZombie;
    }

    public void setHuman(Player human) {
        this.human = human;
    }

    public void setZombie(Player zombie) {
        this.zombie = zombie;
    }

    public void setFlashZombie(Zombie flashZombie) {
        this.flashZombie = flashZombie;
    }

    public void setStrongZombie(Zombie strongZombie) {
        this.strongZombie = strongZombie;
    }

    public void setFatZombie(Zombie fatZombie) {
        this.fatZombie = fatZombie;
    }

    public void setCamuflageZombie(Zombie camuflageZombie) {
        this.camuflageZombie = camuflageZombie;
    }

    public void start() {
        System.out.println("El juego ha iniciado");
        System.out.println(human.toString());
        System.out.println(board.toString());

    }

    public ZombieGame() {
        // String name,int positionX,int positionY, int attack, int speed,int score   
        human = new Human("Jugador1", 5, 4, 4, 5, 6);
        board = new Board(100);
        board.squares[5][5] = new Square("human");
        //Crear zombie

    }

    public int readBoard(int positionX, int positionY) {
        if ("vacio".equals(board.squares[positionX][positionY].getItis())) {
            return 0;
        }
        return 1;
    }

    public void crearZ() {
        //drawimage panel metodo paint grphics 2d
        //key listener gui
        int zombieT = (int) (Math.random() * 3);
        int x, y;

        if (zombieT == 4) {
            boolean zombiePlaced = false;
            do {
                x = (int) (Math.random() * 9);
                y = (int) (Math.random() * 9);
                if (0 == readBoard(x, y)) {
                    board.squares[x][y] = new Square("FatZ");
                    zombiePlaced = true;
                }

            } while (!zombiePlaced);
        }
        if (zombieT == 0) {
            boolean zombiePlaced = false;
            do {
                x = (int) (Math.random() * 9);
                y = (int) (Math.random() * 9);
                if (0 == readBoard(x, y)) {
                    board.squares[x][y] = new Square("FlashZ");
                    zombiePlaced = true;
                }

            } while (!zombiePlaced);
        }
        if (zombieT == 1) {
            boolean zombiePlaced = false;
            do {
                x = (int) (Math.random() * 9);
                y = (int) (Math.random() * 9);
                if (0 == readBoard(x, y)) {
                    board.squares[x][y] = new Square("NormalZ");
                    zombiePlaced = true;
                }

            } while (!zombiePlaced);
        }
        if (zombieT == 2) {
            boolean zombiePlaced = false;
            do {
                x = (int) (Math.random() * 9);
                y = (int) (Math.random() * 9);
                if (0 == readBoard(x, y)) {
                    board.squares[x][y] = new Square("CamouflageZ");
                    zombiePlaced = true;
                }

            } while (!zombiePlaced);
        }

        System.out.println(board.toString());

    }

    public int setPositionX() {
        int pos = 0;

        for (int conta = 0; conta < 10; conta++) {
            for (int conta2 = 0; conta2 < 10; conta2++) {
                if ("human".equals(board.squares[conta][conta2].getItis())) {
                    pos = conta;
                }

            }
        }
        return pos;

    }

    public int setPositionY() {

        int pos = 0;

        for (int conta = 0; conta < 10; conta++) {
            for (int conta2 = 0; conta2 < 10; conta2++) {
                if ("human".equals(board.squares[conta][conta2].getItis())) {
                    pos = conta2;
                }

            }
        }
        return pos;
    }

    public void MovimientoD(javax.swing.JProgressBar scoreHuman) {

        int x = setPositionX();
        int y = setPositionY();
        if (y != 9) {

            board.squares[x][y] = new Square("vacio");
            if(board.squares[x][y + 1].getItis().contains("Z")){
                playSound();
            scoreHuman.setValue(scoreHuman.getValue() + 30);
            }
            board.squares[x][y + 1] = new Square("human");
            
            

        }

    }

    public void MovimientoI(javax.swing.JProgressBar scoreHuman) {

        int x = setPositionX();
        int y = setPositionY();
        if (y != 0) {

            board.squares[x][y] = new Square("vacio");
            if(board.squares[x][y - 1].getItis().contains("Z")){
                playSound();
            scoreHuman.setValue(scoreHuman.getValue() + 10);
            }
            
            board.squares[x][y - 1] = new Square("human");
            

        }

    }

    public void MovimientoUp(javax.swing.JProgressBar scoreHuman) {

        int x = setPositionX();
        int y = setPositionY();
        if (x != 0) {

            board.squares[x][y] = new Square("vacio");
            if(board.squares[x-1][y].getItis().contains("Z")){
                playSound();
            scoreHuman.setValue(scoreHuman.getValue() + 20);
            }
            board.squares[x - 1][y] = new Square("human");

        }

    }

    public void MovimientoAbajo(javax.swing.JProgressBar scoreHuman) {

        int x = setPositionX();
        int y = setPositionY();
        if (x != 9) {

            board.squares[x][y] = new Square("vacio");
            if(board.squares[x+1][y].getItis().contains("Z")){
                playSound();
            scoreHuman.setValue(scoreHuman.getValue() + 20);
            }
            board.squares[x + 1][y] = new Square("human");

        }

    }
    public static synchronized void playSound() {
    /*new Thread(new Runnable() {
  // The wrapper thread is unnecessary, unless it blocks on the
  // Clip finishing; see comments.
    public void run() {
      try {
        Clip clip = AudioSystem.getClip();
        AudioInputStream inputStream = AudioSystem.getAudioInputStream(
          Main.class.getResourceAsStream("/Imagenes/disparo.mp3"));
        clip.open(inputStream);
        clip.start(); 
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  }).start();*/
    java.awt.Toolkit.getDefaultToolkit().beep();
}
}


       
          


    
        
    
         

