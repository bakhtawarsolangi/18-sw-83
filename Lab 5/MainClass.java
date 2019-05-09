class Student{
    private String name;
    private int age;
    private int rollno;
    private String dept;
    private int batch;
    private String uni;
    public Student (String name,int age){
       this.name=name;
       this.age=age;
     }
  public void setData(int r,String dept,int batch,String uni){
     rollno=r;
     this.dept=dept;
     this.batch=batch;
     this.uni=uni;
     }
  public void showData(){
      System.out.println("Name:"+name);
      System.out.println("Age:"+age);
      System.out.println("Roll no:"+batch+"SW"+rollno);
      System.out.println("Department:"+dept);
      System.out.println("Batch:"+batch);
      System.out.println("University:"+uni);
     }
}
class UseStudentClass{
    public static void main(String args[]){
        Student s1=new Student ("Bakhtawar",19);
        s1.setData(83,"Software",18,"MUET");
        s1.showData();
    }
}
         
    
         
class Marksheet{
     private double calculus;
     private double english;
     private double islamiat;
     public Marksheet(double calculus,double eng,double isl){
         this.calculus=calculus;
         english=eng;
         islamiat=isl;
         }
    public int getTotalMarks(){
       return 300;
        }
    public double getObtainedMarks(){
       return (calculus+english+islamiat);
       }
    public double getPercentage(){
       return (((getObtainedMarks()/getTotalMarks())*100));
       }
   public char getGrade(double percentage){
       char grade=0;
       if(percentage>=90){
         grade='A';
       }
       else if(percentage<90 && percentage>=80){
         grade='B';
       }
        else if(percentage<80 && percentage>=70){
         grade='C';
      }
         else if(percentage<70 && percentage>=60){
         grade='D';
       }
         
            return grade;
     }
}
 class UseMarksheetClass{
      public static void main(String args[]){
         Marksheet m=new Marksheet(93,88.9,98.8);
          System.out.println("TOTAL MARKS:"+m.getTotalMarks());
          System.out.println("OBTAINED MARKS:"+m.getObtainedMarks());
          System.out.println("PERCENTAGE:"+m.getPercentage());
          if(m.getGrade(m.getPercentage())!=0 ){
          System.out.println("GRADE:"+m.getGrade(m.getGrade(m.getPercentage())) );
                    }
       else{
        System.out.println("GRADE: Fail");
         } 

    }
}

   class CombinedClass{
        Student s;
        Marksheet m;
           public CombinedClass(Student s,Marksheet m){
              this.s=s;
              this.m=m;
          }
           public void createStudentResult(){
                s.showData();
                System.out.println("TOTAL MARKS:"+m.getTotalMarks());
                System.out.println("OBTAINED MARKS:"+m.getObtainedMarks());
                System.out.println("PERCENTAGE:"+m.getPercentage());
                  if(m.getGrade(m.getPercentage())!=0 ){
                   System.out.println("GRADE:"+m.getGrade(m.getGrade(m.getPercentage())) );
                    }
       else{
        System.out.println("GRADE: Fail");
         } 
      }
  }
 public class MainClass{
       public static void main(String args[]){
       Student s=new Student("Bakhtawar Solangi",19);
       Marksheet m=new Marksheet(93,88.9,98.8);
       s.setData(83,"Software",18,"MUET");
       CombinedClass cc=new CombinedClass(s,m);
       cc.createStudentResult();
  }
}


                 