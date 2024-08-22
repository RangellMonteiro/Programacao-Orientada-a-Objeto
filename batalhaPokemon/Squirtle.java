package batalhaPokemon;

public class Squirtle extends Pokemon {

    public Squirtle(int level, float xp, int vitorias, int derrotas) {
        super(level, xp, vitorias, derrotas);

    }

    @Override
    public void batalhar() {

    }

    @Override
    public void atacar() {
        System.out.println("Usando jato de água!");
    }

}
