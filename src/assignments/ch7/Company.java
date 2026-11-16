package assignments.ch7;

import java.util.ArrayList;

public class Company {
    /***
     * <<< This class is NOT complete. >>>
     *
     * A company has the following instance fields:
     * int retireAge, int retireYears, int retireSalary, int salaryBudget,
     * and an ArrayList empList, which contains a list of employees
     *
     * For this assignment you must complete the methods:
     *   1) addEmployee
     *   2) printEmployeeList
     *   3) employeeIsEligible
     *   4) processRetirements
     */

    private ArrayList<Employee> empList;    // array list of all employees in this company
    private int retireAge;                  // minimum age to retire
    private int retireYears;                // minimum years on job to retire
    private int retireSalary;               // minimum salary to retire
    private int salaryBudget;               // total salary of ALL employees in the company

    /** <<< THIS CODE IS COMPLETE >>>
     * constructs a company with a given retirement age,
     * years of service and salary
     */
    public Company (int retireAge, int retireYears, int retireSalary) {
        this.retireAge = retireAge;
        this.retireYears = retireYears;
        this.retireSalary = retireSalary;
        salaryBudget = 0;
        empList = new ArrayList<Employee>();
    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition:
     * 1) Adds employee to the ArrayList empList
     * 2) Update 'salaryBudget' by adding the new employee's salary
     */
    public void addEmployee(Employee emp) {
        System.out.println("Give Age: ");
        // <<< Complete the code >>>

    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition:
     *   1) print a list of all employee's in the company.
     *   2) print the salaryBudget
     */
    public void printEmployeeList() {

        // <<< Complete the code >>>

    }

    /**
     * <<< This code is NOT complete. >>>
     * This method determines if an employee is eligible to retire.
     * An employee can retire if they meet at least two of the following
     * requirements:
     *
     *   1) The employee is at least retireAge years old.
     *   2) The employee has worked at least retireYears.
     *   3) The employee's salary is at least retireSalary.
     *
     * postcondition: returns true if emp is eligible to retire;
     * otherwise, returns false
     */
    private boolean employeeIsEligible(Employee emp)  {

        // <<< Complete the code >>>

        return true; // so it compiles
    }

    /**
     * <<< This code is NOT complete. >>>
     * postcondition:
     *   1) remove ALL retirement-eligible employees from empList;
     *   2) salaryBudget has been updated to reflect remaining employees
     */
    public void processRetirements(){

        // <<< Complete the code >>>

    }
    /************************* END EMPLOYEE CLASS ******************************/











    /********************* Inner Private Class Employee **********************/
    /************************** DO NOT EDIT THIS *****************************/
    class Employee
    {
        private int age;  // the employee's age in years
        private int yearsOnJob; // the number of years the employee has worked
        private int salary; // the employee's salary in dollars
        private int ID; // the ID number of the employee

        public Employee(int age, int yearsOnJob, int salary, int ID)
        {
            this.age = age;
            this.yearsOnJob = yearsOnJob;
            this.salary = salary;
            this.ID = ID;
        }

        public int getAge() { return age; }
        public int getYearsOnJob() { return yearsOnJob; }
        public double getSalary() { return salary; }
        public int getID() { return ID; }

        public String toString() {
            return "Employee: ID=" + ID + " Age=" + age +
                    " Years on job=" + yearsOnJob + " Salary=" + salary;
        }
    }
    /******************* END Inner Private Class Employee ********************/


    /******************* MAIN METHOD ****************************/
    public static void main(String[] args) {
        Company HaasCo = new Company(55,30,100000);

        // The following code is a bit jenky, but it works.  Let's
        // not talk about how or why.  Just trust me.
        HaasCo.addEmployee(HaasCo.new Employee(55,19,120000,6546));
        HaasCo.addEmployee(HaasCo.new Employee(65,32,92000,46354));
        HaasCo.addEmployee(HaasCo.new Employee(45,20,154000,1321));
        HaasCo.addEmployee(HaasCo.new Employee(52,30,91000,65486));
        HaasCo.addEmployee(HaasCo.new Employee(63,32,100000,32165));
        HaasCo.addEmployee(HaasCo.new Employee(39,19,95000,44654));
        HaasCo.addEmployee(HaasCo.new Employee(54,30,95000,3467));

        HaasCo.printEmployeeList(); // print list of employees and total salary

        HaasCo.processRetirements(); // process retirements

        HaasCo.printEmployeeList(); // print list of employees and total salary

        /***
         *
         * The following is output from this Tester:
         *
         * Employee: ID=6546 Age=55 Years on job=19 Salary=120000
         * Employee: ID=46354 Age=65 Years on job=32 Salary=92000
         * Employee: ID=1321 Age=45 Years on job=20 Salary=154000
         * Employee: ID=65486 Age=52 Years on job=30 Salary=91000
         * Employee: ID=32165 Age=63 Years on job=32 Salary=100000
         * Employee: ID=44654 Age=39 Years on job=19 Salary=95000
         * Employee: ID=3467 Age=54 Years on job=30 Salary=95000
         * Total Salary Budget: 747000
         *
         * Employee: ID=1321 Age=45 Years on job=20 Salary=154000
         * Employee: ID=65486 Age=52 Years on job=30 Salary=91000
         * Employee: ID=44654 Age=39 Years on job=19 Salary=95000
         * Employee: ID=3467 Age=54 Years on job=30 Salary=95000
         * Total Salary Budget: 435000
         */

    }
    /***************** END MAIN METHOD **************************/
}