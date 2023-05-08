=====================================================INTRODUCTION IN JAVA ===========================================================

System => is perdefined class  that contains that there variable 

out => using out we can print data on console  and write from file 

in => read the data from console 

err => print data on console 




1) if return type is boolean then it can only be true or false 

2) if return type is String int or any other data type then we can return null;

=====================================================================================OPERATORS IN JAVA ========================================================================
1) Uniary operator :::
     increment operator:: 
     1) pre-increment /decrement => ++i, --i
     2) post-increment/ decrement  => i++, i--
         int x = 10; 
         y = x++; 
         System.out.println(x ,y) =>  11, 10 first x will be assigned to y then x will be increased; 

         int x = 10; 
         int y = --x; 
         System.out.println(x, y) => 9, 9 first x will be decreased then it will be assigned to  y

         int x = 10; 
         System.out.println(x++) // 10
            System.out.println(x++)// 11
            System.out.println(++x) //13
            System.out.println(++x)//14

        System.out.println(x++ + ++x ) // 10 + 11 => 21
        System.out.println(++x + x++)  // 11 + 11 => 22
        System.out.println(10<<3) // 10 * 2 ^ 3 => 10 * 2* 2* // this is called lifeshift operator 
        System.out.println(10>>3) // 10 / 2^ 3 => 10 / 27 => 0 nearest integer
      3)10++ --10 // is wrong
      4) cannot increment or decrement boolean // true++ is wrong
      5) variable storing primitive data type except boolean can be incremented or decremented 

 2) () division multiple additon substraction BODMAS important 


 3) Logical operation 
      &&    ::  It is logical and it will check the first condition if it is false then it will not check the second condition 
              only if the first condition is true it will check second and if both are true then it return true 

              example:  x = 5 , y = 6;  if( x > y && ++x < y ) { print} print(x) => 5 since it never goes to other expresssion 

     &     :: bitwise and check both expression no matter what 
     ||    :: if the first condition is true it will not check the second condition  but if the first condition is false it check the second condition 
               if any of the condition is true it return true 
         
       
      |   :: no matter first condition is true or false it check the second condition  any of them is  true will return true 


 important::      2< 5 || 6 < 5 && 4>7 ==> It will be seen as 2<5 || (6<5 && 4>7) true so it will not go to other side 
                  2> 5 || 6 > 5 && 4>7 ==>    false since && is single block so it is false over all so  its like 2> 5 || (false)   => false 
                  && will be single block 

 
                  (5>6 && 5<6 || 5>3 ); => this is read as (5> 6 && 5<6) || 5>3  the and block will be tread and evaluated as one => false || 5>3 
                  if false then || will check second and if one of the thing is true it will return ture so the result is true 
==========================================================================(  NAMING CONVENTION IN JAVA )=========================================================================


1) PACKAGES                 :::   1) packages are always in the lower case;
                                  2) package name is always unique 

2) CLASSES  and INTERFACES  :::   1) the class name is always CamelCase 
                                  2) First letter is always capital 

3) METHODS                  :::   methods name is mixedCase 

4) CONSTANTS                :::   constants are always uppercase for example :- int final RAM = 45;  we have to delcare and assign the value then and there what 
                                  we cannot do is delcare at one place and then assign someother place if the final is added in front

    ***Important***         :::   final class Dog  :: means that Dog cannot be inherited  but we can make an instance of the class in or out of class somehwere depending 
                                  upon the access modifier 

    final method/function() :::   means that method cannot be overriden by the child class 


======================================================================( DATA TYPES AND DATA MANIPULATION )==========================================================================


 1) System.out.println == system is the class of the java that contains the many function so system is a kind of packet in the java  and out stands for output 

  and println always print in the new line

 2) After writing the program in the java we have to do javac filename.java==> that stands for the java compile and then if all the things compiles perfectly then we can 
    execute or run the file with the java filename  we do not  put class extension( running javac filename.java will create filename.class

3) a) The int data type allows values between -2,147,483,648 and 2,147,483,647, inclusive in the javascript; 
 // that is the maximum value  int can contain is  2147483648 and min value it can hold is -2147483647 if any 
 // mutliplication or the exponential is greater than that it cannot hold that 
    b) to counter this problem we have long  in the java 
      long number = Long.MAX_VALUE  ==> 9223372036854775807 and min value is - 9223372036854775807 ;
    c) one important concept of java is casting which is if arithemtic operation of the between two is done  
    int  r = 5.0/ 2.0 will be an error but int r = (int)(5.0/2.0) is the called the casting 
    d) 50L is long  50d is double 50f is float
4) char is surrounded by the single quote and it has only one character of the alphabet or other  

5) String are all the string with the doulbe quotes unlike char which are single quote and java is strict about it  
6) amoung all the other only string is capitalized.

7) In Java, variable names are case-sensitive. myHeight is a different variable from myheight. camel case is used to name the variables and it starts with $,_ or alphabets 
it cannot start with the number.
8) The java compiler will give the error for the missing semicolon and undefined variables in the program during the compiling  
9) Addition (+=)  int num += 5;
   Subtraction (-=)
   Multiplication (*=)
   Division (/=)
   Modulo (%=)  
10) The order of the numerical operation in the java programming is given as follows 
    The order is as follows: (^^^^^^%%%%%%%********////////+++++++++++++++++--------- ---------+++++++++++++++++=///////////+**********%%%%%%%%%^^^^^^^)
      Parentheses  (PEMM DAS)
      Exponents
      Modulo/Multiplication/Division 
      Addition/Subtraction 
11) a)  == returns true or false and it checks the memory location of the data ,  the primitive data types are immutable and just have same memory location even if declared 
      couple of times some where 
      <= smaller or equal to >= greater or equal to   
    b) .equals() it will checks if the given strings are equals 
12) && is for logical and and || is for logical or in the java just like the javascript;

13) !true = false and !false = true 
                                                                                    typecasting in java 

IMPLICIT casting : is assigning the lower data type to higher data type  
EXPLICIT casting : is assigning the higher data type to lower data type
===========================================================================( INTEGER IN JAVA )======================================================================================

1) Interger.parseInt("45")  :::  45 // it will convert the string numbers into integer
2) Double.parseInt( "45")   :::  45.0 && Double.parseInt("34.45") ==> 34.45 // it will convert the things to double 
3) float 
4) Integer.toString(123)   ::: it will convert the integer into string

===========================================================================( STRING IN JAVA )=========================================================================================
*** imp *** since String is immutable no matter what method we use we cannot change the string so it will create new string in the memory and 
and point our reference to that newly changed string so obviously it will make the new copy 


**imp** one very important thing to understand 
String :: string is the  collection of the char in the java  and we can make string using  
String str = new String("suman");  using new keyword we can create object;
String is predefined class and it is availabe in java.lang* class; 
String is immutable. Value of String cannot be changed 

difference between == and boolean equal 

== :: if we are working it check the content if we are working with object it checks the address  

.equals( ) If operants are object it check the content if the content is same it will return true other wise false;

1) The string is immutable in the java and also in the javascript  
2) The string can be reassigned 
3) a)String.length()                 :::  gives the length of the string
   b) string1.concat(string2)        :::  string1 = "suman", string2 = " ram " => "sumanram" , concat() does not  
                                          actually change the value of the original string.
   c) indexOf()                      :::  "suman".indexOf("u") ==> 1 if there is no u then -1 is returned 
   d) charAt()                       :::  "suman".charAt(0) ==> "s"
   e) equals() / equalsIgnoreCase()  :::  "suman".equals("ram") ==> false 
   f) substring()                    :::  "suman".substring(1, 3) ==> "uma"
   g) toUpperCase() / toLowerCase()  :::   "ram".toUpperCase() ==> "RAM"
   h) string.compareTo(otherString)  :::  return -1 or 0 or 1 compare Lexicographically each and every char number 
4) toString()                        :::  method can be used as the function of the any class and can be over written as 
   @Overrider 
    public String toString(){
    return "this is the data of 
    the class   " + this.data
   }
5) enum  
                                     ::: it  are collection of the constant  by default it is static and constant 
  enum level {
      SUMAN,
       RAM, 

 }

 6) split                            ::: it will split the string and convert it into the array of the splited string factions 

                                         String[] ram = "suman is genius".split(" ") 
 7) join              ::    It is used to join the many strings into one string 
               example::   String a = "suman" ,  String b = "is " ,  String c = "the man" String d = String.join(" ", a, b,c) ==> "suman is the man"

               converting the arrays to string ::: String.join("", only one array)

8) Imp:: A<B<C<D................<Z     <a<b<c.....<z only for the char  there are symbols in between 
    so A = 65 and Z = 90 and a = 97 and z = 122 so there are 6 symbols in between 

9) string.toCharArray()=> it will convert the string to the arrays of char 
  "suman".toCharArray() => It will convert to ['s', 'u','m','a','n'];

10) trim() ::: " suman suma     ".trim() => suman suma // it will trim the front and back space;

11) String str1.equalsIgnoreCase(str2) => it will ignore case 

12) String a =  string.valueOf(any primitive data type ) ==> converts the char and other primitive  data types into string **imp**

13) "sumanis".replace('s', 't') = > "tumant"; // it will replace the char 

14) "welcome ram welcome".replaceAll("welcome, java");=> "java ram java"; // it will replace the string 


15) "welcome ram welcom".replaceFirst("welcome","java") => "java ram welcome" 

16) "welcome ram".subString(0, 5) => "welcom";

17) "welcome ram".subString(3)=> "ome ram"; 

18) "suman".toCharArray(); => {'s','u','m','a','n'} //It will convert the string to array of char 

19) char [] raw = new char[] {'s','u','m','a','n'} String s = String.copyValueOf(raw); // it will convert the array of primitive data into string

20) "summan".lastIndexOf('m') => gives the position of m from reverse
21) "suman".lastIndexOF("an") => gives the position of an from reverse
22) "suman".concat("tam") ==> "sumantam";
23) "suman ra".contains("ra") ==> it will give the boolean true // we are checking the string contains string or not 
24
STRINGBUFFER ::
string buffer represent group of character and each and each character will represent based on index value and string buffer is mutable 
StringBuffer sb  = new StringBuffer(); the initial capacity of string buffer is 16; 
after it reaches the initial limit of the 16 value then the next will be (initial length + 1) * 2

1) sb.append("siva"); :: it can use (array, string , character array,primitive data type ); it will convert all the data type to the string and store 

   sb.capacity() ==> will give the capacity not how many we have inside 
   sb.length() ===> how many character we have 
   sb1.capacity() ==> 16; 
   sb1.length() ==> 0 
   sb1.append(true); 
   sb1.capacity() ==> 16; 
   sb1.length() ==> 4;

2)  sb.capacity() ==> will give the capacity not how many we have inside 

3) sb.length() ===> how many character we have 
   sb => "ram"
4) sb.insert(1, "shiva"); ==> rshiva

5) sb.delete(1,  5);  from one to 5 inclusive deleted ==> "r";

6) sb.charAt(1) ==> 'r'

7) sb.deleteCharAt(0)=> r is deleted;

8) sb.ensureCapacity(2000)==> it will ensure/set  the capacity of the sb to 2000 

9) sb.trimpToSize() ==> it will remove the extra allocated memory space 
10) sb.substring(4,10)==>  it will give the sbustring from 4 and 10;
11) sb.substring()
12) although the default capacity is 16 we can do 
     StringBuffer sb1 = new StringBuffer(5);
     sb1.capacity() = > 5; 
     sb1.append("sumank");
     sb1.capacity() => 12; ==> 5 + 1 * 2;
13) 

STRING BUILDER::
 ===============================================================( Collections and data structure )================================================================================
                                                                      ===========
                                                                       COLLECTION  
                                                                      ============
              A)  SET                                              B)  LIST                                        C) QUEUE                   D) Map

==================================================================================================================================================================================

           1) HashSet                    =                      1) ArrayList x                        =            1) LinkedList  x    =   1) HashMap X
                                         =                                                            =                                =  
           2) LinkedHashSet              =                      2) LINKEDLIST  x                      =             2) PriorityQueue   =   2) LinkedHashMap x
                                         =                                                            =                                =
           3) TreeSet                    =                      3) VECTOR                             =                                =    3) TreeMap 

