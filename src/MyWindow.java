import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyWindow extends JFrame {
    public MyWindow() {
        setVisible(true);
        setSize(500,500);
        setLocation(650,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JButton firstButton = new JButton("Выйти");
//        add(firstButton, BorderLayout.NORTH);
        ActionListener listener = new CloseActionListener();
        firstButton.addActionListener(listener);
//        firstButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.exit(0);
//            }
//        });


        JButton secondButton = new JButton("Зарегистрироваться");
//        add(secondButton, BorderLayout.SOUTH);
        ActionListener listener2 = new NewActionListener();
        secondButton.addActionListener(listener2);


        JPanel panel = new JPanel(new GridLayout(1, 2));
        panel.add(firstButton);
        panel.add(secondButton);

        add(panel, BorderLayout.SOUTH);
    }

}
