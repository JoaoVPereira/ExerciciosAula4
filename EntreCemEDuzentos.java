package ExerciciosAula4;
import javax.swing.*;
public class EntreCemEDuzentos{
    static public void main (String...args){
        int n = 0;
        int cont = 0;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero: "));
            if(n==0) return;
            else {
            if(n >=100 && n <=200){
                cont++;
            }
        }
        }while( n != 0);

        JOptionPane.showMessageDialog(null,"A quantidade de numeros entre 100 e 200 é:  " + cont);
    }
}