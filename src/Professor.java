public class Professor {
   private String name;
   private String researchArea;
   private int salary;

    public Professor(String name, String researchArea, int salary) {
        this.name = name;
        this.researchArea = researchArea;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", researchArea='" + researchArea + '\'' +
                ", salary=" + salary +
                '}';
    }
}
