public class Q26
{
   public static void main(String[] args)
   {
    
      int[][] values =
      { 
     {8,3,4,2}, {2,3,7,8}, {3,4,5,6}, {7,1,3,1}, {6,0,0,0} 
      };
         int sum =0;
     
      for (int row = 0; row < 5; row++)
      {
         for (int col = 0; col < 4; col++)
         {
            System.out.print(values[row][col] + " ");

            sum = sum + values[row][col];
         }

         System.out.println();    
      }
               System.out.print("array sum = "+sum);

   }
}