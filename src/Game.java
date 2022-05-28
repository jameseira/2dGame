import javax.swing.JPanel;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Game extends JPanel implements KeyListener{
    private Grid grid;
    public Game(){
        grid = new Grid();

        setFocusable(true);
        addKeyListener(this);
        add(grid);
    }   
    @Override
    public void keyPressed(KeyEvent e){
        System.out.println("pressed");
    }
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
