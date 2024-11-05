
import java.util.Scanner;

public class Atvd1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius:");
        double temperatura = scanner.nextDouble();
        if (temperatura >= 15 && temperatura <= 25){
            System.out.println("A temperatura esta dentro dos limites seguros");
            
        }else{
            System.out.println("Atenção, a temperatura está fora dos limites seguros!");
        }
}
}