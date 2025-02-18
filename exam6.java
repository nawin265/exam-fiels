class main
{
public static void main (String args[])
	{
         int a[][]={{3,2,1},{4,7,6,7},{7,-8}};
              
              int max=0;
              for(int x=0;x<=a.length-1;x++)
                  {
                   for(int y=0;y<=a[x].length-1;y++)
                       {
                        if(max<a[x][y])
                          {
                            max=a[x][y];
                          }
                        
                       }
                      System.out.println(max+"max of array");
                  }
	}
}