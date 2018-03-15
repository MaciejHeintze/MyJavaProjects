
import javax.swing.*;
import java.io.*;

public class Main {


    public static void compare(String file1, String file2) throws IOException{

        boolean check = true;
        int counter = 1;
        String line1, line2;
        BufferedReader reader1 =null;
        BufferedReader reader2 = null;

        try {
          reader1 =  new BufferedReader(new FileReader(new File(file1)));
          reader2 = new BufferedReader(new FileReader(new File(file2)));
        }catch(IOException e){
            e.printStackTrace();
        }


        BufferedWriter plik1 = new BufferedWriter((new FileWriter("wyniki.txt")));

        while(((line1 = reader1.readLine())!=null)||((line2 = reader1.readLine())!=null)){

             line2 = reader2.readLine();

             if (line1.equals(line2)) {

                plik1.write("Linia: " + counter + "--" + "true");
                plik1.newLine();
                counter++;

            }else{
                plik1.write("Linia: " + counter + "--" + "false");
                plik1.newLine();

                counter++;
                check = false;
             }


        }
        plik1.close();

        JOptionPane.showMessageDialog(null, "Wynik porównania: "+check+"\n"+"Rezultat poszczególnych linii w pliku wyniki");
    }


    public static void main (String[] args) throws IOException{

        String file1 ="C:\\Users\\macie\\Documents\\Pliki\\";
        String file2="C:\\Users\\macie\\Documents\\Pliki\\";
        String x="",y="";

        x = JOptionPane.showInputDialog("Podaj nazwe pierwszego pliku: ",x);
        file1+=x;
        y = JOptionPane.showInputDialog("Podaj nazwe drugiego pliku: ",y);
         file2+=y;
        String q = ".txt";
        file1+=q;
        file2+=q;
       compare(file1,file2);

    }


}
