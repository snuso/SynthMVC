package sample.Models;

import sample.core.Model;

public class AppModel extends Model {

    private String text = "";

    public void setText(String value){
        this.text = value;
    }

    public String getText(){
        return this.text;
    }

}
