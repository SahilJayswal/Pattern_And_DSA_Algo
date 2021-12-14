package Pattern;

import java.util.Scanner;
      
public class Star_Pattern {

	public static void main(String[] args) {
          Scanner sc =  new Scanner(System.in);
          System.out.print("Enter number of rows: ");
          int n = sc.nextInt();
          sc.close();
          
          pattern1(n);
          pattern2(n);
          pattern3(n);
          pattern4(n);
          pattern5(n);
          pattern6(n);
          pattern7(n);
          pattern8(n);
          pattern9(n);
          pattern10(n);
          pattern11(n);
          pattern12(n);
          pattern13(n);
          pattern14(n);
          pattern15(n);
          pattern16(n);
          pattern17(n);
          pattern18(n);
          pattern19(n);
          pattern20(n);
          pattern21(n);
          pattern22(n);
          pattern23(n);
          pattern24(n);
          pattern25(n);
        }
        
        static void pattern1(int n){
          
          System.out.println("\n1. Pattern1\n");
          
            for(int i=1; i<=n; i++){
              for(int j=1; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern2(int n){
          
          System.out.println("\n2. Pattern2\n");
          
            for(int i=1; i<=n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern3(int n){
          
          System.out.println("\n3. Pattern3\n");
          
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern4(int n){
          
          System.out.println("\n4. Pattern4\n");
          
            for(int i=1; i<=n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern5(int n){
          
          System.out.println("\n5. Pattern5\n");
          
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern6(int n){
          
          System.out.println("\n6. Pattern6\n");
          
            for(int i=1; i<=n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                System.out.print("* ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern7(int n){
          
          System.out.println("\n7. Pattern7\n");
          
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              for(int j=i; j<n; j++){
                System.out.print("* ");
              }
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern8(int n){
          
          System.out.println("\n8. Pattern8\n");
          
          for(int i=1; i<n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                System.out.print("* ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
          
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              for(int j=i; j<n; j++){
                System.out.print("* ");
              }
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern9(int n){
          
          System.out.println("\n9. Pattern9\n");
          
            for(int i=1; i<=n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                // Print * for only fist column and row less than number of rows
                // OR row is a list line
                if(j==1 && i<n || i==n){
                  System.out.print("* ");
                }
                else{
                  System.out.print("  ");
                }
              }
              
              for(int j=1; j<=i; j++){
                //Print * where row == column && 
                //row is less one less the total number of rows both true.
                //Or if row is last line == true
                if(i==j && i<n || i==n){
                  System.out.print("* ");
                }else{
                  System.out.print("  ");
                }
              }
              System.out.println();
            }
        }
        
        static void pattern10(int n){
          
          System.out.println("\n10. Pattern10\n");
          
            //First loop for upper pattern
            for(int i=1; i<n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                
                if(j==1 && i<=n){
                  System.out.print("* ");
                }
                else{
                  System.out.print("  ");
                }
              }
              
              for(int j=1; j<=i; j++){
                
                if(i==j && i<=n){
                  System.out.print("* ");
                }else{
                  System.out.print("  ");
                }
              }
              System.out.println();
            }
            
            // Second loop for lower pattern
             for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              
              for(int j=i; j<=n; j++){
                //Print * where column == row
                if(j==i){
                  System.out.print("* ");
                }else{
                  System.out.print("  ");
                }
              }
              
              // Running loop one less time the number of rows
              for(int j=i; j<n; j++){
                //Print * where column == number of rows-1
                if(j==n-1){
                  System.out.print("* ");
                }else{
                  System.out.print("  ");
                }
              }
              System.out.println();
             }
        }
        
        static void pattern11(int n){
            System.out.println("\n11. Pattern11\n");
            
            for(int i=1; i<=n; i++){
              
              for(int j=1; j<=n; j++){
                //If Row is first or Last print * on all column
                if(i==1 || i==n){
                  System.out.print("* ");
                }
                //If Row is greater the 1{first line) and less that n(last line)
                if(i>1 && i<n){
                  //check if column is first or last and print *, else print space
                  if(j==1 || j==n){
                    System.out.print("* ");
                  }else{
                    System.out.print("  ");
                  }
                }
                
              }
              System.out.println();
            }
          }
          
        static void pattern12(int n){
          System.out.println("\n12. Pattern12\n");
            
            //Print Upper pattern
            //Run Row one less time
            for(int i=1; i<n; i++){
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
            
            //Print Lower pattern
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        } 
        
        static void pattern13(int n){
          System.out.println("\n13. Pattern13\n");
            
            //Print Upper pattern
            //Run Row one less time
            for(int i=1; i<n; i++){
              //Print Space for square area
              for(int j=1; j<=n; j++){
                System.out.print("  ");
              }
              //Print space for Lower Left Triangle
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              //Print * from Upper Right Triangle
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
            
            //Print Lower pattern
            for(int i=1; i<=n; i++){
              //Print space for square area
              for(int j=1; j<=n; j++){
                System.out.print("  ");
              }
              //Print space for Upper Left Triangle
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              //Print * for Lower Right Triangle	
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        } 
        
        static void pattern14(int n){
          System.out.println("\n14. Pattern14\n");
            int count=0;
            
            for(int i=1; i<=n; i++){
              //First * Triangle
              for(int j=i; j<=n; j++){
                //This print four * in first row for first triangle
                if(i==1 && count<n-1){
                  System.out.print("* ");
                  count++;
                }//From 2nd row normal iteration start
                if(i>1){
                  System.out.print("* "); 
                }
              }
              for(int j=1; j<i; j++){
                System.out.print("  ");
              }
              for(int j=2; j<i; j++){
                System.out.print("  ");
              }
              //Second * Triangle
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
             
        } 
        
        static void pattern15(int n){
          System.out.println("\n15. Pattern15\n");
            int count=0;
            
            for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                if(i==n && count<n-1){
                  System.out.print("* ");
                  count++;
                }if(i<n){
                  System.out.print("* ");
                }
              }
              for(int j=i; j<n; j++){
                System.out.print("  ");
              }
              for(int j=i+1; j<n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            } 
        } 
        
        static void pattern16(int n){
          System.out.println("\n16. Pattern16\n");
            
              for(int i=1; i<n; i++){
                int count=0;
              //First * Triangle
              for(int j=i; j<=n; j++){
                //This print four * in first row for first triangle
                if(i==1 && count<n-1){
                  System.out.print("* ");
                  count++;
                }//From 2nd row normal iteration start
                if(i>1){
                  System.out.print("* "); 
                }
              }
              for(int j=1; j<i; j++){
                System.out.print("  ");
              }
              for(int j=2; j<i; j++){
                System.out.print("  ");
              }
              //Second * Triangle
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
            
            for(int i=1; i<=n; i++){
              int count=0;
              for(int j=1; j<=i; j++){
                if(i==n && count<n-1){
                  System.out.print("* ");
                  count++;
                }if(i<n){
                  System.out.print("* ");
                }
              }
              for(int j=i; j<n; j++){
                System.out.print("  ");
              }
              for(int j=i+1; j<n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            } 
        } 
        
        static void pattern17(int n){
          System.out.println("\n17. Pattern17\n");
            
            for(int i=1; i<=n; i++){
             
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                System.out.print("  ");
              }
              
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
             
        } 
        
        static void pattern18(int n){
          System.out.println("\n18. Pattern18\n");
           
            for(int i=1; i<=n; i++){
             
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              for(int j=i; j<n; j++){
                System.out.print("  ");
              }
              for(int j=i; j<n; j++){
                System.out.print("  ");
              }
              
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
             
        } 
        
        static void pattern19(int n){
          System.out.println("\n19. Pattern19\n");
            
            for(int i=1; i<n; i++){
             
              for(int j=1; j<=i; j++){
                System.out.print("  ");
              }
              for(int j=i; j<n; j++){
                System.out.print("* ");
              }
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
            
            for(int i=1; i<=n; i++){
              
              for(int j=i; j<=n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<i; j++){
                System.out.print("* ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
             
        } 
        
        static void pattern20(int n){
          System.out.println("\n20. Pattern20\n");
          
          for(int i=1; i<n; i++){
            for(int j=1; j<=i; j++){
              System.out.print("* ");
            }
            System.out.println();
          }
          for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
              System.out.print("* ");
            }
            System.out.println();
          }
        }
        
        static void pattern21(int n){
          System.out.println("\n21. Pattern21\n");
          
          for(int i=1; i<n; i++){
            for(int j=i; j<=n; j++){
              System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
              System.out.print("* ");
            }
            System.out.println();
          }
          for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
              System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
              System.out.print("* ");
            }
            System.out.println();
          }
        }
        
        static void pattern22(int n){
          System.out.println("\n22. Pattern22\n");
          
          for(int i=1; i<n; i++){
            for(int j=1; j<=n; j++){
              System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
              System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
              System.out.print("* ");
            }
            System.out.println();
          }
          for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
              System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
              System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
              System.out.print("* ");
            }
            System.out.println();
          }
        }
        
        static void pattern23(int n){
          System.out.println("\n23. Pattern23\n");
          
            for(int i=1; i<n; i++){
              int count=0;
              for(int j=1; j<=i; j++){
                if(i==n && count<n-1){
                  System.out.print("* ");
                  count++;
                }if(i<n){
                  System.out.print("* ");
                }
              }
              for(int j=i; j<n; j++){
                System.out.print("  ");
              }
              for(int j=i+1; j<n; j++){
                System.out.print("  ");
              }
              for(int j=1; j<=i; j++){
                System.out.print("* ");
              }
              System.out.println();
            } 
            
            
            
            for(int i=1; i<=n; i++){
              int count=0;
              for(int j=i; j<=n; j++){
                if(i==1 && count<n-1){
                  System.out.print("* ");
                  count++;
                }
                if(i>1){
                  System.out.print("* "); 
                }
              }
              for(int j=1; j<i; j++){
                System.out.print("  ");
              }
              for(int j=2; j<i; j++){
                System.out.print("  ");
              }
              for(int j=i; j<=n; j++){
                System.out.print("* ");
              }
              System.out.println();
            }
        }
        
        static void pattern24(int n){
          System.out.println("\n24. Pattern24\n");
          
          for(int i=1; i<=n; i++){
            for(int j=1; j<n; j++){
              if(j==1){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            for(int j=1; j<=n; j++){
              if(j==1 || i==1){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.println();
          }
          
          
          for(int i=1; i<=n; i++){
            for(int j=1; j<n; j++){
              if(i==n || i==1){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            for(int j=1; j<=n; j++){
              if(j==n || i==1 || j==1){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.println();
          }
        }
        
        static void pattern25(int n){
          
          System.out.println("\n25. Pattern25\n");
          
          for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
              System.out.print("  ");
            }
            for(int j=i; j<n; j++){
              if(i==1 || i==j){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            
            for(int j=i; j<=n; j++){
              if(i==1 || j==n){
                System.out.print("* ");
              }else{
                System.out.print("  ");
              }
            }
            System.out.println();
          }
        }
    }