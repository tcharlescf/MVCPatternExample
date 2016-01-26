
package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controller class controls between Model and View
 * Controller detects events from view class and gives an information to model class
 * View class doesn't know about Model and Controller
 */ 
public class Controller {

    private Model model;
    private View view;
    private ActionListener al;
    private double num1, num2;
    private String temp;
    private int result1 = 0;
    private double result2 = 0;
    
    // Make the obejcts
    Controller(){
        view = new View();
        model = new Model();
    }

    public void control() {
        add();
        subtract();
        multiply();
        divide();
    }

    // Happens the event to each button
    private void add() {
        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                doAdd();
            }
        };
        view.getAddButton().addActionListener(al);
    }

    private void subtract() {
        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                doSub();
            }
        };
        view.getSubButton().addActionListener(al);
    }

    private void multiply() {
        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                doMul();
            }
        };
        view.getMulButton().addActionListener(al);
    }

    private void divide() {
        al = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                doDiv();
            }
        };
        view.getDivButton().addActionListener(al);
    }
    
    private void getNumbers(){
        num1 = Integer.parseInt(view.getNum1());
        num2 = Integer.parseInt(view.getNum2());
        model.setNumbers(num1, num2);
    }
    
    /**
     * When the add button or the other buttons are pressed 
     * Get the numbers and the numbers stored to Model
     * The numbers are processed by Model
     * The processed numbers are showed by View
     */
    private void doAdd(){
        getNumbers();
        model.add();
        // Convert double to int
        result1 = (int)model.getAdd();
        view.setResult(Integer.toString(result1));
    }
    private void doSub(){
        getNumbers();
        model.sub();
        result1 = (int)model.getSub();
        view.setResult(Integer.toString(result1));
    }
    private void doMul(){
        getNumbers();
        model.mul();
        view.setResult(Double.toString(model.getMul()));
    }
    private void doDiv(){
        getNumbers();
        model.div();
        view.setResult(Double.toString(model.getDiv()));
    }
}
