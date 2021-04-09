package practica5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practica5[] numero;
        int tam = 10;
        int resp;
        numero = new Practica5[tam];
        
        for (int i = 0; i < numero.length; i++) {
            numero[i] = new Practica5();
        }
        
        try{
            for (int i = 0; i < numero.length; i++) {
                System.out.print("Ingresa el numero " + (i+1) + ": ");
                numero[i].setNum(sc.nextInt());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        try{
            System.out.println("----------Salida estándar----------");
            System.out.println("El arreglo original es: ");
            for (int i = 0; i < numero.length; i++) {
                System.out.println((i+1) + ".-" + numero[i].getNum());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("--------------------------");
        System.out.print("Cual numero quieres buscar: ");
        resp=sc.nextInt();

        try{
            for (int i = 0; i < numero.length; i++) {
                if(resp==numero[i].getNum()){
                    System.out.println("El indice del valor '" + resp + "' es: "+ (i+1));
                }
            }
            System.out.println("-1");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
