
package main;

public class Student {
    private String firstName;
    private String lastName;
    private double yearOfBirth;
    
    public Student () {
        
    }
    
    public Student (String firstName, String lastName, double yearOfBirth) {
        this.firstName = firstName; 
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(double yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public void info (){
        System.out.println ("Ime Petar" + this.firstName);
        System.out.println("Prezime Petrovic" + this.lastName);
        System.out.println("Godina rodjenja 01.01.1900." +this.yearOfBirth);
    }
    
    
    
}
