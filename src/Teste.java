import java.util.InputMismatchException;

public class Teste {

	public static Leitura scan = new Leitura();
	public static String op = "";
	public static BDVeiculos bdVeiculos = new BDVeiculos();

	public static void main(String args[]) {

		boolean sair = false;

		

		while (!sair) {
			System.out.println("Sistema de Gestão de Veículos - Menu Inicial\n");
			System.out.println(
					"\t1. Cadastrar Veículo de Passeio\n\t2. Cadastrar Veículo de Carga\n\t3. Imprimir Todos os Veículos de Passeio"
							+ "\n\t4. Imprimir Todos os Veículos de Carga\n\t5. Imprimir Veículo de Passeio Pela Placa\n\t6. Imprimir Veículo de Carga Pela Placa"
							+ "\n\t7. Excluir Veículo de Passeio pela Placa\n\t8. Excluir Veículo de Carga pela Placa\n\t9. Sair do Sistema\n");
			try {
				op = scan.entDados("OP: ");
			} catch (InputMismatchException e) {
				System.out.println("Tipo de entrada incorreta, informe apenas numeros.");
			}

			switch (op) {
				case "1":
					String continua = "s";
					while (continua.equalsIgnoreCase("s")) {
						Passeio pas = new Passeio();
						System.out.println(
								"Informe os dados cadastrais do veiculo de passeio " + (bdVeiculos.getListaPasseio().size() + 1));
						bdVeiculos.getListaPasseio().add(cPasseio(pas));
						if (bdVeiculos.getListaPasseio().get(bdVeiculos.getListaPasseio().size()-1) != null) {
							continua = scan.entDados("Continuar o cadastro? (s/n)");
						} else {
							bdVeiculos.getListaPasseio().remove(bdVeiculos.getListaPasseio().size()-1);
							continua = "n";
						}
					}
					break;
				case "2":
					continua = "s";
					while (continua.equalsIgnoreCase("s")) {
							Carga car = new Carga();
							System.out.println(
									"Informe os dados cadastrais do veiculo de carga " + (bdVeiculos.getListaCarga().size() + 1));
							bdVeiculos.getListaCarga().add(cCarga(car));
							if(bdVeiculos.getListaCarga().get(bdVeiculos.getListaCarga().size()-1) != null){
								continua = scan.entDados("Continuar o cadastro? (s/n)");
							} else {
								bdVeiculos.getListaCarga().remove(bdVeiculos.getListaCarga().size()-1);
								continua = "n";
							}

					}
					break;
				case "3":
					if (bdVeiculos.getListaPasseio().size() > 0){
						for (int i = 0; i < bdVeiculos.getListaPasseio().size(); i++) {
							System.out.println();
							System.out.println("Dados cadastrais do veiculo de passeio " + (i + 1));
							vPasseio(bdVeiculos.getListaPasseio().get(i));
							System.out.println();
						}
					} else {
						System.out.println("Não existem veículos de passeio cadastrados.");
					}
					break;
				case "4":
					if (bdVeiculos.getListaCarga().size() > 0){
						for (int i = 0; i < bdVeiculos.getListaCarga().size(); i++) {
							System.out.println();
							System.out.println("Dados cadastrais do veiculo de carga " + (i + 1));
							vCarga(bdVeiculos.getListaCarga().get(i));
							System.out.println();
						}
					} else {
						System.out.println("Não existem veículos de carga cadastrados.");
					}
					break;
				case "5":
					boolean temPlacaP = false;
					String passeioPlaca = scan.entDados("Informe a placa do veiculo de passeio:");
					for (int i = 0; i < bdVeiculos.getListaPasseio().size(); i++) {
						if (bdVeiculos.getListaPasseio().get(i).getPlaca().equalsIgnoreCase(passeioPlaca)) {
							temPlacaP = true;
							System.out.println("Dados do veículo de passeio " + (i + 1));
							vPasseio(bdVeiculos.getListaPasseio().get(i));
						}
					}
					if (!temPlacaP) {
						System.out.println("Placa nao cadastrada");
					}
					break;
				case "6":
					boolean temPlacaC = false;
					String cargaPlaca = scan.entDados("Informe a placa do veiculo de carga:");
					for (int i = 0; i < bdVeiculos.getListaCarga().size(); i++) {
						if (bdVeiculos.getListaCarga().get(i).getPlaca().equalsIgnoreCase(cargaPlaca)) {
							temPlacaC = true;
							System.out.println("Dados do veículo de carga " + (i + 1));
							vCarga(bdVeiculos.getListaCarga().get(i));
						}
					}
					if (!temPlacaC) {
						System.out.println("Placa nao cadastrada");
					}
					break;
				case "7":
					temPlacaP = false;
					passeioPlaca = scan.entDados("Informe a placa do veiculo de passeio que será excluído:");
					for (int i = 0; i < bdVeiculos.getListaPasseio().size(); i++) {
						if (bdVeiculos.getListaPasseio().get(i).getPlaca().equalsIgnoreCase(passeioPlaca)) {
							temPlacaP = true;
							bdVeiculos.getListaPasseio().remove(i);
							System.out.println("Veículo de passeio excluído com sucesso.");
						}
					}
					if (!temPlacaP) {
						System.out.println("Placa nao cadastrada, não é possível excluir um veículo não cadastrado.");
					}
					break;
				case "8":
					temPlacaC = false;
					cargaPlaca = scan.entDados("Informe a placa do veiculo de carga que será excluído:");
					for (int i = 0; i < bdVeiculos.getListaCarga().size(); i++) {
						if (bdVeiculos.getListaCarga().get(i).getPlaca().equalsIgnoreCase(cargaPlaca)){
							temPlacaC = true;
							bdVeiculos.getListaCarga().remove(i);
							System.out.println("Veículo de carga excluído com sucesso.");
						}
					}
					if (!temPlacaC) {
						System.out.println("Placa nao cadastrada, não é possível excluir um veículo não cadastrado.");
					}
					break;
				case "9":
					sair = true;
					break;
				default:
					System.out.println("Informe um dos valores apresentados");
					break;
			}
		}
	}
	

