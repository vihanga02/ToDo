package ToDoListPacage;

import javax.swing.*;
import java.awt.*;

public class Task extends JPanel{
    private JLabel index;
    private JTextField taskName;
    private JButton adder;
    private JButton clear;

    public Task(){
        GridLayout layoutTask = new GridLayout(1,4);
        layoutTask.setHgap(5);
        this.setPreferredSize(new Dimension(400,20));
        this.setBackground(new Color(255,234,17));
        this.setLayout(layoutTask);

        index = new JLabel();
        index.setPreferredSize(new Dimension(20,10));
        index.setHorizontalAlignment(JLabel.LEFT);
        index.setBackground(new Color(255,234,17));
        this.add(this.index);

        taskName = new JTextField("Enter task");
        taskName.setPreferredSize(new Dimension(10,20));
        taskName.setBorder(BorderFactory.createEmptyBorder());
        this.setBackground(new Color(255,234,17));

        adder = new JButton("Done");
        adder.setPreferredSize(new Dimension(10,20));
        this.add(this.adder);

        clear = new JButton("Clear");
        clear.setPreferredSize(new Dimension(10,20));
        this.add(this.clear);
    }
}
