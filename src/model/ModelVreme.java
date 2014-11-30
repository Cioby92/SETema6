package model;

import Excetion.MyException;

import java.util.Random;


/**
 * Created by Ciobotaru on 30.11.2014.
 */


public class ModelVreme {

    public static final int initVal=0;

    public int getTemperarue() {
        return temperarue;
    }

    public int getVitezaVantului() {
        return VitezaVantului;
    }

    private int temperarue;
    private int VitezaVantului;


    public ModelVreme()
    {
        temperarue=initVal;
       VitezaVantului=initVal;
    }

    public void setTemperatura()throws  Exception
    {
        try {
                temperarue= getRandomTemp();
            }catch (NumberFormatException e)
        {
            throw new MyException ((String.valueOf(temperarue)),e.getMessage());
        }

    }

    public void setvitezaVantului()throws  Exception
    {
        try {
            VitezaVantului= getRandViteza();
        }catch (NumberFormatException e)
        {
            throw new MyException((String.valueOf(VitezaVantului)),e.getMessage());
        }
    }

    public int getRandViteza()
    {
        Random rand=new Random();
        int randVant=rand.nextInt((0+80)+1);
        return  randVant;
    }

    public int getRandomTemp() {

        Random rand=new Random();

        int randTemp=rand.nextInt((45+35)+1-35);
        return  randTemp;
    }
}
