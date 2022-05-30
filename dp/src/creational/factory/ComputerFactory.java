package creational.factory;

public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("pc".equals(type)) {
            return new PC(ram, hdd, cpu);
        } else if ("server".equals(type)) {
            return new Server(ram, hdd, cpu);
        }

        return null;
    }

}
