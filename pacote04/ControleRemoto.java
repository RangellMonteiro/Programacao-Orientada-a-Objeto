package pacote04;

public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    /**
     * @return int return the volume
     */
    private int getVolume() {
        return volume;
    }

    /**
     * @param volume the volume to set
     */
    private void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * @return boolean return the ligado
     */
    private boolean getLigado() {
        return ligado;
    }

    /**
     * @param ligado the ligado to set
     */
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    /**
     * @return boolean return the tocando
     */
    private boolean getTocando() {
        return tocando;
    }

    /**
     * @param tocando the tocando to set
     */
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    // Métodos abstratos
    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);

    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("----MENU----");
        System.out.println("Está ligado? " + this.getLigado());
        System.out.println("Está tocando? " + this.getTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("|");
        }

    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando Menu...");

    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()) {
            this.setVolume(getVolume() + 5);
        } else {
            System.out.println("Impossível aumentar volume");
        }

    }

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if (this.getLigado()) {
            this.setVolume(getVolume() - 5);
        } else {
            System.out.println("Impossível baixar volume");
        }

    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }

    }

}
