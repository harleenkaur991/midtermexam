/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{

   public double Salary;
   public double bonus;
  public String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }
       public double getSalary() {
        return Salary;
    }

    public void setSalary(double s) {
     
    this.Salary=s;
    
    
}
    public void setEmp(String em)
    {
        this.emp=em;
    }
public String getEmp()
{
    return emp;
}
}