import functions.Functions;

import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Functions functions = new Functions();
        String opc;
        functions.nomeEmpresa();
        functions.create();
        while (true){
            System.out.println("Digite promo para alterar a promoção");
            System.out.println("Digite 'mostrar' para mostrar todos os produtos");
            System.out.println("Digite 'exit' para sair do programa");
            opc = scanner.nextLine();
            if(Objects.equals(opc, "promo")){
                functions.promo();
            }
            if(Objects.equals(opc, "exit")){
                System.exit(0);
            }
            if(Objects.equals(opc, "mostrar")){
                functions.print();
            }
        }

    }
}