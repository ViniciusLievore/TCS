package senaicarro;


public class Moto extends Veiculo{
    public Moto(){
        this.modelo = "Cruiser";
        this.cor = "preto";
        this.pneu = 100;
        this.tanque = 100;
        this.status = false;
    }
    
    @Override
    public void ligar(){
        if(this.status == false){
            this.status = true;
        }
        else System.out.println("\nA moto ja esta desligada");
    }
    
    @Override
    public void desligar(){
        if(this.status == true){
            this.status = false;
        }
        else System.out.println("\nA moto ja esta ligada");
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
            System.out.println("\nLigue a moto antes");
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
