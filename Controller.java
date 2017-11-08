/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author cowcutta
 */



public class Controller {
    
    private Model model;
    private View view;
    
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    
    public void setBandName(String Name){
        model.setName(Name);
    }
    
    public String setBandName() {
        return model.getName();
    }
    
    public void setBandNumber(String Number){
        model.setNumber(Number);
    }
    
    public String setBandNumber(){
        return model.getNumber();
    }
    public void updateView(){
       view.printStudentDetails(model.getName(), model.getNumber()); 
    }
    
}


    
 
