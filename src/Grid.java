import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

public class Grid extends JPanel{
    // boolean gameLoop;
    GridBagConstraints c;
    GridBagLayout tile;

    // long now;
    // double delta;
    // long before = System.nanoTime();

    public Grid(){
        setPreferredSize(new Dimension(600,600));

        tile = new GridBagLayout();
        setLayout(tile);
        c = new GridBagConstraints();

        // Snake snake = new Snake();
        // snakeMove();#

        drawMap();

    }

    public void drawMap(){
        // Snake snake = new Snake();
        SnakePosition s = SnakePosition.getInstance();
        int x = 0;
        int y = 0;

        for(int i = 0; i < 12; i ++){
            for(int k = 0; k < 12; k ++){
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = x;
                c.gridy = y;
                if(s.yPosition == y && s.xPosition == x){
                    add(new Snake(), c);    
                }
                else{
                    add(new Blank(), c);  
                }
                y = y + 1;
            }
            y = 0;
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = x;
            c.gridy = y;
            if(s.xPosition == x){
                add(new Snake(), c);    
            }
            else{
                add(new Blank(), c);
            }    
            x = x + 1;
        }
    }

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
    //         drawMap();
    //         delta = 0; 
    //         before = System.nanoTime();
    //     }
    // }

}