//   *** Imp *** if we do Collection<String> coll = new Set/List/queue   we cannot go  2 step down but only one step down on from the right on the left 
//        we can do Set<String> coll = new HashSet/ Linkedlist/ TreeSet but we cannot do Collection<String> collection = new LinkedList Error;;    


 ===========================================================================( Arrays in java )=================================================================================
Array ::: Advantages ::
 1) Homogeneous data are stored 
         2) Type casting is not required 
         3) Performance is High 



***imp *** one important thing is we have to import the array anad arraylist from the util of the java at the top of the program::
           array size is fixed and data stored is homogeneous 

****imp*** syntax::: DataType  arrayName = new DataType[size];
        when we declare int[] arr = new int[3] => [0, 0 , 0] it will be created since the default value of int is 0;

        when we declare String[] arr = new String[] => [null, null , null] will be created since the default value of string is null;

****Traverse*****
 TO traverse throught the array we can use for loop or we shorter version of the for loop for the arr 
 for(int i = 0; i < arr.length; i++){
   System.out.println(arr[i]);
 }
for( int a : arr){
   System.out.println(a); we only give the data types and array and we can traverse // but only for the display puropse since for 
                                                                                    //  storing index is needed 
}



        *******imp *******    if we tries to access the element beyond the size of an array ==> it will give the out of bound exception 
1) The array                   :::  in the java is  start with curly brackets 
   String[] name of the array  :::  it stores only the string and nothing else 
   int[] name of the array     :::  it only holds the integers 
2) one interesting fact        :::  the array in java is that array cannot be printed using System.out.println(name of the array ) ::: 
                                    it will only print the memory address of the array but does not display the array and what it has inside it 
  
3) To print the array          :::  we have to use toSting()  system.out.println(Arrays.toString(name of the array ));  
                                    but we can print individual index element in the array by println method.

4) But we can change or assign or manipulate the elements of the array using array[index] = what ever we want to change or assign 
5) To declare empty array we have to do is  
   int[] suman = new int[number of index in the array];
6) default values of the numberical array is 0;

     :: ARRAY DECLARATION TECHNIQUES :: 

 i) int[][] suman; // 2D array is declared 

 ii) int[][] suman = new int[3][4] // 2D array is declared which contain 3 arrays inside each of those containing 4 element of Ram kind; 

 iii) Ram[][] suman = new Ram[3][4]{{ram1, ram2, ram3, ram4}, {ram5, ram6, ram7, ram8}, {ram9, ram10, ram11, ram12 }}

 iv) Ram [][] suman = new Ram[][]{{1,2,3,},{4,5,6},{7,8,9}}; 
      suman = new Ram[][]{{4,5,6},{3,2,1}, {8,8,8}} // it is the reassignment 
 v) accessing the new element is  
     System.out.println(suman[0][0]) ===> will print 4; 
     suman[0][0] = 5 will change the element at 00 
6) name of array.length will give the length of the array 
7) The array in the java cannot be resized and new elements cannot be added 
8) So we need a flexible array whose length can be increased and that is called arraylist 
   // This code wont compile:
   ArrayList<int> ages;
 
   // This code will compile:
   ArrayList<Integer> ages; 

    ArrayList<String> toDolist = new ArrayList<String>(); // this is the proper way to declare the arraylist in the java 

9) ArrayList assortment = new ArrayList<>() ::: this types of the arraylist will take any types of the data in arraylist and even the mixed data 
                          since the nature of data is not specified in the begining. 
10)  arraylist.add( "name ")  :::    will add the name string at the end of the arraylist  
            if we needed to add the new information in the arraylist we need the index where we need to add it  
            arraylist.add(1, "suman") 
            all the other elements will get shifted to the right 
            if the index is not present then it will cause error.
11) ArrayList.size()       :::              will give the length or the size of the arraylist  
12) TO get a element at a specific index we need get() for the arraylist 
        ArrayList.get(2) ::: it gives the element at the index 2 of the arraylist 
13) ArrayList.set(1, "suman") :::To change the elements in the arraylist we need to use the set method 
                                it will change the element at index 1 to "suman "
14) Remove :: to remove element at a specific index we use ArrayList.remove(element we want to remove)
            note:: if we give the interger to the remove it will take this as the index of the element to be removed 
15) indexOf()::    to get the index of the element we needed to do is ArrayList.indexOf(element);

16) Looping through the array using for loop 
   for( type of data in the array  anyname : array ){
       System.out.println(anyname);
   }
17) Innitialize the arrayLists with many different things; 
    ArrayList<Types Of data> nameOfArrayList = new ArrayList<>(Arrays.asList(one, two , three, four, five, size))

18 **Imp**) The primitive data types cannot be stored in the arraylist ie we cannot store :: 
   char, double , int , float, long, short and byte in arraylist;

19) ArrayList.add( index, value)    ::: // add the new elements in the arraylist  

    ArrayList.get(index)            ::: // get the element at the index "index"

    ArrayList.getFirst()            ::: // get the first element in the arraylist  of elements 

    ArrayList.getLast()             ::: // it gives the last elements in the arraylist  of the elements 
  
    ArrayListList.get(index)        ::: // it gives the  elements in the arraylist  at the index ; 

    ArrayList.set(index , element)  ::: // it change or set the elements at index to given elements 

    ArrayList.size()                ::: // gives the size or the number elements of the arraylist 

    ArrayList.indexOf(element)      ::: // gives the index of the element in the arraylist 

    ArrayList.addFirst(element)     ::: // it add the element at the top of the arraylist  

    ArrayList.addLast(element)      ::: // it add the element at the last of the arraylist  
   
    ArrayList.remove()              ::: // it will remove and return the first element of the arraylist 

    ArrayList.remove(index)         ::: // it will remove the element at the index 
  
    ArrayList.clear()               ::: // it clears all the element in the arraylist 

    ArrayList.contains(elementName) ::: // it will return boolean

    ArrayList.add(integer)          :::will give error ; 

***imp*** arraylist can store the heterogeneous data but we have to decalre the generics as object List<Object> suma = new ArrayList<>() suma.add(1), suma.add("suman");
 ===============================================================================( 2D-ARRAY IN THE JAVA )========================================================================


   1) To declare the array 2 D array we need to do is int[][] 
   2) to delcare the 3 D array we need to do is int[][][] 


+====================================================================================( LinkedList )=============================================================================
1) The linkedList is similar to the arrayList in the declartaion and other functionality 
    LinkedList<String> nameOfLinkedList = new LinkedList<>(); 

2) Iterator<String> i = linkedList.iterator(); // it should have the same data type as that in linkedList  except map 
   while( i.hasNext()){
      System.out.println("the next element is" + i.next()); // It is available for all the data types that comes under collections 
   }

3) All the functions of the linkedList 

      linkedList.add( index, value)       ::: // add the new elements in the chain 

      linkedList.get(index)               ::: // get the element at the index "index"

      linkedList.getFirst()               ::: // get the first element in the chain of elements 

      linkedList.getLast()                ::: // it gives the last elements in the chain of the elements 
      
      linkedList.get(index)               ::: // it gives the  elements in the chain at the index ; 

      linkedList.set(index , element)     ::: // it change or set the elements at index to given elements 

      linkedList.size()                   ::: // gives the size or the number elements of the chain

      linkedList.indexOf(element)         ::: // gives the index of the element in the chain 

      linkedList.addFirst(element)        :::// it add the element at the top of the chain 

      linkedList.addLast(element)         ::: // it add the element at the last of the chain 
         
      linkedList.remove()                 ::: // it will remove and return the first element of the chain 

      linkedList.remove(index)            ::: // it will remove the element at the index 

      linkedList.clear()                  ::: // it will remove all the elements of the elements of the chain
      
      linkedList.hasNext()                ::: // it will give boolean if there is next element of not ; 

      linkedList.next()                   ::: // it will give the next elements 

      linkedList.previous()               ::: // it will give the previous element; 

      linkedList.hasPrevious              ::: // it will give the previous element; 


      ****vvimpor*** link<Data Type> nameOfTheList = new ArryList/LinkedList/anykind of list<data type>();
      ****vvimpor***  we cannot do linkedList/arraylist.add(1, ram); if initially the size of the list is zero // it will create out of bound error 
      instead we can do is linkedList/arraylist.add(ram) or .add(0, ram);

≈==========================================================================( DIFFERENCE BETWEEN THE ARRAYLIST AND THE LINKEDLIST )==================================================

      Incrementing to the next location in memory with the ArrayList  is considered faster than jumping to the next location via a reference in LinkedList .

Here are differences and advantages of ArrayList vs LinkedList, sorry for long answer.

LinkedList and ArrayList  are two different implementations of the List interface.
 LinkedListimplements it with a doubly-linked list. ArrayList implements it with a dynamically re-sizing array.

As with standard linked list and array operations, the various methods will have different algorithmic runtimes.

For LinkedList<E>

get(int index) is O(n/4) average
add(E element) is O(1)
add(int index, E element) is O(n/4) average      but O(1) when index = 0 <--- main benefit of LinkedList<E>
remove(int index) is O(n/4) average
Iterator.remove() is O(1) <--- main benefit of LinkedList<E>
ListIterator.add(E element) is O(1) <--- main benefit of LinkedList<E>
Note: O(n/4) is average, O(1) best case (e.g. index = 0), O(n/2) worst case (middle of list)

For ArrayList<E>

get(int index) is O(1) <--- main benefit of ArrayList<E>
add(E element) is O(1) amortized, but O(n) worst-case since the array must be resized and copied
add(int index, E element) is O(n/2) average
remove(int index) is O(n/2) average
Iterator.remove() is O(n/2) average
ListIterator.add(E element) is O(n/2) average
Note: O(n/2) is average, O(1) best case (end of list), O(n) worst case (start of list)

LinkedList<E> allows for constant-time insertions or removals using iterators, but only sequential access of elements. In other words, 
you can walk the list forwards or backwards, but finding a position in the list takes time proportional to the size of the list. 
Javadoc says "operations that index into the list will traverse the list from the beginning or the end, whichever is closer", 
so those methods are O(n/4) on average, though O(1) for index = 0.

ArrayList<E>, on the other hand, allow fast random read access, so you can grab any element in constant time. 
But adding or removing from anywhere but the end requires shifting all the latter elements over, either to make an opening or fill the gap. 
Also, if you add more elements than the capacity of the underlying array, a new array (1.5 times the size) is allocated, 
and the old array is copied to the new one, so adding to an ArrayList is O(n) in the worst case but constant on average.

So depending on the operations you intend to do, you should choose the implementations accordingly.
 Iterating over either kind of List is practically equally cheap. (Iterating over an ArrayList is technically faster, 
 but unless you are doing something really performance-sensitive, you should not worry about this -- they are both constants.)

The main benefits of using a LinkedList arise when you re-use existing iterators to insert and remove elements.
 These operations can then be done in O(1) by changing the list locally only. In an array list, the remainder of the array needs to be moved (i.e. copied). 
 On the other side, seeking in a LinkedList means following the links in O(n), 
 whereas in an ArrayList the desired position can be computed mathematically and accessed in O(1).

Another benefit of using a LinkedList arise when you add or remove from the head of the list, since those operations are O(1), while they are O(n) for ArrayList.
 Note that ArrayDeque may be a good alternative to LinkedList for adding and removing from the head, but it is not a List.

Also, if you have large lists, keep in mind that memory usage is also different.
 Each element of a LinkedList has more overhead since pointers to the next and previous elements are also stored.
 ArrayLists do not have this overhead. However, ArrayLists take up as much memory as is allocated for the capacity, 
 regardless of whether elements have actually been added.

