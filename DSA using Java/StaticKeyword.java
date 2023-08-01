package JAVA;

//Static Keyword: That's mean to access the static variable we don't need objects.
//You cannot access unstatic method under the static method, for that we have to make that particular variable or function as static.

class Emp{
    int eid;
    int salary;
    static String ceo;

    public void show(){
        System.out.println(eid+" : "+salary+" : "+ceo);
    }
}
public class StaticKeyword {
    public static void main(String[] args){
        Emp navin = new Emp();
        navin.eid = 90;
        navin.salary = 100000;
        //navin.ceo = "Mahesh";
        Emp.ceo = "Mahesh"; //We don't need object because of static keyword

        Emp Rahul = new Emp();
        Rahul.eid = 100;
        Rahul.salary = 2000;
        //Rahul.ceo = "Chetana";
        Emp.ceo = "Chetana";
         Rahul.show();

        //Rahul.ceo = "Ajey";
        Emp.ceo = "Ajey";

        navin.show();
        Rahul.show();
        //Here, basically we had'nt assigned the static keyword to the ceo 
        //if ceo of the company is changing for one employee definately it will change for any one in the company
        //by assigning static keyword to the ceo--->We will making the ceo property as static.
    
    }

}