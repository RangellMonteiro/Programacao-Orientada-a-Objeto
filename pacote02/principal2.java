package pacote02;

public class principal2 {
    public static void main(String[] args) {
        Caneta2 c1 = new Caneta2();
        c1.modelo = "BIC cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f; "Erro pois o atributo é privado"
        c1.carga = 80;
        c1.tampada = true;

        c1.status();

    }
}
