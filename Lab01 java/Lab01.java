class Lab01{
	public static void main(String args[]){
		String name="bakhtawar";
		int rollno=83;
		int totalobt=300;
		int total=550;
		float per=0f;
		per=(totalobt*100)/total;
		System.out.println("name="+name+"\n"+"Roll No="+rollno+"\n"+"Total Marks="+total+"\n"+"Total Obtained="+totalobt+"\n"+" Percentage="+per+"%"+"\n");
		if(per>=50)
			System.out.println("true");
		else 
			System.out.println("false");
	}
}