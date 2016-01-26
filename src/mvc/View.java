
package mvc;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

// View class draws only the interface
public class View extends JFrame{
    private JPanel abovePanel, middlePanel, bottomPanel;
    private JButton addButton, subButton, mulButton, divButton;
    private JTextArea numText1, numText2;
    private JLabel resultLabel;
    private String num1, num2;
    private double result;
    
    // Draw the interface when the program is run
    View(){
        super("Simple Calculator");
        setSize(350, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        abovePanel = new JPanel();
        middlePanel = new JPanel();
        bottomPanel = new JPanel();
        
        setLayout(new GridLayout(3, 1));
        
        add(abovePanel);
        add(middlePanel);
        add(bottomPanel);
        
        abovePanel.setLayout(new FlowLayout());
        middlePanel.setLayout(new GridLayout(1, 4));
        bottomPanel.setLayout(new FlowLayout());
        
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("x");
        divButton = new JButton("/");
        numText1 = new JTextArea(1, 15);
        numText2 = new JTextArea(1, 15);
        resultLabel = new JLabel("Result : ");
        
        abovePanel.add(numText1);
        abovePanel.add(numText2);
        
        middlePanel.add(addButton);
        middlePanel.add(subButton);
        middlePanel.add(mulButton);
        middlePanel.add(divButton);
        
        bottomPanel.add(resultLabel);
        
        setVisible(true);
    }
    
    // Retreive the first number and the second number
    public String getNum1(){
        num1 = numText1.getText().toString();
        return num1;
    }
    public String getNum2(){
        num2 = numText2.getText().toString();
        return num2;
    }
    
    // Retreive the buttons and labels to be used by Controller class
    public JButton getAddButton(){
        return addButton;
    }
    public JButton getSubButton(){
        return subButton;
    }
    public JButton getMulButton(){
        return mulButton;
    }
    public JButton getDivButton(){
        return divButton;
    }
    public void setResult(String result){
        resultLabel.setText(result);
    }
}
