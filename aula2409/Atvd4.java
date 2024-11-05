
import java.util.Scanner;

public class Atvd4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor total da compra:");
        double valorTotal = scanner.nextDouble();
        System.out.println("Qual a disponibilidade do produto? (digite 'disponível' ou 'indisponível'): ");
        String disponibilidade = scanner.next();
         if (disponibilidade.equalsIgnoreCase("indisponível")) {
            System.out.println("Produto cancelado");
         }else if(disponibilidade.equalsIgnoreCase("disponível")) {
            if(valorTotal > 100){
                System.out.print("Escolha a opção de frete (expresso/padrão): ");
                String frete = scanner.next();
                if (frete.equalsIgnoreCase("expresso")){
                    System.out.println("Pedido aprovado com entrega expresso.");
                }else{
                    System.out.println("Pedido aprovado com entrega padrão");

                }

            }else{
                System.out.println("Pedido aprovado com frete econômico.");
            }
         }else{
            System.out.println("Entrada de disponibilidade inválida.");
        }
    }
}