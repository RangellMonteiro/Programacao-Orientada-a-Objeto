package Pacote06;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho() {
        this.trabalhando = !this.trabalhando;

    }

    /**
     * @return String return the setor
     */
    public String getSetor() {
        return setor;
    }

    /**
     * @param setor the setor to set
     */
    public void setSetor(String setor) {
        this.setor = setor;
    }

    /**
     * @return boolean return the trabalhando
     */
    public boolean getTrabalhando() {
        return trabalhando;
    }

    /**
     * @param trabalhando the trabalhando to set
     */
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
