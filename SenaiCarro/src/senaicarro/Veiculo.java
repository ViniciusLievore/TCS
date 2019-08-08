package senaicarro;


public class Veiculo {
    
    protected boolean status = false;
    protected float preco = 0;
    protected String modelo;
    protected String cor;
    protected int pneu = 100;
    protected int tanque = 100;

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPneu() {
        return pneu;
    }

    public void setPneu(int pneu) {
        this.pneu = pneu;
    }
    
    public void ligar(){
        if(this.status == false){
            this.status = true;
        }
        else System.out.println("O veiculo ja esta desligado");
    }
    
    public void desligar(){
        if(this.status == true){
            this.status = false;
        }
        else System.out.println("O veiculo ja esta ligado");
    }
    
    public void abastecer(){
        if(tanque == 100){
            System.out.println("O tanque ja esta cheio");
        }
        else{
            this.tanque += 10;
            this.preco += 4;
            System.out.println("Tanque: " + this.tanque);
            System.out.println("Valor a pagar" + this.preco);
        }
    }
    
    public void acelerar(){
        if(this.tanque == 0 || this.pneu == 0){
            System.out.println("Tanque vazio ou pneu desgastado, va ao posto");
        }
        else{
            this.tanque -= 10;
            this.pneu -= 5;
            System.out.println("Andou");
        }
    }
    
    public void trocarPneu(){
        if(this.pneu == 100){
            System.out.println("Pneu nao precisa ser trocado");
        }
        else{
            this.pneu = 100;
            System.out.println("Pneu foi trocado");
        }
    }
    
    public void mostrarStatus(){
        System.out.println("Tanque: " + this.tanque);
        System.out.println("Valor a pagar: " + this.preco);
        System.out.println("Desgaste do pneu: " + this.pneu);
    }
    
    public void mostrarVeiculo(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Status: " + this.status);
    }
    
    
}
