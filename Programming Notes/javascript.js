difference between findindex indexof include 
the sort() only compares the first element wether it is number or the alphabet then if the first character is same then it compare the second element. 

Sort(sort function)  we can put the function inside it to compare the two numbers and the right function is array.sort( (a,b )=> a-b)

every thing in the javascript is an object and to form the we can form object by making var obj = {} and we can set the key and value pair for the object using obj.ram = 0 and we can make the object counter as obj.ram += 1 

==================================================================           Array in the javascript         =================================
Arrays in the javascript are just like the objects with the index and values in the name of the index inside the array.
	1)  arrays arr = [" string", 1, "21", true] is (*one way of creating or declaring arrays) just the collection and it is always indexed as arr =[ 0: "string", 1: 1, 2:"21", 3: true length: 3]
	2) declaring the arrays 
		  a)  var arr1 = new Array("string, 1, "21", true) 
		  b) var arr1 = [] 
		  c) var arr1 = new Array(); 
==================================================================           data properties in the javascript         =================================

1)  var num = 00001 
console.log(num) ==> 1
==================================================================           Array properties in the javascript         =================================

1) animals = ["cat","dog","rabbit","bird","fish","zebra"];
        animals.push("sheep"); // add item at the end of an array
        var remove1 = animals.pop(); // remove last item from the end of an array
        
        animals.shift(); //remove first item
        animals.unshift("horse");//add first item to array
        
        animals.splice(2,1); // remove from pos number of items
      
        
        //animals.sort(); // sort items by value
        //animals.reverse(); // reverse the order of items
        //animals.sort().reverse();
        
        
        
        console.log(animals);
2)  var q = prompt("what do you want to remove");
        var finder = arr.indexOf(q);
        
        var v = (finder > -1) ? arr.splice(finder,1) : false;
        
3) Looping through arrays 
            var arr = ["cat","dog","fish",4,2,5,6,6,4];
        for(var x in arr){
            console.log(x); // index value
            console.log(arr[x]); // the item value
        }
 4) Math.pow(12, 4)==> 4 to the power of 12 

 5) split() ===> a) "suman".split() ==> ["suman"]
				 b) "suman".split("") ==> ["s","u","m","a","n"]
                 c) "suman".split(" ")==> ["suman"]
  				 d) "suman khadka".split(" ")==> ["suman", "khadka"]
                 e) "suman".split("u") ==> ["s", "man"]
 6) join() ===> it works  for the array only and 
				a) ["suman", "is", "the", "best"].join()==> "suman,is,the,best"
   				b) ["suman", "is", "the", "best"].join("")==> "sumanisthebest"
				c) ["suman", "is", "the", "best"].join(" ")==>"suman is the best"

 7) toString() ===>  a) var n = 123 , if n.toString() ==> "123"
 8) array.indexOf("x") ===> gives the index of the "x" in the arr and if it is not present gives back the -1
 9) reduce ===> arr.reduce(function(a,b)) ==> where a is accumulator and b is the second 
 10) console.log(Math.max(1, 3, 2));
     expected output: 3
 11) JOINING THE ARRAY :: 
      a) concat ===> arr1 = [1,23,4,5] and arr2 = [2,0,0,4,55 ]  , arr = arr1.concat(arr2) concat gives the new copy of the two arrays joined 
      b) [1,2,4,5,6] + [2,3,5,6,7] => it converst to the strings and the result is "1,24,5,62,3,5,6,7"
      c) slice(start) => [1,2,4,5,6].slice(3) ===> [5,6] where is [1,2,3,4,5,6].slice(2,3) ==> [3,4] or slice(start, end)::: if not given what ever given is the start position
==================================================================           Object in the javascript         =================================
  LOOPING THROUGH THE OBJECT 

  1) var car = {color:"red",make:"ford",doors:5,model:"mustang"};  // literal
        car.driver ="Lance";
        for(var property in car){
            console.log(property + " " + car[property]);
            //console.log();           
        }
        result :: color red 
                  make ford 
                  doors 5 
                  model mustan

 	ROUGH 
 	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="Herd the sheep back into their pasture before time runs out! A browser-based game inpired by a childhood growing up in Maine."> 
    <meta property='og:title' content='Sheep on the Lam' />
    <meta property='og:image' content='https://raw.githubusercontent.com/benrose207/SheepOnTheLam/master/assets/images/game_screenshot.png' />
    <meta property='og:description' content='Herd the sheep back into their pasture before time runs out!' />
    <meta property='og:url' content='https://benrose207.github.io/SheepOnTheLam/' />                 