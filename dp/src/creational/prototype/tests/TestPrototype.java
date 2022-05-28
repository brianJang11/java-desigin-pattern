package creational.prototype.tests;

import creational.prototype.Employees;

import java.util.List;

public class TestPrototype {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData(); // get data from database

        Employees employees1 = (Employees) employees.clone();
        Employees employees2 = (Employees) employees.clone();

        List<String> list = employees1.getEmplList();
        list.add("new-emm1");

        List<String> list1 = employees2.getEmplList();
        list1.remove("emp1");

        System.out.println("emps List: "+ employees.getEmplList());
        System.out.println("empsNew List: "+ list);
        System.out.println("empsNew1 List: "+ list1);
    }
}
