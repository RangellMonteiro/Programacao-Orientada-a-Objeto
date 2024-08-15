package Pacote07;

public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Rastejando");

    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo vegetais");

    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de reptil");

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
