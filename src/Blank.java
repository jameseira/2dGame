import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Blank extends JLabel{
    public Blank(){
        Border line = BorderFactory.createLineBorder
            (new Color(0,0,0), 5);

        setPreferredSize(new Dimension(50,50));
        setBackground(new Color(70,110,20));
        setBorder(line);
        setOpaque(true);
    }
}
