package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//EJERCICIO 01
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el genero de pelicula favorito \n ACCION \n COMEDIA \n DRAMA \n CIENCIA FICCION");
        String pelicula = sc.nextLine();
        pelicula = pelicula.toUpperCase();

        if (pelicula.equals("ACCION")){
            System.out.println("Te recomiendo ver el transportador");
        }else if (pelicula.equals("COMEDIA")){
            System.out.println("Te recomiendo que veas American Pie 3 La Boda");
        }else if (pelicula.equals("DRAMA")){
            System.out.println("Te recomiendo ver PD te amo");
        }else if (pelicula.equals("CIENCIA FICCION")){
            System.out.println("Te recomiendo la pelicula Avengers Endgames");
        }else {
            System.out.println("Lo siento el genero seleccionado no esta en la lista");
        }

        //EJERCICIO 02

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un producto de la lista \n TV \n PC gamer \n Tablet \n Heladera");
        String producto = sc.nextLine();
        producto = producto.toUpperCase();
        System.out.println("Ingrese la categoria del cliente \n 1) Estudiante \n 2) Adulto \n 3) Jubilado");
        int categoria = sc.nextInt();

        double precio = 0;
        double precioDescuento = 0;
        double descuento = 0;

        if (producto.equals("TV")) {
            precio = 500000;
        }else if (producto.equals("PC GAMER")) {
            precio = 800000;
        }else if (producto.equals("TABLET")) {
            precio = 250000;
        }else if (producto.equals("HELADERA")) {
            precio = 1090000;
        }else {
            System.out.println("El producto no esta en la lista");
        }

        System.out.println("------------TICKET NO FISCAL-------------");
        System.out.println(producto+"---------------------------"+precio);

        if (categoria == 1){
            descuento = 0.1;
            precioDescuento = precio - (precio * descuento);
        }else if (categoria == 2){
            descuento = 0.05;
            precioDescuento = precio - (precio * descuento);
        }else if (categoria == 3){
            descuento = 0.15;
            precioDescuento = precio - (precio * descuento);
        }else {
            System.out.println("La categoria ingresada no corresponde a ninguna de la lista");
        }

        System.out.println("Subtotal --------------------------"+precio);
        System.out.println("Descuento -------------------------"+descuento*100+" %");
        System.out.println("Total -----------------------------"+precioDescuento);


            Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione su genero de libro favorito de las siguientes opciones \n 1) Fantasia \n 2) Misterio \n 3) Romance \n 4) Ciencia Ficcion");
        int genero = sc.nextInt();

        if (genero == 1){
            System.out.println("Te puedo sugerir el libro El Señor de los Anillos");
        }else if (genero == 2){
            System.out.println("Te puedo sugerir el libro El asesinato de Roger Ackroyd");
        }else if (genero == 3){
            System.out.println("Te puedo sugerir el libro Orgullo y Prejuicio");
        }else if (genero == 4){
            System.out.println("Te puedo sugerir el libro Una odisea del espacio");
        }else{
            System.out.println("La opcion seleccionada es incorrecta");
        }



        //EJERCICIO 04

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su altura");
        double altura = sc.nextDouble();
        System.out.println("Ingrese su peso");
        double peso = sc.nextDouble();

        double imc = peso / Math.pow(altura,2);

        if (imc < 18.5 ){
            System.out.println("Estas en bajo peso");
        }else if (imc >= 18.5 && imc <= 24.9 ){
            System.out.println("Estas en un peso normal");
        }else if (imc >= 25 && imc <= 29.9){
            System.out.println("Cuidado tienes sobrepeso");
        }else if (imc >= 30){
            System.out.println("Precausion, tienes obesidad!!");
        }



        //EJERCICIO 05

        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int aleatorio = 0;

        while (aleatorio == 0){
            aleatorio = ra.nextInt(4);
        }

        String opcion = "";
        String opcion2 = "";
        if(aleatorio == 1){
            opcion = "Piedra";
        }else if (aleatorio == 2){
            opcion = "Papel";
        }else if (aleatorio == 3){
            opcion = "Tijera";
        }
        opcion = opcion.toUpperCase();

        System.out.println("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.println("Ingresa una opcion entre \n 1) Piedra \n 2) Papel \n 3) Tijera");
        int persona = sc.nextInt();

        if(persona == 1){
            opcion2 = "Piedra";
        }else if (persona == 2){
            opcion2 = "Papel";
        }else if (persona == 3){
            opcion2 = "Tijera";
        }

        opcion2 = opcion2.toUpperCase();

        System.out.println("La maquina eligio "+opcion);
        System.out.println(nombre+" eligio "+opcion2);

        if (opcion.equals("PIEDRA") && opcion2.equals("PIEDRA")){
            System.out.println("Empate!");
        }else if (opcion.equals("PAPEL") && opcion2.equals("PAPEL")){
            System.out.println("Empate!");
        }else if (opcion.equals("TIJERA") && opcion2.equals("TIJERA")){
            System.out.println("Empate!");
        }else if (opcion.equals("PIEDRA") && opcion2.equals("PAPEL")){
            System.out.println("Felicidades gano "+nombre+"!!");
        }else if (opcion.equals("PIEDRA") && opcion2.equals("TIJERA")){
            System.out.println("El ganador es la Maquina!");
        }else if (opcion.equals("PAPEL") && opcion2.equals("PIEDRA")){
            System.out.println("El ganador es la Maquina!");
        }else if (opcion.equals("PAPEL") && opcion2.equals("TIJERA")){
            System.out.println("Felicidades gano "+nombre+"!!");
        }else if (opcion.equals("TIJERA") && opcion2.equals("PIEDRA")){
            System.out.println("Felicidades gano "+nombre+"!!");
        }else if (opcion.equals("TIJERA") && opcion2.equals("PAPEL")){
            System.out.println("El ganador es la Maquina!");
        }


        //EJERCICIO 06

                Scanner sc = new Scanner(System.in);

                // Pedir al usuario los datos
                System.out.print("¿Cuántas horas duermes al día? ");
                int horasSueño = sc.nextInt();

                System.out.print("¿Cuántas horas haces ejercicio al día? ");
                int horasEjercicio = sc.nextInt();

                System.out.print("¿Cuántas comidas saludables consumes al día? ");
                int comidasSaludables = sc.nextInt();

                // Evaluación básica de los hábitos
                String evaluacion = "";
                if (horasSueño >= 7 && horasEjercicio >= 1 && comidasSaludables >= 3) {
                    evaluacion = "Tus hábitos saludables son excelentes. ¡Sigue así!";
                } else if (horasSueño >= 6 && horasEjercicio >= 0.5 && comidasSaludables >= 2) {
                    evaluacion = "Tus hábitos saludables son buenos, pero puedes mejorar en algunos aspectos.";
                } else {
                    evaluacion = "Te recomendamos mejorar tus hábitos saludables. Intenta dormir más, hacer más ejercicio y consumir más comidas saludables.";
                }

                // Imprimir la evaluación
                System.out.println(evaluacion);


        //EJERCICIO 07

                Scanner sc = new Scanner(System.in);

                System.out.print("¿Cómo te sientes hoy? (feliz, triste, enérgico, relajado): ");
                String estadoAnimo = sc.nextLine().toLowerCase();

        if ("feliz".equals(estadoAnimo)) {
            System.out.println("¡Qué bueno que estés feliz! Puedes:");
            System.out.println("- Escuchar música alegre.");
            System.out.println("- Salir a caminar o correr.");
            System.out.println("- Ver una comedia.");
        } else if ("triste".equals(estadoAnimo)) {
            System.out.println("Entiendo que te sientas así. Quizás te ayude:");
            System.out.println("- Escuchar música relajante.");
            System.out.println("- Leer un buen libro.");
            System.out.println("- Tomar un baño caliente.");
        } else if ("enérgico".equals(estadoAnimo)) {
            System.out.println("¡Aprovecha esa energía! Puedes:");
            System.out.println("- Hacer ejercicio intenso.");
            System.out.println("- Aprender algo nuevo.");
            System.out.println("- Salir con amigos.");
        } else if ("relajado".equals(estadoAnimo)) {
            System.out.println("¡Relájate y disfruta! Puedes:");
        } else {
            throw new IllegalStateException("Unexpected value: " + estadoAnimo);
        }

    }
}
