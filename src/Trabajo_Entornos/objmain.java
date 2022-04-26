/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Entornos;

import Trabajo_de_Entornos.clase_cuenta;
import java.util.Scanner;

/**
 *
 * @author ediso
 * @version 1.0
 * @since 21/04/2022
 */
public class objmain {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        clase_cuenta una_cuenta = new clase_cuenta("Mario", 400);
        clase_cuenta cuenta_2 = new clase_cuenta("Fernando", 300);
        //Aqui lo estamos almacenando
        clase_cuenta[] almacenCuenta = new clase_cuenta[10];
        almacenCuenta[0] = una_cuenta;
        almacenCuenta[1] = cuenta_2;

        acciones_dinero(entrada, almacenCuenta, 1.0);
     
    }

    public static void acciones_dinero(Scanner entrada, clase_cuenta[] almacenCuenta, double dinero) throws NumberFormatException {
        System.out.println("Dime nombre de usuario: ");
        String nombrecuenta = entrada.nextLine();
        boolean continuar = true;
        int i = 0;
        do {
            if (almacenCuenta[i].getTitular().equals(nombrecuenta)) {
                System.out.println("1.Ingresar");
                System.out.println("2.Retirar");
                System.out.println("3.Salir");
                int respuesta = Integer.parseInt(entrada.nextLine());

                switch(respuesta){
                    case 1:
                        double ingreso=(double) Integer.parseInt(entrada.nextLine());
                        almacenCuenta[i].ingresar(ingreso);
                    case 2:
                        double retirada=(double) Integer.parseInt(entrada.nextLine());
                        almacenCuenta[i].retirar(retirada);
                    case 3:
                        System.out.println("saliendo");
                        continuar=false;
                }
        
            }else if (i==almacenCuenta.length){
                System.out.println("no se encontadro ninguna cuenta");
            }
        } while (continuar);
    }

}
