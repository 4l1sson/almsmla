
import java.util.Scanner;

public class divisaopor2 {
    public static void main(String[] args) {
        System.out.print("Informe o tipo de operação a operar:");
        Scanner leitor = new Scanner(System.in);
        String nomeOp = leitor.next();
        if (nomeOp.equals("Inteiro")) {


                System.out.print("Informe um numero inteiro qualquer:");
                double n = leitor.nextInt();
                int conta = (int) n/2;
                System.out.println("Resultado inteiro:"+conta);
               
        
                
            } 
            if(nomeOp.equals("Real")) {
                System.out.print("Informe um numero real qualquer:");

                double n = leitor.nextDouble();
                double conta1 = (double) n/2;
                
                System.out.println("Resultado numero real:"+conta1);
                                 
            }
            leitor.close();
        }
    
}
    
