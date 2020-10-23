 
package sumatoriametodos;
import java.util.Scanner;
 
public class SumatoriaMetodos {
    static Scanner leer=new Scanner(System.in);

     
    public static void main(String[] args) {
        int n,i;
        double result,acum=0;
        System.out.println("Ingrese el limite para su sumatoria");
        n=leer.nextInt();
        for(i=1;i<=n;i++){
        result=numerador(n,i)/denominador(n,i);
        acum=acum+result;}
        System.out.print("El resultado es: ");
        System.out.printf("%.5f%n",acum);   
    }
    public static double numerador(int n, int i){
        double numerador;
            numerador=i*i+8*i+10;
            return numerador;
    }
    public static double denominador(int n, int i){
        double abajo,denominador,fact=1;
            abajo=i+1;
            while(abajo!=0){
                fact=fact*abajo;
                abajo=abajo-1;}
                denominador=fact;
        
                return denominador;
        }
}
