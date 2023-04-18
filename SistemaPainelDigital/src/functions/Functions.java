package functions;

import java.util.*;

public class Functions {
        Scanner scanner = new Scanner(System.in);

        List<String> lista = new ArrayList<>();

        String nomeEmpresa;
    public  void create(){

        String adicionar = "1";
        float adicionarNum = 1;
        for(int i = 0; i<6; i++){
            System.out.println("Digite o próximo nome e o valor com espaço entre eles");
            adicionar = scanner.nextLine();
            adicionar = adicionar.substring(0,1).toUpperCase() + adicionar.substring(1).toLowerCase();
            lista.add(adicionar);}
        }


    public void promo(){
        int promocao;
        Scanner scanner1 = new Scanner(System.in);
        print();
        System.out.println("Digite o número do index que você quer deixar em promoção");
        promocao = scanner1.nextInt();
        Collections.swap(lista, 0, promocao);
    }
    public void nomeEmpresa(){
        System.out.println("Digite o nome da empresa: ");
        nomeEmpresa = scanner.nextLine();
        nomeEmpresa = nomeEmpresa.substring(0,1).toUpperCase() + nomeEmpresa.substring(1).toLowerCase();
    }
    public void print(){
        System.out.println("===============================");
        System.out.println(nomeEmpresa);
        System.out.println("===============================");
        System.out.println(lista.get(0).toUpperCase());
        System.out.println("===============================");
        for(int i = 1; i<6; i++){
            System.out.println(i + " - " + lista.get(i));
        }
        System.out.println("===============================");
    }

}
