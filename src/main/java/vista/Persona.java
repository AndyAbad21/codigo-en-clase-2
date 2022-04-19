/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;

import java.util.Date;
/**
 * 
 * @author Andy Abad
 */
public class Persona 
{
    String cedula;
    String nombre;
    Date fechaNacimiento;
    java.util.Date fechaActual=new java.util.Date();
    public void calcularEdad()
    {
        System.out.println("La fecha actual es: "+fechaActual);
    }
}