The default initial capacity of an ArrayList is pretty small (10 from Java 1.4 - 1.8). 
But since the underlying implementation is an array, the array must be resized if you add a lot of elements.
 To avoid the high cost of resizing when you know you are going to add a lot of elements, construct the ArrayList with a higher initial capacity.


 ====================================================================================( SETS IN JAVA  )==========================================================================
 ================================================================================================================================================================================

 1) The set                  :::   any things that is collection of the unique of the  set of data is called set in the mathematics

    HashSet                  :::  1) It is a kind of set in java that does not take the duplicate value and it stores tha value using hasing method ie even if we add it will not 
                                     take it. 

                                  2) It store the values using methods  just like arraylist but one difference is set may not has the internal order 

                                  3) Since we do not have the internal order we cannot do hashSet.get(index ) and only way to get the elements from the set is iteration 
                         
                                      Set<Integer> names = new HashSet<Integer>(); 
                                        for( Integer name : names){
                                         System.out.println(name);

                                         }

::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::(  HashSet Methods  ):::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::: 


1) clear()                    :::  HashSet.clear()             // It removes all the elements in the hashset  

2) addAll()                   :::  HashSet.addAll(HashSet2)    // It will add all the elements from the HashSet2 into the Hashset  

3) removeAll(set1)            :::  HashSet.removeAll(set1)     // It will remove all the elements that are present in the set1 that are also present in HashSet

4) retainAll(set1)            :::  HashSet.retainAll(set1)     // It will delete all the other elements except the elements that are present in both sets 

5) size()                     :::  HashSet.size()              // It will return the size of the hashset

6) isEmpty()                  :::  HashSet.isEmpty()           // It will return the boolean true if its empty and false if it not 

7) contains()                 :::  HashSet.contains("ram ")    // It will return true if the set contains ram element

8) add()                      ::: HashSet.add("ram")           // It will add the "ram "

::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::( LinkedHashSet Methods)::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

  LinkedHashSet               :::  It extends from the Hashset and implements from the set ie it will implements everythings from the Set and selected from Hashset
                                         
                                          man.add("am");
                                          man.add("km");
                                          man.add("ym");
                                          man.add("hm");
                                          man.add("lm");
                                          
                                          
                                          suman.add("Ram");
                                          suman.add("Ramaan");
                                          suman.add("charam");
                                          suman.add("ramu");
                                          suman.add("ramayan");
                                          suman.add("ramji");
                                          suman.add("sardam");
                                          suman.add("Haram");
                                          suman.add("Mani");
                                          suman.add("susp");
                                          suman.add("karan");
                                          suman.add("suram");
                                          
                                          System.out.println(suman.size());
                                          System.out.println(suman.contains("ramji"));
                                          System.out.println(suman.remove("Ram"));		
                                          System.out.println(suman.size());
                                          System.out.println(suman.equals(suman));
                                          System.out.println(suman.isEmpty());
                                          System.out.println(suman.toString());
                                          System.out.println(suman.iterator());
                                          System.out.println(suman.addAll(man));
                                          System.out.println(suman.size());
                                          
                                          for(String value : suman) {
                                             System.out.println(value);
                                          }
                                          
                                       }

                                       // it will gives the following results 
                                          12
                                          true
                                          true
                                          11
                                          true
                                          false
                                          [Ramaan, charam, ramu, ramayan, ramji, sardam, Haram, Mani, susp, karan, suram]
                                          java.util.LinkedHashMap$LinkedKeyIterator@7de26db8
                                          true
                                          16
                                          Ramaan
                                          charam
                                          ramu
                                          ramayan
                                          ramji
                                          sardam
                                          Haram
                                          Mani
                                          susp
                                          karan
                                          suram
                                          am
                                          km
                                          ym
                                          hm
                                          lm


=================================================================================( COLLECTION METHODS  IN THE JAVA )==================================================================


1) BinarySearch               :::     Collections.binarySearch( arrays<Ram>/arraylists<Ram>/lists<Ram>, Ram seat, null  ) 
                                        // it will return value greater than 0  if it is found 
                                       // it will give -1 if  the set is not found in the list or collection

2) Shallow copy of list       :::    List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats)   
                                       //  it will make the copy of the arraylist in the constructor of the theatre 
                                       **vvimp** shallow copy means the seatsCopy shows to same place as the theatre.seats
                                        that means changes in the seatsCopy will change the theatre.seats;

3)ReverseList                 :::     Collections.reverse(seats)                          // it will reverse the original list and do not return the list


4) Shuffle                    :::     Collections.shuffle(seats)                         // it will shuffle the original and doesn't return shuffled list 


5) min                        :::     Collections.min(seats)                             // it will give the min value of the seats 


6) max                        :::     Collections.max(seats)                             // it will give the max value of the seats

***vvimp*** we need to apply the implement comparable and write compareTo method to compare so that we can we min, max, sort, reverserlist 

7) swap                       :::     Collections.swap(list, i, j)                         // here i and j are swapped and list actually changes 


8) copy                       :::     Collections.copy( seats, otherseats)                 // It makes the copye of seats  and 

9) Sort                       :::     Collections.sort(seats)                               // it will sort the seats according to the comparable  and original is changed


10) Sort                       :::    Collections(seats ClassName.staticMethod comparator) // It will sort according to the comparator 

11) comparator                 :::    if comparator is implemented and compare method is written then what we can do is classInstance.compare(Object one, Object two)
                                       //  classInstance is the instance of class where comparator is implemented 
                                       example :: 
****vvImp********

Implementing Comparable means "I can compare myself with another object." This is typically useful when there is a single natural default comparison.

Implementing Comparator means "I can compare two other objects." This is typically useful when there are multiple ways of comparing two instances of a type 
- e.g. you could compare people by age, name etc. 

but comparator can also be used in the same class whose two instances is needed to be compared  again important thing is we need to implement the comparator to use the compare and 
override it 
                  example ::  

                  class Dog implements Comparator {
                     @Override 
                     public int compare(object extends Dog one, object extends Dog two){ // either we need to keep the Dog or we need to put the extends or generic 
                     if(one.getAge() > two.age()){
                        return 1; 
                     } else if(one.getAge() < two.getAge()){
                        return -1;
                     } else {
                        return 0;
                     }
                     }
                  }

                  class Dog extends Comparabel {
                     @override 
                    public boolean compareTo(Object one){
                        return this.name.equals(one.getName())
                     }
                  }



11) Comparator              :::   static final Comparator<Seat>  NAME_FILTER = new Comparator<Seat>() {
                                       pubic int compare(Seat seat1, Seat seat2){
                                          return seat1.getName().compareTo(seat2.getName());
                                       }
                                    }

                                    public  main(String[]args){
                                       Collection.sort(theatre.seats, BinarySearch.NAME_FILTER);

                                    }
                     

                                           public class ComparatorDemo {

                                             public static void main(String[] args) {
                                                List<Person> people = Arrays.asList(
                                                         new Person("Joe", 24),
                                                         new Person("Pete", 18),
                                                         new Person("Chris", 21)
                                                );
                                                Collections.sort(people, new LexicographicComparator());
                                                System.out.println(people);
                                                Collections.sort(people, new AgeComparator());
                                                System.out.println(people);
                                             }
                                          }

                                          class LexicographicComparator implements Comparator<Person> {
                                             @Override
                                             public int compare(Person a, Person b) {
                                                return a.name.compareToIgnoreCase(b.name);
                                             }
                                          }

                                          class AgeComparator implements Comparator<Person> {
                                             @Override
                                             public int compare(Person a, Person b) {
                                                return a.age < b.age ? -1 : a.age == b.age ? 0 : 1;
                                             }
                                          }

                                          class Person {

                                             String name;
                                             int age;

                                             Person(String n, int a) {
                                                name = n;
                                                age = a;
                                             }

                                             @Override
                                             public String toString() {
                                                return String.format("{name=%s, age=%d}", name, age);
                                             }
                                          }
   Different method of comparator :::  Collections.sort(lists , new Comparator<Dog>() {// instead of makeing public  static method and then passing that symbol(all capital)
                                                                                       // just like we did above it is more convenient
      @Override 
      Compare( Dog dog1, Dog dog2){
         if( dog1.getAge() > dog2.getAge()){
            return 1; 
         } else if( dog1.getAge() < dog2.getAge()){
            return -1; 
         } else {
            return 0;
         }
      }
   } )
======================================================================( MAP IN THE JAVA )================================================================================

    MAP                    :::   It is just like the hash in the ruby  which take the key and value pair. Just like the lists maps also do not take the primitive data type
                                   as the keys or value 
                                 if we want to add the primitive data type in the map then we have to do autoboxing  like Map<Integer, Integer> sum = Map<Integer, Integer>
                           :::   There are different types of map in java  they are          
                                                                                     1)  HashMap 

                                                            
                                                                                     2) TreeMap 
                                                            
                                                            
                                                                                     3) LinkedHashMap 

Map
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::(  HashMap  ):::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
   

1) Declaration            ::: Map<String/key , String/value> suman = new HashMap<String, String>(); 

2) Add                    ::: suman.put("suman", "suman is the best he is genius"); 

3) Replace by add         ::: suman.put("suman", "suman is genius"); // it will return the previous value of the value  replacing the previous value assigned to the key "suman"

4) Check key              ::: suman.containsKey("suman"); // it will return true or false; 

5) replace                ::: suman.replace("suman", " suman is ram "); // it will replace the value of suman 

6) replace                ::: suman.replace("suman", "suman is genius", "suman is supreme genius"); //It will search key suman and value suman is genius exactly then replace the value 

7) get                    ::: suman.get("suman") // it will return the value stored with the key suman;

8) keysets()              ::: suman.keySet(); // will give the sets of the keys in the suman 

9) Iteration/keysets      ::: for( String key : suman.keySet())  {
                                 System.out.println("keys in the suman" + key +": have the value " + suman.get(key));
                               }   

10) remove(key)           :::  suman.remove("suman")     // it will return the value removed if it find the matching key;

11) remove(key, value)    ::: suman.remove("suman", "suman is the best he is genius"); // it wil return boolean if it has the matching key and values 

**** VVImp *** In  HashMap and HashSet if we are Storing our own class as keys then we need to override the equals method given and also write the HashCode() method
since the keys are hashed to get the unique identities of the buccket or the index where they are saved and fetched so functioning specially comparing will not be 
effective if not over written 

                                    Usually for the Object the eqauls method ::: 

                                    public boolean equals (Object obj){
                                       return (this == obj);
                                    }

                                    @Overriding 
                                    public boolean equals (Object obj){
                                       if( this == obj){
                                          return true;
                                       }
                                       we have to write how we want to compare two object with name etc ;

                                    }

                                    @Overriding 
                                    public String HashCode(){
                                       this.name.hashCode() + 45 + this.bodyType.hashCod(); // 
                                    // it will insure that the hash will generated using the name and 45 will make the last things is number and unique;
                                    // other wise it will compare the object put it in the same bucket to store the value 
                                    }


:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::(  LinekdHashMap  ):::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::

LinkedHashMap     :::  It is just like the hashmap add the data by sorting the data. Taking keys in consideration for the sorting. It will take key and values just like hashmap 
                       It extends from the HashMap and implement from map.ie it will have all the methods of HashMap and map 


                       public static void main(String[]args) {

                              Map<Integer, String> suman = new LinkedHashMap<>(); 
                              suman.put(12, "suman");  suman.put(21, "Ruman"); suman.put(13, "man"); suman.put(14, "sum"); suman.put(41, "aan");  suman.put(51, "raman");
                              suman.put(61, "kaman"); suman.put(71, "sun"); suman.put(100, "none"); 
                              
                              boolean b = suman.containsKey(41); 
                              System.out.println(suman.replace(12, "jump"));
                              System.out.println(suman.get(12)); 
                              System.out.println(suman.remove(13,"jman")); 
                              System.out.println(suman.remove(12,"man")); 
                              System.out.println(suman.keySet()); 
                              System.out.println(suman.isEmpty());
        
                                 for( Integer key : suman.keySet() ) {
                                 System.out.println(suman.get(key));
                                 }
                                 suman.clear();
                                 System.out.println(suman.isEmpty());
                              
                               }

                               // The result of the above method is as followas 

                              suman 
                              jump
                              false
                              false
                              [12, 21, 13, 14, 41, 51, 61, 71, 100]
                              false
                              jump
                              Ruman
                              man
                              sum
                              aan
                              raman
                              kaman
                              sun
                              none
                              true


  
:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::(  TreeMap  ):::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
TreeMap ::: Tree map has the key value pair just like hashMap and it has internal data stored in the ascending order according to the entrySet or keys 
            It doesn't use the hashing function 

             SortedMap<String, Integer> suman = new TreeMap<>() // it extends from sortedmap and implements from map
=================================================================( FUNCTION IN THE JAVA )======================================================================================
1) Functions are the list of the statements and expressions that takes the input as parameters and return something; 
   syntax of function in java is 

    public (static) void/int/String/double funtionName(parameters){
       return or not return 
    }

    a) we cannot use the same name for two  functions in the class or package and also have the same kind or number of the parameters 
    b) if name of the function is same and the parameters are different it is called method overloading;

2) Final function () {

} // the functions with final infront of them are not overrideen in the child class 
======================================================================( loops in the java )============================================================


1) for loop:: for( int i = 0; i < 12; i++){
 a)  break and continue::                  // break will  only break the one loop 
    break will break the for loop and  
    continue will skip it to the another iteration 
    }

 important :: first it will check value of i then it will chek if i smaller than 12 or not then go for the execution  then only it will go for i increment 
              so in for loop it doesn't matter ++i or i++ 
****Important note *************
      int test = 0;
	   for(System.out.println("suman"); test <=6; System.out.println("hello")) {
		   System.out.println("ram");
		   test++;
	   }

      suman // it will be run just once and increment and condition check is done after each iteration;
      ram
      hello
      ram
      hello
      ram
      hello
      ram
      hello
      ram
      hello
      ram
      hello
      ram
      hello

              
2) while loop ::  int num = 0 , while ( num < 9 ){
     num ++ ;
   } 



3) for each loop ::  


4) if  Loop  is ::  boolean ?  true do this : false do that ==> boolean ?  true ? this : that  : false do that 
 But only thing seems to be working in the java is  to equate it to variable and execute those or put the function that return something there;
Ram ram = (inFo) ? (ram.shyam("hari") ? ram1 : ram2): ram3; // return value of the every expression should be Ram;
 note :: we cannot use the expression or statement inside the ternanry expression we should only write things we need to return; but we cannot 
 use direct return statement

   imp :: the condition should be boolean and inside the if statement there shoud be at least one statement ie  any thing ending with ; other wise it will give 
      *** compilation error ***
   important :: if there are multiple statements inside the if or  else loop we need curly brackets if we only have one statement then we  can ingnore curly satement 

5) do {

    } while (condition); // loop runs for  least once even if the condition is not satisfied 

6) Switch Loop::  
    format ::: 
    byte/ int /short / String / no long and double  ra = 50;
    Switch () {
      case 50: 
           System.out.println("hello weekend bro")
           break; 
      case 40:
           System.out.println("hello weekend bro")
           break;
      case 40: // no duplicate case 
           break;
      default: 

    }

======================================================================(  METHODS IN JAVA  )============================================================

vvv imp make this all about the classes note remodel this 

1) The sets of statements which are set of expressions that perform certain tasks 
2) Syntax of function is 

 pubic/private/proteccted (static) void/int/String functionName ( parameters){
    // java function does not need to return anything if the void is written on it;

 }
 3) there are two types of function in the java static and instance  
   static :: function:: Static  make the associate to the blue print of the class. 

                       a) Static functions are avaiable inside the static methods without doing className. within the class 

                       b) Static functions are avaiable outside the class it belongs using className.functionName();

                       c) Static functions are avaiable inside instance of function within its own class of origin by doing className.
                           class Dog(){
                             public void print(){
                               System.out.println("dog is faithful animal");
                            } 

                            public static void print1(){
                              Dog.print();// static function are availabe inside the instance function
                            }
                          }
                 // inside main 
                 public static void main(String[]args){
                    Dog puppy = new Dog("ratty");
                    puppy.print() // dog is faithful animal;
                    Dog.print1() // dog is faithful animla 
                 }

                 d) static variables and instance varialbe both are availabe inside the instance function :::
                   class Dog(){
                      public in su = 45; 
                      public static String n = "name"; 
                     
                     public void name(){
                        System.out.println("her is  static variable "+ n + su); // both static and instance variables are availble in the instance function without using
                        // the className.varialbeName; 

                       }
                     public static void kaam(){
                        return n + su //:: Error::instance variables are created only at the time of instantaion so su doesn't exist yet
                        return n :: // we do not need to do className.n since it is static function;
                     }
                   }

                   e) But we cannot access the instance varaible and function from the static function since they are created at the instantation.
 4) Instance function are not availabe inside the static methods within the class  but they are available once instance of class. is done 
    
   inside the other instance function we need to do this. which is optional sometimes 
5) static {
   any code // any code inside the staic block is called first then non static methods after the initialization 
}


=========================================( OBJECT ORIENTED PROGRAMMING AND CLASSES IN THE JAVA )======================================================

oops::: 

========================::::polymorphism:::============== 

method over loading ::: run  time // the method is same but the number or the nature of arugments or both are different 

method over ridding ::: compile time 

Constructor :::  It is a type of function that is used to initialize an object from a class 


 a) Default constructor:: a constructor who doesnt have a parameter is called as default constructor 
     It is used to initialized the value inside the object 

 b) Parameterized constructor:: a constructor who have  parameters is called parameterized constructor 

 c) Copy constructor :: a constructor which copy the value from one object to another object is called copy constructor 
 


1) a)  One of the difference between the javascript and java language is that in javascript everything is object model and object is the original
      blue print for all other things. Even the class and function are a special kind of object in the javascript 
      where as in java class is the original blue print and object  is special kind of class   which is interesting 
   b) every java class need its own files and only one will will need the main function.
2) Method :: it is the set or collection  of instructions in the java that is used to perform certain operation. 
   main is the entry point of the any programs in the java. void 
   way to declare the method in the java is:::

    public void  nameOfMethod(types of parameters parametersname){
        
   } 
   public void main() is the main method in the java program from where the java start running 

   public :: means it is publically accessible 
   void :: means there is no specific output of the method 
   nameOfMethod:: is the name of the method 
   parametersname:: is the name of parameters used and types gives what primitive and non premitive data types are used 
   signature of the method is the name of the method with parameters  

   there are two methods static and non static methods  :: 
   static methods can be used inside the main method without className.
 3) every java program has at least one class 


                                   ::HOW TO USE THE INHERITANCE IN THE JAVA :: 
   1)  public class Language { // public is access identifier and class defines it is a class, each class needs it own files 
         String name; 
         int numSpeaker; 
         String region; 
         String order; 
         public Language(String name, int numSpeakers, String region, String order){   // name of class = name of file = name of constructor 

               this.name = name; 
               this.numSpeaker = numSpeaker; 
               this.region = region; 
               this.order = order; 
         }  
     }


     public class  Nepali {
        public Nepali( String region, String order){ // we have alreday decided the name and number of speakers so we do nott expect
           super( "nepali ", 50000000, region, order) // if something is fixed then we send it to super since super expect and also the things 
           // we need from user the moment in nepali class is initiated

        }
     }
   2) EXTENDS  ::: we use extends to  use the inheritance in the java and even if we dont make call to parents constructor using super java does it for us 
   3) OVERRIDE :::  a)if we over ride the method in the child class we need to write @Override before writing the method in the child class 
                      and we have to have same name and exactly same or higher accessor infront of the name (public etc )
                    b) The to override both the child and parents class function should have same parameters ;
                    c) It can have different or similar return types; 
   4) SUPER    ::: super is called in the child class, super refers to the parent class just like this refers to the present class; 
                   1) to call the function that we need to execute if the child class is initiated then we need to do 

                      super.functionName(parameters);
                   2) super( parameters ) should be the first things or line in the constructor of the child class 
                     if not the super is called nonetheless but without parameters 

   Classes :: classes are the special kind of objects that are  blue print for collection of parameter and the function to be carried out
   class has many parts as follows: 

   constructors: : they are kind of special funtion that helps us to carry out the things that we wants to be done during the 
   initialization of the class 
   1) classes can have more than one constructor depending upon the number of parameter to be passed to the constructor;

   class Person(){
      public Person(){
         this("suman", 45);// this is the sepecial use of the this to call the constructor with parameters;
      }
      public Person(String name, int age);// we can have more than two constructor if the we are using different parameters; 
   }
   classMethods:::  getClass().getName() will give the name of the class if we type this syntax under the function or class
  =====================================================================================(:::INTERFACES:::)==========================================================================
  Interface ::: it is just the contract or the strict instruction that the methods and the variable formats of the class that implements the interface doesnt change that much 
                a) by convention we start the name of the interface with the I letter  
                b) we only define the methods that need to be included or by the class that implements the interface but not write the code note:: class should implements all 
                   functions
                c) if is better to start the the method with void or the return type but to leave the access modifier in the class itself 
                d) we have to define the return type function and the parameter in the interface 
                e) Just like like the extends we write the implements to make the interface 

*** important *** every variables inside the interfaces are by default static and final  ie we can do InterfaceName.constantName inside the static methods and also instance methods
      public interface  
    ================================================================== :::example of the interface:::=============================================================================
     package Interface;
     import java.util.List; 

     public interface ISaveable{
            public String name; // these variables in the interfaces are always final and static by default ie same copy goes to classes implementing it 
            List<String> write();// these are the three methods without the accessor that any class that implements Isaveable should include all of them 
            List<String> read(List<String> list); // we can write the public private protected but that should be decided by the implementing class;
            String getName();

      }
     
      package Interface;
      import java.util.List;
      import java.util.ArrayList;
      public class Player implements ISaveable{// the Isaveable is implemented 
         // write code here
      private String name; 
      private String weapon; 
      private int hitPoints; 
      private int strength; 
    
      public Player(String name, String weapon, int hitPoints, int strength){ // class can have its own construtors and everything it wants as long as it implements all methods in 
    // ISaveable 
            this.name = name; 
            this.weapon = "Sword";
            this.hitPoints = hitPoints; 
            this.strength = strength; 
        
      }
    
       public String getName(){
        return this.name; 
       }
    
       public String getWeapon(){
        return this.weapon; 
       }
    
       public int getHitPoints(){
        return this.hitPoints; 
        
      }
    
    public int getStrength(){
        return this.strength;
     }

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(1, this.name);
		values.add(2, this.weapon);
		values.add(3, this.hitPoints); 
		values.add(4, this.strength);
	}

	@Override
	public List<String> read(List<String> list) {
		// TODO Auto-generated method stub
		return null;
	}
    
   public static void main(Strings[] args) {
     Isaveable  isa ;
      isa   = new Player("suman", "sword", 45,67); /// this is one way to declare instance of Player class;
     or Isaveable isa = new Player("suman", "sword", 45, 67); // this is another way to declare instance of Player class;

     isa.Only the functions that are declared in the Isaveable;
     
     if we want to use the function or the methods that are not declared in the Isaveable the we need to use 

     Player p1  = new Player("suman", "sword", 45, 67)
      then p1.getWeapon(); 
           p1.getName(); 

      or another way is to write in the manner (Player (isa)).getName() or (Player(isa)).getWeapon(); // this is the other way to use the methods unique to that class 


   }

   Difference between this and super 

   this. ::: it is used to call the instance variable and instance function of a child class or the class we are working on 
   super. ::: when used in a instance class will refer the parent class and  super is used to differentiate the which function we are calliing 

   having same name wether it is parent or child function with same name 

   this()  ::: it is used to call the constructor from another constructor but we can only use only once ie from one constructor we can call 
   another constructor only once 

   super() ::: It is used to call the parent constructor from child constructor   


   class B {
      public B(){
         System.out.println("This is parent constructor");
      }
   }

   class A extends B {
      public A(){
         // hidden super() is always there
         System.out.println("this is child constructor");
      }
   }

   A a = new A(); first the super constructor will execute then the child constructor will be executed 

   ** imp ** 1) if the super class have the parameterized constructor then it is mandatory for child class  to have a parameterized constructor 
                or privide the artificial value it will create a compilation error 
class B {
   int i ; 
   int j 
   b(int i , int j ){
     this.i = i; 
     this.j = j; 

   }
}

