

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;
import javax.swing.SwingUtilities;

/**
 *
 * @author cowcutta
 */
public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        View view = new View();
        Model model = retrievePlayerInfo();
        
        Controller controller = new Controller(model, view);
        
        controller.updateView();
        
        System.out.println("Enter Band Name: ");
        String P = input.next();
        
        controller.setBandName(P);
        
        controller.setBandNumber("1");
        
        controller.updateView();
        
    }
    
    private static Model retrievePlayerInfo(){
        Model player = new Model();
        player.setName("The Beatles");
        player.setNumber("2");
        return player;
        
    }
    
}