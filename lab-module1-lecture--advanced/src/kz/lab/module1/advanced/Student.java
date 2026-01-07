package kz.lab.module1.advanced;

import java.util.Objects;

public final class Student {

    private final int id;
    private final String name;
    private final String phone;

    public Student(int id, String name, String phone) {
        this.id = id;
        this.name = Objects.requireNonNull(name);
        this.phone = Objects.requireNonNull(phone);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id &&
            name.equals(student.name) &&
            phone.equals(student.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone);
    }

    @Override
    public String toString() {
        return "Student[id=%d, name=%s, phone=%s]"
            .formatted(id, name, phone);
    }
}
