import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente maria = new Cliente();
        maria.setNome("Maria");

        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");

        Cliente ana = new Cliente();
        ana.setNome("Ana");

        // Cria contas associadas aos clientes
        Conta ccVenilton = new ContaCorrente(venilton);
        Conta poupancaVenilton = new ContaPoupanca(venilton);

        Conta ccMaria = new ContaCorrente(maria);
        Conta poupancaMaria = new ContaPoupanca(maria);

        Conta ccCarlos = new ContaCorrente(carlos);
        Conta poupancaCarlos = new ContaPoupanca(carlos);

        Conta ccAna = new ContaCorrente(ana);
        Conta poupancaAna = new ContaPoupanca(ana);

        // Realiza operações nas contas
        ccVenilton.depositar(200);
        ccVenilton.transferir(50, poupancaVenilton);

        ccMaria.depositar(300);
        ccMaria.transferir(100, poupancaMaria);

        ccCarlos.depositar(400);
        ccCarlos.transferir(150, poupancaCarlos);

        ccAna.depositar(500);
        ccAna.transferir(200, poupancaAna);

        // Imprime extratos das contas
        System.out.println("Extratos:");
        ccVenilton.imprimirExtrato();
        poupancaVenilton.imprimirExtrato();

        ccMaria.imprimirExtrato();
        poupancaMaria.imprimirExtrato();

        ccCarlos.imprimirExtrato();
        poupancaCarlos.imprimirExtrato();

        ccAna.imprimirExtrato();
        poupancaAna.imprimirExtrato();

        // Cria uma lista de contas e adiciona as contas criadas
        List<Conta> contas = new ArrayList<>();
        contas.add(ccVenilton);
        contas.add(poupancaVenilton);
        contas.add(ccMaria);
        contas.add(poupancaMaria);
        contas.add(ccCarlos);
        contas.add(poupancaCarlos);
        contas.add(ccAna);
        contas.add(poupancaAna);

        // Cria um banco e configura com a lista de contas
        Banco banco = new Banco();
        banco.setNome("Banco Exemplo");
        banco.setContas(contas);

        // Chama o método para listar os clientes
        banco.listarClientes();
    }
}