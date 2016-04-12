
import common.Employee;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alancerio18
 */
public class Lab {

    public static void main(String[] args) {
        Employee e1 = new Employee("Sanders", "Bernie", "111-11-1111");
        Employee e2 = new Employee("Clinton", "Hilary", "222-22-2222");
        Employee e3 = new Employee("Cruz", "Ted", "333-33-3333");
        Employee e4 = new Employee("Trump", "Donald", "333-33-3333");

        Map<String, Employee> employeeMap = new HashMap<String, Employee>();
        employeeMap.put("111-11-1111", e1);
        employeeMap.put("222-22-2222", e2);
        employeeMap.put("333-33-3333", e3);
        employeeMap.put("333-33-3333", e4);

        Set<String> keys = employeeMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
        Collection<Employee> values = employeeMap.values();
        for (Employee e : values) {
            System.out.println(e);
        }
        Map<String, Employee> employeeTreeMap = new TreeMap<String, Employee>();
        List<Employee> sortedList = new ArrayList<Employee>(values);
         Collections.sort(sortedList);
        for(Employee emp : sortedList) {
            System.out.println("sorted: " + emp);
        }
        
        Set<Employee> set = new TreeSet<Employee>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        
          List<Employee> list = new ArrayList<Employee>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        Collections.sort(list);
        
        System.out.println("The size of the Sorted Set is: " + set.size());
        for (Employee e : set) {
            System.out.println(e);
        }
    }
}
