package ToDoListPacage;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class BTnPannel extends JPanel {
    private JButton addTask;
    private JButton clearTask;
    Border emptyBoder = BorderFactory.createEmptyBorder();
    public BTnPannel(){
        this.setPreferredSize(new Dimension(400,80));
        this.setBackground(new Color(129,202,207));

        addTask.setBorder(emptyBoder);
        addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20) );
        this.add(addTask);

        clearTask = new JButton("Clear all tasks");
        clearTask.setBorder(emptyBoder);
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
