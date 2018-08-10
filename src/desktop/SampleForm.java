package desktop;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by expert on 24/7/18.
 */
public class SampleForm implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;
    SampleForm(){
        JFrame f=new JFrame("first window");
        f.setLayout(null);
        f.setSize(500,500);
        label=new JLabel();
        button=new JButton("click");
        textField=new JTextField();
        f.add(label);
        f.add(button);
        f.add(textField);
        label.setBounds(100,100,150,50);
        button.setBounds(100,300,75,50);
        textField.setBounds(100,200,75,50);
        button.addActionListener(this);//object of event is created
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

    }


    public static void main(String[] args) {
        new SampleForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //label.setText("WELCOME");
       label.setText(textField.getText());


    }
}
