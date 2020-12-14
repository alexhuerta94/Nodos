
package nodos;

import java.util.Scanner;

public class Primeronodos {
 Scanner sc = new Scanner(System.in);
    
    static class Nodo {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;
    Nodo incio = null;
    
    public void agregar() {
        Nodo temp = new Nodo();
        System.out.println("agregar el dato ");
        temp.dato=sc.nextLine();
        
        if (fin == null) {
            fin = temp;
            fin.sig = null;
            incio = temp;
        } else {
            incio.sig=temp;
            temp.sig = null;
            incio = temp;
            System.out.println("Dato agregado "+ incio.dato);
        }
    }

    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" DATO " + "[" + actual.dato + "]\n");
                actual = actual.sig;
            }
        } else {
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    
    public void eliminarultimo (){
        if (fin != null) {
        System.out.println("Dato eliminado: "+ fin.dato);
        fin = fin.sig;}
        else {
            System.out.println("No hay datos por eliminar");
        }
    }

    public void eliminarprimero (){
        Nodo actual = fin;
         if (fin != null) {
        while(actual.sig != incio ){
            actual = actual.sig;
        }
       System.out.println("Dato eliminado: "+ incio.dato);
       actual.sig = null;
       incio = actual;}
          else {
            System.out.println("No hay datos por eliminar");
        }
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Primeronodos n = new Primeronodos();
        do {
            System.out.println("1.- Agregar \n"
                    + "2.- Mostrar \n"
                    + "3.- Eliminar Primer dato \n"
                    + "4.- Eliminar Ultimo dato \n"
                    + "5.- Salir");
            switch (opt = sc.nextInt()) {
                case 1:
                    n.agregar();
                    break;

                case 2:
                    n.mostrar();
                    break;
                 
                case 3:
                    n.eliminarultimo();
                    break;
                 
                case 4:
                    n.eliminarprimero();
                    break;
            }
        } while (opt != 5);
    }
}
    