class A  extends B {
   A(){// error since the parent constructor is parameterized but the child constructor is not parameterized 

   }

//    what we can do is 
//  
A(){
   super(1, 2) // provide the artificail values  and it wil work fine 
}
}
   ============================================================================( INNER CLASSES IN THE JAVA  )=====================================================================
   1) Inner classes have access to all the variables and function of the outer class but we can have the same name for the variables inner and outer since things in inner classes 
     are not availabe outside that class but we do not use same name to remove confusion
    EXAMPLE OF INNERCLASS  :::: 
                               public class Animal {
                                  String name; 
                                  String class; 
                                 public Animal(name, class){
                                    this.name = name; 
                                    this.class = class;
                                 }

                                 public class Behaviour{
                                    String behave; 
                                    public Behaviour(behave){
                                       this.behave; 
                                    }

                                    public void  act(){
                                       System.out.println(name/* this.name will confuse the program since this means current class which is 
                                       Behaviour class to solve the problem what we can do is just keep name */ + "is showing " + this.behave)
                                    } 
                                 }
                               }

   CALLLING THE INNER CLASS IN THE MAIN ::: 
                                       public static void main(String[]args){
                                          Animal dog = new Animal("dog","mamal"); 
                                          Animal.Behaviour cry = dog.new Behaviour("bark"); // it means Behavoir class is inside the Animal class and we can only 
                                          //have Behaviour class  once the dog is instanciated;
                                          cry.act(); // it will give dog is showing bark;
                                          
                                       }
   SMART WAY OF GOING THIS IS ::  public class Dog {
                                    String name;
                                    public Dog(name, title){
                                       this.name = name;
                                       this.friends = new Friends(title)
                                    }
                                      public class Friends(){
                                         String groupName;
                                        ArrayList<D extends Dog> friends; 
                                        public Friends(String groupName){
                                          this.groupName = groupName;
                                           this.friends = new ArrayList<>();
                                        }
                                      }
                                    }

                                    we can create many function that will ultimately call inner class function to store name and friends and edit 
   ===================================================================(  ABSTRACT CLASSES IN JAVA )===================================================================================
   intro:: in short abstract classes are the classes that we cannot make an instance out of them ie we cannot instantiate abstract class just like interface 
  1) The abstract classes are just like the interfaces that gives the sets of values and function that child classes that inherits from them will need to implement 
  2) all the function and methods that are not defined or coded need to have the abstract identifier so that it does not cause the error 
  3) unlike interface , abstract class can have constructor and the all the instance variables  and even all the fully coded functions 
  4) again all The access modifier can be used in the abstract class but it cannot have the private access modifier
  5) abstract classes are just like the super class and child class have same access and process as in parent class with the abstract class only difference is the methods or 
    function marked as abstract should be implemented in the child class that inherit from the abstract class::

  6) if sub class or child class of Abstract class do not implement all the abstract methods then it has to be declared as abstract 
          public abstract class Animal{
              public (not private) String x1; 
              public (not private) String x2;

              public Animal(String x1, Stringx2){
                 this.x1 = x1; 
                 this.x2 = x2;
              }
              abstract nature of return / void getThis();
              abstract nature of return value/ void  move();
              abastract nature of return value / void  eat(); 

              public void ram(){// it is regular function 
                 System.out.println(" the ram is ram" );
              }
          }

          public class Dog extends Animal{
             string y; 
             string z;
            
            public Dog(String x1, Stringx2, String y, String z){
               super(x1, x2); 
               this.y = y; 
               this.z = z;

            }

            @Override 
            pubic return type getThis(){

            }

            public return type move(){

            }

            public return type eat(){
               
            }

          }

      Dog dog = new Dog( ,,,,,,); 
      we can use all the functions in both of the classes; 

      Note :::  if the method is invoked in the child class then the jaca will look for the method first in the child class then if it is not found then it will go to super 
       public abstract class Ram {
                  String name;
                  public Ram(String name) {
                     this.name = name;
                  }
         
                  public String getName(){
                     return name;
                 }
         
                 public boolean setName(String name) {
                   this.name = name;
                    return true;
                }
         
                 public abstract void  print();
		 
}

       
        public class Shyam extends Ram {

       	public Shyam(String name) {
	       	super(name);
       	}

	     @Override
	     public void print() {
	     	  System.out.println(super.name + "is the best things "); or we can write (this.name + "is the best things ")// it gives same result 
		
       	}

}
  ===================================================( variable and constant declaration and assigning and reassigining IN THE JAVA  )=============================================



  1) It seems java variables can be reassigned as much as we like  

  2) array in java can only hold one type of a data and wether it is double, int, String , object or any other data reference  unlike javascript 
    which can hold the mixer of data reference 
  3) to declare the array we have to 
      double[] name of the array   :::    it holds the doubles 
      String[] name of the array   :::    it holds the Strings 
      int[] name of the array      :::    it holds the integers 

  4) local variable                :::    These are the variables that are declared inside the methods and they cannot be used outside the method and 
                                          we dont use private or public 
  5) The Instance variable         :::    are the variables that are  declared inside the class but above the all the methods and constructors  but without "static" infront of them 
     a)  Instance variable         :::    can be readily availabe inside the constructor but to access the instance variable outside the constructor we need to do this.instanceVariableName

  ===================================================( variable and constant declaration and assigning and reassigining IN THE JAVA  )=============================================

1) non-static variable :: JVM will give the default value to the non-static variable as null 
2) non-static variable :: connot be accessed from the static method directly  but through the object or instance of the class 
3) Instance varaible are not shared that is each and every object of a class have seperate memory 

class Ram {
   int age; 
   string name; 

   public static void main(String[] args){
     Ram r = new Ram() // it will have age and name with the default value or what ever initial value they are given 
     Ram s = new Ram() // it will have age and name with the default value or 

     //  when we make an instance or object of a class they will have a seperate memory with unique hash memory 
     // if  instance variables are given  initial values then that initial values will be shared to evey single instance just for once at the time of instantiation then if the 
     // then if we change in one object other object  variable do not change 
   }

}

static variable :: static variable and the static methods can be accessed from the static methods directly 
                   
                   static variable cannot be declared inside the method ( both non static and static ) they can only be declared inside class 

                   static variable and static methods can be accessed directly from non static method 

                   static is shared between class and also all the instance of the class since. once the class is made one memory is constructed to keep the static variable and 
                   static function then it is referenced ever since 
                   so if static varialbe is changed by accessing from one  instance of the class then that instance variable is changed for all other instance of class 
                   since every instance is pointing to same static varialbe 


                   class Book {
                     static String genre = "horror"; 
                    

                     public static void main(Strings[]args){
                        Book book1 = new Book();
                        Book book2 = new Book();
                        book1.genre = "romance"

                       print  book2.genre // will give romance 
                     }
                   }


     


 ===================================================( SCOPE ENCAPSULATION AND SCOPE IN THE JAVA  )==================================================================================
 
 
 
 There are three types of variables.

    1) non-static Instance Variables :: these are the variables declared inside the class and out side the all the methods. 
                               scope of the instance variables is everywhere in the class except static methods 

    2) Class Variables :: A variable which is declared inside a class, outside all the blocks just like instance variables and 
       is declared as static is known as class variable. 
       Scope of the class variable is everywhere even inside the static methods 
    3) Local Variables::All variables which are not instance or class variables are known as local variables. the scope is inside the block 
       or the curley brackets they are declared 
       public class scope_and_lifetime {
            int num1, num2;   //Instance Variables
            static int result;  //Class Variable
            int add(int a, int b){  //Local Variables
                num1 = a;
                num2 = b;
                return a+b;
            }
            public static void main(String args[]){
                scope_and_lifetime ob = new scope_and_lifetime();
                result = ob.add(10, 20);
                System.out.println("Sum = " + result);
             }
            }
     4) Public ::: accessor will make things accessible to the other class and within the class except the static methods 
     5) private ::: private accessor will make it restricted to the class only   
        a) If the class instance variable and the method are private they are only availabe with in the class only and not outside the class 
        b) But private methods and variables can be accessed within the class 
       
       Modifier               Class                   Package                  Child class                   Global  

       public                   yes                     yes                       yes                           yes 

 
       protected                yes                     yes                       yes                            no 


       no modifier              yes                      yes                       no                            no 


       private                  yes                      no                        no                            no 
     6) this ::: a) this in the javascript is used to reference the instance variable, this generally and usually means the instance of class 
                 b) this is used to call the constructor in the methods ::: this.constructorName
                 c) this is used to call one instance method into another 
     7) static ::: a) static methods are similar to the class methods in other language that are accessed by putting dot in in the class instead of 
                     the instance of the class 
                   b) mainly the utility are the static methods 
                   c) static variables are like the class  variables in other programming languages that are availabe on the class as well as on the instance 
                    of the class  unlike static methods which are not availabe in the class.
                   d) static ::: static variables in side the instance method are readily availabe just use as it was normally 
                                 but instance variables inside instance require this. 
                                 but static variable inside inside static methods need not be using className. or it will be error 
                     
                   only if we need to use static method  inside the static method  or any other method need to put className.
                   Static methods and variables are associated with the class as a whole, not objects of the class.
                   Static methods and variables are declared as static by using the static keyword upon declaration.
                   Static methods cannot interact with non-static instance variables. This is due to static methods not having a this reference.
                   Both static methods and non-static methods can interact with static variables.
                                                      public class ATM{
                                    // Static variables
                                    public static int totalMoney = 0;
                                    public static int numATMs = 0;

                                    // Instance variables
                                    public int money;

                                    public ATM(int inputMoney){
                                       this.money = inputMoney;
                                       numATMs += 1;
                                       totalMoney += inputMoney;
                                    }

                                    public void withdrawMoney(int amountToWithdraw){
                                       if(amountToWithdraw <= this.money){
                                          this.money -= amountToWithdraw;
                                          totalMoney -= amountToWithdraw;
                                       }
                                    }

                                    // Write your averageMoney() method here
                                    public static void averageMoney() {
                                       System.out.println(totalMoney / numATMs); /*the static variables  are used inside the 
                                       static methods but className. is not used infornt of them */

                                    }
                                    public static void main(String[] args){

                                       System.out.println("Total number of ATMs: " + ATM.numATMs); 
                                       ATM firstATM = new ATM(1000);
                                       ATM secondATM = new ATM(500);
                                       System.out.println("Total number of ATMs: " + ATM.numATMs); 

                                       System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney);  
                                       firstATM.withdrawMoney(500);
                                       secondATM.withdrawMoney(200);
                                       System.out.println("Total amount of money in all ATMs: " + ATM.totalMoney); // while inside main use classname.   

                                       // Call averageMoney() here
                                       ATM.averageMoney();
                                    }

                                    } 
                   e) Static Math class:: it contains all the major math operation in the java  
                      1) 
        8) The static methods of one class are available in the classes within the packages by doing className.InstanceOfClassName();
            Instance Methods are also avaialbe to other classes in the same packages once we do instanceOfClassName.methodName();


===========================================================( INPUT FORM THE CONSOLE IN THE JAVA  )================================================================
** scan.next() vs scan.nextLine() ==> nextLine() will take space as input but next() will not take space as intput no matter how much we press Enter
1) TO open the gate to accept the data form the console we need to start the scanner 

    Scanner scanner = new Scanner( System.in) // the portal is started to reveive the input form the console 
     String suman = scanner.nexLine(); 
     int num = scanner.nextInt();  // do receive as many things as we want from the console again 

    scanner.close(); // The portal is closed otherwise it remains open 
   
2) extra scanner.nextLine() to receive enter statement as an input; 

3) scanner.hasNextInt() checks if the entered line is int or not and return boolean true if int false if other data;
4) scanner should be closed inside the program it is opened before the return statement other wise the program cannot reach there..


=======================================================( DIFFERENCES BETWEEN THE JAVA AND JAVASCRIPT )===================================================


1) java is class based  program and everything is derivative of class  even the object is derivative of class 
   where as ::: in javascript the oject is the basis of everything even the function  that means function is special kind of first-class object 

2) In javascript there has to be return statement that means javascript function return something even if there is no return statement it 
return defualt null; 
where as ::: the java function needs to predetermined what if wants to return and it can have desing to not return anything by writing void 

