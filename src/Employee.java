public class Employee {
   private int empId;
   private int empSalary;
//this - current instance
    public Employee(int empId, int empSalary) {
        this.empId = empId;
        this.empSalary = empSalary;
    }

    public String printEmployeeInfo(){
        return "Emp Id :"+getEmpId()+"\n"+"Emp Salary :"+empSalary;
    }

    //getter method
    public int getEmpId(){
        return empId;
    }
    //setter method
    public void setEmpId(int employeeId){
        employeeId=empId;
    }

    public void setEmpSalary(int employeeSalary){
        employeeSalary=empSalary;
    }
}
