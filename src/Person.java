import java.io.*;
import java.util.*;


class Person {
    String prenume;
    String nume;

    Person(String prenume, String nume) {
        this.prenume = prenume;
        this.nume = nume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person persoana = (Person) o;
        return Objects.equals(prenume, persoana.prenume) &&
                Objects.equals(nume, persoana.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prenume, nume);
    }
}

