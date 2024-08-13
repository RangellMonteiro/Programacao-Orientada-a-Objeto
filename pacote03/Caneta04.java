package pacote03;

public class Caneta04 {
    public String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

    public Caneta04(String m, String c, float p) {
        this.tampar();
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);

    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String m) { // Método modificador
        this.modelo = m;
    }

    public float getPonta() {
        return this.ponta;
    }

    public void setPonta(float p) {
        this.ponta = p;
    }

    public String getCor() {
        return this.cor;

    }

    public void setCor(String c) {
        this.cor = c;
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    public void status() {
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.getModelo()); // métodos acessores
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + getCor());
    }

}
