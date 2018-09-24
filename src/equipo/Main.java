/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class Main {
    public static void main (String[]args){
    Equipo A = new Equipo("A");
    Jugador j1= new Jugador("Juan");
    boolean resultado = A.addJugador(j1);
    A.addJugador(new Jugador("Julian"));
    ArrayList<Jugador> lista = A.getJugadores();
    if(resultado==true){
            System.out.println("ingresado");
    }else{
            System.out.println("no se logro ingresar al equipo");
    }

//for1
    for(Jugador jugador:A.getJugadores()){
        System.out.println(jugador.getNombre());;
    }
//for2
    for(int i=0; i<A.getJugadores().size();i++){
        Jugador jugador = A.getJugadores().get(i);
        System.out.println(jugador.getNombre());
    }
//otra forma de imprimir
        System.out.println(A.toString());
    }
    
}
