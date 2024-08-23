package batalhaPokemon;

import java.util.Random;

public class Batalha {
    // Atributos
    private Pokemon desafiado;
    private Pokemon desafiante;
    private boolean confirmada;

    public void confirmarLuta(Pokemon p1, Pokemon p2) {
        this.confirmada = true;
        this.desafiado = p1;
        this.desafiante = p2;
    }

    public void batalhar() {
        System.out.println("POKEMON DESAFIADO!");
        this.desafiado.status();
        System.out.println("POKEMON DESAFIANTE!");
        this.desafiante.status();
        if (this.desafiado.getTipo() == "Grama" && this.desafiante.getTipo() == "Fogo") {
            System.out.println("Vencedor: " + this.desafiante.getNome());
            this.desafiante.ganharBatalha();
            this.desafiado.perderBatalha();
        } else if (this.desafiado.getTipo() == "Grama" && this.desafiante.getTipo() == "Agua") {
            System.out.println("Vencedor: " + this.desafiado.getNome());
            this.desafiado.ganharBatalha();
            this.desafiante.perderBatalha();
        } else if (this.desafiado.getTipo() == "Grama" && this.desafiante.getTipo() == "Eletrico") {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarBatalha();
                    this.desafiante.empatarBatalha();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharBatalha();
                    this.desafiante.perderBatalha();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderBatalha();
                    this.desafiante.ganharBatalha();
                    break;

            }

        } else if (this.desafiado.getTipo() == "Fogo" && this.desafiante.getTipo() == "Eletrico") {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarBatalha();
                    this.desafiante.empatarBatalha();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharBatalha();
                    this.desafiante.perderBatalha();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderBatalha();
                    this.desafiante.ganharBatalha();
                    break;

            }

        } else if (this.desafiado.getTipo() == "Fogo" && this.desafiante.getTipo() == "Grama") {
            System.out.println("Vencedor: " + this.desafiado.getNome());
            this.desafiado.ganharBatalha();
            this.desafiante.perderBatalha();
        } else if (this.desafiado.getTipo() == "Fogo" && this.desafiante.getTipo() == "Agua") {
            System.out.println("Vencedor: " + this.desafiante.getNome());
            this.desafiado.perderBatalha();
            this.desafiante.ganharBatalha();
        } else if (this.desafiado.getTipo() == "Agua" && this.desafiante.getTipo() == "Eletrico") {
            System.out.println("Vencedor: " + this.desafiante.getNome());
            this.desafiado.perderBatalha();
            this.desafiante.ganharBatalha();
        } else if (this.desafiado.getTipo() == "Agua" && this.desafiante.getTipo() == "Fogo") {
            System.out.println("Vencedor: " + this.desafiado.getNome());
            this.desafiado.ganharBatalha();
            this.desafiante.perderBatalha();
        } else if (this.desafiado.getTipo() == "Agua" && this.desafiante.getTipo() == "Grama") {
            System.out.println("Vencedor: " + this.desafiante.getNome());
            this.desafiado.perderBatalha();
            this.desafiante.ganharBatalha();
        } else if (this.desafiado.getTipo() == "Eletrico" && this.desafiante.getTipo() == "Fogo") {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarBatalha();
                    this.desafiante.empatarBatalha();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharBatalha();
                    this.desafiante.perderBatalha();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderBatalha();
                    this.desafiante.ganharBatalha();
                    break;

            }

        } else if (this.desafiado.getTipo() == "Eletrico" && this.desafiante.getTipo() == "Grama") {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarBatalha();
                    this.desafiante.empatarBatalha();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharBatalha();
                    this.desafiante.perderBatalha();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderBatalha();
                    this.desafiante.ganharBatalha();
                    break;

            }
        } else if (this.desafiado.getTipo() == "Eletrico" && this.desafiante.getTipo() == "Agua") {
            System.out.println("Vencedor: " + this.desafiado.getNome());
            this.desafiado.ganharBatalha();
            this.desafiante.perderBatalha();

        } else {
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarBatalha();
                    this.desafiante.empatarBatalha();
                    break;
                case 1:
                    System.out.println("Vitoria do " + this.desafiado.getNome());
                    this.desafiado.ganharBatalha();
                    this.desafiante.perderBatalha();
                    break;
                case 2:
                    System.out.println("Vitoria do " + this.desafiante.getNome());
                    this.desafiado.perderBatalha();
                    this.desafiante.ganharBatalha();
                    break;

            }

        }

    }

}
