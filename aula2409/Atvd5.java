public class Atvd5 {
    public static void main(String[] args) {
    int contador = 0;
    for (int i = 1; i <= 20; i++) {
if (i % 3 == 0 && i % 5 != 0){
contador++;
}
    }
    System.out.println("Total de números divisiveis por 3 e não por 5: " + contador);
}
}