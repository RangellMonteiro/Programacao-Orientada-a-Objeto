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

    @Override
    public void subirDeLevel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subirDeLevel'");
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
