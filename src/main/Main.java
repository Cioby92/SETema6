package main;

import controller.Api;
import model.ModelVreme;
import view.vizualizareVreme;

/**
 * Created by Ciobotaru on 30.11.2014.
 */
public class Main {
    public  static void main(String[] args)
    {
        vizualizareVreme view=new vizualizareVreme();
        ModelVreme model=new ModelVreme();

        Api controller=new Api(model,view);
        view.setVisible(true);
    }
}
