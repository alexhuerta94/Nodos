
package nodos;

import java.util.Scanner;

/**
 *
 * @author Alejandro Huerta Gonzalez 3S11
 */
public class Eliminarprimeroultimo {
 Scanner sc = new Scanner(System.in);
    //Creamos las variables del ejercicio
    static class Nodo {
        String dato;
        Nodo sig;
    }
    
    Nodo fin = null;
    Nodo incio = null;
    //Creamos el primer metodo que nos permitira agregarlos al nodo 
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
//metodo que nos mostrara lo guardado en los nodos 
    public void mostrar() {
        Nodo actual = new Nodo();
        actual = fin;
        if (fin != null) {
            while (actual != null) {
                System.out.print(" DATO " + "[" + actual.dato + "]\n");
                actual = actual.sig;
            }
        } else {//creamos un if-else que comprobara que haya datos en el nodo si no mostrara que esta vacio
            System.out.println("\n La lista se encuentra vacia\n");
        }
    }
    //metodo que eliminara el ultimo nodo almacenado 
    public void eliminarultimo (){
        if (fin != null) {
        System.out.println("Dato eliminado: "+ fin.dato);
        fin = fin.sig;}
        else {//validamos con un if else que haya datos por eliminar
            System.out.println("No hay datos por eliminar");
        }
    }
//metodo que eliminara el ultimo nodo almacenado 
    public void eliminarprimero (){
        Nodo actual = fin;
         if (fin != null) {
        while(actual.sig != incio ){
            actual = actual.sig;
        }
       System.out.println("Dato eliminado: "+ incio.dato);
       actual.sig = null;
       incio = actual;}
          else {//validamos con un if else que haya datos por eliminar
            System.out.println("No hay datos por eliminar");
        }
         
    }//creamos el menu que ejecutara el programa y desde el cual llamaremos los metodos creados
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        String dato;
        Eliminarprimeroultimo n = new Eliminarprimeroultimo();
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
    
