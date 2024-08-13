package ultraEmojiCombat;

import java.util.Random;

public class Luta {
    // Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    // Métodos Públicos

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }

    }

    public void lutar() {
        if (this.aprovada) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0 1 2
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;

                case 1:
                    System.out.println("Vitória do  " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;

                case 2:
                    System.out.println("Vitória do  " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;

            }

        } else {
            System.out.println("A luta não pode acontecer");
        }

    }

    /**
     * @return Lutador return the desafiado
     */
    public Lutador getDesafiado() {
        return desafiado;
    }

    /**
     * @param desafiado the desafiado to set
     */
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    /**
     * @return Lutador return the desafiante
     */
    public Lutador getDesafiante() {
        return desafiante;
    }

    /**
     * @param desafiante the desafiante to set
     */
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    /**
     * @return int return the rounds
     */
    public int getRounds() {
        return rounds;
    }

    /**
     * @param rounds the rounds to set
     */
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    /**
     * @return boolean return the aprovada
     */
    public boolean isAprovada() {
        return aprovada;
    }

    /**
     * @param aprovada the aprovada to set
     */
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

}
