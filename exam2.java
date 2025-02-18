class Main
{
public static void main(String args[])
 	{
        int a[]={10,23,45,34,78,67,56};
               
             for(int x=0;x<=a.length-1;x++)
                 {
                     int num=a[x];
                     int count=0;
                     for(int start=1;start<=num;start++)
                        {
                           if(num%start==0)
                             {
                              count++;
                             }
                        }
                      if(count==2)
                         {
                            System.out.println(a[x]+" is a prime");
                         }
                 }
	}
}