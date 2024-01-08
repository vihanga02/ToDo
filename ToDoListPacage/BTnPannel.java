package ToDoListPacage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BTnPannel extends JPanel {
    private JButton addTask;
    private JButton clearTask;
    Border emptyBoder = BorderFactory.createEmptyBorder(10, 10, 10, 10);
    public BTnPannel(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(129,202,207));

        addTask = new JButton("Add Tasks");
        addTask.setBorder(emptyBoder);
        addTask.setBackground(new Color(100,154,100));
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20) );
        this.add(addTask);

        clearTask = new JButton("Clear All");
        clearTask.setBorder(emptyBoder);
        clearTask.setBackground(new Color(255,100,100));
        clearTask.setFont(new Font("Sans-serif", Font.PLAIN, 20) );
        this.add(clearTask);
    }

    public JButton getAddTask(){
        return addTask;
    }

    public JButton getClearTask() {
        return clearTask;
    }
}