3) In java we can do the method overloading but not in the javascript since number of the parameters and their nature is fixed in java but 
 we can give as many parameters as we wants in the javascript and not even the nature of the parameters is fixed in javascript


 ===========================================================( MATH PACKAGE   IN THE JAVA  )================================================================
1) Math.round(8.1) ==> 8; 
2) Math.PI ==> 3.14
3) Math.sqrt(number or expression); // square root of number or expression; 
4) Math.pow(number, 5); // number to the power of 5;
5) Integer.parseInt("45");  // it will return 45 as integer;
6) String.format()


CASTING  :: IT IS CONVERSION OF ONE DATA TYPE TO ANOTHER 1) IMPLICIT CASTING :: CONVERSION BY JAVA DURING COMPILING 2) EXPLICIT CASTING:: WE CARE CONVERTING DURING PROGRAM WRITING
PREFERANCE :: FIRST STAIC BLOCK THEN STATIC METHODS THEN INSTANCE BLOCK AND INSTANCE METHOD


================================================================================( JAVAFX )===================================================================================
1) The alertbox in the javaFx is called the stage and it is the outer most box and then inside stage there is scene  
    public void start (Stage stage)  throw IOE exception {
       stage.setTitle("The title of the stage "); 
       stage.show();               // the show will only start after we do the show() at the very last 
       stage.setX(500);            // it start to position the stage from the left top corner 
       stage.setY(100);            // it sart  to position the stage in reference to Y from the right top corner 
       stage.setWidth(600);        // it will set the width of the stage 
       stage.setHeight(300);       // it will set the height of the stage
    }
2) Everything that is to be done wether the function or the buttons and all the application should be done inside the scene 
   Scene scene = new Scene( ) // scene itself is nothing but we need insert some GUI inside it to be desplayed be it text or other screen , 

   Vbox vbox = new Vbox(); 
   Scene scene = new Scene(vbox);

3) event itself run on the UI thread 


4) In the controller the what ever the nature of the tab is there in the FXLM is there the constant or the variable will have the same designation 

    for example :: 
    <Button fx:id = "123">
    <Button/>
    <List fx:id = "34"><List/>
    public class Controller {
       private Button 123; 
       private List<TodoList> 33; // because the TodoList is the object we are inserting in the list in the FXML file
    }



===========================================================( EXCEPTION  IN THE JAVA  )====================================================================================
***VVImp*** The errors and exception in the java are all inbuilt and our task is just to recognize the error and use the try catch 

1) Each exception is the subclass of the some bigger general exception  class  and thus keep searching the exact  child class for the exact error case 

2)    try {

      }catch(Exception e){
      System.out.println(e.toString()); // this will probably catch the all most all exception of the java program but the point is not catching   
      
      } // The point is knowing the exact error and then keep the program running avoiding that part since the progarm will stop at that point of exception
3) 
     try {
     Divider(0, 3);
     Divider(5, 0);
     } catch(RuntimeException e){
     System.out.println(e.toString());
    }
    }

    public static void Divider ( int x,  int y){
    try {
        System.out.println(x / y);
    }catch(java.lang.Exception e){
    throw new RuntimeException();// we can throw all the error we want. ie the error we throw is perceived as the actual error created and at come point we can catch that error
    }
    }

    4) we can have mutliple catch phrase at a place 

      public static void Divider ( int x,  int y){
    try {
        System.out.println(x / y);
    }catch(ArithmeticException e){
    throw new ArithmeticException();// we can throw all the error we want. ie the error we throw is perceived as the actual error created and at come point we can catch that error
    } catch(RuntimeException e){
       throw new RuntimeException();
    }
    }


    5) INPUT and OUTPUT 
         0,this is the number 0
         1,this is the number 1
         2,this is the number 2
         3,this is the number 3
         4,this is the number 4
         5,this is the number 5
         6,this is the number 6
         7,this is the number 7
         8,this is the number 8
         9,this is the number 9 // it is the data stored in the file name suman.txt
     
    Writing File using Filereader     :::  FilerReader book = new FileReader("file.txt"); // it can create any type of file in the same folder where the program is written 
                                           book.write("ram is the best man "  + ","  + " 123 " + "hero"); // it will write inside the file file.txt;
                                           book.close() // book need to be closed at the last of the operation. Without that other operations  will be not be carried out.


   Reading the data form the file     :::  Scanner scanner = new Scanner(FileName) // Scanner scanner = new Scanner("suman.txt"); 

                                           scanner.useDelimiter(",") // it is not need but it is the way to tell that from bigining to the comma it is int 
                                                                 // scanner read a single line at a time 
                                           while (scanner.hasNext()){
                                           int num = scanner.hasNext();   // if  we do just string all = scanner.nexLine() it will print everything as string
                                           scanner.skip(scanner.delimiter()); // it will other wise print the delimiter 
                                           String description = scanner.nexLine() // it means after the delimiter whole line is string 
                                           }
   Reading using the BufferReader     :::  Scanner scanner = new Scanner(new BufferReader(new FileReader(FileName))) // it has same function as the file reader but internal 
                                                                                                                     //working might be different
   Regular expression or regrex in the java is given by:: 

      abc…           :::    Letters
      123…           :::    Digits
      \d             :::    Any Digit
      \D             :::    Any Non-digit character
      .              :::    Any Character
      \.             :::    Period
      [abc]          :::    Only a, b, or c
      [^abc]         :::    Not a, b, nor c
      [a-z]          :::    Characters a to z
      [0-9]          :::    Numbers 0 to 9
      \w             :::    Any Alphanumeric character
      \W             :::    Any Non-alphanumeric character
      {m}            :::    m Repetitions
      {m,n}          :::    m to n Repetitions
      *              :::    Zero or more repetitions
      +              :::    One or more repetitions
      ?              :::    Optional character
      \s             :::    Any Whitespace
      \S             :::    Any Non-whitespace character
      ^…$            :::   Starts and ends
      (…)            :::   Capture Group
      (a(bc))        :::   Capture Sub-group
      (.*)           :::   Capture all
      (ab|cd)        :::   Matches ab or cd
      [abc]+         :::   One or more a or b or c 
      [" "/&.$,@?]+  :::   one or more space and symbol 
      *******************************************************( VVimportant need to revisit the input and out  )*****************************************************
        FileOutPutStream file = new FileOutPutStream("D:\\suman.txt"); 
        file.write(65); //  it will save "A" in the file suman.txt if not there create a file 
        file.close(); 
        String str = "hello there man 10000"
        Bytes[] bytes = Str.getBytes(); 
        file.write(str); 
        file.close(); // *** imp *** OUT PUT is for writing the data  && INPUT is for reading the data

        FileInputStream stream = new FileInputStream("D://suman.txt"); 
        int data = stream.read(); 
        System.out.println(data); 


        read all the input and output stream methods ::: 

    ===================================================================(    CONCURRENCY IN JAVA  )=============================================================================

    Thread   :::     It is the memory line or the address for the cpu to carry out the function.To use the thread we need to either extend from the thread or 
                     implement from the runnable interface to override the run method to start the thread 

                     public class NewThread extends Thread {
                        @Override
                        public void run(){
                           System.out.println("This is new thread");
                        }
                     }

                     public class NewRunnableClass implements Runnable {
                        @Override 
                        pubic void run(){
                           System.out.println("this is new runnable");
                        }
                     }

                     public class Main {
                           public static void main(String[]args){
                                 
                                 Thread thread = new Newthread()
                                 thread.start()                 // it will print "This is new thread" we can do thread.run() which will run the run in same thread 
                                                                // but start will start the new thread

                                 Thread newRunnable = new Thread(new NewRunnableClass()); 
                                 newRunnable.start()          // it will print "this is new runnable"
                               
                               Thread newRunnable = new Thread( new Running () { // it is an error since Running is not there 
                               Thread newRunnable = new Thread( new NewRunnableClass () { // we are overriding the run function of a class which is already present and implement 
                                                                                          // runnable 
                                  @override 
                                  public void run() {
                                     System.out.println("this the runnable all at a place ");
                                  }
                               })
                               newRunnable.start() // this will print " this the runnable all at a place "

                           }
                             newRunnable.interrupt() // it will interrupt the newRunnable thread if It is sleeping or in waiting status otherwise it will do nothing 

                       }

   synchronize    :::    synchronize will prevent the thread interferance and it will prevent the sharing the same block and the method between threads at a time 

                              public  class Dog {
                                public Synchronized void display() {
                                    for( int i = 0; i< 5; i ++){
                                       System.out.println("the dog");
                                    }
                                 }
                              }

                              public class Print1 extends Thread{
                                 pubic void print(Dog dog){
                                    
                                    dog.disply();
                                 }
                              }

                                 Dog dog = new Dog();
                              Thread thread1 =  new Print1();   // 
                              Thread thread2 = new Print1()     // both are sepereate thread with copy of bluprint of dog as instruction for what to do 
                              thread1.print(dog)                // First the thread1 will complete with function then the thread 2 will perform the function 
                              thread2.print(dog)
 
 Synchronize in block :::  
                            public  class Dog {
                                  public void display() {
                                     synchronized(this){
                                       for( int i = 0; i< 5; i ++){
                                          System.out.println("the dog");
                                       }
                                    }
                                  }
                              }

                              public class Print1 extends Thread{
                                 pubic void print(Dog dog){
                                    
                                    dog.disply();
                                 }
                              }

                                 Dog dog = new Dog();
                              Thread thread1 =  new Print1();   // 
                              Thread thread2 = new Print1()     // both are sepereate thread with copy of bluprint of dog as instruction for what to do 
                              thread1.print(dog)                // First the thread1 will complete with function then the thread 2 will perform the function 
                              thread2.print(dog)
 

            ***VVimp***                     synchronizing should be kept bare minimum since it will affect the performance of the code 

            ****VVimp****    the portion of the thread is remaining just like the input and output ; 

=======================================================================(Anonymous Class)===========================================================================================
   INTRODUCTION :::   It is the expression so we need to put the semicolon after the bracket
                      It will help us to override the original method without even extending but it is somewhat similar we will not be able to access private in anonymous class 


                    public class Anonymous {

                    public static void main(String[]args){
//                         Animal goat = new Animal("goat");
//                         goat.display();
                           Animal goat = new Animal("goat"){
                            @Override
                           public void display() {

                                System.out.println("who is this goat "+this.name);
                            }

                        }; // it is an expression so we need semicolon 

                    }

                   }

                  class Animal {
                  public String name; // if we make this private then anonymous class will not be able to access it to make change in the Overridden method 

                     public Animal(String name){
                           this.name = name;
                     }

                     public void display(){

                        System.out.println("the name of this animal is "+ this.name);// it will print "the name of this animal is goat "

                     }
                  }

INTERFACES    ::: 
imp:::
 one interface can extends many interfaces 
 one class can implements many infterfaces 
 by default all functions are abstract in interface 
 by defaults all the instance variables are constant 

1) functional interface  // have only one abastract method; 
2) normal interfacce     // have more than one abastract method; 
3) runnable interface    // it is a type of interface which have only one run method 
4) throwable interface   // It is exception interfacce 

                     In case of the interfaces we like Runnable what we need to do to implement the run method is to implement the runnable and then override the run method 
                     and another way is to make the anonymous method of the Runnable interface 

                     class Animal implements Runnable {

                        @Override 
                        void run() {
                           System.out.println("Display the nature of the Animal"); 
                        }
                     }

                     

                     Another method is:: 
                     
                     Runnable run = new Runnable(){
                        void run() {
                           System.out.println("Display the nature of the animal");
                        };
                     }

***VVIMP*** every variables that are used inside the anonymous class or the lambda expression should be final or effectively final  // has to be final for that iteration
 
 we cannot start same thread twice 

   example        :::   for( int i = 0 ; i < 10; i++){
                              Employee employee = employees.get(i); // it is effectively final since we are making new instance which will be taken as final 
                              employee = employees.get(i); // it will get the error since it is same variable not final or effectively final 
                           }

                          new Thread(()-> System.out.println(employee)); // it will print all right and  it is using the run method of runnable interfacce 

