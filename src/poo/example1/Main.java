package poo.example1;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        // Crear un cliente
        Scanner sc = new Scanner(System.in);
        Scanner scAge = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        String name = sc.nextLine();
        System.out.println("Ingrese su apellido:");
        String lastName = sc.nextLine();
        System.out.println("Ingrese su edad:");
        int agePeaple = scAge.nextInt();
        Cliente cliente1 = new Cliente(name, lastName, agePeaple);

        // Crear una cuenta bancaria para el cliente
        int saldoTotal = 100000 + rand.nextInt(1000000);

        CuentaBancaria cuenta1 = new CuentaBancaria(cliente1, saldoTotal);
        System.out.println("Hola deseas depositar dinero a tu cuenta?");
        String question = sc.nextLine();

        if(Objects.equals(question, "si")){
            System.out.println("Ingrese el monto a depositar:");
            int depoti = scAge.nextInt();
            cuenta1.depositar(depoti);
            System.out.println(cuenta1);
        }else {
            System.out.println("Ingrese el monto a retirar:");
            int retir = scAge.nextInt();
            cuenta1.retirar(retir);
            System.out.println(cuenta1);
        }


    }
}
