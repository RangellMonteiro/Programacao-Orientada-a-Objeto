package Pacote07;

public class Peixe extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo substâncias");

    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Peixe não faz som");

    }

    public void soltarBolha() {
        System.out.println("Soltou uma bolha");

    }

    /**
     * @return String return the corEscama
     */
    public String getCorEscama() {
        return corEscama;
    }

    /**
     * @param corEscama the corEscama to set
     */
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

}
