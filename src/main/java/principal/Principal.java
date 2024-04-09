package principal;

import javax.swing.JOptionPane;
import model.Restaurante;

public class Principal {

    public static void main(String args[]) {
        Restaurante restaurante = new Restaurante();
        int op = -1;
        while (op != 0) {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Preencher Restaurante"
                    + "\n2 - Imprimir Restaurante"
                    + "\n0 - Sair"));
            switch (op) {
                case 1:
                    restaurante.leitura();
                    break;
                case 2:
                    restaurante.imprimir();
                    break;
            }
        }
    }
}
