import java.io.Serializable;
import java.util.List;

import jakarta.xml.bind.annotation.*;

@XmlType(propOrder = {"Company_name", "Departments"} )
@XmlRootElement(name = "Company")
@XmlAccessorType(XmlAccessType.FIELD)
public class Company implements Serializable {

    @XmlElement(name = "Company_name")
    private String Company_name;

    @XmlElementWrapper(name = "Departments")
    @XmlElement(name = "Department")
    private List<Department> Departments;

    public Company() { }

    public Company(String Company_name, List<Department> Departments) {
        this.Company_name = Company_name;
        this.Departments = Departments;
    }

    public String getCompany_name() { return Company_name; }
    public void setCompany_name(String company_name) { this.Company_name = Company_name; }

    public List<Department> getDepartments() { return Departments; }
    public void setDepartments(List<Department> departments) { this.Departments = Departments; }

    @Override
    public String toString()
    {
        return "\nCompany" + "\nCompany name: " + Company_name + " \n\tDepartments" + Departments;
    }
}