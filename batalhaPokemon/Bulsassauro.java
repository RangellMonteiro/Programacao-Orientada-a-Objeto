package batalhaPokemon;

public class Bulsassauro extends Pokemon {

    public Bulsassauro(int level, float xp, int vitorias, int derrotas) {
        super(level, xp, vitorias, derrotas);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void batalhar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'batalhar'");
    }

    @Override
    public void atacar() {
        System.out.println("Usando folha navalha");
    }

}