	public static Passeio cPasseio(Passeio passeio) {
		System.out.print("Informe a placa: ");
		try{
			String pPlaca = scan.entDados("");
			if (bdVeiculos.existePasseio(pPlaca)) {
				throw new VeicExistException();
			} else {
				passeio.setPlaca(pPlaca);
				System.out.print("Informe a marca: ");
				passeio.setMarca(scan.entDados(""));
				System.out.print("Informe o modelo: ");
				passeio.setModelo(scan.entDados(""));
				System.out.print("Informe a cor: ");
				passeio.setCor(scan.entDados(""));
				System.out.print("Informe a veloc. Max.: ");
				try{
					passeio.setVelocMax(Float.parseFloat(scan.entDados("")));
				} catch (VelocException e) {
					
				}
				System.out.print("Informe a qtd. de rodas: ");
				passeio.setQtdRodas(Integer.parseInt(scan.entDados("")));
				System.out.print("Informe a qtd. de pistoes do motor: ");
				passeio.getMotor().setQtdPist(Integer.parseInt(scan.entDados("")));
				System.out.print("Informe a potencia do motor: ");
				passeio.getMotor().setPotencia(Integer.parseInt(scan.entDados("")));
				System.out.print("Informe a quantidade de passageiros: ");
				passeio.setQtdPassageiros(Integer.parseInt(scan.entDados("")));
				return passeio;
				}
		} catch (VeicExistException e) {
			return null;
		}
		
	}

	public static void vPasseio(Passeio passeio) {
		System.out.println("Placa: " + passeio.getPlaca());
		System.out.println("Marca: " + passeio.getMarca());
		System.out.println("Modelo: " + passeio.getModelo());
		System.out.println("Cor: " + passeio.getCor());
		System.out.println("Qtd. de rodas: " + passeio.getQtdRodas());
		System.out.println("Qtd. de pistoes do motor: " + passeio.getMotor().getQtdPist());
		System.out.println("Potencia do motor: " + passeio.getMotor().getPotencia());
		System.out.println("Qtd. Passageiros: " + passeio.getQtdPassageiros());
		System.out.println("Veloc. Max. do veiculo de passeio: " + passeio.calcVel(passeio.getVelocMax()) + " CM/H");
		System.out.println("Soma das letras: " + passeio.calcular());
	}

	public static Carga cCarga(Carga carga) {
		System.out.print("Informe a placa: ");
		try{
			String cPlaca = scan.entDados("");
			if(bdVeiculos.existeCarga(cPlaca)){
				throw new VeicExistException();
				
			} else {
				carga.setPlaca(cPlaca);
				System.out.print("Informe a marca: ");
			carga.setMarca(scan.entDados(""));
			System.out.print("Informe o modelo: ");
			carga.setModelo(scan.entDados(""));
			System.out.print("Informe a cor: ");
			carga.setCor(scan.entDados(""));
			System.out.print("Informe a veloc. Max.: ");
			try {
				carga.setVelocMax(Float.parseFloat(scan.entDados("")));
			} catch (VelocException e) {
				
			}
			System.out.print("Informe a qtd. de rodas: ");
			carga.setQtdRodas(Integer.parseInt(scan.entDados("")));
			System.out.print("Informe a qtd. de pistoes do motor: ");
			carga.getMotor().setQtdPist(Integer.parseInt(scan.entDados("")));
			System.out.print("Informe a potencia do motor: ");
			carga.getMotor().setPotencia(Integer.parseInt(scan.entDados("")));
			System.out.print("Informe a quantidade de carga max.: ");
			carga.setCargaMax(Integer.parseInt(scan.entDados("")));
			System.out.print("Informe a tara: ");
			carga.setTara(Integer.parseInt(scan.entDados("")));
			return carga;
			}
		} catch (VeicExistException e) {
			return null;
		}
		
	}

	public static void vCarga(Carga carga) {
		System.out.println("Placa: " + carga.getPlaca());
		System.out.println("Marca: " + carga.getMarca());
		System.out.println("Modelo: " + carga.getModelo());
		System.out.println("Cor: " + carga.getCor());
		System.out.println("Qtd. de rodas: " + carga.getQtdRodas());
		System.out.println("Qtd. de pistoes do motor: " + carga.getMotor().getQtdPist());
		System.out.println("Potencia do motor: " + carga.getMotor().getPotencia());
		System.out.println("Qtd. Carga Max.: " + carga.getCargaMax());
		System.out.println("Tara: " + carga.getTara());
		System.out.println("Veloc. Max. do veiculo de passeio: " + carga.calcVel(carga.getVelocMax()) + " M/H");
		System.out.println("Soma dos numeros: " + carga.calcular());
	}

}