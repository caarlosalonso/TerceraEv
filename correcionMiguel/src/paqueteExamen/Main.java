package paqueteExamen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList <Biblioteca> listaEjemplares = new ArrayList<>();
        ArrayList <Biblioteca> listaEjemplaresAlquilados = new ArrayList<>();
        for (int contador = 0; contador <= 1000; contador++){
            Libro libroAuxiliar = new Libro("Por Poner", "Por Poner", LocalDate.of(2022, 3, 4), 2);
            Musica musicaAuxiliar = new Musica("Por Poner", "Por Poner", LocalDate.of(2022, 3, 4), 2);
            Pelicula peliculaAuxiliar = new Pelicula("Por Poner", "Por Poner", LocalDate.of(2022, 3, 4), 2);
            listaEjemplares.add(libroAuxiliar);
            listaEjemplares.add(musicaAuxiliar);
            listaEjemplares.add(peliculaAuxiliar);
        }
        int menu;
        do {
            System.out.println("Bienvenido al Menu, elige opciones");
            System.out.println("1.Mostrar Listas");
            System.out.println("3.Alquilar Ejemplar");
            menu = teclado.nextInt();
            if (menu == 1){
                mostrarListas(listaEjemplares, listaEjemplaresAlquilados);
            } else if (menu == 3) {
                alquilarEjemplar(listaEjemplares, listaEjemplaresAlquilados);
            }

        } while (menu != 5);
    }
    public static void mostrarListas(ArrayList<Biblioteca> listaEjemplares, ArrayList <Biblioteca> listaEjemplaresAlquilados){
        System.out.println("LISTA EJEMPLARES" + '\n' + "**********");
        for (int contador = 0; contador < listaEjemplares.size(); contador++){
            listaEjemplares.get(contador).mostrar();
            System.out.println("**********");
        }
        System.out.println("LISTA EJEMPLARES ALQUILADOS" + '\n' + "**********");
        for (int contador = 0; contador < listaEjemplaresAlquilados.size(); contador++){
            listaEjemplaresAlquilados.get(contador).mostrar();
            System.out.println("**********");
        }
    }

    public static void alquilarEjemplar(ArrayList<Biblioteca> listaEjemplares, ArrayList <Biblioteca> listaEjemplaresAlquilados){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Proporciona el codigo del ejemplar");
        String codigoEjemplar = teclado.nextLine();
        String regexEjemplar = "[Bib][0-9]{6}";
        boolean correctoIncorrecto = false;
        //while (!Pattern.matches(regexEjemplar, codigoEjemplar)){
        //System.out.println("Formato del Codigo del Ejemplar Incorrecto, vuelve a introducirlo");
        //codigoEjemplar = teclado.nextLine();
        //}
        for (Biblioteca listaEjemplare : listaEjemplares) {
            if (listaEjemplare.getCodigo().equals(codigoEjemplar)){
                listaEjemplare.alquilar();
                listaEjemplaresAlquilados.add(listaEjemplare);
                listaEjemplares.remove(listaEjemplare);
                correctoIncorrecto = true;
            }

        }
        if (!correctoIncorrecto){
            System.out.println("El ejemplar indicado no esta en la lista de disponibles");

        }
    }
}