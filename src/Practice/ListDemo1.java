/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alancerio18
 */
public class ListDemo1 {

    public static void main(String[] args) {
        //sets are the same but they get rid of duplicates
        Set<String> shoppingList = new HashSet();
        //boxing taking a primitive value and putting it into an object
        shoppingList.add("beer");
        shoppingList.add("chips");
        shoppingList.add("beer");
        shoppingList.add("nuts");
        
        //every list can provide an iterator
//        Iterator <String>it = shoppingList.iterator();
//        while(it.hasNext()){
//            String item = it.next();
//            System.out.println(item);
//        }
        for (String s : shoppingList) {
            String item = s;
            System.out.println(item);
        }
//
//        for (int i = 0; i < shoppingList.size(); i++) {
//            String item = shoppingList.get(i);
//            System.out.println(item);
//        }

    }
}
