import java.util.Objects;

public class Animal {

    String name;
    int age;
    boolean tail;

    Animal() {
        this.age = 45;
        this.name = "Васька";
        this.tail = false;
    }

    @Override
    public String toString() {
        return "Кот по имени " + name + ", " +
                "возраст: " + age + ", " +
                "хвост: " + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                tail == animal.tail &&
                name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
