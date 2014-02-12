

public class Hail{
	public static int counter;
    public static void hail(int n){

		if (n==1){
		    //System.out.println(1);
		    counter++;
		}
		else if (n%2 ==0){
		    //System.out.println(n);
		    counter++;
		    hail(n/2);
		    
		}
		else{
		   // System.out.println(n);
		    counter++;
		    hail((3*n)+1);
			}	
    }

    public static int HailLen(int n){
    	int vert = 0;
    	hail(n);
    	vert = counter;
    	counter = 0;
    	return vert;
    }
    
    public static void longestHail(int n){
    	int check = HailLen(1);
    	for (int x =1; x < n; x++){
    		if (HailLen(x) > HailLen(check))
    			check = x;
    	}
    	System.out.println("LongestHail: " + check);
    }

    public static void main(String[] args){

    	longestHail(1);
    	longestHail(2);
    	longestHail(3);
    	longestHail(4);
    	longestHail(5);
    	
    	
    }
}
	

    

