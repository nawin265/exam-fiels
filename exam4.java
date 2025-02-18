class Main
{
public static void main(String args[])
	{
         int a[]={11,3,9,39,45,55,12};
                int smax=0,max=0;
             
               for(int x=0;x<=a.length-1;x++)
                   {
                      if(max<a[x])
                         {
                           smax=max;
                            max=a[x];
                         }
                      else if(a[x]>smax && a[x]!=max)
                            {
                                smax=a[x];
                           }
                    }
                    System.out.println(smax+" second largest in a array");
	}
}