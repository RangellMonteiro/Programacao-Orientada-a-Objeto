package batalhaPokemon;

public abstract class Pokemon {
    private String nome;
    private String tipo;
    private int level;
    private float xp;
    private String fraqueza;
    private int vitorias;
    private int derrotas;

    public abstract void batalhar();

}
