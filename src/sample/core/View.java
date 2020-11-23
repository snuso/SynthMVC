package sample.core;

import sample.Views.ButtonView;

import javax.swing.*;

public class View {

    public void render(){

        JFrame frame = new JFrame();

        ButtonView button = new ButtonView();

        frame.add(button.getComponent());

        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
