=================================================:::First  and second part of assignment :::==================================================================
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
		isTheNumberEven(3); 
		isTheNumberPrime(7);
		factorial(5);
		isNumberArmstrong(153);
		isNumberPallindrome(1241);
		evenIntBelow100();
		primeIntBelow100();
		patternOne();
		patternTwo();
		patternThree();
		
		patternFive();
		patternSix();
		patternSeven();
		patternEight();
		patternNine();
		patternTen();
		
		floyedTriangle();
		pyramidPattern(6,7);
		
		squarePattern();
		
		switchDemo("A");
		
		
	}
}

====================================================================::: Third part of assignment:::================================================
public class ThirdAssignment {
	
// 1) Write a program to check if a given number is Positive, Negative, or Zero.
//    If Statement 	

	public static void IfNumberIsPosNegOrZeor(int number) {
		
		if( number == 0) System.out.println("The number is zero"); 
		else if(number % 2 == 0) System.out.println("The number is even"); 
		else System.out.println("The number is odd");
	}
	
// 2) Write a program to check if the program has received command line arguments or not.
//	  If the program has not received the values then print "No Values", else print all the 
//    values in a single line separated by ,(comma). Eg1) java Example O/P: No values Eg2) 
//    java Example Mumbai Bangalore O/P: Mumbai,Bangalore [Note: You can use length property of an array to check its length
	

    
	public static void IsThereAnArgument() {
		Scanner scan = new Scanner(System.in); 
		String s = scan.nextLine();
		if(s.length() == 0) System.out.println("No values"); 
		else {
			String[] arr = s.split(" "); 
			s = String.join(",", arr);
			System.out.println(s);
		}
	}
	
	
	
//	3) Initialize two character variables in a program and display the characters in alphabetical order. Eg1) 
//  if first character is s and second is e O/P: e,s Eg2) if first character is a and second is e O/P:a,e
	
	
 public static void characterHierchy(char a , char b) {
	 if ( a > b) {
		 System.out.println( a + "," + b);
	 } else {
		 System.out.println( b + "," + a);
	 }
 }
 
 
//  4) Initialize a character variable in a program and if the value is alphabet then print "Alphabet" if it’s a number 
//      then print "Digit" and for other characters print "Special Character"
     
 public static void digitOrAlphabet(char i ) {
	 if( i >= '0'  &&  i <= '9') {
		 System.out.println("Digit");
	 } else if( i >= 65 && i <= 90 || i >= 97 && i <= 122) {
		 System.out.println("Alphabet");
	 } else {
		 System.out.println("special character");
	 }
 } 
 
 
//  5) Write a program to accept gender ("Male" or "Female") and age (1-120) from command line arguments and print 
//     the percentage of interest based on the given conditions. 
//     Interest == 8.2% Gender ==> Female Age ==>1 to 58 Interest == 7.6% Gender ==> Female Age ==>59 -120 Interest == 9.2% 
//     Gender ==> Male Age ==>1-60 Interest == 8.3% Gender ==> Male Age ==>61-120
//	   If Statement 
 public static void PercentAge() {
	 Scanner scan = new Scanner(System.in);
	 System.out.println("Enter the gender "); 
	 System.out.println();
	 String gender = scan.next(); 
	 gender = gender.toLowerCase();
	 System.out.println();
	 System.out.println("Ender the age");
	 System.out.println();
	 int age = scan.nextInt();
	 
	 if(gender.equals("male")) {
		 if(age >= 1 && age <= 58) {
			 System.out.println("Interest is  8.2%" );
		 } else if(age >= 59 && age <= 120) {
			 System.out.println("Interest is  7.6 %");
		 } else {
			 System.out.println("Invalid entry");
			 
		 }
	 } else if ( gender.equals("female")) {
		 if(age >= 1 && age <= 60) {
			 System.out.println("Interest is 8.3%");
		 } else if(age >= 61 && age <= 120) {
			 System.out.println("interest is 7.9%");
		 }
		 else {
			 System.out.println("Invalid entry");
		 }
	 } else {
		 System.out.println("Invalid entry");
	 }
 }
 
// 6)Write a program to convert from upper case to lower case and vice versa of an alphabet and print the old character 
// and new character as shown in example (Ex: a->A, M->m).
   public static void caseViseVersa(String s ) {
	  if( s.toLowerCase().equals(s)) { 
		  System.out.println( s + "-------->" + s.toUpperCase());
	  } else {
		  System.out.println(s + "--------->" + s.toLowerCase());
	  }
   }
   
//   7) Write a program to print the color name, based on color code. If color code in not valid then print "Invalid Code".
//      R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
   
