class student{
   
   int rollno;
   String name,course;
   float fee;

   student(int rollno,String name,String course)
   {
       this.rollno= rollno;
       this.name= name;
       this.course = course;
   }

   student(int rollno,String name,String course,float fee)
   {
    this(rollno,name,course); 
    this.fee= fee;

   }
   void show()
   {
       System.out.println(rollno +" "+name+" "+course+" "+fee);
   }


}

class Q33{

public static void main(String args[]){

student s = new student(90,"Shradha","DAC");
student s1 = new student(100,"abc","DAC",70000f);

s.show();
s1.show();

}

}