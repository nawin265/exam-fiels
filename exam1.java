class Main
{
public static void main(String args[])
  	{
         int a[]={10,20,30,40,50,60,70}; // 40,50,60,70,10,20,30
         
                    int count=0;
                    for(int r=1;r<=3;r++)
                       {    
                          int temp=a[0];
                            count++;
                        for(int x=0;x<a.length-1;x++)
                          {

                           a[x]=a[x+1];
                          
                        
                           }  
                          a[a.length-1]=temp;
                       }
                     System.out.println(count+" num of rotation");
                     
                  for(int t:a)
                       System.out.println(t);  
                       
	}
}