
package principal;

import Lista.Lista;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Lista a = new Lista();
        Scanner in = new Scanner(System.in);
        int opcao = 1;
                do{
            System.out.println("=============================================");
            System.out.println("            Brincando com Posições           ");
            System.out.println("=============================================");
            System.out.println("Lista de opições disponiveis:");
            System.out.println("1.Adicionar no Começo");
            System.out.println("2.Adicionar no Final");
            System.out.println("3.Adicionar por posição");
            System.out.println("4.Remover por Posicao");
            System.out.println("5.Remover no começo");
            System.out.println("6.Remover no final");
            System.out.println("7.Imprimir Lista");
            System.out.println("0.SAIR");
            System.out.print("Digite o número da operação que deseja realizar: ");
            opcao = in.nextInt();
        switch(opcao){
            case 1:
                System.out.print("Digite o que deseja adicionar: ");
                a.adicionarNoComeco(in.next());
                break;
            case 2:
                System.out.print("Digite o que deseja adicionar: ");
                a.adicionarNoFinal(in.next());
                break;
            case 3:
                System.out.print("Em qual posição deseja adicionar? ");
                int pos = in.nextInt();
                System.out.print("Digite o que deseja adicionar: ");
                a.adicionarPosicao(pos, in.next());
                break;
            case 4:
                System.out.print("Qual a posição você desenha remover? ");
                a.removerPosicao(in.nextInt());
                break;
            case 5:
                a.removerNoComeco();
                break;
            case 6:
                a.removerNoFim();
                break;
            case 7:
                a.imprimir();
                break;
            default:
                System.out.println("Número inválido!");
                //break;
        }    
        }while(opcao!=0);
       in.close();
    }
}
