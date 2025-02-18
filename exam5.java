class Main
{
public static void main(String args[])
    {
          int a[]={1,2,3,4,5,2,4,5,6,8,4,9};
              int b[]=new int[a.length];
                
                for(int x=0;x<=a.length-1;x++)
                    {
                       int count=0;
                           if(b[x]==1)
                              {
                               continue;
                              }    

                       for(int y=x+1;y<=a.length-1;y++)
                         {
                             if(a[y]==a[x])
                                {
                                  count++;
                                   b[y]=1;
                                }
                        }
                        if(count==0)
                         {
                        System.out.println(a[x]+"unique element in a array");  
                         }
                    }
	}
}