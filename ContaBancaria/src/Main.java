
public class Main {

	public static void main(String[] args) {

				
//				ConanBancaria conta1 = new ConanBancaria(true, 200, 213785);
//				ConanBancaria conta2 = new ConanBancaria(true, 1000, 3897);
//				
//				conta1.Receber(1000);
//				conta2.Receber(600);
//				
//				System.out.printf("O valor na conta 1 ? de R$%.2f%n",conta1.Ver());
//				System.out.printf("O valor na conta 2 ? de R$%.2f%n%n",conta2.Ver());
//				conta1.Dar(400);
//				conta2.Receber(400);
//				
//				System.out.printf("O valor na conta 1 ? de R$%.2f%n",conta1.Ver());
//				System.out.printf("O valor na conta 2 ? de R$%.2f%n%n",conta2.Ver());
//				conta1.Dar(600);
//				conta2.Receber(600);
//				System.out.printf("O valor na conta 1 ? de R$%.2f%n",conta1.Ver());
//				System.out.printf("O valor na conta 2 ? de R$%.2f%n%n",conta2.Ver());
//				
				Cliente cliente1 = new Cliente();
// Crie o Objeto cliente1
				cliente1.setNome("Rafael");
				cliente1.setCPF(123456);
				cliente1.setNumConta(1237763);
// Coloque os atributos
//				System.out.println(cliente1);
			
				
				
				Cliente cliente2 = new Cliente();
				
				cliente2.setNome("Rafael");
				cliente2.setCPF(123456);
				cliente2.setNumConta(1237763);
				
			
//				if(cliente1 == cliente2) {
//					System.out.println("________________________");
//					System.out.println("Os Objetos s?o iguais!");
//				}else {
//					System.out.println("_________________________");
//					System.out.println("Os Objetos s?o diferentes!");
//				}
				
				if(cliente1.equals(cliente2)) {
					System.out.println("Os atr?butos s?o iguais");
				}else {
					System.out.println("Os atr?butos s?o diferentes!");
				}
// Usando if else para mostrar uma mensagem caso o  equals seja igual ou diferente				
				
			}

		}

