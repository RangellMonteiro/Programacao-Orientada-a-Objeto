package banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos personalizados
    public void estadoAtual() {
        System.out.println("------------------------------------------------------");
        System.out.println("Conta: " + this.getnumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getsaldo());
        System.out.println("Status: " + this.getstatus());
        System.out.println("------------------------------------------------------");
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setstatus(true);
        if (t == "CC") {
            this.setsaldo(50);
        } else if (t == "CP") {
            this.setsaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");

    }

    public void fecharConta() {
        if (this.getsaldo() > 0) {
            System.out.println("Conta não pode ser fechada porque ainda possui saldo ativo.");
        } else if (this.getsaldo() < 0) {
            System.out.println("Conta não pode ser fechada pois tem débido");
        } else {
            this.setstatus(false);
            System.out.println("Conta fechada com sucesso");
        }

    }

    public void depositar(float v) {
        if (this.getstatus()) {
            this.setsaldo(this.getsaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de: " + this.getDono());
        } else {
            System.out.println("É impossível depositar em uma conta fechada!");
        }

    }

    public void sacar(float v) {
        if (this.getstatus()) {
            if (this.getsaldo() >= v) {
                this.setsaldo(this.getsaldo() - v);
                System.out.println("Saque realizado na conta de: " + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar em uma conta fechada!");
        }

    }

    public void pagarMensal() {
        float v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getstatus()) {
            this.setsaldo(this.getsaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }

    }

    // Métodos especiais
    public ContaBanco() {
        this.setsaldo(0);
        this.setstatus(false);

    }

    public int getnumConta() {
        return this.numConta;
    }

    public void setnumConta(int n) {
        this.numConta = n;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public float getsaldo() {
        return this.saldo;
    }

    public void setsaldo(float s) {
        this.saldo = s;
    }

    public boolean getstatus() {
        return this.status;
    }

    public void setstatus(boolean s) {
        this.status = s;

    }

}
