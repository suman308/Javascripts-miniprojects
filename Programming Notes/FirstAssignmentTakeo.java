public class NumberSwaping {

	public static void swapTwoNumTemp(int a , int b) {
		int c = b; 
		b = a; 
		a = c; 
		System.out.println(a + "\t"+ b);
	}
	
	public static void swapTwoNumNoTemp(int a , int b) {
		a = a + b; 
		b = a-b; 
		a = a-b;
		System.out.println(a +"\t"+ b);
		
	}
	
	public static void swapThreeNumTemp(int a , int b, int c) {
		int d = a; 
		a = b; 
		b = c; 
		c = d;
		System.out.println(a +"\t"+ b + "\t" + c); 
	}
	
	public static void swapThreeNumNoTemp(int a, int b, int c) {
		a = a + b + c;
		b = a - b -c; 
		c = a - b -c; 
		a = a- b-c; 
		System.out.println(a +"\t"+ b + "\t" + c); 
		
	}
	public static void main(String[] args) {
	 swapTwoNumTemp(1, 2); 
	 swapTwoNumNoTemp(1, 2);
	 swapThreeNumTemp(1,2,3); 
	 swapThreeNumNoTemp(1,2,3);
	 
	}
}

public class assignment3to10 {
	public static void oneToTen() {
		int i=1; 
		while(i <= 10 ) {
		 System.out.println(i); 
		 i++;
		}
	}
	
	public static void doWhileDemo() {
		int i = 0; 
		do {
			System.out.println("weekend bro");
			
		} while(i >= 10);
	}
   
	
	public static void switchDemo(String grade) {
		switch (grade) {
		case "A": 
			System.out.println("excellent");
			break; 
		case "B": 
			System.out.println("very good");
			break;
			
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("OK"); 
			default: 
				System.out.println("weekend bro enter the right grade");
		}
		
		
		
	}
	public static void whileLoopDemo() {
		boolean test = true;
		int i = 0; 
		while(test) {
			
			if( i == 5) {
				System.out.println("weekend bro"); 
				test = false;
			}
			
		}
	}
	public  static boolean isTheNumberEven(int a ) {
		boolean b = a % 2 == 0; 
		if(b) System.out.println("The number is even"); 
		else System.out.println("The number is odd");
		return b;
	}
	
	public static boolean isTheNumberPrime(int number) {
		int count = 0;
		if(number <= 2 ) System.out.println("The number is not prime"); 
		else {
			for( int i = 2; i < number; i++) {
				if( number % i == 0) count++;
			}
		}
		if( count > 0) {
			System.out.println("The number is not a prime ");
			return true;
		}
		else {
			System.out.println("the number is prime");
			return false;
		}
	}
	
	public static void  factorial(int number) {
		int factorial = 1; 
		for(int i = number; i >= 1 ; i--) {
			factorial *= i; 
					 
		}
		System.out.println(factorial);
	}
	
	public static void isNumberArmstrong(int number) {
		int n = number;
		int n1 = 0; 
		
		
		int count = 0; 
		for(;n > 0;) {
			n /= 10; 
			count++;
			
		}
		n = number; 
		for(; n > 0; ) {
			int a = n % 10;
			
			n1 += Math.pow(a, count);
			n /= 10;
			
		}
		
		if( n1 == number ) System.out.println("the number is Armstrong"); 
		else System.out.println("the nubmer is not armstrog");
		
	}
	
	public static void isNumberPallindrome(int num) {
		int n = 0;
		int m = num;
		for(; m > 0 ; ) {
			 n *= 10;
			 n += m % 10; 
			 
			 m /= 10; 
			
		}
		
		if( n == num ) System.out.println("the number is pallindrome");
		else System.out.println("The number is not a pallindrome");
	}
	
    public static void evenIntBelow100() {
    	for(int i = 2; i <= 100; i++) {
    		if(i % 2 == 0) 
    			System.out.println(i);
    		
    	}
    }
    
    public static void primeIntBelow100() {
    	for( int i = 1; i <= 100; i++) {
    		int count = 0; 
    		if( i > 2) {
    			 
    			for( int j = 2; j < i; j++) {
    				
    				if( i % j == 0) {
    					count++; 
    				}
    				
    			}
    		}
    		if(count == 0) System.out.println(i);
    	}
    	
    }
    
    public static void patternOne() {
    	for( int j = 0; j < 3; j++) {
	    	for(int i = 0;  i< 5; i++) {
	    		System.out.print("* " );
	    	}
	    	System.out.println();
    	}
    }
    
    public static void patternTwo() {
    	for( int j = 0; j < 5; j++) {
    		
	    	for(int i = 0;  i>j; i++){
	    		
	    		System.out.print("* " );
	    	}
	    	System.out.println();
    	}
    }
    
