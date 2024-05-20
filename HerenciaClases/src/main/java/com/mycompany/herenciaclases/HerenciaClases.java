
package com.mycompany.herenciaclases;

public class HerenciaClases {

    public static void main(String[] args) {
        Person persona = new Person ("Juan","192184",19);
        System.out.println("Person");
        persona.fingerPrintRegister();
        
        
        
        System.out.println("Hola mi nombre es = " + persona.getName());
        
        
        Admnistrative administrativo = new Admnistrative ("Jefe","Pedro","192184",39);
        administrativo.fingerPrintRegister();
        
        
        Student estudiante = new Student ("Ing Sistemas",4,3.8f,"Mamian","192222",18);
        System.out.println("Hola, mi nombre es = " + estudiante.getName() + " Su codigo es = " + estudiante.getId());
        
        
    }
}
