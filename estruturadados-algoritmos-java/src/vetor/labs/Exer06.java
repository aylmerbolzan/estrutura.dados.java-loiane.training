package vetor.labs;

public class Exer06 {
    public static void main(String[] args) {

        // Criação das variáveis
        Scanner scan = new Scanner(System.in);

        // Criar um vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<Contato>(20);

        // Criar e adicionar 30 contatos

    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista){

    for(int i=1; i<quantidade; i++){
        Contato contato = new Contato();
        contato.setNome("Contato " + i);
        contato setTelefone("1111-1111" + i);
        contato.setEmail("contato" + i + "@gmail.com");

        lista.adiciona(contato);
        }
       }
}
