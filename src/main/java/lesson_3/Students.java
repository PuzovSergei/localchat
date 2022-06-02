package lesson_3;

import java.io.*;
import java.util.Objects;

public class Students implements Serializable{
    int id;
    String name;
    transient Book book;

    public Students(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                "book=" + book +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return id == students.id && Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

class MainSerializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Students s = new Students(1, "Alex");
        Book book1 = new Book("Book");
        s.book = book1;
       /* System.out.println(s);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("student.ser"));
        objectOutputStream.writeObject(s);
        objectOutputStream.close();*/

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("student.ser"));
        Students studentDeserialized = (Students) objectInputStream.readObject();
        objectInputStream.close();

        System.out.println(studentDeserialized);
        System.out.println(s.equals(studentDeserialized));
    }
}