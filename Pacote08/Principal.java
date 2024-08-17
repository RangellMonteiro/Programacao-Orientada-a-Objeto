package Pacote08;

public class Principal {
    public static void main(String[] args) {

        Cachorro c = new Cachorro();

        c.reagir("Olá"); // Abanar e latir
        c.reagir("Vai apanhar"); // Rosnar
        c.reagir(11, 45); // Abanar
        c.reagir(21, 00);// iguinorar
        c.reagir(true); // abanar
        c.reagir(false);// rosnar e latir
        c.reagir(2, 12.5f);// Latir
        c.reagir(17, 4.5f);// Rosnar

    }

}
