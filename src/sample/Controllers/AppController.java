package sample.Controllers;

import sample.Views.AppView;
import sample.Models.AppModel;
import sample.core.Controller;
import javax.swing.*;

public class AppController extends Controller {

    public AppController(AppModel model, AppView view){
        super(model, view);
    }

}
