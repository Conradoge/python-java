import java.util.Scanner;

public class Atvd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
System.out.println("Qual a sua nacionalidade?");
         String nacionalidade = scanner.nextLine();
         if (nacionalidade.equalsIgnoreCase("brasileiro") || nacionalidade.equalsIgnoreCase("brasil")) {
         System.out.println("Qual sua idade?");
         int idade = scanner.nextInt();
         if (idade >= 16){
            System.out.println("Você está apto para votar");
         } else if (idade >= 16 && idade < 18){
            System.out.println("Você esta aptopara votar, mas o voto é facultativo.");

         }else if(idade >= 18 && idade < 70){
            System.out.println("Você está apto para votar e seu voto é obrigatorio.");

         }else if(idade >= 70){
            System.out.println("O seu vot é facultativo.");
         }
}
}
}