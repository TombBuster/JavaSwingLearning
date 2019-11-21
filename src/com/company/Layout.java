package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Layout {
    void getLayout() {
        JFrame f = new JFrame("Button Window");
        final JLabel calcOut = new JLabel("0");
        calcOut.setBounds(50, 50, 150, 20);
        List<JButton> buttonList = new ArrayList<JButton>();
        for(int i=0; i<9; i++) {
            int currentNumber = i;
            JButton button = new JButton(Integer.toString(i+1));
            buttonList.add(button);
            button.setBounds((i%3)*50, 200-(i/3)*50,50,50);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String currentCalc = calcOut.getText();
                    if (currentCalc.equals("0")) {
                        currentCalc = "";
                    }
                    calcOut.setText(currentCalc + Integer.toString(currentNumber + 1));
                }
            });
            f.add(button);
            }

        f.add(calcOut);
        f.setSize(400, 500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
