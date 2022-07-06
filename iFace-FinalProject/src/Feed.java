import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Feed {

    private int feedControl = 0;
    private ArrayList<String> mensagensFeed = new ArrayList<String>();
    Scanner sc = new Scanner(System.in);

    public int getFeedControl(){
        return feedControl;
    }

    public void mandarFeed(){
        System.out.println("\nDigite alguma coisa para seu feed:");
        String mensagem = sc.nextLine();

        mensagensFeed.add(mensagem);
    }

    public void printarFeed(){
        if(mensagensFeed.size() > 0){
            System.out.println("\nMensagens no feed:\n");

            for(int i = 0; i < mensagensFeed.size(); i++){
                System.out.println("--> " + mensagensFeed.get(i));
            }
        }
        else System.out.println("\nVocê ainda não possui nenhuma mensagem!!\n");
    }

    public void controlarFeed(){
        System.out.println("\nQuem você deseja que possa ver o seu Feed? Escolha um número abaixo:");
        System.out.println("0 - Todos usuarios do iFace\n1 - Somente amigos");
        int auxiliar = -11;

        while(auxiliar != 0 && auxiliar != 1){
            try {
                auxiliar = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("\nEntrada digitada inválida!");
                System.out.println("0 - Todos usuarios do iFace\n1 - Somente amigos");
                sc.nextLine();
            }
        }

        if(auxiliar == 0){
            feedControl = 0;
            System.out.println("\nPronto! Todos os usuarios podem ver seu Feed agora!\n");
        }
        else if(auxiliar == 1){
            feedControl = 1;
            System.out.println("\nPronto! Apenas seus amigos podem ver seu Feed agora!\n");
        }
    }

    public void exibirFeedAlguem(ArrayList<Account> contas, String username){
        int sucesso = 0;
        int indice = 0;
        int sucesso1 = 0;
        System.out.println("\nDigite o nome de quem deseja ver o Feed");
        String pessoa = sc.nextLine();

        for(int i = 0; i < contas.size(); i++){
            if(contas.get(i).getUsername().equals(pessoa)){
                indice = i;
                sucesso++;
            }
        }
        if(sucesso == 1){
            if(contas.get(indice).feedControl == 0){
                contas.get(indice).printarFeed();
            }
            else if(contas.get(indice).feedControl == 1){
                for(int k = 0; k < contas.get(indice).friends.getAmigos().size(); k++){
                    if(contas.get(indice).friends.getAmigos().get(k).equals(username)){
                        contas.get(indice).printarFeed();
                        sucesso1++;
                    }
                }
                if(sucesso1 == 0){
                    System.out.println("\nDesculpe, o usuario so permite que amigos vejam seu Feed!\n");
                }
            }
        }
        else{
            System.out.println("\nO usuario digitado não existe!\n");
        }

    }
}
