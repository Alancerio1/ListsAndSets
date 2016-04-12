/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alancerio18
 */
public class EqualityDemo {
    public static void main(String[] args) {
        Person p1 = new Person("sally","Smith","333-33-3333");
        Person p2 = new Person("sally","Smith","333-33-3333");
        Person p3 = new Person("John","Doe","444-44-4444");
        
        Set<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        for(Person p : people){
        System.out.println(p);
        }
//        if(p1.equals(p2)){
//            System.out.println("Persons ARE equal");
//        }else{
//            System.out.println("Persons are NOT equal");
//        }
//        String s1 = "Hello";
//        String s2 = "Hello";
//        if(s1.equals(s2) ){
//            System.out.println("Strings are equal");
//        }else{
//            System.out.println("Strings are NOT equal");
//        }
            
    }
}
