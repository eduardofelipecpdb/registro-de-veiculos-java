
public class Veiculo {
	public int capacidadepassageiros;
	public int capacidadearmazenamento;
	public String cor;
	public String combustivel;
	public int cilindrada;
	public String modelo;
	public String anomodelo;
	public String anofabricacao;
	public String tipoveiculo;

	@Override
	   public String toString() {
	        return ("\n\nModelo: "+this.getModelo()+
	                    "\nCor: "+ this.getCor()+
	                    "\nCapacidade de passageiros: "+ this.getCapacidadepassageiros()+
	                    "\nCapacidade de armazenamento: "+ this.getCapacidadearmazenamento()+
	                    "\nAno de fabricacao: "+ this.getAnofabricacao()+
	                    "\nCilindradas: "+ this.getCilindrada()+
	                    "\nCombustivel: "+ this.getCombustivel()+
	                    "\nTipo do veiculo: "+ this.getTipoveiculo()+
	                    "\nAno do modelo: "+ this.getAnomodelo() + "\n\n");
	   }

	public int getCapacidadepassageiros() {
		return capacidadepassageiros;
	}

	public int getCapacidadearmazenamento() {
		return capacidadearmazenamento;
	}

	public String getCor() {
		return cor;
	}

	public String getCombustivel() {
		return combustivel;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public String getModelo() {
		return modelo;
	}

	public String getAnomodelo() {
		return anomodelo;
	}

	public String getAnofabricacao() {
		return anofabricacao;
	}

	public String getTipoveiculo() {
		return tipoveiculo;
	}
}
