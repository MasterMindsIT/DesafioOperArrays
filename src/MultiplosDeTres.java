public class MultiplosDeTres {
    public static void main(String[] args) {
        int[] numeros = new int[args.length] ;
        for (int i = 0; i < args.length; i++) {
            numeros[i] = Integer.parseInt(args[i]);
        }
        //suma(numeros);
        promedio(numeros);
    }

    private static void suma(int[] numeros) {
        int total = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i]%3==0){
                total+=numeros[i];
            }
        }
        System.out.println(total);
    }
    static void promedio(int[] numeros){
        int total = 0;
        int contador = 0;
        for (int i = 0; i < numeros.length ; i++) {
            if(numeros[i]%3==0){
                total+=numeros[i];
                contador++;
            }
        }
        suma(numeros);
        System.out.println(total/contador);
    }
}
