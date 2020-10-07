import java.util.Objects;

public class Device {

    String manufacturer;
    String serialNumber;
    float price;

    Device() {
        this.manufacturer = "Samsung";
        this.price = 120;
        this.serialNumber = "AB1234567CD";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Float.compare(device.price, price) == 0 &&
                manufacturer.equals(device.manufacturer) &&
                serialNumber.equals(device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, serialNumber, price);
    }
}
