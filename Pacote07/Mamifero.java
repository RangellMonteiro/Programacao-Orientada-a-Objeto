package Pacote07;

public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Correndo");

    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Mamando");

    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de mamífero");

    }

    /**
     * @return String return the corPelo
     */
    public String getCorPelo() {
        return corPelo;
    }

    /**
     * @param corPelo the corPelo to set
     */
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

}
