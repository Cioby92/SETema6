package controller;


import model.ModelVreme;
import view.vizualizareVreme;

/**
 * Created by Ciobotaru on 30.11.2014.
 */
public class Api {
    ModelVreme model = new ModelVreme();
    vizualizareVreme vizualizare = new vizualizareVreme();

    public Api(ModelVreme model, vizualizareVreme vizualizare) {
        this.model = model;
        this.vizualizare = vizualizare;
        this.vizualizare.addButtonListene(new Listener(model, vizualizare));

    }

}
