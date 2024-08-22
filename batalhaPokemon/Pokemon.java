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

    public abstract void atacar();

    public Pokemon(int level, float xp, int vitorias, int derrotas) {
        this.level = 6;
        this.xp = 0;
        this.vitorias = 0;
        this.derrotas = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public String getFraqueza() {
        return fraqueza;
    }

    public void setFraqueza(String fraqueza) {
        this.fraqueza = fraqueza;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
}
