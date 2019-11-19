package orientacao.controller;

public class ClasseConta {

    public int numConta;
    protected String tipConta;
    private String donoConta;
    private double saldo;
    private boolean status;

    // Metodo Personalizado para impressão 
    public void estadoAtual() {
        System.out.println("Numero da Conta: " + this.getNumConta());
        System.out.println("Tido da Conta: " + this.getTipoConta());
        System.out.println("Dono da Conta: " + this.getdonoConta());
        System.out.println("Saldo da Conta: " + this.getSaldo() + " Em Reais.");
        System.out.println("Conta aberta: " + this.getStatus());
    }

    // Construtor
    public void ClasseConta() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void abrirConta(String conta) {

        this.setTipoConta(conta);
        this.setStatus(true);

        if ("CC".equals(conta)) {
            this.setSaldo(50);
        } else if ("CP".equals(conta)) {
            this.setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso! Seja Bem Vindo!");
    }

    public void fecharConta() {

        if (this.getStatus()) {
            if (this.getSaldo() == 0) {
                this.setStatus(false);
                System.out.println("Sr(a)" + this.getdonoConta() + " Foi um prazer telo conosco!\nSua conta foi fechada com sucesso!");
            } else if (this.getSaldo() > 0) {
                System.out.println("Não é possivel fechar a conta! Existe saldo");
            } else if (this.getSaldo() < 0) {
                System.out.println("Não é possivel fechar a conta! Existe saldo negativo");
            }
        } else {
            System.out.println("A conta que você esta tentando cancelar não foi aberta! ");
        }
    }

    public void depositar(double valor) {
        if (this.getStatus() == false) {
            System.out.println("Não é possivel depositar! A conta esta fechada");
        } else {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("O valor de R$ " + valor + " Foi Depositado com sucesso!" + "Na conta do Sr(a). " + this.getdonoConta() + "\nMuito obrigado! ");
        }
    }

    public void sacar(double valorSaque) {

        if (this.getStatus() == true) {
            if (this.getSaldo() < 0) {
                System.out.println("Não é possivel sacar ! Saldo negativo!");
            } else if (this.getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("O valor de : R$ " + valorSaque + " Foi sacado da conta do Sr(a)." + this.getdonoConta() + " Com sucesso!");
            } else {
                System.out.println("Não é possivel sacar ! Saldo insuficiente!");
            }
        } else {
            System.out.println("Não é possivel sacar ! A conta esta fechada!");
        }
    }

    public void pagarMensalidade() {
        double valorCC = 12;
        double valorCP = 20;

        if (this.getStatus() == true) {
            if ("CC".equals(this.getTipoConta())) {
                if (this.getSaldo() < 0) {
                    System.out.print("Não é possivel pagar mensalidae! Não existe saldo");
                } else if (this.getSaldo() > 0 && this.getSaldo() >= valorCC) {
                    this.setSaldo(this.getSaldo() - valorCC);
                    System.out.println("A mensalidade de R$ " + valorCC + " Foi paga com sucesso por Sr(a). " + this.getdonoConta());
                } else {
                    System.out.print("Não é possivel pagar mensalidae! Não existe saldo suficiente! ");
                }
            } else if ("CP".equals(this.getTipoConta())) {
                if (this.getSaldo() < 0) {
                    System.out.print("Não é possivel pagar mensalidae! Não existe saldo");
                } else if (this.getSaldo() > 0 && this.getSaldo() >= valorCP) {
                    this.setSaldo(this.getSaldo() - valorCP);
                    System.out.println("A mensalidade de R$ " + valorCP + " Foi paga com sucesso por Sr(a). " + this.getdonoConta());
                } else {
                    System.out.print("Não é possivel pagar mensalidae! Não existe saldo suficiente! ");
                }
            }
        } else {
            System.out.print("Não é possivel pagar mensalidae! A conta esta fechada! ");
        }
    }

    // Get e Set
    // Numero da conta
    public void setNumConta(int numeroConta) {
        this.numConta = numeroConta;
    }

    public int getNumConta() {
        return this.numConta;
    }

    // Tipo de Conta
    public void setTipoConta(String tipo) {
        this.tipConta = tipo;
    }

    public String getTipoConta() {
        return this.tipConta;
    }

    // Dono da Conta
    public void setdonoConta(String dono) {
        this.donoConta = dono;
    }

    public String getdonoConta() {
        return this.donoConta;
    }

    // Saldo da Conta
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Status da Conta
    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean getStatus() {
        return this.status;
    }
}