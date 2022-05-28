import javax.swing.JFrame;

public class App extends JFrame{
    public static void main(String[] args) throws Exception {
        GameThread thread1 = new GameThread();
        thread1.start();

        init();
    }

    public static void init(){
        JFrame window = new JFrame();

        Game dispalyGame = new Game();

        window.add(dispalyGame);

        window.setTitle("Snake");
        window.setSize(670,670);
        window.setDefaultCloseOperation(EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
