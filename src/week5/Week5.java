package week5;

import java.util.Date;

public class Week5 {

    public static void main(String[] args) {
        
        //The keyword 'void' is used to denote a method.
        //A 'PRIVATE' method cannot be accessed from another class whereas a PUBLIC can.
        //The 'Main' method REQUIRES the 'Static' keyword but others do not UNLESS they ae being called or eferenced in the 'Main' method.
        //The keyword 'Void' simply refers to the fact that the method is not returning any value.
        
        //Doing this calls the method named as such and thus executes its code when one runs the program.
        hello();
        String name = getName();
        System.out.println(name);
        int age = getAge();
        System.out.println(age);
        
        getDay();
        
    }
    
    public static void hello(){
        
        System.out.println("Hello World!");
        
    }
    
    public static void doSum(){
        
        
        
    }
    
    private static String getName(){
        
        String name = "Derick";
        return name;
        
    }
    
    private static int getAge(){
        
        int age = 22;
        return age;
        
    }
    
    public static String getDay(){
        
        Date date = new Date();
        String day = date.toLocaleString();
        System.out.println(day);
        return day;
        
    }
    
}