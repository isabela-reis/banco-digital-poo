import java.util.List;
import java.util.TreeSet;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

    public void listarClientes() {
    	TreeSet<String> clientes = new TreeSet<>();
        for (Conta conta : contas) {
            Cliente cliente = conta.getCliente();
            if (cliente != null) {
                clientes.add(cliente.getNome());
            }
        }
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente encontrado.");
        } else {
            System.out.println("=== Clientes do Banco em ordem alfabética ===");
            for (String nome : clientes) {
                System.out.println(nome);
            }
        }
    }
}