package ExerciciosAula4;
import javax.swing.*;
    public class ImprimirMedia{
        public static void main(String...args){
            Double num, soma = 0.0;
            int resp = 0;

            do{
                num = Double.parseDouble(JOptionPane.showInputDialog("Digite os numeros"));

                if (num >= 0){
                    soma = num + soma;
                    resp++;
                }
            } while( num>=0 );
                JOptionPane.showMessageDialog(null,"A média dos números é: " + (soma/resp));
                JOptionPane.showMessageDialog(null,"A quantidade de números é: " + resp);
                JOptionPane.showMessageDialog(null,"A soma dos numeros é: " + soma);

        }
    }