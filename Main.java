public class Main {
    public static void main(String[]args){
        char[]letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        int numero=52127889;
        char letra;
        calculo(letras,numero);


    }public static void calculo(char[] letras, int numero){
        int resultado=numero%23;
        for(int i=0;i<=letras[resultado];i++){

        }
        System.out.println(letras[resultado]);
    }
}
