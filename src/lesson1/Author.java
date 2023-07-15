package lesson1;

public class Author {
    String fullName;

    int age;

    public Author(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "lesson1.Author{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
