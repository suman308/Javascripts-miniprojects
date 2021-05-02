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
