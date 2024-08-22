package batalhaPokemon;

public class Charmander extends Pokemon {

    public Charmander(int level, float xp, int vitorias, int derrotas) {
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
        System.out.println("Usando lança chamas!");

    }

    @Override
    public void subirDeLevel() {
        // TODO Auto-generated method stub
        if (this.getXp() >= 1000) {
            this.setLevel(this.getLevel() + 1);
            this.setXp(0);
        }
    }

    @Override
    public void perderBatalha() {
        // TODO Auto-generated method stub
        this.setVitorias(this.getVitorias() - 1);
    }

    @Override
    public void ganharBatalha() {
        // TODO Auto-generated method stub
        this.setVitorias(this.getVitorias() + 1);
        this.setXp(this.getXp() + 100);

    }

}
