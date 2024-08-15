package Pacote06;

public class Bolsista extends Aluno {
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());

    }

    @Override
    public void pagarMensalidade() {
        System.out.println(this.getNome() + "É bolsista! pagamento facilitado");

    }

    /**
     * @return float return the bolsa
     */
    public float getBolsa() {
        return bolsa;
    }

    /**
     * @param bolsa the bolsa to set
     */
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

}
