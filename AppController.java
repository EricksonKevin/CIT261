/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.controller;

import kevin.view.AppFrame;
import javax.swing.*;
/**
 *
 * @author cowcutta
 */
public class AppController {
    
    private AppFrame appFrame;
    
    public void start() {
       
        appFrame = new AppFrame(this);
        
    }
    
}
