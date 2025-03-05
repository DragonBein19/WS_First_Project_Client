import java.io.Serializable;
import java.util.List;

import jakarta.xml.bind.annotation.*;

@XmlType(propOrder = {"Company_name", "Departments"} )
@XmlRootElement(name = "Company")
@XmlAccessorType(XmlAccessType.FIELD)
public class Company implements Serializable {
    @XmlElement(name = "Company_name")
    private String Company_name;

    private List<Department> Departments;

    public Company() { }

    public Company(String company_name, List<Department> departments) {
        Company_name = company_name;
        Departments = departments;
    }

    public String getCompany_name() { return Company_name; }
    public void setCompany_name(String company_name) { Company_name = company_name; }

    public List<Department> getDepartments() { return Departments; }
    public void setDepartments(List<Department> departments) { Departments = departments; }

    @Override
    public String toString()
    {
        return "\nCompany {" + "\nCompany name: " + Company_name + " \n\tDepartments {" + Departments + " }";
    }

    @XmlType(name = "Department")
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Department {
        @XmlElement(name = "Department_name")
        private String Department_name;

        private List<Employee> Employs;

        public Department() { }

        public Department(String department_name, List<Employee> employs) {
            Department_name = department_name;
            Employs = employs;
        }

        public String getDepartment_name() { return Department_name; }
        public void setDepartment_name(String department_name) { Department_name = department_name; }

        public List<Employee> getEmployes() { return Employs; }
        public void setEmployes(List<Employee> employs) { Employs = employs; }

        @Override
        public String toString()
        {
            return "\t\tDepartnment {" + Department_name + " \n\t\t\tEmploys {" + Employs + " \t\t\t}";
        }
    }

    @XmlType(name = "Employee")
    @XmlRootElement
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class Employee{

        @XmlElement(name = "name")
        private String name;

        @XmlElement(name = "Surname")
        private String Surname;

        @XmlElement(name = "age")
        private int age;

        @XmlElement(name = "position")
        private String position;

        public Employee() { }

        public Employee(String name, String surname, int age, String position) {
            this.name = name;
            Surname = surname;
            this.age = age;
            this.position = position;
        }

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
            return "\t\t\t\tEmployee {" + " \n\t\t\t\t\tname: " + name + "\n\t\t\t\t\tSurname" + Surname + "\n\t\t\t\t\tage" + age + "\n\t\t\t\t\tposition" + position + " \t\t\t}";
        }
    }
}