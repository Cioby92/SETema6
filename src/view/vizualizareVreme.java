package view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static java.awt.Toolkit.getDefaultToolkit;

/**
 * Created by Ciobotaru on 30.11.2014.
 */
public class vizualizareVreme extends JFrame {

    //componente vizuale
    private JTextField temperatura=new JTextField();
    private JTextField WindSpeed=new JTextField();
    private JButton updateButton=new JButton("Update");
    JLabel LabelTemperatura=new JLabel("Temperatura: ");
    JLabel LabelVant=new JLabel("Viteza Vantului: ");
    JLabel valoareTemperatura=new JLabel();
    JLabel ValoareVitezaVantului=new JLabel();

    JLabel background=new JLabel(new ImageIcon("images.jpg"));


    public vizualizareVreme() {
        temperatura.setEditable(false);
        WindSpeed.setEditable(false);

        JPanel continut = new JPanel();
        continut.setLayout(null);
        LabelTemperatura.setLayout(null);
        LabelVant.setLayout(null);
        updateButton.setLayout(null);
        valoareTemperatura.setLayout(null);
        ValoareVitezaVantului.setLayout(null);
        LabelTemperatura.setForeground(Color.red);
        LabelVant.setForeground(Color.red);

        ValoareVitezaVantului.setForeground(Color.yellow);
        valoareTemperatura.setForeground(Color.yellow);
        background.setLayout(new GridBagLayout());
        try
        {
           background.setIcon(new ImageIcon(ImageIO.read(getClass().getResource("images.jpg"))));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        continut.add(background);



        this.setBounds(300, 100, 300, 300);
        LabelTemperatura.setBounds(50, 100, 100, 40);
        LabelVant.setBounds(51, 70, 100, 40);
        updateButton.setBounds(100, 140, 80, 30);
        valoareTemperatura.setBounds(150, 105, 80, 30);
        ValoareVitezaVantului.setBounds(150, 75, 80, 30);

        //Adaugarea Componentelor

        continut.add(LabelTemperatura);
        continut.add(LabelVant);
        continut.add(updateButton);
        continut.add(valoareTemperatura);
        continut.add(ValoareVitezaVantului);


        getDefaultToolkit();
        getIconImage();
        setIconImage(Toolkit.getDefaultToolkit().getImage("images.jpg"));

        //Finalizare Continut

        this.setContentPane(continut);
        this.setBackground(Color.BLUE);
        continut.setBackground(Color.darkGray);
        this.setTitle("Vremea");

       //nu stiu de ce nu merge+background image
        ImageIcon img=new ImageIcon("images.jpg");
        this.setIconImage(img.getImage());

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }




    public void setWindSpeed(double valoare)
    {
        this.ValoareVitezaVantului.setText(valoare+"M\\s");

    }

    public  void setTemperatura(double valoare)
    {
        this.valoareTemperatura.setText(valoare+"C");
    }

    public void addButtonListene(ActionListener action)
    {
        updateButton.addActionListener(action);
    }
}
