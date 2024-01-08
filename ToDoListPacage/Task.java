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
        this.add(this.taskName);

        adder = new JButton("Done");
        adder.setPreferredSize(new Dimension(10,20));
        this.add(this.adder);

        clear = new JButton("Clear");
        clear.setPreferredSize(new Dimension(10,20));
        this.add(this.clear);
    }

    public void writeIndex1(int n){
        this.index.setText(String.valueOf(n));
        this.revalidate();
    }

    public JButton getDonej(){
        return  this.adder;
    }

    public JButton getremovej(){
        return this.clear;
    }

    public void doneStatus(){
        this.taskName.setBackground(Color.green);
        this.index.setBackground(Color.green);
        this.adder.setBackground(Color.green);
        this.clear.setBackground(Color.green);
        this.setBackground(Color.green);

        revalidate();
    }
}
