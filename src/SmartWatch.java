public class SmartWatch {
    public static void main(String[] args) {
        int[] pasos = new int[args.length] ;
        for (int i = 0; i < args.length; i++) {
            pasos[i] = Integer.parseInt(args[i]);
        }
        pasos = clearSteps(pasos);
        int promedio = 0;
        int contador = 0;
        for (int i = 0; i < pasos.length; i++) {
            if(pasos[i] > 0){
                promedio += pasos[i];
                contador++;
            }
        }
        System.out.println(promedio/contador);
    }
    static int[] clearSteps(int[] depurar){
        int[] depurados = new int[depurar.length];
        for (int i = 0; i < depurar.length; i++) {
            if(depurar[i]>200 && depurar[i]<100000){
                depurados[i] = depurar[i];
            }else{
                depurados[i] = 0;
            }
        }
        return depurados;
    }
}
