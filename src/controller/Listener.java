package controller;

import model.ModelVreme;
import view.vizualizareVreme;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Ciobotaru on 30.11.2014.
 */
public class Listener implements ActionListener {

    ModelVreme model=new ModelVreme();
    vizualizareVreme view=new vizualizareVreme();
    public Listener(ModelVreme model,vizualizareVreme view)
    {
        this.model=model;
        this.view=view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


       try {

           model.setTemperatura();
           model.setvitezaVantului();
           view.setTemperatura((model.getTemperarue()));
           view .setWindSpeed(model.getVitezaVantului());

       }
       catch (Exception e1) {
        e1.printStackTrace();
       }
    }
}
