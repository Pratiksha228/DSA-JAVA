//Time Complexity---> O(n)
//Space Complexity ---> O(1)


package JAVA;

class Student{
    public int roll_no;
    public String name;

Student(int roll_no, String name){
    this.roll_no = roll_no;
    this.name = name;
}
}

public class ArrayOfObjects {
    public static void main(String[] args){
       Student[] arr;
       int n = 10;
       arr = new Student[n]; 
       arr[0] = new Student(101, "Pratiksha");
       arr[1] = new Student(102, "Tejas");
       arr[2] = new Student(103, "Vaishnavi");
       arr[3] = new Student(104, "Kshitija");
       arr[4] = new Student(105, "Akshay");
       //accessing the array elements on the specified position

       for(int i=0; i<arr.length-1; i++){
        System.out.println("Elements in the position of the "+i+" roll number of the student of the "+arr[i].roll_no+" name of the studentt "+arr[i].name);
       }

    }
    
}
