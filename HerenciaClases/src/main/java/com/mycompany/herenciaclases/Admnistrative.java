package com.mycompany.herenciaclases;

public class Admnistrative extends Person {

    private String dependency;
    
    
    

    public Admnistrative(String dependency, String name, String id, int age) {
        super(name, id, age);
        this.dependency = dependency;
    }
    
    public String getDependency(){
    return dependency;
    }

    public void SeeData() {
        System.out.println("Mostrar datos del administrativo " );
    }
    
    
     public void fingerPrintRegister (){
            System.out.println("Registrando huella administrativo");
}
}