    public static void patternThree() {
    	for( int j = 0; j < 5; j++) {
    		
	    	for(int i = 0;  i<=j; i++){
	    		
	    		System.out.print("* " );
	    	}
	    	System.out.println();
    	}
    }
    
    public static void patternFour() {
    	
    }
    
    public static void patternFive() {
    	for( int i = 1; i <= 5; i++) {
    		for( int j = 0; j < 5; j++) {
    			System.out.print(i);
    		}
    		System.out.println();
    	}
    }
    
    public static void patternSix() {
    	for( int i = 1; i <= 5; i++) {
    		for( int j = 0; j < 5; j++) {
    			System.out.print(i);
    		}
    		System.out.println();
    	}
    }
    
    public static void patternSeven() {
    	int num = 0;
    	for( int i = 1; i <= 5; i++) {
    		 
    		for(  int j = 1; j <= 10; j++) {
    			num++;
    			System.out.print(num+"    ");
    		}
    		System.out.println();
    	}
    }
    public static void patternEight() {
    	int num = 0;
    	for( int i = 1; i <= 5; i++) {
    		 
    		for(  int j = 1; j <= 10; j++) {
    			num++;
    			if(num % 2 != 0)System.out.print(num+"    ");
    		}
    		System.out.println();
    	}
    }
    
    public static void patternNine() {
    	int num = 0;
    	for( int i = 1; i <= 5; i++) {
    		 
    		for(  int j = 1; j <= 10; j++) {
    			num++;
    			if(num % 2 == 0)System.out.print
    			
    			(num+"    ");
    		}
    		System.out.println();
    	}
    }
    
    public static void floyedTriangle() {
    	int num = 0;
    	for( int i = 1; i <= 7; i++) {
    		 
    		for(  int j = 1; j <= i; j++) {
    			num++;
    			System.out.print(num+"    ");
    		}
    		System.out.println();
    	}
    }
    public static void patternTen() {
    	for( int i = 1; i <= 5; i++) {
    		for(char a = 'a'; a < 'g'; a++) {
    			System.out.print(a);
    		}
    		System.out.println();
    	}
    }
    
    
    
    public static void PascalTriangle() {
    	int num = 0;
    	for( int i = 1; i <= 7; i++) {
    		 
    		for(  int j = 1; j <= i; j++) {
    			num++;
    			System.out.print(num+"    ");
    		}
    		System.out.println();
    	}
    }
    
    public static void pyramidPattern( int row , int col) {
		for(int i = 0; i< row; i++) {
			for(int j = col-i; j > 1; j--) {
				 System.out.print(" ");
			}
			
			for( int j = 0; j <= i; j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
	
    
    public static void squarePattern() {
    	for( int i =0; i < 5; i ++) {
    		for( int j = 0; j < 8; j++) {
    			if( i == 0 || j == 0  || i == 4 || j == 7) System.out.print("#");
    			else System.out.print(" ");
    		}
    		
    		System.out.println();
    	}
    }
    
   public static void printingTenColumnOfOddNum() {
	   int k = 1;
	   for(int i = 0; i < 10; i++) {
		   for(int j = 0; j<5; j++) {
			  k += 3;
			System.out.println(k);
		   }
		   
		   System.out.println();
	   }
   }
   
   public static String getSmallestAndLargest(String s, int k) {
       String smallest = "";
       String largest = "";
      
        for(int i = 0 ; i< s.length()-4; i++){
           String st = s.substring(i, i+3); 
          
           if(smallest.charAt(0) > st.charAt(0)) {
               smallest = st; 
           } else if( smallest.charAt(0) == st.charAt(0)){
               if(smallest.charAt(1) >  st.charAt(1)){
                   smallest = st;
               }
           } else if(largest.charAt(0)< st.charAt(0)) {
                largest = st; 
           } else if(largest.charAt(0) == st.charAt(0)){
               if(largest.charAt(1) < st.charAt(1)){
                   largest = st;
               }
           }
           
           }
        
       // Complete the function
       // 'smallest' must be the lexicographically smallest substring of length 'k'
       // 'largest' must be the lexicographically largest substring of length 'k'
       
       return smallest + "\n" + largest;
   }
   
	

	public static void main(String[] args) {
//		isTheNumberEven(3); 
//		isTheNumberPrime(7);
//		factorial(5);
//		isNumberArmstrong(153);
//		isNumberPallindrome(1241);
//		evenIntBelow100();
//		primeIntBelow100();
//		patternOne();
//		patternTwo();
//		patternThree();
//		
//		patternFive();
//		patternSix();
//		patternSeven();
//		patternEight();
//		patternNine();
//		patternTen();
//		
//		floyedTriangle();
//		pyramidPattern(6,7);
//		
//		squarePattern();
		
//		switchDemo("A");
		
		
	}
}