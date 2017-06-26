import java.util.*;
public class sumascolumnas{
        public static void main(String[] args){
                Scanner lee = new Scanner(System.in);
                String s=lee.nextLine();
                String[] joke=s.split("\\s+");
                int m=joke.length;
                int[] numbers;
                if(m%2!=0){
                        m++;
                        String[] joke1=new String[m];
                        for(int i=0;i<m-1;i++){
                                joke1[i]=joke[i];
                        }//end for
                        joke1[m-1]="0";
                        numbers=new int[m];
                        for(int i=0;i<m;i++){
                                String strip=joke1[i];
                                int conv=Integer.parseInt(strip);
                                numbers[i]=conv;
                        }//end for
                }//end if
                else{
                        numbers=new int[m];
                        for(int i=0;i<m;i++){
                                String strip=joke[i];
                                int conv=Integer.parseInt(strip);
                                numbers[i]=conv;
                        }//end for

                }//end else
                double r=Math.sqrt(m);
                int root=(int)r;
                if(Math.pow(r,2.0)!=m){
                        int[][] mat=new int[root+1][root];
                        int k=0;
                        for(int i=0;i<root+1;i++){
                                for(int j=0;j<root;j++){
                                        mat[i][j]=numbers[k];
                                        k=k+1;
                                }//end for2
                        }//end for1
                        int z=0;
                        for(int i=0;i<root;i++){
                                for(int j=0;j<root+1;j++){
                                        z=mat[j][i]+z;
                                }//end for2
                                System.out.print(z+" ");
                                z=0;
                        }//end for1
                        System.out.println();

                }//end if
                else{
                        int[][] mat=new int[root][root];
                        int k=0;
                        for(int i=0;i<root;i++){
                                for(int j=0;j<root;j++){
                                        mat[i][j]=numbers[j];
                                        k=k+1;
                                }//end for2
                        }//end for1
                        int z=0;
                        for(int i=0;i<root;i++){
                                for(int j=0;j<root;j++){
                                        z=mat[j][i]+z;
                                }//end for2
                                System.out.print(z+" ");
                                z=0;
                        }//end for1
                        System.out.println();
                }//end else
        }//end main

}//end class
