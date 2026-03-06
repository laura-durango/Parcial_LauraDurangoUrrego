import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Metodos {

    Scanner sc = new Scanner(System.in);

    public Objpunto2 [][] CrearMatriz (Objpunto2[][]m){

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length; j++) {

                Objpunto2 o = new Objpunto2();

                

                System.out.println("Ingrese el producto");
                o.setProducto(sc.next());

                System.out.println("Ingrese el valor del producto");
                o.setValorProducto(sc.nextDouble());

                System.out.println("Ingrese la catidad del producto");

                o.setCantidad(sc.nextInt());


                m[i][j] = o;

        
                
            }
            
        }

        return m;

    }

    public double totalventas (Objpunto2 [][]m) {

        double total = 0;


        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length; j++) {

                total = total + (m [i][j].getCantidad()*m[i][j].getValorProducto());
                
            }
            
        }
         return total;
    }

    public void llenarMatriz(Objpunto2[][] ventas) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'llenarMatriz'");
    }

    public Objpunto2[][] CrearMatriz(int f, int c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'CrearMatriz'");
    }   
}
