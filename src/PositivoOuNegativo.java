import java.util.Scanner;
public class PositivoOuNegativo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();
        String retorno = Verificar(n);
        System.out.println(retorno);
    }
    public static String Verificar(int n) {
        String retorno;

        if (n > 0) {
            retorno = "P";
        } else {
            retorno  = "N";
        }
        return retorno;
    }
}
