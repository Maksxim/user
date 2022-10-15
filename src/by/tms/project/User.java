package by.tms.project;

import java.util.Objects;

public class User implements Cloneable {

    private String name;
    private String password;
    private Address address;

    public User(String name, String password, Address address) {
        this.name = name;
        this.password = password;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password);
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        return (User) super.clone();
    }

    public User cloneDeep() throws CloneNotSupportedException {

        User u = (User) super.clone();

        u.address = (Address) address.clone();

        return u;

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address=" + address +
                '}';
    }
}
