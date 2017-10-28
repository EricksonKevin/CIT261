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
import javax.swing.*;
import kevin.controller.AppController;


public class AppPanel extends JPanel {
    
    private AppController baseController;
    private JLabel nameLabel;
    private JLabel genreLabel;
    private JTextField nameField;
    private JTextField genreField;
    private JButton createBandButton;
    private SpringLayout baseLayout;
    
    
    
    
    public AppPanel(AppController baseController){
       
        this.baseController = baseController;
        
        nameLabel = new JLabel("Type the name of the band");
        genreLabel = new JLabel("What genre of music does this band play?");
        
        nameField = new JTextField(30);
        genreField = new JTextField(20);
        
        createBandButton = new JButton("Click to add band");
        
        baseLayout = new SpringLayout();
        
        
        setupLayout();
        setupPanel();
        setupListeners();
        
       
        
        
    }
    
    private void setupLayout() {
        
        
    }
    
    private void setupPanel(){
        this.setLayout(baseLayout);
        this.add(createBandButton);
        this.add(nameField);
        this.add(genreField);
        this.add(nameLabel);
        this.add(genreLabel);
        
        
    }
    
    private void setupListeners(){
        
        
    }
}


