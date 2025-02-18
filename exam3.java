class Main
{
public static void main (String args[])
	{
         
          int a[]={125,123,456,12,335,789,100,791,890,896,760,792};
                   int max=0;
                 for(int x=0;x<=a.length-1;x++)
                     {
                       if(a[x]%2!=0)
                         {
                          
                           if(max<a[x])
                             {
                              max=a[x];
                             }
                           
                         }
                     }
                 System.out.println(max+" largest odd number in array");
	}
}