
package mvc;

// Model class stores datas
public class Model {
    
    private double num1, num2;
    private double result;

    public void setNumbers(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public void add(){
        result = num1 + num2;
    }
    public void sub(){
        result = num1 - num2;
    }
    public void mul(){
        result = num1 * num2;
    }
    public void div(){
        result = num1 / num2;
    }
    
    /* --------------------------------------------- */
    public double getAdd(){
        return result;
    }
    public double getSub(){
        return result;
    }
    public double getMul(){
        return result;
    }
    public double getDiv(){
        return result;
    }
}
