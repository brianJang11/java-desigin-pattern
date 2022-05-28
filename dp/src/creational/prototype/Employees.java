package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> emplList;

    public Employees() {
        emplList = new ArrayList<>();
    }

    public Employees(List<String> list) {
        this.emplList = list;
    }

    public void loadData() {
        emplList.add("emp1");
        emplList.add("emp2");
        emplList.add("emp3");
        emplList.add("emp4");
    }

    public List<String> getEmplList() {
        return emplList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();

        for (String s :
                this.getEmplList()) {
            temp.add(s);
        }

        return new Employees(temp);
    }
}
