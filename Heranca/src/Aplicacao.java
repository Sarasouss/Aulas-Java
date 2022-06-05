
public class Aplicacao {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
// Criando o objeto veiculo
		veiculo.setMarca("Honda");
		veiculo.setModelo("City");
		veiculo.setAno(2010);

		veiculo.imprimir();
		veiculo.buzinar();
// adicionando os atributos do metodo
		Carro carro = new Carro();
		carro.setMarca("Chevrolet");
		carro.setModelo("Meriva");
		carro.setAno(2005);
		carro.setQuatroPortas(true);
		System.out.println();
		
		carro.imprimir();
		carro.buzinar();
// visualizando carro e seus metodos		
		Caminhao caminhao = new Caminhao();
		caminhao.setMarca("SCANIA");
		caminhao.setModelo("XJT76");
		caminhao.setAno(2021);
		
		System.out.println();
		
		caminhao.imprimir();
		caminhao.buzinar();
		
		Moto moto = new Moto();
		moto.setMarca("Honda");
		moto.setModelo("Titan");
		moto.setAno(2014);
		
		System.out.println();
		
		moto.imprimir();
		moto.buzinar();
		moto.empinar();
		
	}
}
