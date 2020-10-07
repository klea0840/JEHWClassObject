public class Main {

    public static void main(String[] args) {

        Device device = new Device();
        System.out.println("to String: " + device.toString());
        System.out.println("hashCode: " + device.hashCode());


        System.out.println("==============================");

        Monitor monitor = new Monitor();
        System.out.println("to String: " + monitor.toString());
        System.out.println("hashCode: " + monitor.hashCode());
        System.out.println("Equals: " + device.equals(monitor));

        System.out.println("==============================");

        Animal animal = new Animal();
        System.out.println("to String: " + animal.toString());
        System.out.println("hashCode: " + animal.hashCode());
        System.out.println("Equals: " + animal.equals(monitor));

    }
}
