import jakarta.xml.bind.annotation.*;

import java.io.Serializable;

@XmlType(propOrder = {"name", "Surname", "age" , "position"} )
@XmlAccessorType(XmlAccessType.FIELD)
public class Emploee implements Serializable {
    @XmlElement(name = "name")
    private String name;
    @XmlElement(name = "Surname")
    private String Surname;
    @XmlElement(name = "age")
    private int age;
    @XmlElement(name = "position")
    private String position;

    public Emploee(String name, String surname, int age, String position) {
        this.name = name;
        Surname = surname;
        this.age = age;
        this.position = position;
    }

    public Emploee() { }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return Surname; }
    public void setSurname(String surname) { Surname = surname; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public String toString()
    {
        return "\n\t\t\t\t\tEmployee" + "\n\t\t\t\t\t\tname: " + name + "\n\t\t\t\t\t\tSurname: " + Surname + "\n\t\t\t\t\t\tage: " + age + "\n\t\t\t\t\t\tposition: " + position;
    }
}
