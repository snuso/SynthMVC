package sample.core;

public class Controller {

    protected View view;
    protected Model model;

    public Controller(Model model, View view){
        this.view = view;
        this.model = model;
    }

    public void start() {
        this.view.render();
    }

}
