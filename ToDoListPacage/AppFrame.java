package ToDoListPacage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppFrame extends JFrame{
    TitleBar title = new TitleBar();
    BTnPannel btnp = new BTnPannel();
    AddList lists = new AddList();

    private JButton adder;
    private JButton clear;
    public AppFrame(){
        this.setSize(400,700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
        this.add(this.title, BorderLayout.NORTH);
        this.add(this.btnp, BorderLayout.SOUTH);
        this.add(this.lists, BorderLayout.CENTER);

        adder = btnp.getAddTask();
        clear = btnp.getClearTask();

        addListner();
    }

    public void addListner(){
        adder.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Task task = new Task();
                lists.add(task);
                lists.indexNum();
                revalidate();

                JButton done = task.getDonej();
                done.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        task.doneStatus();
                        revalidate();
                    }
                });

                JButton remove = task.getremovej();
                remove.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        lists.remove(task);
                        lists.indexNum();
                        revalidate();
                        repaint();
                    }
                });
            }
        });

        clear.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                Component[] taskList = lists.getComponents();
                for (int i= 0; i < taskList.length; i++){
                    if (taskList[i] instanceof Task){
                        lists.remove((Task)taskList[i]);
                    }
                }
                revalidate();
                repaint();
            }
        });
    }
}
