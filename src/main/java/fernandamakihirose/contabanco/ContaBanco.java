package fernandamakihirose.contabanco;

import lombok.Data;


@Data
public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);

        if (this.tipo.equalsIgnoreCase("CC")) {
            this.saldo = 50;
        } else {
            this.saldo = 150;
        }
    }

    public void fecharConta() {
        if (this.saldo > 0) {
            System.out.println("Conta com dinheiro...");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito...");
        } else {
            setStatus(false);
            System.out.println("Conta fechada...");
        }
    }

    public void depositar(float valor) {
        if (status) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Impossível depositar...");
        }
    }

    public void sacar(float valor) {
        if (status) {
            if (this.saldo >= valor) {
                this.saldo -= valor;
            } else {
                System.out.println("Salso insuficiente");
            }
        } else {
            System.out.println("Impossível sacar...");
        }
    }

    public void pagarMensal() {
        float valor = 0;
        if (this.tipo.equalsIgnoreCase("CC")) {
            valor = 12;
        } else if (this.tipo.equalsIgnoreCase("CP")) {
            valor = 20;
        }

        if (status) {
            sacar(valor);
        }
    }

    public void estadoAtual() {
        System.out.println(
                "------------------------------"
                        + "\n ContaBanco: " + numConta
                        + "\n Tipo: " + tipo
                        + "\n Dono: " + dono
                        + "\n Saldo: " + saldo
                        + "\n Status: " + status
        );
    }
}
