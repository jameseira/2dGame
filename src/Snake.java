import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;

public class Snake extends JLabel{
    // boolean gameLoop;

    // private int snakeY;
    // private int snakeX;

    // long now;
    // double delta;
    // long before = System.nanoTime();

    public Snake(){
        setPreferredSize(new Dimension(50,50));
        setBackground(new Color(120,20,20));
        setOpaque(true);
    }

    // public void setX(int x){
    //     snakeX = x;
    // }

    // public int getX(){
    //     return snakeX;
    // }

    // public void setY(int y){
    //     snakeY = y;
    // }

    // public int getY(){
    //     return snakeY;
    // }

    // public void snakeMove(){
    //     snakeX = 5;
    //     snakeY = 5; 
    //     gameLoop = true;
    //     while(gameLoop){
    //         render();
    //     }
    // }

    // public void render(){
    //     now = System.nanoTime();
    //     delta = now - before;
    //     // before = now;
    //     if (delta >= 1000000000){
    //         System.out.println("one second has passed");
    //         // drawMap();
    //         delta = 0; 
    //         before = System.nanoTime();
    //     }
    // }
}
