package ToDoListPacage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame{
    TitleBar title = new TitleBar();
    BTnPannel btnp = new BTnPannel();

    private JButton adder;
    private JButton clear;
    public AppFrame(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.btnp, BorderLayout.SOUTH);

        adder = btnp.getAddTask();
        clear = btnp.getClearTask();

        addListner();
    }

    public void addListner(){
        adder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
    }
}
