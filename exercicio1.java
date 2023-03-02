/**
 * exercicio
 */
public class exercicio1 {

    public static void main(String[] args) {
        for(int i = 150; i <= 300; i++){
            System.out.println("Numero:"+i);
        }
        int soma = 0;
        for(int j = 1; j<=1000;j++){
            soma += j;
        }
        System.out.println("Soma de 1 até 1000:"+soma);
        int fat = 1;
        for(int k = 1; k <= 10;k++){
            fat= fat*k;
    
            System.out.println("O fatorial a calcular é:"+k+" ,resultado do fatorial:"+fat);

        }
    }
}