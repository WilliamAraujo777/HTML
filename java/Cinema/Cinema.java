
// import javax.swing.JOptionPane; 
import java.util.*;

public class Cinema{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> lugares = new ArrayList<String>();

		int sala = 0;
		int escolha = 0;
		int qtdLugares = 0;
		String lugarEscolhido = "";
		//int fileiras[] = new int[6];
		//String lugares[] = new String[25];

		System.out.println("Olá! Seja bem vindo(a) a bilheteria!\nPor favor, insira seu nome: ");
		String nome = sc.nextLine();

		while (escolha == 0) {
			System.out.println("Atualmente, estamos com duas salas de cinema ativas, qual deseja?"
					+ "\nSala Alpha = As Branquelas" + "\nSala Beta  = A chegada");
			sala = sc.nextInt();

			if (sala == 1 || sala == 2) {
				escolha += 1;
			} else {
				System.out.println("Opa! Parece que selecionou uma sala indisponivel...Tente novamente!");
			}
		}

		if (sala == 1) {
			System.out.println(
					"Você Selecionou a sala Alpha com o filme: As Branquelas! Que contem 140 lugares disponiveis!" 
					+ "\nQuantos lugares vai querer?");
					qtdLugares = sc.nextInt();
					if(qtdLugares > 0 && qtdLugares <= 140){

					}else{
						System.out.println("Por favor, selecione no máximo 140 bilhetes!");
					}
			
		} else if (sala == 2) {
			System.out.println("Você Selecionou a sala Beta com o filme: A chegada!" + "\nQuantos lugares vai querer?");
			qtdLugares = sc.nextInt();
		}
		
		for (int cont = 0; cont < qtdLugares; cont++) {
			System.out.println("Qual fileira irá querer?" + "\n6 " + "\n5 " + "\n4" + "\n3" + "\n2"
					+ "\n1 - ASSENTOS PREFERENCIAIS" + "\nTELAO");

			int fileiraEscolhida = sc.nextInt();
 			System.out.println("teste");
			sc.nextLine();
	

			if (fileiraEscolhida != 1) {
				System.out.println("Agora escolha um assento: " + "\nA B C D E F G H I J K L M N O P Q R S T U V W ");
				lugarEscolhido = fileiraEscolhida + sc.nextLine();

			} else {
				System.out.println("Agora escolha um assento: " + "\nA B C D E F G H I J K L M"
						+ "\nPREFERENCIAIS: N O P Q R S T U V W Y Z");
				 lugarEscolhido = fileiraEscolhida + sc.nextLine();
			}

			if(cont != 0){
				
				if(!lugares.contains(lugarEscolhido)){
					lugares.add(cont, lugarEscolhido);
				}else{
					System.out.println("Opa! Parece que este lugar ja foi selecionado! Por favor, escolha outro");
					cont -= 1;
				}
			}else{
				lugares.add(cont, lugarEscolhido);
			}
		}

		System.out.println(nome + " seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.");


	}

}

/*
 * a b c d e f g h i j k l m n o p q r s t u v w beta a b c d e f g h i j k l m
 * n o p q r s t alpha
 */

/*
 * A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F)
 * com mais 12 assentos para pessoas com deficiência. A sala Beta possui 120
 * lugares divididos em 5 fileiras (A, B, C, D, E) com mais 6 lugares para
 * pessoas com deficiência.
 * 
 * 
 * 
 * Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala
 * Beta de "A Chegada".
 * 
 * 
 * 
 * Construa um programa em que uma pessoa compre um ingresso para qualquer uma
 * das salas e possa escolher a fileira em que vai sentar.
 * 
 * 
 * 
 * O programa deve perguntar, em algum momento, o nome do usuário.
 * 
 * 
 * 
 * Uma vez que o assento seja escolhido, é necessário que o programa exiba
 * quantos lugares ainda estão disponíveis no total e também em quais fileiras.
 * 
 * 
 * 
 * É importante que o comprador possa escolher a quantidade de ingressos que
 * quer comprar e que ele não possa comprar mais ingressos do que a fileira
 * tenha disponível.
 * 
 * 
 * 
 * Ao final, o programa deve exibir a mensagem
 * "[COMPRADOR], seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme."
 * .
 */