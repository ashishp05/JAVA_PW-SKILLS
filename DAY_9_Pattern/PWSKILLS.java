public class PWSKILLS {
    public static void main(String[] args) {
        int n=13;
        for(int i=0 ;i<n ;i++)
        {
            //p
            for(int j=0;j<n;j++)
            {
                if(j==0 ||i==0 && j<(n-3)/2 ||i==(n-1)/2 && j<(n-3)/2  || j==(n-1)/2 && i<(n-3)/2 && i>1 || i==1 && j==(n-3)/2 || i==(n-3)/2 && j==(n-3)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("");
        
              //W
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==n-1 ||i+j==(n-1) && i>(n-1)/2 || j==i && i>=(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.println(" ");
        }
        System.out.println();

        //Skills
        for(int i=0 ;i<n;i++)
        {
            //p
            for(int j=0;j<=(n-1)/2;j++)
            {
                if(i==0 && j>1 && j<=(n-3)/2 || i==(n-1)/2 && j>1 && j<(n-3)/2|| i==(n-1) && j>0 &&  j<(n-3)/2||j==0 && i>1 && i<=(n-3)/2 ||j==(n-1)/2 && i>(n-1)/2 && i<(n-2) ||i==1 && j==1 ||i==(n-1)/2 && j==1 ||i==(n-1)/2 && j==(n-3)/2 || j==(n-3)/2  && i==n-2|| i==1 && j==(n-1)/2 || i==n-2 && j==0 )
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("   ");

            for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0|| i+j ==(n-1)/2 ||i-j ==(n-1)/2 )
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("   ");
        
            for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==(n-1)/4|| i==0 || i==(n-1))
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("   ");

            for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0|| i==(n-1) )
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("   ");
        
            for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0|| i==(n-1) )
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("   ");

            for(int j=0;j<=(n-1)/2;j++)
            {
                if(i==0 && j>1 && j<=(n-3)/2 || i==(n-1)/2 && j>1 && j<(n-3)/2|| i==(n-1) && j>0 &&  j<(n-3)/2||j==0 && i>1 && i<=(n-3)/2 ||j==(n-1)/2 && i>(n-1)/2 && i<(n-2) ||i==1 && j==1 ||i==(n-1)/2 && j==1 ||i==(n-1)/2 && j==(n-3)/2 || j==(n-3)/2  && i==n-2|| i==1 && j==(n-1)/2 || i==n-2 && j==0 )
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.println("   ");

        }
    }
}