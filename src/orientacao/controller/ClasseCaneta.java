package orientacao.controller;

public class ClasseCaneta {

    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    // Void - Sem retorno
    public void status() {
        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("A carga da caneta: " + this.carga);
        System.out.println("O modelo da caneta e: " + this.modelo);
        System.out.println("A caneta esta tampada?: " + this.tampada);
        System.out.println("A ponta da caneta: " + this.ponta);
        if(!this.tampada){
            System.out.println("Estou rabiscando ou escrevendo");
        }else{
            System.out.println("A Caneta esta tampada! Não posso rabiscar ou escrever!");
        }
    }

    public void rabiscar() {

        if (this.tampada == true) {
            System.out.println("Não posso rabiscar! A Caneta esta tampada!");
        } else {
            System.out.println("Estou rabiscando");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
