package batalhaPokemon;

public class Bulbassauro extends Pokemon {

    public Bulbassauro(String tipo, int level, float xp, int vitorias, int derrotas, int empates) {
        super(tipo, level, xp, vitorias, derrotas, empates);
        this.setTipo("Grama");
        // TODO Auto-generated constructor stub
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
            System.out.println(this.getNome() + "Subiu de level");
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

    @Override
    public void status() {
        // TODO Auto-generated method stub
        System.out.println("Pokemon: " + this.getNome());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Level: " + this.getLevel());
        System.out.println("Experiência: " + this.getXp());
        System.out.println("Fraqueza: " + this.getFraqueza());
        System.out.println("Vitorias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    @Override
    public void empatarBatalha() {
        // TODO Auto-generated method stub
        this.setEmpates(this.getEmpates() + 1);
    }

}
