/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.view;

/**
 *
 * @author cowcutta
 */

import javax.swing.JFrame;
import kevin.controller.AppController;

public class AppFrame extends JFrame{
    
    private AppPanel basePanel;
    
    public AppFrame(AppController baseController) {
        
        basePanel = new AppPanel(baseController);
        setupFrame();
        
    }
    
    /**
     * Sets content pane, and makes it visible
     */
    private void setupFrame() {
        
        this.setContentPane(basePanel);
        this.setSize(500, 500);
        this.setVisible(true);
        
    }
}
