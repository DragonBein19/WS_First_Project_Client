import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@XmlType(propOrder = {"Department_name", "Employs"} )
@XmlAccessorType(XmlAccessType.FIELD)
public class Department implements Serializable {
    @XmlElement(name = "Department_name")
    private String Department_name;
    @XmlElementWrapper(name = "Employs")
    @XmlElement(name = "Emploee")
    private List<Emploee> Employs;

    public Department() { }

    public Department(String department_name, List<Emploee> Employs) {
        Department_name = department_name;
        this.Employs = Employs;
    }

    public String getDepartment_name() { return Department_name; }
    public void setDepartment_name(String department_name) { Department_name = department_name; }

    public List<Emploee> getEmploys() { return Employs; }
    public void setEmploys(List<Emploee> Employs) { this.Employs = Employs; }

    @Override
    public String toString()
    {
        return "\n\t\tDepartment" + "\n\t\t\tDepartment name: " + Department_name + "\n\t\t\t\tEmploys" + Employs;
    }
}
