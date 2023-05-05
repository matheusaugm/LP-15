import java.io.*;
import java.util.Scanner;

public class ManipuladorArquivo {
	public static void leitor(String path) throws IOException{
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
		while(true){
			if(linha != null){
				System.out.println(linha);
			}else
				break;
			linha = buffRead.readLine();
		}
		buffRead.close();
	}
	public static void escritor (String path) throws IOException{
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();

	}
	public static void concatenadorNomes(String pathNome, String pathSobrenome, String pathNomeCompleto) throws IOException{
		String nome = "";
		String sobrenome = "";
		String nomeCompleto = "";
		BufferedReader buffReadNome = new BufferedReader(new FileReader(pathNome));
		BufferedReader buffReadSobrenome = new BufferedReader(new FileReader(pathSobrenome));
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(pathNomeCompleto));
		while(true){
			nome = buffReadNome.readLine();
			sobrenome = buffReadSobrenome.readLine();
			if(nome != null && sobrenome != null){
				nomeCompleto = nome + " " + sobrenome;
				System.out.println(nomeCompleto);
				buffWrite.append(nomeCompleto + "\n");

			}else
				break;
		}
		buffReadNome.close();
		buffReadSobrenome.close();
		buffWrite.close();
	}

}
