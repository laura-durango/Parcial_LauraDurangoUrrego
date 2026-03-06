import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Metodos metodos = new Metodos();

        System.out.println("Ingrese cuantas filas tendra la matriz ");
        int f = sc.nextInt();

        System.out.println("Ingrese cuantas Columnas tendra la matriz ");
        int c = sc.nextInt();

        Objpunto2 [][] ventas = metodos.CrearMatriz(f,c);

        metodos.llenarMatriz(ventas);

        double total = metodos.totalventas(ventas);

        System.out.println("El total de las ventas en el mes de abril es:" + total);



        
    }
    
}
