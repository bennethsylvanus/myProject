import java.util.*;
public class Employee{
    
    public String employeeId,firstName,lastName,doe,dob,phone,email,address;
    public char gender;
    public String get_employeeId(){
        return this.employeeId;
    }
    public String get_fullName(){
        return firstName+" "+lastName;
    }
    public int get_age(){
        GregorianCalendar cal = new GregorianCalendar ();
        int current_month = cal.get(Calendar.MONTH);
        int current_year = cal.get(Calendar.YEAR);
        int current_day = cal.get(Calendar.DATE);
        String [] dob_array = this.dob.split ("-");

        int age = current_year - Integer.parseInt(dob_array[0]);

        if(current_month < Integer.parseInt (dob_array[1])){
            age--;
        } else {
            if(current_month == Integer.parseInt(dob_array[1])
                && current_day < Integer.parseInt(dob_array[2]))
                age--;
        }

        return age;
    }
}