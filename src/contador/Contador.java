/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class Contador {
int tiempo = 5;
    public void Imprimir(int tiem){
        
        if((tiempo != 0)){ 
            
//          System.out.println("La bomba va a explotar en: " + tiempo + " segundos");
            JOptionPane.showMessageDialog(null, "La bomba va a explotar en: " + tiempo + " clicks");
            tiempo = tiempo -1;
            Imprimir(tiempo);
            
        }else{
//            System.out.println("¡BOOOM!");
            JOptionPane.showMessageDialog(null, "¡BOOOM!");
            
        }
              
    }
    public static void main(String[] args) {
        Contador cuenta = new Contador();
        cuenta.Imprimir(0);
    }
}
