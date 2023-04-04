public class FullName {
    public static void main(String[] args) {
        int n=11;
        System.out.println();
        for(int i=0 ;i<n ;i++)
        {
               //H

                for(int j=0;j<n;j++)
               {
                   if(j==0 || j==(n-1)/2 || i==(n-1)/2 && j<(n-1)/2)
                   {
                     System.out.print("* ");
                   }
                   else 
                   {
                    System.out.print("  ");
                   }
               }System.out.print("");

               //A
               for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            } System.out.print("");

            //R
            for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0 ||i==0 && j<(n-3)/2 ||i==(n-1)/2 && j<(n-3)/2  || j==(n-1)/2 && i<(n-3)/2 && i>1 || i==1 && j==(n-3)/2 || i==(n-3)/2 && j==(n-3)/2 ||i-j ==(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("    ");

             //I

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
             }System.out.print("    ");

             //P
 
             for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0 ||i==0 && j<(n-3)/2 ||i==(n-1)/2 && j<(n-3)/2  || j==(n-1)/2 && i<(n-3)/2 && i>1 || i==1 && j==(n-3)/2 || i==(n-3)/2 && j==(n-3)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("     ");

            //A

            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print(" ");

            //R

            for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0 ||i==0 && j<(n-3)/2 ||i==(n-1)/2 && j<(n-3)/2  || j==(n-1)/2 && i<(n-3)/2 && i>1 || i==1 && j==(n-3)/2 || i==(n-3)/2 && j==(n-3)/2 ||i-j ==(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("    ");

            //A
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }
            System.out.println("");
        }
    System.out.println();
    System.out.println();

        for(int i=0;i<n;i++){
          //A
          for(int j=0;j<n;j++)
          {
              if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
              {
                System.out.print("* ");
              }
              else 
              {
               System.out.print("  ");
              }
          }System.out.print(" ");

            //A
            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print(" ");

            //S
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

             //H
             for(int j=0;j<n;j++)
             {
                 if(j==0 || j==(n-1)/2 || i==(n-1)/2 && j<(n-1)/2)
                 {
                   System.out.print("* ");
                 }
                 else 
                 {
                  System.out.print("  ");
                 }
             }System.out.print("");

             //I
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
             }System.out.print("    ");
                  //S
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
            
              //H
              for(int j=0;j<n;j++)
              {
                  if(j==0 || j==(n-1)/2 || i==(n-1)/2 && j<(n-1)/2)
                  {
                    System.out.print("* ");
                  }
                  else 
                  {
                   System.out.print("  ");
                  }
              }System.out.println();
       
     } 
    

    System.out.println();
    System.out.println();

     for(int i=0;i<n;i++){
        //A
        for(int j=0;j<n;j++)
        {
            if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
            {
              System.out.print("* ");
            }
            else 
            {
             System.out.print("  ");
            }
        }System.out.print(" ");

        //M
        for(int j=0;j<n;j++)
        {
            if(j==0 || j==(n-1) || i==j && i<=(n-1)/2||i+j==((n-1)) && i<(n-1)/2)
            {
              System.out.print("* ");
            }
            else 
            {
             System.out.print("  ");
            }
        }System.out.print("    ");
       //R
        for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0 ||i==0 && j<(n-3)/2 ||i==(n-1)/2 && j<(n-3)/2  || j==(n-1)/2 && i<(n-3)/2 && i>1 || i==1 && j==(n-3)/2 || i==(n-3)/2 && j==(n-3)/2 ||i-j ==(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("    ");
          //U
          for(int j=0;j<=(n-1)/2;j++)
            {
                if(j==0 && i<(n-2)|| j==(n-1)/2 && i<(n-2) ||i==n-1 && j>1 &&j<(n-3)/2||i==(n-2) && j==1 ||i==(n-2) && j==(n-3)/2 )
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ") ;
                }
            }System.out.print("    ");
            //T
            for(int j=0;j<=n-1;j++)
            {
                if(j==(n-1)/2|| i==0)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("    ");
    

             //B
             for(int j=0;j<n;j++)
             {
                 if(i==0 && j<(n-1)/2 || i==(n-1)/2 && j<(n-1)/2 || i==(n-1) && j<(n-1)/2 ||j==0 || j==(n-1)/2 && i>0 && i<(n-1) && i!=(n-1)/2)
                 {
                   System.out.print("* ");
                 }
                 else 
                 {
                  System.out.print("  ");
                 }
             }System.out.print("");
            //H 
            for(int j=0;j<n;j++)
            {
                if(j==0 || j==(n-1)/2 || i==(n-1)/2 && j<(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("");

            //A 

            for(int j=0;j<n;j++)
            {
                if(i==0 && j>0 && j<(n-1)/2 || j==0 && i>0 ||j==(n-1)/2 && i>0 || i==(n-1)/2 && j<(n-1)/2)
                {
                  System.out.print("* ");
                }
                else 
                {
                 System.out.print("  ");
                }
            }System.out.print("");

            //I
                   
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
            }System.out.println("");

        

    }
    }
    

}