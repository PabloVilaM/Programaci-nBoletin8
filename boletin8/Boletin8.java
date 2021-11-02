package boletin8;
import javax.swing.JOptionPane;

public class Boletin8 {

    public static void main(String[] args) {
        
        Clasificacion primerProducto = new Clasificacion();
        
        primerProducto.Clasificar();
        
        String valors = JOptionPane.showInputDialog("Dame un valor");
        String nome = JOptionPane.showInputDialog("Dame el nombre del producto");
        
       int valor = Integer.parseInt(valors);
        
        Clasificacion segundoProducto = new Clasificacion(nome,valor);
        
        segundoProducto.CC();
    }
    
}
