package orientacao;

import java.util.Scanner;
import orientacao.controller.ClasseConta;

public class Conta {

    public static void main(String[] ars) {
        Scanner input = new Scanner(System.in);
        String tipoConta, donoConta,saldo;
        int numeroConta,entrar,status;
        boolean fecharConta;
        double deposito,saque;
        
        System.out.println("Ola seja bem vindo ao Banco King!\n\nDeseja abrir sua conta? 0 - SIM || 1 - NÃO\n");
        entrar = input.nextInt();
        
        while(entrar == 0){
            System.out.println("Informe o nome do correntista: ");
            donoConta = input.next();
            ClasseConta correntista = new ClasseConta();
            
            System.out.println("Legal! É otimo telo aqui!\nQual o tipo da conta? CC - pessoa fisica ou CP - pessoa juridica");
            tipoConta = input.nextLine();
            correntista.setdonoConta(donoConta);
            correntista.abrirConta(tipoConta);
            
            System.out.println("Deseja vezualizar o extrato inicial da conta: 3 - SIM || 4 - NÃO");
            status = input.nextInt();
            if(status == 3){
                correntista.estadoAtual();
            }else{
                System.out.println("Sr(a)." + donoConta + " Sua conta foi aberto com sucesso!");
            }
            
            System.out.println("Deseja sair? 0 - SIM || 1 - NÃO");
            entrar = input.nextInt();
            if(entrar != 0 ){
                System.out.println("Deseja ver seu saldo? SIM || NÃO");
                saldo = input.next();
                if(saldo == "SIM" || saldo == "sim"){
                    System.out.println("Sr(a). " + donoConta + " Seu saldo é " + correntista.getSaldo());
                }
            }
        }  
    }
}
