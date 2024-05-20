
package com.mycompany.herenciaclases;


public class Student extends Person{
    private String carrer;
    private int semester;
    private float average;

    public Student(String carrer, int semester, float average, String name, String id, int age) {
        super(name, id, age);
        this.carrer = carrer;
        this.semester = semester;
        this.average = average;
    }
    
    public void SeeGrades(){
        System.out.println("Viendo lista de notas del estudiante"); 
    }
    public void registerSubjects(){
        System.out.println("Registrar materias del estudiante");
    }
    public void cancelSubjects(){
        System.out.println("Cancelar materias del estudiante");
    }

    public String getCarrer() {
        return carrer;
    }

    public void setCarrer(String carrer) {
        this.carrer = carrer;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(float average) {
        this.average = average;
    }
    
    
}
