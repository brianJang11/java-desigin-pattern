package structural.adapter.tests;

import structural.adapter.SocketAdapter;
import structural.adapter.Volt;
import structural.adapter.impl.SocketClassAdapterImpl;
import structural.adapter.impl.SocketObjectAdapterImpl;

public class TestAdapter {

    public static void main(String[] args) {
        testClassAdapter();
        testObjcetAdapter();
    }

    private static void testObjcetAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt120 = getVolt(socketAdapter, 120);

        System.out.println("volt3 volts using Object Adapter="+volt3.getVolts());
        System.out.println("volt12 volts using Object Adapter="+volt12.getVolts());
        System.out.println("volt120 volts using Object Adapter="+volt120.getVolts());
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();
        Volt volt3 = getVolt(socketAdapter, 3);
        Volt volt12 = getVolt(socketAdapter, 12);
        Volt volt120 = getVolt(socketAdapter, 120);

        System.out.println("volt3 volts using Class Adapter="+volt3.getVolts());
        System.out.println("volt12 volts using Class Adapter="+volt12.getVolts());
        System.out.println("volt120 volts using Class Adapter="+volt120.getVolts());

    }

    private static Volt getVolt(SocketAdapter sockAdapter, int i) {
        switch (i){
            case 3: return sockAdapter.get3Volt();
            case 12: return sockAdapter.get12Volt();
            case 120: return sockAdapter.get120Volt();
            default: return sockAdapter.get120Volt();
        }
    }

}
