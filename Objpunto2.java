public class Objpunto2 {

    private String Producto;
    private double ValorProducto;
    private int Cantidad;
   
    public Objpunto2(String producto, double valorProducto, int cantidad) {
        Producto = producto;
        ValorProducto = valorProducto;
        Cantidad = cantidad;
        
    }
    public Objpunto2() {
    }
    public String getProducto() {
        return Producto;
    }
    public void setProducto(String producto) {
        Producto = producto;
    }
    public double getValorProducto() {
        return ValorProducto;
    }
    public void setValorProducto(double valorProducto) {
        ValorProducto = valorProducto;
    }
    public int getCantidad() {
        return Cantidad;
    }
    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    
    
    
        
    }

}