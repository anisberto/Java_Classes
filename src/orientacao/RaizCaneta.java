package orientacao;

import java.util.Scanner;
import orientacao.controller.ClasseCaneta;

/**
 *
 * @author anisberto
 */
public class RaizCaneta {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int action, fim, printer, escrever;
        ClasseCaneta caneta1 = new ClasseCaneta();
        caneta1.cor = "Azul";
        caneta1.carga = 15;
        caneta1.modelo = "Bic";
        caneta1.ponta = 1.2f;
        caneta1.tampada = true;

        do {
            System.out.println("\nDeseja: 0 - DESTAMPARA CANETA || 1 - TAMPAR A CANETA\n");
            action = input.nextInt();

            if (action == 0) {
                caneta1.destampar();
            } else if (action == 1) {
                caneta1.tampar();
            }
            System.out.println("\nDeseja Imprimir: 0 - SIM || 1 - Não\n");
            printer = input.nextInt();
            if (printer == 0) {
                caneta1.status();
            }

            System.out.println("\nDeseja finalizar: 0 - SIM || 1 - Não\n");
            fim = input.nextInt();

        } while (fim != 0);
    }
}
