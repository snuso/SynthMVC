package sample.Models;

import sample.core.Model;

public class ButtonModel extends Model {

    private String buttonText = "Click me!";

    public void setButtonText(String value){
        this.buttonText = value;
    }

    public String getButtonText(){
        return this.buttonText;
    }

}
