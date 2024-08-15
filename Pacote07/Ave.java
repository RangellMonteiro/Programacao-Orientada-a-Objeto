package Pacote07;

public class Ave extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Voando");

    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo frutas");

    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de ave");

    }

    public void fazerNinho() {
        System.out.println("Contruindo ninho");
    }

    /**
     * @return String return the corPena
     */
    public String getCorPena() {
        return corPena;
    }

    /**
     * @param corPena the corPena to set
     */
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

}
