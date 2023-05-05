import java.io.IOException;

public class PrincipalArquivo {
	public static void main(String[] args) throws IOException {
		String pathNome ="nome.txt";
		String pathSobrenome = "sobrenome.txt";
		String pathNomeCompleto = "nomeCompleto.txt";
		ManipuladorArquivo.concatenadorNomes(pathNome, pathSobrenome, pathNomeCompleto);


	}
}
