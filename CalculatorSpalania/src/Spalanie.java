import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Spalanie extends JFrame implements ActionListener{

   private JLabel srednieSpalanie, odleglosc, liczbaPasazerow, boxLabel;
   private JTextField srednieSpalanieText, odlegloscText, liczbaPasazerowText;
   private JButton oblicz;
   private JTextField wynik;
   private JCheckBox boxEurope, boxPoland;
   private double srSpal,odl,liczbaOsob;



    public Spalanie()
    {

    setSize(500,700);
    setTitle("Obliczanie spalania samochodu");
    setLayout(null);

    srednieSpalanie= new JLabel("Srednie spalanie na 100km: ");
    srednieSpalanie.setBounds(20,50,170,20);
    add(srednieSpalanie);

    srednieSpalanieText = new JTextField("");
    srednieSpalanieText.setBounds(200,50,170,20);
    add(srednieSpalanieText);

    odleglosc=new JLabel("Dlugosc trasy w km:");
    odleglosc.setBounds(20,100,170,20);
    add(odleglosc);

    odlegloscText=new JTextField("");
    odlegloscText.setBounds(200,100,170,20);
    add(odlegloscText);

    liczbaPasazerow=new JLabel("Liczba pasażerów: ");
    liczbaPasazerow.setBounds(20,150,170,20);
    add(liczbaPasazerow);

    liczbaPasazerowText=new JTextField("");
    liczbaPasazerowText.setBounds(200,150,170,20);
    add(liczbaPasazerowText);

    oblicz = new JButton("Oblicz");
    oblicz.setBounds(180,350,70,30);
    add(oblicz);
    oblicz.addActionListener(this);

    wynik = new JTextField("Wynik: ");
    wynik.setBounds(20,400,400,200);
    add(wynik);


    boxLabel = new JLabel("Gdzie odbędzie się podróż: ");
    boxLabel.setBounds(20,200,170,20);
    add(boxLabel);


    boxEurope = new JCheckBox("Europa");
    boxEurope.setBounds(50,250,100,50);
    add(boxEurope);
    boxEurope.addActionListener(this);

    boxPoland = new JCheckBox("Polska");
    boxPoland.setBounds(150,250,100,50);
    add(boxPoland);
    boxPoland.addActionListener(this);


    }


    public static void main(String[] args){
        Spalanie s = new Spalanie();
        s.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        s.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    Object wrt = e.getSource();

    try {
        srSpal = Double.parseDouble(srednieSpalanieText.getText());
        odl = Double.parseDouble(odlegloscText.getText());
        liczbaOsob = Double.parseDouble(liczbaPasazerowText.getText());
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Nie właściwy format danych"+"\n"+ex);
    }
        if(liczbaOsob<1){
            liczbaOsob=1;
        }
        double l = (liczbaOsob*5)/100;

        if((wrt == oblicz) && (!boxPoland.isSelected()) && (!boxEurope.isSelected())) {

            double x = ((odl*srSpal)/100)*4.45;
            double x1 = ((odl*srSpal)/100)*4.75;

            String y = "Twoja podróż wyniesie około: "+Math.round(x+x*l)+"-"+Math.round(x1+x1*l)+" PLN."+"\n";
            wynik.setText(String.valueOf(y));

        }else if(!boxEurope.isSelected()){
            if ((wrt == oblicz)&&(boxPoland.isSelected())) {
                double x = ((odl * srSpal) / 100) * 4.45;
                double x1 = ((odl * srSpal) / 100) * 4.75;

                String y = "Twoja podróż wyniesie około: " + Math.round(x + x * l) + "-" + Math.round(x1 + x1 * l) + " PLN." + "\n";
                wynik.setText(String.valueOf(y));
            }
        }else if ((!boxPoland.isSelected())) {
            if ((wrt == oblicz) && (boxEurope.isSelected())) {
                double x = ((odl * srSpal) / 100) * 5;
                double x1 = ((odl * srSpal) / 100) * 6.3;

                String y = "Twoja podróż wyniesie około: " + Math.round(x + x * l) + "-" + Math.round(x1 + x1 * l) + " PLN." + "\n";
                wynik.setText(String.valueOf(y));
            }
        }else if ((wrt == oblicz))
            if ((boxPoland.isSelected()) && (boxEurope.isSelected())) {

                double x = ((odl * srSpal) / 100) * 4.85;
                double x1 = ((odl * srSpal) / 100) * 5.85;

                String y = "Twoja podróż wyniesie około: " + Math.round(x + x * l) + "-" + Math.round(x1 + x1 * l) + " PLN." + "\n";
                wynik.setText(String.valueOf(y));

            }
}

}