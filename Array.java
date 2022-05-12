class Array
{
   public static void main(String args[])
   {
      int arr[]={1,2,3,4,5};
           for (int i=0; i<arr.length;i++)
      {
         arr[i]=(int) Math.pow(arr[i],2);
      }
      for (int number:arr)
      {
         System.out.println(number);
      }
   }
}