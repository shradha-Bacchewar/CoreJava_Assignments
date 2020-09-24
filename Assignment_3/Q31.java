class student{

       int rollno;
        String name;

        void setData(int r , String n)
        {
            rollno = r;
            name = n;

        }

        void showData()
            {
                System.out.println(rollno + " " + name);
            }
}

class Q31 {
        public static void main(String args[]){
        
        student s = new student();

        s.setData(90,"Shradha");
        s.showData();
        s.setData(101,"abc");
        s.showData();
        
        }

}