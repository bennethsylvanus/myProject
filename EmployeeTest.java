import java.util.*;
import java.text.*;
public class EmployeeTest{
    
    public static void main (String [] args){
        Employee faith = new Employee();
        faith.employeeId = "Staff/001";
        faith.firstName = "Faith";
        faith.lastName = "Goodness";
        faith.dob = "2016-07-13";

        System.out.println(faith.get_employeeId());

        System.out.println(faith.get_fullName());

        System.out.println(faith.get_age());
    }
}