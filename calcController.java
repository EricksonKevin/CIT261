/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcontrlpttrn;

import java.util.HashMap;

/**
 *
 * @author cowcutta
 */
public class calcController {
    
      /**
     *
     * Create instance of commandHashMap
     */
    public static HashMap<String,calcHandler> commandHashMap = new HashMap<>();
    
    public static void handleCommand(String command, Integer firstNumber, Integer secondNumber){
        
        // hashMap
        commandHashMap.put("+", new Add());
        commandHashMap.put("*", new Multiply());
        commandHashMap.put("/", new Divide());
        commandHashMap.put("-", new Subtract());
        
        calcHandler handler = commandHashMap.get(command);
        
        handler.calculate(firstNumber, secondNumber);
    }
    
}
