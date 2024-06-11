
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Tenis;
import service.InteracaoUsuario;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        InteracaoUsuario interacaoUsuario = new InteracaoUsuario(leitor);

        List<Tenis> tenises = new ArrayList<Tenis>();

        int opcao = 0;

        while (opcao != 0) {
            opcao = interacaoUsuario.requistarOpcaoMenu();
            switch (opcao) {
                case 1:
                    tenises.add(
                        interacaoUsuario.requisitarDadosTenis()
                        );
                default:
                    throw new AssertionError();
            }
        }
        
        
    }
}
