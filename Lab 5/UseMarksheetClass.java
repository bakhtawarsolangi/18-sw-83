class Marksheet{
     private double calculus;
     private double english;
     private double islamiat;
     public Marksheet(double calculus,double eng,double isl){
         this.calculus=calculus;
         english=english;
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
public class UseMarksheetClass{
      public static void main(String args[]){
         Marksheet m=new Marksheet(93.7,88.9,98.8);
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

      
        
       