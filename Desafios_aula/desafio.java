import java.util.Scanner; 
    public static void main(String [] args) {
        java.util.Scanner leitura = new Scanner (System.in);
        System.out.println("Digite um número");
        int numero = leitura.nextInt();
        System.out.println("");
        for(int i = 1; i <= numero; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j + "");
        }
        System.out.println("");
    }


}