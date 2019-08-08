package senaicarro;


public class Carro extends Veiculo implements InterfaceVeiculo{
    public Carro(){
        this.modelo = "Camaro";
        this.cor = "amarelo";
        this.pneu = 100;
        this.tanque = 100;
        this.status = false;
    }
    
    @Override
    public void ligar(){
        if(this.status == false){
            this.status = true;
        }
        else System.out.println("\nO carro ja esta desligado");
    }
    
    @Override
    public void desligar(){
        if(this.status == true){
            this.status = false;
        }
        else System.out.println("\nO carro ja esta ligado");
    }
    
    @Override
    public void abastecer(){
        if(tanque == 100){
            System.out.println("\nO tanque ja esta cheio");
        }
        else{
            this.tanque += 10;
            this.preco += 4;
            System.out.println("\nTanque: " + this.tanque);
            System.out.println("Valor a pagar" + this.preco);
        }
    }
    
    @Override
    public void acelerar(){
        if(this.tanque == 0 || this.pneu == 0){
            System.out.println("\nTanque vazio ou pneu desgastado, va ao posto");
        }
        else if(this.status == false){
            System.out.println("\nLigue o carro antes");
        }
        else{
            this.tanque -= 10;
            this.pneu -= 5;
            System.out.println("\nAndou");
        }
    }
    
    @Override
    public void trocarPneu(){
        if(this.pneu == 100){
            System.out.println("\nPneu nao precisa ser trocado");
        }
        else{
            this.pneu = 100;
            System.out.println("\nPneu foi trocado");
        }
    }
    
    @Override
    public void mostrarStatus(){
        System.out.println("\nTanque: " + this.tanque);
        System.out.println("Valor a pagar: " + this.preco);
        System.out.println("Desgaste do pneu: " + this.pneu);
    }
    
    @Override
    public void mostrarVeiculo(){
        System.out.println("\nModelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Status: " + this.status);
    }
}
