
/// Suma de los elementos de un objeto ArrayList.
package pacticas_de_laboratorio_lista_de_datos;
import java.util.ArrayList;

public class Pacticas_de_laboratorio_lista_de_datos {

    public static void main(String[] args) {//se crea el metodo main
        
    // crea, inicializa y muestra en pantalla el objeto ArrayList de objetos Number 
    // que contiene objetos Integer y Double, después muestra el total de los elementos
    Number[] numeros = { 1, 2.4, 3, 4.1 }; // objetos Integer y Double  
    ArrayList< Number > listaNumeros = new ArrayList< Number >(); //se crea listanumeros y se almacena en la variable number
    for ( Number elemento : numeros )  // se utiliza un for para 
    listaNumeros.add( elemento ); // coloca cada número en listaNumeros
    System.out.printf( "listaNumeros contiene: "+listaNumeros );// se imprime con los numros contenidos en una lista
    System.out.printf( "Total de los elementos en listaNumeros: %.1f\n",
            sumar( listaNumeros )); 
    // ﬁn de main 
}
// calcula el total de los elementos de ArrayList 
    public static double sumar( ArrayList< Number > lista )   {
        double total = 0; // inicializa el total
        // calcula la suma 
        for ( Number elemento : lista ) // se utiliza un for para cumplir la condicion
            total += elemento.doubleValue(); // se utiliza el operador para sumar el total y el numero de elemento
        return total; //retorna el total
    } // ﬁn del método sumar
}  // ﬁn de la clase TotalNumeros



