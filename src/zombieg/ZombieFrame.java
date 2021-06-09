/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombieg;

import com.sun.tools.javac.Main;
import zombiegame.Board;
import zombiegame.Square;
import zombiegame.ZombieGame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class ZombieFrame extends javax.swing.JFrame {

    /**
     * Creates new form ZombieFrame
     */
    FondoPanel fondo = new FondoPanel();
    private JLabel[][] panelArray;
    ZombieGame game = new ZombieGame();
    public boolean btnx = true;
    public boolean btny = true;

    public ZombieFrame() {

        this.setContentPane(fondo);
        initComponents();
        vida.setValue(100);
        scoreHuman.setValue(0);

        panelArray = new JLabel[10][10];
        //primera Fila:
        panelArray[0][0] = jLabel1;
        panelArray[0][1] = x1y2;
        panelArray[0][2] = x1y3;
        panelArray[0][3] = x1y4;
        panelArray[0][4] = x1y5;
        panelArray[0][5] = x1y6;
        panelArray[0][6] = x1y7;
        panelArray[0][7] = x1y8;
        panelArray[0][8] = x1y9;
        panelArray[0][9] = x1y10;
        //Segunda fila
        panelArray[1][0] = x2y1;
        panelArray[1][1] = x2y2;
        panelArray[1][2] = x2y3;
        panelArray[1][3] = x2y4;
        panelArray[1][4] = x2y5;
        panelArray[1][5] = x2y6;
        panelArray[1][6] = x2y7;
        panelArray[1][7] = x2y8;
        panelArray[1][8] = x2y9;
        panelArray[1][9] = x2y10;
        //tercera fila
        panelArray[2][0] = x3y1;
        panelArray[2][1] = x3y2;
        panelArray[2][2] = x3y3;
        panelArray[2][3] = x3y4;
        panelArray[2][4] = x3y5;
        panelArray[2][5] = x3y6;
        panelArray[2][6] = x3y7;
        panelArray[2][7] = x3y8;
        panelArray[2][8] = x3y9;
        panelArray[2][9] = x3y10;
        //Cuarta fila
        panelArray[3][0] = x4y1;
        panelArray[3][1] = x4y2;
        panelArray[3][2] = x4y3;
        panelArray[3][3] = x4y4;
        panelArray[3][4] = x4y5;
        panelArray[3][5] = x4y6;
        panelArray[3][6] = x4y7;
        panelArray[3][7] = x4y8;
        panelArray[3][8] = x4y9;
        panelArray[3][9] = x4y10;
        //Quinta fila
        panelArray[4][0] = x5y1;
        panelArray[4][1] = x5y2;
        panelArray[4][2] = x5y3;
        panelArray[4][3] = x5y4;
        panelArray[4][4] = x5y5;
        panelArray[4][5] = x5y6;
        panelArray[4][6] = x5y7;
        panelArray[4][7] = x5y8;
        panelArray[4][8] = x5y9;
        panelArray[4][9] = x5y10;
        //Sexta fila
        panelArray[5][0] = x6y1;
        panelArray[5][1] = x6y2;
        panelArray[5][2] = x6y3;
        panelArray[5][3] = x6y4;
        panelArray[5][4] = x6y5;
        panelArray[5][5] = x6y6;
        panelArray[5][6] = x6y7;
        panelArray[5][7] = x6y8;
        panelArray[5][8] = x6y9;
        panelArray[5][9] = x6y10;
        //Septima fila
        panelArray[6][0] = x7y1;
        panelArray[6][1] = x7y2;
        panelArray[6][2] = x7y3;
        panelArray[6][3] = x7y4;
        panelArray[6][4] = x7y5;
        panelArray[6][5] = x7y6;
        panelArray[6][6] = x7y7;
        panelArray[6][7] = x7y8;
        panelArray[6][8] = x7y9;
        panelArray[6][9] = x7y10;
        //Octavafila
        panelArray[7][0] = x8y1;
        panelArray[7][1] = x8y2;
        panelArray[7][2] = x8y3;
        panelArray[7][3] = x8y4;
        panelArray[7][4] = x8y5;
        panelArray[7][5] = x8y6;
        panelArray[7][6] = x8y7;
        panelArray[7][7] = x8y8;
        panelArray[7][8] = x8y9;
        panelArray[7][9] = x8y10;
        //Novena fila
        panelArray[8][0] = x9y1;
        panelArray[8][1] = x9y2;
        panelArray[8][2] = x9y3;
        panelArray[8][3] = x9y4;
        panelArray[8][4] = x9y5;
        panelArray[8][5] = x9y6;
        panelArray[8][6] = x9y7;
        panelArray[8][7] = x9y8;
        panelArray[8][8] = x9y9;
        panelArray[8][9] = x9y10;
        //Decima fila
        panelArray[9][0] = x10y1;
        panelArray[9][1] = x10y2;
        panelArray[9][2] = x10y3;
        panelArray[9][3] = x10y4;
        panelArray[9][4] = x10y5;
        panelArray[9][5] = x10y6;
        panelArray[9][6] = x10y7;
        panelArray[9][7] = x10y8;
        panelArray[9][8] = x10y9;
        panelArray[9][9] = x10y10;

        game.start();

        game.crearZ();
        updateBoard();

        // jLabel1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/FastZombie.jpeg").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        x2y1 = new javax.swing.JLabel();
        x3y1 = new javax.swing.JLabel();
        x4y1 = new javax.swing.JLabel();
        x5y1 = new javax.swing.JLabel();
        x6y1 = new javax.swing.JLabel();
        x7y1 = new javax.swing.JLabel();
        x10y1 = new javax.swing.JLabel();
        x8y1 = new javax.swing.JLabel();
        x9y1 = new javax.swing.JLabel();
        x9y2 = new javax.swing.JLabel();
        x1y2 = new javax.swing.JLabel();
        x2y2 = new javax.swing.JLabel();
        x3y2 = new javax.swing.JLabel();
        x4y2 = new javax.swing.JLabel();
        x5y2 = new javax.swing.JLabel();
        x6y2 = new javax.swing.JLabel();
        x7y2 = new javax.swing.JLabel();
        x8y2 = new javax.swing.JLabel();
        x1y3 = new javax.swing.JLabel();
        x10y2 = new javax.swing.JLabel();
        x1y4 = new javax.swing.JLabel();
        x2y3 = new javax.swing.JLabel();
        x2y4 = new javax.swing.JLabel();
        x3y4 = new javax.swing.JLabel();
        x3y3 = new javax.swing.JLabel();
        x4y3 = new javax.swing.JLabel();
        x4y4 = new javax.swing.JLabel();
        x5y3 = new javax.swing.JLabel();
        x5y4 = new javax.swing.JLabel();
        x6y3 = new javax.swing.JLabel();
        x6y4 = new javax.swing.JLabel();
        x7y3 = new javax.swing.JLabel();
        x7y4 = new javax.swing.JLabel();
        x8y3 = new javax.swing.JLabel();
        x8y4 = new javax.swing.JLabel();
        x9y3 = new javax.swing.JLabel();
        x9y4 = new javax.swing.JLabel();
        x10y4 = new javax.swing.JLabel();
        x10y3 = new javax.swing.JLabel();
        x1y10 = new javax.swing.JLabel();
        x2y10 = new javax.swing.JLabel();
        x3y10 = new javax.swing.JLabel();
        x4y10 = new javax.swing.JLabel();
        x5y10 = new javax.swing.JLabel();
        x6y10 = new javax.swing.JLabel();
        x7y10 = new javax.swing.JLabel();
        x8y10 = new javax.swing.JLabel();
        x9y10 = new javax.swing.JLabel();
        x10y10 = new javax.swing.JLabel();
        x1y6 = new javax.swing.JLabel();
        x2y6 = new javax.swing.JLabel();
        x3y6 = new javax.swing.JLabel();
        x4y6 = new javax.swing.JLabel();
        x5y6 = new javax.swing.JLabel();
        x6y6 = new javax.swing.JLabel();
        x7y6 = new javax.swing.JLabel();
        x1y7 = new javax.swing.JLabel();
        x1y8 = new javax.swing.JLabel();
        x2y7 = new javax.swing.JLabel();
        x2y8 = new javax.swing.JLabel();
        x3y8 = new javax.swing.JLabel();
        x3y7 = new javax.swing.JLabel();
        x4y7 = new javax.swing.JLabel();
        x4y8 = new javax.swing.JLabel();
        x5y7 = new javax.swing.JLabel();
        x5y8 = new javax.swing.JLabel();
        x6y7 = new javax.swing.JLabel();
        x6y8 = new javax.swing.JLabel();
        x7y7 = new javax.swing.JLabel();
        x7y8 = new javax.swing.JLabel();
        x1y5 = new javax.swing.JLabel();
        x2y5 = new javax.swing.JLabel();
        x3y5 = new javax.swing.JLabel();
        x4y5 = new javax.swing.JLabel();
        x5y5 = new javax.swing.JLabel();
        x6y5 = new javax.swing.JLabel();
        x7y5 = new javax.swing.JLabel();
        x1y9 = new javax.swing.JLabel();
        x2y9 = new javax.swing.JLabel();
        x3y9 = new javax.swing.JLabel();
        x4y9 = new javax.swing.JLabel();
        x5y9 = new javax.swing.JLabel();
        x6y9 = new javax.swing.JLabel();
        x7y9 = new javax.swing.JLabel();
        x8y9 = new javax.swing.JLabel();
        x8y8 = new javax.swing.JLabel();
        x8y7 = new javax.swing.JLabel();
        x8y6 = new javax.swing.JLabel();
        x8y5 = new javax.swing.JLabel();
        x9y5 = new javax.swing.JLabel();
        x9y6 = new javax.swing.JLabel();
        x9y7 = new javax.swing.JLabel();
        x9y8 = new javax.swing.JLabel();
        x9y9 = new javax.swing.JLabel();
        x10y9 = new javax.swing.JLabel();
        x10y8 = new javax.swing.JLabel();
        x10y7 = new javax.swing.JLabel();
        x10y6 = new javax.swing.JLabel();
        x10y5 = new javax.swing.JLabel();
        vida = new javax.swing.JProgressBar();
        scoreHuman = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));

        x2y1.setBackground(new java.awt.Color(255, 255, 255));

        x3y1.setBackground(new java.awt.Color(255, 255, 255));

        x4y1.setBackground(new java.awt.Color(255, 255, 255));

        x5y1.setBackground(new java.awt.Color(255, 255, 255));

        x6y1.setBackground(new java.awt.Color(255, 255, 255));

        x7y1.setBackground(new java.awt.Color(255, 255, 255));

        x10y1.setBackground(new java.awt.Color(255, 255, 255));

        x8y1.setBackground(new java.awt.Color(255, 255, 255));

        x9y1.setBackground(new java.awt.Color(255, 255, 255));

        x9y2.setBackground(new java.awt.Color(255, 255, 255));

        x1y2.setBackground(new java.awt.Color(255, 255, 255));

        x2y2.setBackground(new java.awt.Color(255, 255, 255));

        x3y2.setBackground(new java.awt.Color(255, 255, 255));

        x4y2.setBackground(new java.awt.Color(255, 255, 255));

        x5y2.setBackground(new java.awt.Color(255, 255, 255));

        x6y2.setBackground(new java.awt.Color(255, 255, 255));

        x7y2.setBackground(new java.awt.Color(255, 255, 255));

        x8y2.setBackground(new java.awt.Color(255, 255, 255));

        x1y3.setBackground(new java.awt.Color(255, 255, 255));

        x10y2.setBackground(new java.awt.Color(255, 255, 255));

        x1y4.setBackground(new java.awt.Color(255, 255, 255));

        x2y3.setBackground(new java.awt.Color(255, 255, 255));

        x2y4.setBackground(new java.awt.Color(255, 255, 255));

        x3y4.setBackground(new java.awt.Color(255, 255, 255));

        x3y3.setBackground(new java.awt.Color(255, 255, 255));

        x4y3.setBackground(new java.awt.Color(255, 255, 255));

        x4y4.setBackground(new java.awt.Color(255, 255, 255));

        x5y3.setBackground(new java.awt.Color(255, 255, 255));

        x5y4.setBackground(new java.awt.Color(255, 255, 255));

        x6y3.setBackground(new java.awt.Color(255, 255, 255));

        x6y4.setBackground(new java.awt.Color(255, 255, 255));

        x7y3.setBackground(new java.awt.Color(255, 255, 255));

        x7y4.setBackground(new java.awt.Color(255, 255, 255));

        x8y3.setBackground(new java.awt.Color(255, 255, 255));

        x8y4.setBackground(new java.awt.Color(255, 255, 255));

        x9y3.setBackground(new java.awt.Color(255, 255, 255));

        x9y4.setBackground(new java.awt.Color(255, 255, 255));

        x10y4.setBackground(new java.awt.Color(255, 255, 255));

        x10y3.setBackground(new java.awt.Color(255, 255, 255));

        x1y10.setBackground(new java.awt.Color(255, 255, 255));

        x2y10.setBackground(new java.awt.Color(255, 255, 255));

        x3y10.setBackground(new java.awt.Color(255, 255, 255));

        x4y10.setBackground(new java.awt.Color(255, 255, 255));

        x5y10.setBackground(new java.awt.Color(255, 255, 255));

        x6y10.setBackground(new java.awt.Color(255, 255, 255));

        x7y10.setBackground(new java.awt.Color(255, 255, 255));

        x8y10.setBackground(new java.awt.Color(255, 255, 255));

        x9y10.setBackground(new java.awt.Color(255, 255, 255));

        x10y10.setBackground(new java.awt.Color(255, 255, 255));

        x1y6.setBackground(new java.awt.Color(255, 255, 255));

        x2y6.setBackground(new java.awt.Color(255, 255, 255));

        x3y6.setBackground(new java.awt.Color(255, 255, 255));

        x4y6.setBackground(new java.awt.Color(255, 255, 255));

        x5y6.setBackground(new java.awt.Color(255, 255, 255));

        x6y6.setBackground(new java.awt.Color(255, 255, 255));

        x7y6.setBackground(new java.awt.Color(255, 255, 255));

        x1y7.setBackground(new java.awt.Color(255, 255, 255));

        x1y8.setBackground(new java.awt.Color(255, 255, 255));

        x2y7.setBackground(new java.awt.Color(255, 255, 255));

        x2y8.setBackground(new java.awt.Color(255, 255, 255));

        x3y8.setBackground(new java.awt.Color(255, 255, 255));

        x3y7.setBackground(new java.awt.Color(255, 255, 255));

        x4y7.setBackground(new java.awt.Color(255, 255, 255));

        x4y8.setBackground(new java.awt.Color(255, 255, 255));

        x5y7.setBackground(new java.awt.Color(255, 255, 255));

        x5y8.setBackground(new java.awt.Color(255, 255, 255));

        x6y7.setBackground(new java.awt.Color(255, 255, 255));

        x6y8.setBackground(new java.awt.Color(255, 255, 255));

        x7y7.setBackground(new java.awt.Color(255, 255, 255));

        x7y8.setBackground(new java.awt.Color(255, 255, 255));

        x1y5.setBackground(new java.awt.Color(255, 255, 255));

        x2y5.setBackground(new java.awt.Color(255, 255, 255));

        x3y5.setBackground(new java.awt.Color(255, 255, 255));

        x4y5.setBackground(new java.awt.Color(255, 255, 255));

        x5y5.setBackground(new java.awt.Color(255, 255, 255));

        x6y5.setBackground(new java.awt.Color(255, 255, 255));

        x7y5.setBackground(new java.awt.Color(255, 255, 255));

        x1y9.setBackground(new java.awt.Color(255, 255, 255));

        x2y9.setBackground(new java.awt.Color(255, 255, 255));

        x3y9.setBackground(new java.awt.Color(255, 255, 255));

        x4y9.setBackground(new java.awt.Color(255, 255, 255));

        x5y9.setBackground(new java.awt.Color(255, 255, 255));

        x6y9.setBackground(new java.awt.Color(255, 255, 255));

        x7y9.setBackground(new java.awt.Color(255, 255, 255));

        x8y9.setBackground(new java.awt.Color(255, 255, 255));

        x8y8.setBackground(new java.awt.Color(255, 255, 255));

        x8y7.setBackground(new java.awt.Color(255, 255, 255));

        x8y6.setBackground(new java.awt.Color(255, 255, 255));

        x8y5.setBackground(new java.awt.Color(255, 255, 255));

        x9y5.setBackground(new java.awt.Color(255, 255, 255));

        x9y6.setBackground(new java.awt.Color(255, 255, 255));

        x9y7.setBackground(new java.awt.Color(255, 255, 255));

        x9y8.setBackground(new java.awt.Color(255, 255, 255));

        x9y9.setBackground(new java.awt.Color(255, 255, 255));

        x10y9.setBackground(new java.awt.Color(255, 255, 255));

        x10y8.setBackground(new java.awt.Color(255, 255, 255));

        x10y7.setBackground(new java.awt.Color(255, 255, 255));

        x10y6.setBackground(new java.awt.Color(255, 255, 255));

        x10y5.setBackground(new java.awt.Color(255, 255, 255));

        scoreHuman.setMaximum(1000);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vida, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x9y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x9y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x1y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x9y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x9y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x1y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x9y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x9y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x1y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x9y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x9y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x9y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(x9y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x1y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x4y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x5y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x6y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x7y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x8y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x10y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x2y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(x3y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(scoreHuman, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(x1y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x4y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x5y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x6y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x7y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x8y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x9y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x10y10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(x1y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x2y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x3y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x4y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x5y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x6y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x7y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x8y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x9y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(x10y9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(x1y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x2y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x3y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x4y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x5y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x6y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x7y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x8y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x9y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(x10y1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(vida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(scoreHuman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ataqueZomb() {
        //Checar la posicion de humano
        int posX = game.setPositionX();
        int posY = game.setPositionY();
        if (posX == 0)
            return;
        if (posY == 0)
            return;
        
        if (posY == 9)
           return;
        if (posX == 9)
               return;
        //Checar si hay zombies arriba o abajo
        //x      Z--->  x-1,Y
        //X      H
        //X      z--->  x+1,Y
        //bajar vida segun zombie
        if ("FlashZ".equals(game.board.squares[posX + 1][posY].getItis())) {

            vida.setValue(vida.getValue() - 2);

        }
        if ("NormalZ".equals(game.board.squares[posX + 1][posY].getItis())) {

            vida.setValue(vida.getValue() - 5);

        }
        if ("CamouflageZ".equals(game.board.squares[posX + 1][posY].getItis())) {

            vida.setValue(vida.getValue() - 9);

        }
        if ("FlashZ".equals(game.board.squares[posX - 1][posY].getItis())) {

            vida.setValue(vida.getValue() - 2);

        }
        if ("NormalZ".equals(game.board.squares[posX - 1][posY].getItis())) {

            vida.setValue(vida.getValue() - 5);

        }
        if ("CamouflageZ".equals(game.board.squares[posX - 1][posY].getItis())) {

            vida.setValue(vida.getValue() - 9);

        }

    }

    /*public void getScore() {
        //Checar la posicion de humano
        int posX = game.setPositionX();
        int posY = game.setPositionY();
        if (posX == 0)
            return;
        if (posY == 0)
            return;
        //Checar si hay zombies arriba o abajo
        //x      
        //X     x-1,Y <--- H --->  x,Y+1
        //X     
        //bajar vida segun zombie
        if ("FlashZ".equals(game.board.squares[posX][posY-1].getItis())) {

            scoreHuman.setValue(scoreHuman.getValue() + 30);

        }
        if ("NormalZ".equals(game.board.squares[posX][posY-1].getItis())) {

            scoreHuman.setValue(scoreHuman.getValue() + 10);

        }
        if ("CamouflageZ".equals(game.board.squares[posX][posY-1].getItis())) {

            scoreHuman.setValue(scoreHuman.getValue() + 20);

        }
        if ("FlashZ".equals(game.board.squares[posX][posY+1].getItis())) {

            scoreHuman.setValue(scoreHuman.getValue() + 30);

        }
        if ("NormalZ".equals(game.board.squares[posX][posY+1].getItis())) {

            scoreHuman.setValue(scoreHuman.getValue() + 10);

        }
        if ("CamouflageZ".equals(game.board.squares[posX][posY+1].getItis())) {

            scoreHuman.setValue(scoreHuman.getValue() + 20);

        }

    }*/
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        int prob;
        prob = (int) (Math.random() * 5);
        if (evt.getKeyChar() == 'd') {
            MovZombie();
            updateBackGround();
            game.MovimientoD(scoreHuman);
            ataqueZomb();
            
            if (prob == 1) {
                game.crearZ();
            }
            //getScore();
            updateBoard();

        }

        if (evt.getKeyChar() == 'a') {
            MovZombie();
            updateBackGround();
            game.MovimientoI(scoreHuman);
            ataqueZomb();
            
            if (prob == 1) {
                game.crearZ();
            }
           
            //getScore();
            updateBoard();

        }

        if (evt.getKeyChar() == 'w') {
            MovZombie();
            updateBackGround();
           
            game.MovimientoUp(scoreHuman);
            ataqueZomb();
            
            if (prob == 1) {
                game.crearZ();
            }
            //getScore();
            updateBoard();

        }

        if (evt.getKeyChar() == 's') {
            MovZombie();
            updateBackGround();
            game.MovimientoAbajo(scoreHuman);
            ataqueZomb();
            
            if (prob == 1) {
                game.crearZ();
            }
            //getScore();
            updateBoard();
        }

        if (evt.getKeyChar() == 'r') {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    panelArray[i][j].setIcon(null);
                }
            }
            vida.setValue(100);
            game = new ZombieGame();
            game.start();

        }
        if (vida.getValue() == 0) {
            JOptionPane.showMessageDialog(this, "Game Over, OK para reiniciar");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    panelArray[i][j].setIcon(null);
                }
            }
            vida.setValue(100);
            game = new ZombieGame();
            game.start();
        }
        
        if (scoreHuman.getValue() >= 1000) {
            JOptionPane.showMessageDialog(this, "Ganaste, Ok para reiniciar");
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    panelArray[i][j].setIcon(null);
                }
            }
            scoreHuman.setValue(0);
            game = new ZombieGame();
            game.start();
        }


    }//GEN-LAST:event_formKeyPressed
    public void updateBackGround() {

        int x = game.setPositionX();
        int y = game.setPositionY();
        panelArray[x][y].setIcon(null);

    }

    public void updateBoard() {

        //int pos = 0;
        for (int conta = 0; conta < 10; conta++) {
            for (int conta2 = 0; conta2 < 10; conta2++) {
                if ("FlashZ".equals(game.board.squares[conta][conta2].getItis())) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/FlashZombie.png"));
                    Image img = icon.getImage();
                    Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon fz = new ImageIcon(imgScale);
                    panelArray[conta][conta2].setIcon(fz);

                } else if ("NormalZ".equals(game.board.squares[conta][conta2].getItis())) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Normalzombie.png"));
                    Image img = icon.getImage();
                    Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon nz = new ImageIcon(imgScale);
                    panelArray[conta][conta2].setIcon(nz);

                } else if ("CamouflageZ".equals(game.board.squares[conta][conta2].getItis())) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Cam.png"));
                    Image img = icon.getImage();
                    Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon c = new ImageIcon(imgScale);
                    panelArray[conta][conta2].setIcon(c);

                } else if ("human".equals(game.board.squares[conta][conta2].getItis())) {
                    ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/human.png"));
                    Image img = icon.getImage();
                    Image imgScale = img.getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_SMOOTH);
                    ImageIcon h = new ImageIcon(imgScale);
                    panelArray[conta][conta2].setIcon(h);

                }

            }
        }
    }

    public void MovZombie() {

        for (int conta = 0; conta < 10; conta++) {
            for (int conta2 = 0; conta2 < 10; conta2++) {
                int x = conta;
                int y = conta2;
                String itIs = game.board.squares[conta][conta2].getItis();
                if (itIs != null && itIs.contains("Z")) {

                    if (btnx && btny) {

                        x = conta;
                        y = conta2;

                        x = x + 1;
                        if (x < 10 && y < 10) {
                            btnx = false;
                        }
                    } else if (!btnx && btny) {
                        x = conta;
                        y = conta2;

                        x = x - 1;
                        if (x < 10 && y < 10) {
                            btnx = true;
                        }
                    } else if (btnx && !btny) {
                        x = conta;
                        y = conta2;

                        y = y - 1;
                        if (x < 10 && y < 10) {
                            btny = true;
                        }
                    } else if (!btnx && !btny) {
                        x = conta;
                        y = conta2;

                        x = x + 1;

                        if (x < 10 && y < 10) {

                            btny = true;
                        }

                    }

                    if (x >= 0 && y >= 0 && x < 10 && y < 10) {
                        if ("FlashZ".equals(game.board.squares[conta][conta2].getItis())) {
                            game.board.squares[conta][conta2] = new Square("vacio");
                            panelArray[conta][conta2].setIcon(null);
                            game.board.squares[x][y] = new Square("FlashZ");

                        }

                        if ("CamouflageZ".equals(game.board.squares[conta][conta2].getItis())) {
                            game.board.squares[conta][conta2] = new Square("vacio");
                            panelArray[conta][conta2].setIcon(null);
                            game.board.squares[x][y] = new Square("CamouflageZ");

                        }

                        if ("NormalZ".equals(game.board.squares[conta][conta2].getItis())) {
                            game.board.squares[conta][conta2] = new Square("vacio");
                            panelArray[conta][conta2].setIcon(null);
                            game.board.squares[x][y] = new Square("NormalZ");
                        }
                    }
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ZombieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ZombieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ZombieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ZombieFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ZombieFrame().setVisible(true);
            }

        });

    }

    public void readMove() {
        KeyListener event = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyPressed(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void keyReleased(KeyEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar scoreHuman;
    private javax.swing.JProgressBar vida;
    private javax.swing.JLabel x10y1;
    private javax.swing.JLabel x10y10;
    private javax.swing.JLabel x10y2;
    private javax.swing.JLabel x10y3;
    private javax.swing.JLabel x10y4;
    private javax.swing.JLabel x10y5;
    private javax.swing.JLabel x10y6;
    private javax.swing.JLabel x10y7;
    private javax.swing.JLabel x10y8;
    private javax.swing.JLabel x10y9;
    private javax.swing.JLabel x1y10;
    private javax.swing.JLabel x1y2;
    private javax.swing.JLabel x1y3;
    private javax.swing.JLabel x1y4;
    private javax.swing.JLabel x1y5;
    private javax.swing.JLabel x1y6;
    private javax.swing.JLabel x1y7;
    private javax.swing.JLabel x1y8;
    private javax.swing.JLabel x1y9;
    private javax.swing.JLabel x2y1;
    private javax.swing.JLabel x2y10;
    private javax.swing.JLabel x2y2;
    private javax.swing.JLabel x2y3;
    private javax.swing.JLabel x2y4;
    private javax.swing.JLabel x2y5;
    private javax.swing.JLabel x2y6;
    private javax.swing.JLabel x2y7;
    private javax.swing.JLabel x2y8;
    private javax.swing.JLabel x2y9;
    private javax.swing.JLabel x3y1;
    private javax.swing.JLabel x3y10;
    private javax.swing.JLabel x3y2;
    private javax.swing.JLabel x3y3;
    private javax.swing.JLabel x3y4;
    private javax.swing.JLabel x3y5;
    private javax.swing.JLabel x3y6;
    private javax.swing.JLabel x3y7;
    private javax.swing.JLabel x3y8;
    private javax.swing.JLabel x3y9;
    private javax.swing.JLabel x4y1;
    private javax.swing.JLabel x4y10;
    private javax.swing.JLabel x4y2;
    private javax.swing.JLabel x4y3;
    private javax.swing.JLabel x4y4;
    private javax.swing.JLabel x4y5;
    private javax.swing.JLabel x4y6;
    private javax.swing.JLabel x4y7;
    private javax.swing.JLabel x4y8;
    private javax.swing.JLabel x4y9;
    private javax.swing.JLabel x5y1;
    private javax.swing.JLabel x5y10;
    private javax.swing.JLabel x5y2;
    private javax.swing.JLabel x5y3;
    private javax.swing.JLabel x5y4;
    private javax.swing.JLabel x5y5;
    private javax.swing.JLabel x5y6;
    private javax.swing.JLabel x5y7;
    private javax.swing.JLabel x5y8;
    private javax.swing.JLabel x5y9;
    private javax.swing.JLabel x6y1;
    private javax.swing.JLabel x6y10;
    private javax.swing.JLabel x6y2;
    private javax.swing.JLabel x6y3;
    private javax.swing.JLabel x6y4;
    private javax.swing.JLabel x6y5;
    private javax.swing.JLabel x6y6;
    private javax.swing.JLabel x6y7;
    private javax.swing.JLabel x6y8;
    private javax.swing.JLabel x6y9;
    private javax.swing.JLabel x7y1;
    private javax.swing.JLabel x7y10;
    private javax.swing.JLabel x7y2;
    private javax.swing.JLabel x7y3;
    private javax.swing.JLabel x7y4;
    private javax.swing.JLabel x7y5;
    private javax.swing.JLabel x7y6;
    private javax.swing.JLabel x7y7;
    private javax.swing.JLabel x7y8;
    private javax.swing.JLabel x7y9;
    private javax.swing.JLabel x8y1;
    private javax.swing.JLabel x8y10;
    private javax.swing.JLabel x8y2;
    private javax.swing.JLabel x8y3;
    private javax.swing.JLabel x8y4;
    private javax.swing.JLabel x8y5;
    private javax.swing.JLabel x8y6;
    private javax.swing.JLabel x8y7;
    private javax.swing.JLabel x8y8;
    private javax.swing.JLabel x8y9;
    private javax.swing.JLabel x9y1;
    private javax.swing.JLabel x9y10;
    private javax.swing.JLabel x9y2;
    private javax.swing.JLabel x9y3;
    private javax.swing.JLabel x9y4;
    private javax.swing.JLabel x9y5;
    private javax.swing.JLabel x9y6;
    private javax.swing.JLabel x9y7;
    private javax.swing.JLabel x9y8;
    private javax.swing.JLabel x9y9;
    // End of variables declaration//GEN-END:variables
   class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpeg")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    
}
