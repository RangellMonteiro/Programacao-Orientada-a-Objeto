package batalhaPokemon;

public class Bulsassauro extends Pokemon {

    public Bulsassauro(int level, float xp, int vitorias, int derrotas) {
        super(level, xp, vitorias, derrotas);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void batalhar() {

    }

    @Override
    public void atacar() {
        System.out.println("Usando folha navalha");
    }

    @Override
    public void subirDeLevel() {
        if (this.getXp() >= 1000) {
            this.setLevel(this.getLevel() + 1);
            this.setXp(0);
        }

    }

    @Override
    public void perderBatalha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'perderBatalha'");
    }

    @Override
    public void ganharBatalha() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ganharBatalha'");
    }

}
