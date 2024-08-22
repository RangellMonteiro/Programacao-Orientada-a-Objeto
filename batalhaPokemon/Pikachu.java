package batalhaPokemon;

public class Pikachu extends Pokemon {

    public Pikachu(int level, float xp, int vitorias, int derrotas) {
        super(level, xp, vitorias, derrotas);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void batalhar() {

    }

    @Override
    public void atacar() {
        System.out.println("Usando choque do trovão");
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
