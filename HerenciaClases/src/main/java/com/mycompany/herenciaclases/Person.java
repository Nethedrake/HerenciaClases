/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaclases;

/**
 *
 * @author LENOVO
 */
public class Person {
    private String name;
    private String id;
    private int age;
   

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    public void fingerPrintRegister (){
            System.out.println("Registro de huella");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
