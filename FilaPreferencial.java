import javax.swing.JOptionPane;

public class ifAninhado { public static void main(String[] args) {
int idade;

String aux;

aux = JOptionPane.showInputDialog("Entre com a sua idade para saber sua prioriadade de atendimento");

idade = Integer.parseInt(aux);

if (idade <60) {

JOptionPane.showMessageDialog(null, "Pegue a Fila Comum")

}   else {

        if (idade >=60)

        JOptionPane.showMessageDialog(null, "Pegue a Fila Prioritária")

}   else {

        if (idade>80)

        JOptionPane.showMessageDialog(null, "Pegue a fila para pessoas com 80+")

        }

    }

}