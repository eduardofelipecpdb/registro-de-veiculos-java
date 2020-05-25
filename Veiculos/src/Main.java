import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int acao = 0;
		ArrayList<Veiculo> estoque = new ArrayList<Veiculo>();
		do {
			acao = menu();
			switch (acao) {
				case 1:
					Veiculo inserirdados = inserir(args);
					estoque.add(inserirdados);
					break;
				case 2:
					exibelista(estoque);
					break;
				case 3:
					estoque = remover(estoque);
					break;
				case 4:
					System.out.println("Voce escolheu sair do sistema");
					break;
				default:
					System.out.println("Opcao invalida");
					break;
			}
		}while(acao != 4);
		
	}
	
	public static void exibelista (ArrayList<Veiculo> lista) {
		
		if(lista.size() == 0) {
			System.out.println("Lista de veiculos vazia");
		}
		else {
			System.out.println("Voce escolheu visualizar a lista de veiculos");
			for (int i=0; i<lista.size(); i++) 
			{
				System.out.println(lista.get(i).toString());
			}
		}
	}
	
	public static ArrayList<Veiculo> remover (ArrayList<Veiculo> lista) {
		if(lista.size() == 0) {
			System.out.println("Nao ha veiculos cadastrados");
			return lista;
		}
		else {
			System.out.println("Voce escolheu deletar um veiculo da lista");
		}
		System.out.println("Digite o modelo de carro que deseja remover");
		
		Scanner remove = new Scanner(System.in);
		String modeloremover = remove.nextLine();
		
		for (int i=0; i<lista.size(); i++)
		{
			if(lista.get(i).getModelo().equals(modeloremover) == true) {
				lista.remove(i);
				System.out.println("Remocao bem sucedida");
				return lista;
			}
		}
		System.out.println("Nenhum veiculo com este nome encontrado");
		return lista;
	}
	
	public static int menu() {
		System.out.println("Digite o numero correspondente a sua atividade");
		System.out.println("1 - Inserir veiculo");
		System.out.println("2 - Ver lista de veiculos");
		System.out.println("3 - Deletar veiculo da lista");
		System.out.println("4 - Sair");
		
		Scanner input = new Scanner(System.in);
		int acao = input.nextInt();
		return acao;
	}
	
	public static Veiculo inserir (String[] args) {
		System.out.println("Voce escolheu inserir um novo veiculo");
		
		Veiculo criando = new Veiculo();
		Scanner in = new Scanner(System.in);
		Scanner text = new Scanner(System.in);
		
		System.out.println("Inserindo novo veiculo no sistema");
		
		System.out.println("Digite a Capacidade de passageiros");
		criando.capacidadepassageiros = in.nextInt();
		
		System.out.println("Digite a capacidade de armazenamento");
		criando.capacidadearmazenamento = in.nextInt();
		
		System.out.println("Digite a cor");
		criando.cor = text.nextLine();
		
		System.out.println("Digite o tipo de combustivel");
		criando.combustivel = text.nextLine();
		
		System.out.println("Digite a quantidade de cilindradas");
		criando.cilindrada = in.nextInt();
		
		System.out.println("Digite o modelo");
		criando.modelo = text.nextLine();
		
		System.out.println("Digite o ano do modelo");
		criando.anomodelo = text.nextLine();
		
		System.out.println("Digite o ano da fabricacao");
		criando.anofabricacao = text.nextLine();
		
		System.out.println("Digite o tipo do veiculo");
		criando.tipoveiculo = text.nextLine();
		
		return criando;
	}	
}
