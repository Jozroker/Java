package mainPackage.javaCore14.lesson.task1;

import java.util.Objects;

public class Users implements Comparable<Users> {
    private String name;
    private int age;

    public Users(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users users = (Users) o;
        return age == users.age &&
                Objects.equals(name, users.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Users u) {
        return Integer.compare(this.age, u.age);
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                "}";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
