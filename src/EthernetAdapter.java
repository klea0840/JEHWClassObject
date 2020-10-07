public class EthernetAdapter extends Device {

    int speed;
    String mac;

    EthernetAdapter() {
        super();
        this.mac = mac;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                '}';
    }
}