FOREACH           :::   since for is also a function interface we can use the lambda expression for that Collections.forEach( coll -> System.out.println(coll));

PREDICATE         :::   predicate is the generic interface function that take only one argument and give the boolean out come  
                        prediactes is just like Runnable interface which have run but predicates have many functions to be overwritten 

                        Predicate<Types> pred = new Predicate(()-> operation);

FUNCTION IN JAVA  :::     Function<T, R>  // it takes the one parameter and performs the operation and then  so T is the data type it take and R is the data type it return 
                     
                          Function<Dog, string> getnaam = (Dog dog)-> dog.getName(); 
                         String nam = getnaam.apply(dog)        // apply is  method that is given to the function to initiate 
                         System.out.println(nam);               // it simply means once we declare function and delcare the return type and input data type 
                                                               //  we get space to do operation to the input type or do any operation without using the parameter 
                                                               // then we can initiate the function by doing .apply(providing the parameter here)
                          

STREAM IN JAVA    :::    It is also a kind of interface with  many types of the functionalities that can be used with the collections once we do collections.stream().....

                  :::    Stream is not a data structure in itself  but takes the input from the Collections and can only be used with the Collection data type 

                  :::    Stream  does not change the underlying data  so new data coming from the stream is copy of the orginial data 

                         we have many functionalities in stream 
                         list<String> myList =
                         Arrays.asList("a1", "a2", "b1", "c2", "c1");

                         myList
                        .stream()
                        .filter(s -> s.startsWith("c"))
                        .map(String::toUpperCase)
                        .sorted()
                        .forEach(System.out::println); // 

SUPPLIER IN JAVA  :::  Supplier<R>  it is th function that takes no argument and  we can do the operation and then return the data type R but then to retrive the data 
                        we have to do get 

                        Supplier<String> sn =  ()-> return "suman"
                        String s = sn.get();

                        Supplier<R> sn = new Supplier() {
                           return "hello there"
                        }
                        sn.get
=======================================================================(  Regrex or regular expression)===========================================================================================
   
REGULAR EXPESSION :::      String string = "abcDeeeF12Ghhiiiijkl99z ";

                           String sn = string.replaceAll(".", "y");
                           System.out.println(sn);                                           // "yyyyyyyyyyyyyyyyyyyyy"

                           String sn = string.replaceAll("^abcDee", "y");                    //  yeF12Ghhiiiijkl99z if string = "abcDeeeF12GhhiiiijabcDeel9zzz" => yF12Ghhiiiijyl9zzz

                           string.matches("^abcDee")                                         // true since starting matches but it will be false it has abcDee else where 

                           String sn = string.replaceAll("99z$", "y");                       //  abcDeeeF12Ghhiiiijkl99z 

                            String sn = string.replaceAll("[Gh1]", "ram");                    //  abcDeeeFram2ramramramiiiijkl99z

                            System.out.println("Harry".replaceAll("[hH]arry", "harry"));      // "harry"

==================================================================================( REALTIONAL DATABASE )============================================================================
INTRODUCTION       :::       It is the database that will store the data in the form of table and to retrieve the data it has the co-ordinates as rows and column 

SQL                :::       It is the language to store tetrive and manipulate the table based or relational database 

Sqlite             :::       It is the version of the 

MYSQL              :::       It is the database management system that use the sql language for the data manipulation 

PostGresSql        :::       It is  the databse management system that use  the sql language for the data manipulation 

sqlite             :::       It is the library or database management system which follows PostGresSql rule compliances 


SQlite commands    :::       1) create table contacts ( name text, phone integer, email text)                         // first one is title and second one is data type 

                             2) insert into contacts (name phone email) values ( hari 2342424, hari@gmail.com);       // it will put the values in contact 

                             3) Insert into contact (name, email) values (hari , hari@gmail.com);                     // It will put the values in the contact at name and email only

                             4) select * from contacts;                                                               // It will display all the information of the table 

                             5) delete from contacts where name = "suman";                                            // It will delete the information from table with name suman

                             6) .tables                                                                               // will lists all the table in the database

                             7) .schema                                                                               // it will list the tables and schema

                             8) select * from contact order by name Collate NOCASE DESC                               // it will dispaly by desceding order of name neglecting the case 

                             9) Join in by default inner join                                                         // The join will match the key_id and join the mathing column 
                                                                                                                      // discarding the unmatched columns 

                            10) Left  join                                                                            // all the rows from left table and rows matching Id from right

                            11) Right join                                                                            // all the rows form right and rows matching Id from left

                            12) outer join                                                                            // all the rows from right and left even if we have no matching row 

                            13) select artists.name from artists join albums on artists.id = albums.aritst           // both are integer;
                                join songs on songs.id = artists.song where name like "suman%"
                                order by artists.name;

                            14) update artists set name = "ram" where name = "hari"

                                

//  To connect the database with the java program we need to download the sqlite.jar file from the net and store some folder and we also download the javabrowser to see the visual 
//  java database. After then we have to start the new project and for that we need to add the go to the project structure and library and add the sqlite.jar files 
//  In the main of the class we give the queries of the sqlite 
         import java.sql.Connection;
         import java.sql.DriverManager;
         import java.sql.SQLException;
         import java.sql.Statement;

            public class Main {
               public static void main(String[] args) {
                  try {
                           Connection conn = DriverManager.getConnection("jdbc:sqlite:/Users/skyhawk/Desktop/DataBase/testjava" +
                                    ".db");
                           Statement statement = conn.createStatement();
                           statement.execute("CREATE TABLE IF NOT EXISTS contacts(name TEXT, phone INTEGER, email TEXT)");
                           statement.execute("INSERT INTO contacts (name,  phone, email )" +
                            "VALUES('SSTIMS', 1265343, 'sstim234@gmail.com')");
                           statement.close(); 
                           conn.close();
                  } catch(SQLException e) {
                        System.out.println("Something is wrong "+ e.toString());
                  }
               }
            }

   To query and selecct the information from the db file we need to have the following  
           
                              statement = conn.createStatement();
                              results = statement.executeQuery("SELECT * FROM " + TABLE_ARTISTS);
                              
                              while( results.next()){                      // results is a part of the collection and we can iterate 
                                int res =  results.getInt("track");        // it will give the track inside the 
                                 String nam = results.getString("name")    // it will give the name of the artist
                              }

====================================================================================( Spring Boot )===============================================================================
 Curl            :::     It is one of the command + URL language that is used to give send the url request to the website from the command 

Introduction     :::    spring boot will convert the general java class into the controller and connect the functions of the class into the different http response 
                        so that individual functions in the class will be able to respond to that request 

                        @Controller                                        // It is converting the function called the VirtualLibraty into the controller 
                        public class VirtualLibrary{
                     
                        @RequestMapping("/books/all", RequestMethod.GET)   // The function book will responds to the get request from the url "/books/all" 

                        public Book getAllBooks() {                     // It will also 
                            return getBook();
                         }
      
                        }

@ResponseBody    :::   tells Spring to convert the return values of a controller’s methods to JSON and bind that JSON to the HTTP response body.

@RequestMapping  :::   annotation also accepts several other arguments including method, params, and consumes
                       @Controller
                        public class VirtualLibrary{
                        
                        @RequestMapping("/books/all", RequestMethod.GET) // It is just like the router in the react 
                        public Book getAllBooks() {
                           return getBook();
                        }
                        
                        }

@RequestMapping 
to the class     :::  Class can be made controller and also the primary router that will responds to all the base resquest and further from there we can branch out the 
                      request to all other function depending upon the routing 

                      @Controller 
                      @RequestMapping("/books")                                       // if there are any base  request book it will be here 
                      public class VirtualLibrary {
                         
                         @RequestMapping( value = "/suman" method= RequestMethod.GET) // the get request will go to this method eg:- /books/suman get 
                         public int name() {
                            return 45; 
                         }
                      }


 HTTP Method Annotation	Usage

@GetMapping        :::	Used to specify GET requests to retrieve resources    // @RequestMapping("/about", method = RequestMethod.GET)  equivalent to @GetMapping ("/about")
@PostMapping	    :::  Used to specify POST requests to create new resources
@PutMapping        :::	Used to specify PUT requests to update existing resources
@DeleteMapping	    :::  Used to specify DELETE requests to remove specific resources

suppose the url is :::    libraryapp.com/book?author_count=2&published_year=1995

                          @GetMapping("/book")
                           public Book isBookAvailable(@RequestParam int author_count, @RequestParam int published_year) {  // it will help to parse the parameter send in the http
                                                                                                                            // request 

                              return books.find(author_count, published_year);

                           }

Parameter Id      :::  The param id will be the any thing that comes after the path 
                             @RequestMapping("/books")                                       // if there are any base  request book it will be here 
                                public class VirtualLibrary {
                                @GetMapping("/{id}")
                                public Book isBookAvailable(@PathVariable int id)  {         // It will take care of the request of any kind like "/books/45" 
                                                                                             // or any kind "/books/ram"  /books/{id} it can be anything
                                       return book.findByID(id);
                                  }

 We’ve seen two ways to capture parameters from a request URI. @RequestParam captures the id included in the URI /books?id=28937 and @PathVariable 
 captures the id included in the URI /books/28937 as long as the path includes the {id} variable in books/{id}.


@RequestBody                :::                        import org.springframework.web.bind.annotation.RequestBody;
                                                @PostMapping(path="/addNew")
                                                public String createNewPerson(@RequestBody Person person) {
                                                personRepository.save(person);
                                                return "Person successfully added!";
                                                }

                                               curl -d "{ \"firstName\": \"Diana\", \"lastName\": \"Prince\", \"superPower\": \"super strength\" }" 
                                                    -H "Content-Type: application/json" localhost:4001/superHeroes/addNew // if we make this post request with the data 
                                                    then the data is sent to the Requestbody 

                                  // Other than passing information in the parameters we can pass the information as body for post and put using requestbody


@ResponseStatus             :::              HTTP Status in the spring will use the enum to give the response code, @ResponseStatus will take the two value one for the code and another
                                             for the reason 
                                             code = HtttpStatus.CREATED OR .BAD_REQUEST Or other enum   and anothher value is reason = "the bad request was made by the man"
                                             @ResponseStatus(code = HttpStatus.CREATED , reason = "the bad request was made")

                      
what to throw the exception :::                             @GetMapping("/{id}")
                                                      public Book isBookAvailable(@PathVariable string id) 
                                                      {
                                                      if (id.isNumeric()) {
                                                         int id_int = Integer.parseInt(id)
                                                         return book.findByID(id_int)
                                                      } 
                                                      else {
                                                         throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "The ID contained a non-numerical value.");
                                                      }


Maven           :::     It is the software project managemnt tool  that manage the java projects by managing the hiarchey of the directories , downloading and managing 
                     the dependencies just like package.jason 

                     another similar types of the management tool is Apache ant but it is not that much popular and kind of obselete 

                     and another similar tool but much popular and is in use is gradle.
   
   Archetype   :::   archetypes are nothing but templetes of the java program tha provide the strucutre and skeleton to the java projects and save the need to write the lot of potboiler
                     codes

 MVNrepository :::   MVNrepository.com is the website that contains all the dependencies plugins for the maven projects which we can put inside the 
                    

plugins        :::   It is the software package that is add-in or additional part of the main software tha 

beans          :::  

what is logger in the spring ::: It is the format at which the information is logged in the console , even if we do nothing there is always a pattern in which 
                                 something is logged in the java or spring console which is called as the default console 
                                 




====================================================================================( Interview preparation  )========================================================================
1) Functional interface :: they are the interface that have the one and only abstract method and abstract method is the method that have the  doesn't have the body but just the 
   declaration, abstract method cannot be final since they are to be implemented somewhere else and where they are implemented they will be given body 
   so the lambda expression have more than one non-abstract function but it cannot have more than one abstract function 
   
   it can have static and default function :: default is instance and static is class function 

   
2)  java Object or object of a class is the instance of a java class => basically the object has state and behaviour  state is name, size etc and behaviour is what it does 

