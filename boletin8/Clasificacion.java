package boletin8;

import javax.swing.JOptionPane;

public class Clasificacion {

    private int cventas;
    private String nome;
    
    public Clasificacion(String a, int b){
        cventas = b;
        nome = a;
    }
    
    public Clasificacion(){
 
    }
    
    public void Clasificar(){
        String valor = JOptionPane.showInputDialog("Dame un valor");
        String nome = JOptionPane.showInputDialog("Dame el nombre del producto");
        
       int cventas = Integer.parseInt(valor);
       
       if (cventas<=100){
           System.out.println("Valor del producto: " + valor + "\nNombre del producto: " + nome + " entonces, é de consumo baixo");
       }
       else if (cventas>100 && cventas<=500){
           System.out.println("Valor del producto: " + valor + "\nNombre del producto: " + nome + " entonces, é de consumo medio");
       }
       else if (cventas>500 && cventas <=1000){
           System.out.println("Valor del producto: " + valor + "\nNombre del producto: " + nome + " entonces, é de consumo alto");
       }
       else
           System.out.println("Valor del producto: " + valor + "\nNombre del producto: " + nome + " entonces, é de primeira necesidade");
       
    }
    
    //Otro metodo usando constructores atributos y mas interacción entre clases
    
    public void CC(){
        
        if (cventas<=100){
           System.out.println("Valor del producto: " + cventas + "\nNombre del producto: " + nome + " entonces, é de consumo baixo");
       }
       else if (cventas>100 && cventas<=500){
           System.out.println("Valor del producto: " + cventas + "\nNombre del producto: " + nome + " entonces, é de consumo medio");
       }
       else if (cventas>500 && cventas <=1000){
           System.out.println("Valor del producto: " + cventas + "\nNombre del producto: " + nome + " entonces, é de consumo alto");
       }
       else
           System.out.println("Valor del producto: " + cventas + "\nNombre del producto: " + nome + " entonces, é de primeira necesidade");
    }
    
}
