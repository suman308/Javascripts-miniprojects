=========================================================================================ALGORITH LECTURES========================================================================================
1) What is 32 bit signed integer? 
		A 32-bit signed integer is an integer whose value is represented in 32 bits (i.e. 4 bytes). Bits are binary, meaning they may only be a zero or a one. 
		Thus, the 32-bit signed integer is a string of 32 zeros and ones.
		The signed part of the integer refers to its ability to represent both positive and negative values. 
		A positive integer will have its most significant bit (the leading bit) be a zero, while a negative integer will have its most significant bit be a one.
		Because of this, the most significant bit of a signed integer is typically called the “sign bit” since its purpose is to denote the sign of the integer.
		So, with one bit as the sign, and the remaining 31 bits as the magnitude of the integer, how many values can a 32-bit signed integer represent?
		The largest value it can represent is (2^31) - 1. = 2147483647
		The smallest value it can represent is -(2^31).   = -2147483647
2) Big o notation or the time space complexity 
   

difference between findindex indexof include
the sort() only compares the first element wether it is number or the alphabet then if the first character is same then it compare the second element.

Sort(sort function)  we can put the function inside it to compare the two numbers and the right function is array.sort( (a,b )=> a-b)

every thing in the javascript is an object and to form the we can form object by making var obj = {} and we can set the key and value pair for the object using obj.ram = 0 and we can make the object counter as obj.ram += 1


The folllowing link explains the time complexity perfectly
https://adrianmejia.com/data-structures-time-complexity-for-beginners-arrays-hashmaps-linked-lists-stacks-queues-tutorial/#HashMap-operations-time-complexity
=====================           Array in the javascript         =================================
Operation	                        Worst
==================================================
Access (Array.[])	                O(1)
Insert head (Array.unshift)	        O(n)
Insert tail (Array.push)	        O(1)
Search (for value)	                O(n)
Delete (Array.splice)	            O(n)



Function	        Runtime	Description
array.push          	O(1)	Insert element to the end of the array
array.pop	            O(1)	Remove element to the end of the array
array.shift	            O(n)	Remove element to the beginning of the array
array.unshift	        O(n)	Insert element(s) to the beginning of the array
array.slice	            O(n)	Returns a copy of the array from beginning to end.
array.splice	        O(n)	Changes (add/remove) the array

========================================== Map ====================================================================================
Operation	                        Worst	    Amortized	    Comments
Access/Search (HashMap.get)	        O(n)	        O(1)	        O(n) is an extreme case when there are too many collisions
Insert/Edit (HashMap.set)	        O(n)	        O(1)	        O(n) only happens with rehash when the Hash is 0.75 full
Delete (HashMap.delete)	            O(n)	        O(1)	        O(n) is an extreme case when there are too many collisions

================================================= set using list ===================================================================
====================================================================================================================================
the important thing O(1)< O(n)< O(nlogn) < O(n^2)
====================================================================================================================================
In the space complexity of the how much space is taken by the data is considered 

a) the string takes n space ie O(n) where n is the length of the String. and where as the integer symbol and boolean takes O(1)
   no matter how big it is. this can be because the string at the end are conversted to the number and then to binary to store and
   each binary number represent the one string

========================================time and space complexity of an array ============================================================
a) Array.push() ==> O(1) since it pushes the things at the very end we know where it is going 
b) Array.pop() ===> O(1) Since it pop off the things from the very end of an array we know where we are looking at 
c) Array.shift() ==> o(n) although we know we need to add one at the very begining once we add something at the begining we 
 need to shift all the other element one step further and then it become n numbers of the operation including adding at the begining
 d) Array.unshift() ==> o(n) although we know we need to add one at the very begining once we add something at the begining we
 need to shift all the other element one step further and then it become n numbers of the operation including adding at the begining
 e) forEach/map/filter/reduce ==> O(n) it all happen by going through each of the elements 
 f) slice, splice, => O(n)