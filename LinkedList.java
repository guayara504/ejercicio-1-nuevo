
package linkedlist;

import javax.swing.JOptionPane;


public class LinkedList {

    
    public static void main(String[] args) {
        Lista registro =new Lista();
        
        Nodo e;
        int respuesta;
        String borrar;
         int posicion;
        
        do{
        respuesta =Integer.parseInt(JOptionPane.showInputDialog(null,"1) Agregar estudiante\n2)Agregar a la cabeza\n3)Agregar por posicion\n4)remover por nombre\n5)Mostrar lista\n6)Salir"));
        switch(respuesta){
            case 1:
                
                e =new Nodo();
                e.setEstudiante(JOptionPane.showInputDialog("Digite un nombre: "));
                registro.AddNodo(e);
                break;
            case 2:
                e =new Nodo();
                e.setEstudiante(JOptionPane.showInputDialog("Digite un nombre: "));
                registro.AddHead(e);
                break;
                
            case 3:
                            
                
                JOptionPane.showMessageDialog(null, "hay "+registro.getContador()+" estudiantes.");
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Que posicion elige:"));
                if(posicion-1<registro.getContador()){
                e =new Nodo();
                e.setEstudiante(JOptionPane.showInputDialog("Digite un nombre: "));
                registro.addGivenPosition(posicion, e);
                }
                break;
            case 4:
              
              borrar=(JOptionPane.showInputDialog(null, "Nombre del estudiante:"));
              registro.Remove(borrar);
              break;
            
            case 5:
                registro.Print();
               break;
               
            case 6:
                JOptionPane.showMessageDialog(null, "Ejecucion finalizada");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion incorrecta");
                break;
        }
      
        }while(respuesta!=6);
        
        
        
        
    }
    
}