   public static void colorCode() {
	   Scanner scan = new Scanner(System.in); 
	   System.out.println(" choose the color code amoung R , G, B, O, Y , W"); 
	   String s = scan.next().toLowerCase(); 
	   switch(s) {
	   
	   case "r":
		   
		  System.out.println("Red");
		  break; 
	   case "g":
	   	 System.out.println("Green");
	   	 break;
	   case "b":
		   System.out.println("Blue");
		   	 break;
	   case "o": 
		   System.out.println("Orange");
		   	 break;
	   case "y":
		   System.out.println("Yellow");
		   	 break;
	   case "w":
		   System.out.println("White");
		   	 break;
		   default: 
			   System.out.println("Invalid entry");
			   	 break;
			
	   }
   }

//  8) Write a program to print month in words, based on input month in numbers Example1:
   public static void monthsCode() {
	   Scanner scan = new Scanner(System.in); 
	   System.out.println(" Enter the number "); 
	   int s = scan.nextInt();
	   switch(s) {
	   
	   case 1:
		   
		  System.out.println("January ");
		  break; 
	   case 2:
	   	 System.out.println("February");
	   	 break;
	   case 3:
		   System.out.println("March");
		   	 break;
	   case 4: 
		   System.out.println("April");
		   	 break;
	   case 5:
		   System.out.println("May");
		   	 break;
	   case 6:
		   System.out.println("June");
		   	 break;
	   case 7:
		   
		  System.out.println("July");
		  break; 
	   case 8:
	   	 System.out.println("August");
	   	 break;
	   case 9:
		   System.out.println("September");
		   	 break;
	   case 10: 
		   System.out.println("October");
		   	 break;
	   case 11:
		   System.out.println("November");
		   	 break;
	   case 12:
		   System.out.println("December");
		   	 break;
	   default: 
		   System.out.println("Invalid entry");
		   	 break;
			
	   }
   }
   
//   9) Write a program to add all the values in a given number and print. Ex: 1234->10
   
      public static void digitSum() {
    	  System.out.println("Enter the desired number plz");
    	  Scanner scan = new Scanner(System.in); 
    	  int number = scan.nextInt(); 
    	  int n  = Integer.toString(number).length();
    	  int sum = 0; 
    	  for( int i = 0;  i < n; i++) {
    		  
    		  sum += number % 10; 
    		  number /= 10;
    	  }
    	  
    	  System.out.println(sum);
      }
      
//      10) Write a program to print * in Floyds format (using for and while loop) *
    
      public static void floyedTriangle() {
    	  Scanner scan = new Scanner(System.in);
    	  System.out.println("Enter the row and column of the floyd triangle with a space in between" );
    	  String[] rowCol = scan.nextLine().split(" "); 
    	  int row = Integer.parseInt(rowCol[0]); 
    	  int col = Integer.parseInt(rowCol[1]);
    	  System.out.println(row + col);
    	  int i  = 0, j =0;
    	  while ( i < row ) {
    		  j = 0;
    		  while (j <= i) {
    			  System.out.print("* ");
    			  j++;
    		  }
    		  
    		  System.out.println();
    		  i++;
    	  }
      }
      
//    11)  Write a program that displays a menu with options 1. Add 2. Sub Based on the options chosen,
//      read 2 numbers and perform the relevant operation. After performing the operation, the program should ask the user
//      if he wants to continue. If the user presses y or Y, then the program should continue displaying the menu else the program should terminate.
//      [ Note: Use Scanner class, you can take help from the trainer regarding the same ]
//
  public static void calculator() {
	  Scanner scan = new Scanner(System.in);
	  boolean test = true; 
	  while(test) {
		  System.out.println("****************************************************");
		  System.out.println();
		  System.out.println("choose 1 for addition");
		  System.out.println("choose 2 for substraction");
		  System.out.println("choose 3 if you want to exit"); 
		  
		  System.out.println();
		  System.out.println("****************************************************");
		
		  int choice = scan.nextInt();
		  
		  switch(choice) {
		  case 1: 
			  
			  System.out.println("enter the first number");
			  System.out.println();
			  int num1 = scan.nextInt();
			  System.out.println("enter the first number");
			  System.out.println();
			  int num2 = scan.nextInt();
			  System.out.println( "sum of two number is" + (num1 + num2));
			  break;
			  
		  case 2:
			  System.out.println("enter the first number");
			  System.out.println();
			  int num3 = scan.nextInt();
			  System.out.println("enter the first number");
			  System.out.println();
			  int num4 = scan.nextInt();
			  System.out.println( "substraction of two number is" + (num3 - num4));
			  break; 
			  
		  case 3: 
			 
			  System.exit(0);
			  break;
			  
		default: 
			
			break;
		  }
	  }
	  
	  
	  
  }
	public static void main(String[] args) {
//		IfNumberIsPosNegOrZeor(-2);
//		IsThereAnArgument();
		
//		digitOrAlphabet('*');
//		colorCode();
//		monthsCode();
//		digitSum();
		
//		floyedTriangle();
		calculator();
	}
	

}
