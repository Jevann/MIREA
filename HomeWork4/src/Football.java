package milanmadrid;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Football extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JButton button3 = new JButton("End match");
    JLabel result = new JLabel("Result 0 X 0");
    JLabel last_scorer = new JLabel("Last Scorer: ???");
    JLabel winner = new JLabel("Winner: DRAW");
    Font fnt = new Font("Arial", Font.BOLD, 18);
    int[] array = {0, 0};

    Football() {
        super("Football score");
        Container abc = getContentPane();

        setSize(360, 300);
        setVisible(true);
        abc.setLayout(null);

        abc.setBounds(40, 20, 150, 50);

        abc.add(button1);
        button1.setBounds(40, 20, 120, 40);

        abc.add(button2);
        button2.setBounds(200, 20, 120, 40);

        abc.add(button3);
        button3.setBounds(120, 80, 120, 40);

        abc.add(result);
        result.setBounds(130, 115, 110, 40);

        last_scorer.setBounds(130, 180, 200, 40);
        abc.add(last_scorer);

        winner.setBounds(130, 220, 200, 40);
        abc.add(winner);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[0]++;
                result.setText("Result: " + array[0] + " X " + array[1]);
                last_scorer.setText("Last Scorer: AC Milan");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                array[1]++;
                result.setText("Result: " + array[0] + " X " + array[1]);
                last_scorer.setText("Last Scorer: Real Madrid");
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (array[0] > array[1]) {
                    winner.setText("Winner: AC Milan");
                }
                if (array[0] == array[1]) {
                    winner.setText("Winner: Tie");
                }
                if (array[1] > array[0]) {
                    winner.setText("Winner: Real Madrid");
                }
            }
        });
    }
        public static void main (String[]args){
            new Football();
        }
    }