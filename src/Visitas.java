public class Visitas {
    public static void main(String[] args) {
        int[] visitas = new int[args.length] ;
        for (int i = 0; i < args.length; i++) {
            visitas[i] = Integer.parseInt(args[i]);
        }
        promedio(visitas);
    }
    static void promedio(int[] visitas){
        float promedio = 0;
        for (int i = 0; i < visitas.length; i++) {
            promedio+=visitas[i];
        }
        System.out.println(promedio/ visitas.length);
    }
}