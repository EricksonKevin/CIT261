/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kevin.model;

import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author cowcutta
 */
public class MVCTest {
    
    private ArrayList<Band> bandList;
    private int bandResourceCount;
    
    
    //constructor
    
    public MVCTest() {
        
        bandList = new ArrayList<Band>();
        
        bandResourceCount = 20;
        
    }

    public ArrayList<Band> getBandList() {
        return bandList;
    }

    public void setBandList(ArrayList<Band> bandList) {
        this.bandList = bandList;
    }

    public int getBandResourceCount() {
        return bandResourceCount;
    }

    public void setBandResourceCount(int bandResourceCount) {
        this.bandResourceCount = bandResourceCount;
    }
    
    
    public boolean makeBand(String name, String genre) {
        
        boolean canMakeBand = false;
        
        if(bandResourceCount > 0) {
           Band currentBand = new Band(name, genre);
           bandResourceCount--;
           bandList.add(currentBand);
           canMakeBand = true;
            
        }
        return canMakeBand;
    }
           
    
}
