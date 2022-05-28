public class GameThread extends Thread{

    boolean gameLoop;

    // int x = 5;
    // int y = 5; 

    long now;
    double delta;
    long before = System.nanoTime();

    @Override
    public void run(){
        snakeMove();
    }

    public void snakeMove(){
        // Snake snake = new Snake();

        // snake.snakeX = 5;
        // snake.snakeY = 5; 
        gameLoop = true;
        while(gameLoop){
            render();
        }
    }

    public void render(){
        // Snake snake = new Snake();
        SnakePosition snake = SnakePosition.getInstance();
        // snake.xPosition = 5;
        // snake.yPosition = 5;

        now = System.nanoTime();
        delta = now - before;
        // before = now;
        if (delta >= 1000000000){
            System.out.println("one second has passed");
            // drawMap();
            snake.xPosition ++;
            // Grid g = new Grid();
            // g.removeAll();
            // g.drawMap();
            // g.revalidate();
            // g.repaint();
            System.out.println(snake.xPosition);
            System.out.println(snake.yPosition);
            delta = 0; 
            before = System.nanoTime();
        }
    }
}