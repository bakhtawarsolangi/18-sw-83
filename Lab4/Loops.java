class Loops{
   public static void main(String args[])
     {
  System.out.println("STRUCTURE # 1");
    int r=1,c,s,n=5;
    while(r<=5){
    for(c=1;c<=n;c++){
    System.out.print(" ");
    }n--;
   for(s=1;s<=r;s++){
   System.out.print(" *");
  }r++;
   System.out.println();
       }

 System.out.println("STRUCTURE # 2");

int r1,c1,n1=6,s1,k;
  for(r1=1;r1<=5;r1++){
     for(c1=1;c1<=r1;c1++){
   System.out.print("");
   }n1--;
  for(s1=1;s1<=n1;s1++){
  System.out.print(" *");
   }
  System.out.println(" ");
        }
  System.out.println("STRUCTURE # 3");
  int r2,c2,n2=6,s2,k2;
  for(r2=1;r2<=5;r2++){
     for(c2=1;c2<=n2;c2++){
   System.out.print("");
   }n2--;
  for(s2=1;s2<=r2;s2++){
  System.out.print(" *");
   }
  System.out.println(" ");
        }

     }
  }
 