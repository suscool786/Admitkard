import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N1=sc.nextInt();
		int X1=sc.nextInt();
		int Y1=sc.nextInt();
		int T1=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<>();
		
		for(int i=1;i<=N1;i++){
		    if(i%X1==0){
		        a.add(i);
		    }
		}
		ArrayList<Integer> b=new ArrayList<>();
		
		for(int j=1;j<=N1;j++){
		    if(j%Y1==0){
		        b.add(j);
		    }
		}
		for(int k=0;k<a.size();k++){
		    for(int l=0;l<b.size();l++){
		        if(a.get(k)+b.get(l)==T1){
		            System.out.println(a.get(k)+","+b.get(l));
		            
		        }
		    }
		}
	}
}
