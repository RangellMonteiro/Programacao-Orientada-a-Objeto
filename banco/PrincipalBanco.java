package banco;

public class PrincipalBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setnumConta(1406);
        p1.setDono("Irineu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setnumConta(1407);
        p2.setDono("Irineia");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(100);

        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }

}
