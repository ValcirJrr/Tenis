package service;

import java.util.Scanner;
import model.Tenis;

public class InteracaoUsuario {

    private final Scanner leitor;

    public InteracaoUsuario(Scanner leitor){
        this.leitor = leitor;
    }
    

    final String MENU = """
        ---- MENU ---
        1) cadastrar tenis
        2) listar tenis
        3) procurar por tamanho
        """;

    public int requistarOpcaoMenu(){
        System.out.println(MENU);
        return leitor.nextInt();
    }

    public Tenis requisitarDadosTenis(){
        System.out.println("Informe a marca");
        String marca = leitor.nextLine();
        System.out.println("Informe o tamanho");
        Integer tamanho = leitor.nextInt();
        System.out.println("Informe o modelo");
        String modelo = leitor.nextLine();
        return new Tenis(marca, tamanho, modelo);
    }


    
}
