class Employee {
	private int salary;
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
}
class Developer extends Employee {

    void display() {
        System.out.println("Salary is: " + getSalary());
    }

    public static void main(String[] args) {

        Developer d1 = new Developer();

        d1.setSalary(5000);   

        d1.display();        
    }
}
