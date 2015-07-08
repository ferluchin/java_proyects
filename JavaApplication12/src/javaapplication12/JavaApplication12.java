/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;


import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
 
 
public class JavaApplication12 implements ActionListener {
 
        private static final JFrame frame = new JFrame("Chat Client");
        private static final JTextArea textArea = new JTextArea();
        private static final JTextField textField = new JTextField(25);
        private static final JButton sendButton = new JButton("Send");
       
        public JavaApplication12() {
                frame.setSize(450, 375);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
                Panel p = new Panel();
               
                sendButton.addActionListener(this);
                textArea.setEditable(false);
                JScrollPane areaScrollPane = new JScrollPane(textArea);
                areaScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
                areaScrollPane.setPreferredSize(new Dimension(430, 275));
               
                p.add(areaScrollPane);
                p.add(textField);
                p.add(sendButton);
               
                frame.add(p);
                frame.setVisible(true);
        }
       
        public static void main(String[] args) {
            JavaApplication12 javaApplication12 = new JavaApplication12();
        }
 
        @Override
        public void actionPerformed(ActionEvent arg0) {
                String message = textField.getText();
                textArea.append(message + "\n");
                textField.setText("");
        }
 
}