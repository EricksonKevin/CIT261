/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrlpttrn;

/**
 *
 * @author cowcutta
 */
public class Multiply implements calcHandler {

    @Override
    public void calculate(Integer firstNumber, Integer secondNumber) {
        Integer total = firstNumber * secondNumber;
        System.out.println(total);
    }
    
}
