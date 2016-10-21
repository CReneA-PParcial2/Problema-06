/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg06;
import java.util.*;
/**
 *
 * @author Samsung
 */
public class Problema06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CALCULO DEL SUELDO EN BASE A LAS HORAS TRABAJADAS DE UNA PERSONA
        int ht, ph;
        ht = solicitarHoras();
        ph = salario();
        calculoRespuesta(ht, ph);
    }
    
    //ESCANEO DEL NUMERO DE HORAS TRABAJADAS INGRESADO POR EL USUSARIO
    public static int solicitarHoras(){
        int ht;
        System.out.println("Ingresa el numero de horas trabajadas:");
        Scanner entradaHoras = new Scanner(System.in);
        ht = entradaHoras.nextInt();
        return ht;
    }
    
    //ESCANEO DEL SALARIO POR HORA INGRESADO POR EL USUARIO
    public static int salario(){
        int ph;
        System.out.println("Ingresa el salario por hora:");
        Scanner entradaSalario = new Scanner(System.in);
        ph = entradaSalario.nextInt();
        return ph;
    }
    
    //CALCULO DEL SALARIO TOTAL
    public static void calculoRespuesta(int ht, int ph){
        int t;
        int he;
        if(ht>40){
            he = (ht-40);
            if(he>8){
                he = (he*3);
            }else{
                he = (he*2);
            }
            t = ((40*ph)+(he*ph));
        }else{
            t = (ht*ph);
        }
        System.out.println("El sueldo total es: " + "$" + t);
    }
}
