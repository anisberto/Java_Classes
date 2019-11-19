package orientacao;

import java.util.Random;
import java.util.Scanner;
import orientacao.controller.ClasseConta;

public class Conta {

    public static void main(String[] ars) {
        Scanner input = new Scanner(System.in);
        String tipoConta, donoConta, sobreNome;
        int saldo, entrar, status;
        boolean fecharConta;
        double deposito, saque;

        System.out.println("\tOla seja bem vindo ao Banco King!\n\nDeseja abrir sua conta? 0 - SIM || 1 - NÃO\n");
        entrar = input.nextInt();

        while (entrar == 0) {
            System.out.println("Informe o nome do correntista: ");
            donoConta = input.next();
            input.next();

            ClasseConta correntista = new ClasseConta();
            correntista.setNumConta(sorteia(1, 10000));

            System.out.println("\nLegal! É otimo telo aqui!\nQual o tipo da conta? CC - pessoa fisica ou CP - pessoa juridica\n");
            tipoConta = input.next();
            correntista.setdonoConta(donoConta);
            correntista.abrirConta(tipoConta);

            System.out.println("\nDeseja vezualizar o extrato inicial da conta: 3 - SIM || 4 - NÃO");
            status = input.nextInt();

            if (status == 3) {
                correntista.estadoAtual();
            } else {
                System.out.println("Sr(a)." + donoConta + " Sua conta foi aberto com sucesso!\n");
            }

            System.out.println("Deseja sair? 0 - NÃO || 1 - SIM");
            entrar = input.nextInt();

            if (entrar != 1) {
                if (entrar != 0) {
                    System.out.println("Deseja ver seu saldo? 6 - SIM || 7 - NÃO");
                    saldo = input.nextInt();

                    if (saldo == 6) {
                        System.out.println("Sr(a). " + donoConta + " Seu saldo é R$ " + correntista.getSaldo());
                    } else {
                        entrar = 0;
                    }
                }
            }else{
                entrar = 1;
            }
        }
    }

    public static int sorteia(int limiteInferior, int limiteSuperior) {
        Random rd = new Random();
        return rd.nextInt(limiteSuperior - limiteInferior + 1) + limiteInferior;
    }
}