3) stream is not the data structure it takes the data from collection or the input output  java api but it provides the sequence of data and functionalites like map, 
reduce filter etc. The stream functions are either intermediate or the terminal . Intermediate are the function that again provide/return  the sequence of data so that we 
can chain other functionalities and the terminal either provide one or none data sequence so that we cannot chain the functionalities 

=================================================================  spring boot and spring frame works ===============================================================================
1)  All the object that are created and managed by IOC containers are beans 
 spring IOC is a manager of container that where the right or control of the object creation is given to the container  Inversion of control
2) IOC container contains two interfaces BeanFactory interface and the ApplicationContext interface , we cannot use the interface unless we have implemented classes that implement those 
  interfaces 
note:: To create a container we need to create the bean.xml file inside the src folder 
3) Bean is the xml tag that is pre-created and it will be validated and used by the initial xml tags we add to the bean.xml files by copying and pasting it to it 

4) BeanFactory and the applicationCondex are the interface that are used by the implemented classes. and the implemented class for applicationContext interface is the 
   ClassPathXmlApplicationContext() just like link is interface and LinkedList is implemented class 
   ApplicationContext context = new ClassPathXmlAppicationContext(bean.xml) => it will read the bean.xml file ; 
    
   and this implemented class will implements the function provided by the Applicationcontex interface like getBean() => it will inject the dependencies into the class 

   Student suman = context.getBean("student", Student.class ); => this refers to the 
   <bean  id = "student class = "com.student.something " > //path of the class or the address of the class is kept in the class > 
            we have just created the bean or the object but havent supplied the dependencies 
   <bean/> 



    <bean  id = "student class = "com.student.something " > //path of the class or the address of the class is kept in the class > 
           <property name="nameOfStudent" value="suman"> <property/> // this is the setter based dependecy injection that is  

            //  we provide the id for the class where we need to inject the dependencies 
               and  class is the path of the class 

           // and in the property we give name as the referance to the data we want add dependecy to 


           // class Something {
              private string nameOfStudnet 

              public String  getName() {
               return nameOfStudent; 
              }
           }
           
   <bean/> 


=======================================================================================( SQL MYSQL )============================================================================
1) SELECT    column-name       FROM        Table-Name   WHERE  column-name > value 
 

       table = student 
         name       :       id       :         age        :     weight 
      ======================================================================
         suman      :   1            :        34          :     43
         ram        :   3            :        54          :     54 
         shyan      :   5            :        56          :     76
         jham       :   7            :        67          :     97

   select name from table where age > 34; 

important note :: count(*), avg(), sum(), min(), max() are the aggregate function in the sql ==> count(*) will count the occurance of value before it 
               :: select country, count(*) from table order by country ==> it will select the occurance of the country 
  
1)  sum(colum-name)              => the give the value of sum of all the columns who satifsy the condition after where 

2)  avg(column-name)             => this gives the average of the columns who satifsy the condition after where 

3)  count(column-name)           => this gives the number of columns who satifsy the condition after where 

4) Round(sum(column-name, 2)     => this will sum the coumn and round it 2 decimal point 

5) floor(suma(column-name))      => this will sum the column and it will give the nearest whole number 

6) Power(4, 2)                   => It will give the 16 

Mathematical symbols in SQL :: 

1) => :: equals to or greater than 

2) =< :: equals to or smaller than 

3) =  :: equals to 

4) <  :: smaller than 

5) >  :: greater than 

6) =  :: equals to 


JOINS => select 
               Table1.column1, Table2.column2 
         from 
               Table1 
         Inner / right/ left and full join 

               Table2 
         on 
               Table1.codeColumn = Table2.codeColunm 
         where 
              Table1.column > 
         



USING CASES IN THE SQL 

 CASE
    WHEN condition1 THEN result1
    WHEN condition2 THEN result2
    WHEN conditionN THEN resultN
    ELSE result
END;


SELECT CustomerName, City, Country
FROM Customers
ORDER BY
(CASE
    WHEN City IS NULL THEN Country
    ELSE City
END);

SELECT OrderID, Quantity,
CASE
    WHEN Quantity > 30 THEN 'The quantity is greater than 30'
    WHEN Quantity = 30 THEN 'The quantity is 30'
    ELSE 'The quantity is under 30'
END AS QuantityText
FROM OrderDetails;
					
					====================================================================< spring notes >=================================================

1)  POM:: POM file in maven:: every  pom is registered to collection of schema  as XML name space and it should be registered in xmlns (XML Name space)

   even  the spring has the same architecture of the name space for all the file schema
   
   every pom file is inside project tag and then inside that we have the schema definition and the xmlns description 
   and then we have groupId, modelversion , groupid , version ,  artifact id and packaging 
   <project 

   </project>

2) PACAKAGING::packaging tag can have many option like jar, war , ear , and pom 
   if it has any other type of packaging  other than pom then maven will compile the code and prepare the artifact 
   but if the packaging type is pom then if will not compile the code but still the dependencies, plugins and other things in the pom will be 
   recognized. 
3) so if we put the pom as the packaging in the pom.xml then we shouldn't put the src folder or the source code in the parent project project 

4) then in the evey sub module we have to put parent tag and provide all the details like artifactid groupid and other things then we have to 
go for the things about the modules and in the parent project we have to add the modules and put the aritfactId in the module tag 

5) DEPENDENCYMANAGEMENT::  dependency management is the tag that is either present in the bom.xml or the pom.xml of the parent project. if we 
   put the dependecies inside the dependency management of parent then we have to give to specify the groupid and artifact id but doesn't need 
   to provide the version. But if we don't use the dependency management then all the dependencies are inherited in the child modules 
6) PROPERTIES:: IT is used to define the place holder for the version and other namespace to be used somewhere else in the pom.xml 
7) if we have to put the bean.xml file or collection of beans it has to be in the resources src/main/resources folder since spring mvc will look for the bean.xml file 
in the resources folder and if we have to change the location of the bean.xml file then we have to provide the 
8) The <build> tag in a Maven pom.xml file is used to configure the build process for a project. This section contains information about how the project should be built, such as what plugins to use, which goals to execute, and what directories to include or exclude.

Here are some common elements that you might find in the <build> section of a pom.xml file:

      <plugins>            : This element allows you to configure the plugins that are used during the build process. 
                              Each plugin can be configured with its own set of goals, parameters, and dependencies.
      <resources>          : This element specifies the resources (e.g., properties files, XML files) that should be included in the build.
      <testResources>      : This element specifies the test resources that should be included in the build.
      <sourceDirectory>    : This element specifies the directory where the project's source code is located.
      <testSourceDirectory>: This element specifies the directory where the project's test code is located.

9) <directory>       : tag inside the <build> section of a Maven pom.xml file is used to specify the output directory for the project's build artifacts.
      <build>
         <directory>./output</directory> 
         ...
      </build>
The project build artifact will be stored in the output folder which is in the root directory of where the 
      pom.xml is present
10)<outputDirectory> :tag in the <build> section of a Maven pom.xml file is used to specify the directory where the compiled application 
      code (e.g., .class files) should be placed. This tag specifies the output directory for the compiled code only, whereas 
      the <directory> tag specifies the output directory for all other build artifacts.
      In short, the <build> tag allows you to customize the build process for your Maven project by specifying various 
      configuration options that Maven will use during the build.
11) 



<context-param>
  <param-name>contextConfigLocation</param-name>
  <param-value>/WEB-INF/spring-config/bean.xml</param-value>
</context-param>
in the web.xml file  where our bean.xml file is present in the spring-config folder inside WEB-INF folder

8) if we want to declare or initialize the beans and declare in the bean.xml files and then 

9) if we want to run the certain function in the class  

@PostConstruct
    public void init() {
        // Perform any initialization here
        // This method will be called after all dependencies have been injected
    }


@PostConstruct is part of the Java EE standard, and it is also supported by Spring.
Similarly to @PostConstruct, @PreDestroy can be used to perform any necessary clean-up or shutdown operations before the bean is destroyed.

::: JBOSS Server :::
===============================:::  contents :::==============================
1)<?xml version='1.0' and encoding='utf-8'?> ::: like any xml documents it contains <?xml version='1.0' and encoding='utf-8'?> it just say which version of the xml we are using just like which 
version of the html we are using 
2)  <server xmlns="urn:jboss:domain:16.0">   ::: then we have the tag 
   <server xmlns="urn:jboss:domain:16.0"> 
     everything we need are inside here 

   </server> 
3) <extensions>                              :::inside the server there is <extensions> all the extension are added and the major
 functionalities of the server are due to these extensions 
it might do one of the following tasks
Adding support for new Java libraries or frameworks
Implementing new security protocols
Enabling new database connectors
Providing additional messaging services
Enhancing performance or scalability
modules just contains the configuration files for those functions to be carried out
4) <subsystem xmlns=>  it contains all modular subsytem 
 a) they may be for the datasource configuration <subsystem xmlns ="urn:jboss:domain:datasources:6.0>
 d) 
 b) They may be for the webservice call configuration <subsystem xmlns ="urn:jboss:domain:logging:8.0>
 d) 
 c) They may be for the logging configuration <subsystem xmlns ="urn:jboss:domain:logging:8.0>
 d) 

5) <socket-binding-group> ::: it contains the collection of the socket-binding 
6) <socket-binding>       ::: it represent the socketbinding, port etc for the http https,ajp and other protocal for the server 
   it also contains the some custom socket-bindings a well like management-http 
7) <server xmlns="urn:jboss:domain:13.0">
    <extensions>
        <!-- Extension modules here -->
    </extensions>
    <system-properties>
        <!-- System properties here -->
    </system-properties>
    <management>
        <!-- Management subsystem here -->
    </management>
    <profile>
        <subsystem xmlns="urn:jboss:domain:undertow:12.0">
            <!-- Undertow subsystem configuration here -->
        </subsystem>
        <subsystem xmlns="urn:jboss:domain:datasources:6.0">
            <!-- Datasources subsystem configuration here -->
        </subsystem>
        <!-- Other subsystems here -->
    </profile>
</server>


pom.xml

==================================================================GIT NOTES=================================================
1) git config --list ===> This will show the local setting and email  assocaited with the repo
The above command will result in this 
credential.helper=osxkeychain
init.defaultbranch=main
color.ui=true
user.name=“sumankoder”
user.email=suman.k.coder308@gmail.com
filter.lfs.clean=git-lfs clean -- %f
filter.lfs.smudge=git-lfs smudge -- %f
filter.lfs.process=git-lfs filter-process
filter.lfs.required=true
http.sslverify=false
core.repositoryformatversion=0
core.filemode=true
core.bare=false
core.logallrefupdates=true
core.ignorecase=true
core.precomposeunicode=true
remote.origin.url=https://github.com/suman308/Javascripts-miniprojects.git
remote.origin.fetch=+refs/heads/:refs/remotes/origin/
branch.master.remote=origin
branch.master.merge=refs/heads/master

2) git config --global --list => This will show the remote setting and emails associated with the repo

3) git config --global user.name "NEW_NAME"
   git config --global user.email "NEW_EMAIL"  to change the global user account 

4) git branch --set-upstream-to=upstream_branch local_branch

5) git branch ===> it will show all the branches in the local 
    master
   * notes  we are at this local branch
6) git branch -a ===> it will show all the branches both remote and local 
    master
* notes
  remotes/origin/HEAD -> origin/master this is the symbolic head to say we are at this in the local 
  remotes/origin/master -> one of the remote branchs in remotes

  7) git remote -v 
     it will show all the remote repos connected to our local repo

  8) git push -u origin master ===> for the first

  9) even if we remove use the config username and password we have to remove the gitkey chain in the mac 
  since it will have the username and password from earlier setup 
  10) we cannot use the password to set upstream branch or the push to the new branch we have to generate 
  personal token going to setting developers tool and user the username and in place of the password 
  we have to use that personal acess token for the first time authentication and we need to do this once we 
  have deleted the git.com from the keychain in mac
  11) If i do the personal access token then in keychains the git.com file is auto generated in case of mac.

  12) git push origin release_master_notes_java ===> it will push the to the release-master_notes_java branches

  13) git checkout will mesh up the working directory . 

  14) cloning is cloning the master and origin is the url of the whole repo and all of the branch 
  so cloning on branch will bring every single branches
  





