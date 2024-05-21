public class Manager extends Employee {
    public double bonus;
    public void setBonus(double baseSalary)
    {
        this.bonus=2*baseSalary;
    }
    public double totalSalary()
    {
        double baseSalary=this.getSalary();
        return baseSalary+this.bonus;
    }

    public void managerinfo()
    {
        System.out.println("Manager Information:");
        System.out.println(this.getName());
        System.out.println(this.getSalary());
        System.out.println(this.totalSalary());
    }


}

