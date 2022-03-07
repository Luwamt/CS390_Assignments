package w1l2.CS390_Assignments.w2l6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringGui extends JFrame {
    private JButton countBtn;
    private JButton reverseBtn;
    private JButton removeBtn;
    private JLabel label;
    private JLabel label2;
    private JTextField textin;
    private JTextField textout;

    public static  final  int WIDTH = 380;
    public static  final  int HEIGHT= 280;

    public StringGui(){

        countBtn = new JButton("Count Letters");
        countBtn.setBounds(10, 80, 150, 25);
        reverseBtn = new JButton("Reverse Letters");
        reverseBtn.setBounds(10, 120, 150, 25);
        removeBtn = new JButton("Remove Duplicates");
        removeBtn.setBounds(10, 160, 150, 25);
        label = new JLabel("InPut");
        label.setBounds(180, 80, 80, 25);
        label2 = new JLabel("OutPut");
        label2.setBounds(180, 120, 80, 25);
        textin = new JTextField(20);
        textin.setBounds(180, 100, 140, 25);
        textout = new JTextField(20);
        textout.setBounds(180, 140, 140, 25);

        initializeWindow();

        countBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input =  textin.getText();
                int count = 0;
                while (true) {
                    if (input.equals("") || input.equals(null))
                        break;
                    count++;
                    input = input.substring(1);
                }
                textout.setText(Integer.toString(count));
            }
        });
        reverseBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input =  textin.getText();
                StringBuilder output = new StringBuilder();
                for (int i = input.length() - 1; i >= 0; i--) {
                    output.append(input.charAt(i));
                }
                textout.setText(output.toString());
            }
        });
        removeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String input = textin.getText();
                String result = new String("");
                for (int i = 0; i < input.length(); i++) {
                    if (!result.contains("" + input.charAt(i))) {
                        result += "" + input.charAt(i);
                    }
                }
                textout.setText(result);
            }
        });
    }
public void initializeWindow() {
    JFrame frame = new JFrame("String Utility");
    frame.setSize(WIDTH, HEIGHT);
    frame.setLocation(500, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.add(countBtn);
    frame.add(reverseBtn);
    frame.add(removeBtn);
    frame.add(label);
    frame.add(label2);
    frame.add(textin);
    frame.add( textout);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

    public static void main(String[] args) {
        StringGui answer = new StringGui();

    }
    private static final long serialVersionUID = 3618976789175941431L;
}



