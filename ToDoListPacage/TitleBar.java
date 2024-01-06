package ToDoListPacage;

import javax.imageio.plugins.tiff.TIFFTagSet;
import javax.swing.*;
import java.awt.*;

public class TitleBar extends JPanel {

    JLabel TitleText = new JLabel("ToDO List");
    public TitleBar(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(150,150,150));

        TitleText.setPreferredSize(new Dimension( 200,80));
        TitleText.setFont(new Font("sans-serif", Font.BOLD, 30));
        TitleText.setHorizontalAlignment(JLabel.CENTER);
        this.add(this.TitleText);
    }
}
