class Student  
   {
     String name;
     String address;
     int age;
     String institute;
     int rollno;
     String dept;
     Student(String n,int a,int r){
           name=n;
           age=a;
           rollno=r;
      }
     void setData(String d,String i,String ad){
          dept=d;
          institute=i;
          address=ad;
      }
     void showData(){
       System.out.println("NAME:"+name);
       System.out.println("AGE:"+age);
       System.out.println("ROLL NO:"+rollno);
       System.out.println("ADDRESS:"+address);
       System.out.println("INSTITUTE:"+institute);
       System.out.println("DEPARTMENT:"+dept);
    }
}
 class UseStudent{
     public static void main(String args[]){
       Student s1=new Student("Bakhtawar",19,83);
       s1.setData("Software","MUET","GulshaneMaymar");
       s1.showData();
   }
} 
         
