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

2) null vs undefined 
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

 2) what is the difference between the let,  var and  const   

  a) var => the scope of the var is global if it is declared outside the function 
  b) var => the scope of the var is with in the function if it is delcare inside the function
  c) var tester = "hey hi";

    function newFunction() {
        var hello = "hello";
    }
    console.log(hello); // error: hello is not defined
  d) var can be redeclared  and reassigned as follows
    var greeter = "hey hi";
    var greeter = "say Hello instead";
    or 
    var greeter = "hey hi";
    greeter = "say Hello instead";

 e) Hoisting of the var is as follows 
   console.log (greeter);
    var greeter = "say hello"

        it is interpreted as this:

     var greeter;
    console.log(greeter); // greeter is undefined  It is interpreted as=> there is a variable but the assigning of the value is not done.
    greeter = "say hello" // only the empty memory space is taken to the top but not it's value 

    Let ///
    1) Let is used for declaring the variable and one difference is that it cannot be redecalred
         let greeting = "say Hi";
         let greeting = "say Hello instead"; // error: Identifier 'greeting' has already been declared
    2) let can be decalred in the different scope block 
         let greeting = "say Hi";
      if (true) {
        let greeting = "say Hello instead";
        console.log(greeting); // "say Hello instead"
      }
        console.log(greeting); // "say Hi"

    3) the const is similar to the let and it is blocked scoped but it cannot be reassigned 
      So my conclusion is that var is globally scoped and transend the block and acts as if it is reassigned or the 
    4) unlike ruby where we can compare the two object in javascript we can only compare the two object if they have same memory location 
       Object1 === object 
                const hero1 = {
            name: 'Batman'
          };
          const hero2 = {
            name: 'Batman'
          };
          const hero3 = {
            name: 'Joker'
          };

          isHeroEqual(hero1, hero2); // => true
          isHeroEqual(hero1, hero3); // => false

    ==============================================      MAP    IN JAVASCRIPT     ==================================================================
    ==================================// what is the difference between the map and object in the javascript ===============
     1) the map is just similar to the object but map hold the sequence of the key value pair entered into the map but object may not hold the sequence 

     2) How to declare the map object 
        we can do is let my = new map() ===> to store the key value pair we need to my["suman"] = 1 

        But very important rule is that 
       

        let wrongMap = new Map()
        wrongMap['bla'] = 'blaa'
        wrongMap['bla2'] = 'blaaa2'

        console.log(wrongMap)  // Map { bla: 'blaa', bla2: 'blaaa2' } 

          But that way of setting a property does not interact with the Map data structure. It uses the feature of the generic object. 
          The value of 'bla' is not stored in the Map for queries. Other operations on the data fail:

          wrongMap.has('bla')    // false
          wrongMap.delete('bla') // false
          console.log(wrongMap)  // Map { bla: 'blaa', bla2: 'blaaa2' }

           The correct usage for storing data in the Map is through the set(key, value) method.
          syntax is =======> myMap.set(key, value)
          // Add new elements to the map with chaining.
            myMap.set('bar', 'foo')
                 .set(1, 'foobar')
                 .set(2, 'baz');

          let contacts = new Map()
          contacts.set('Jessie', {phone: "213-555-1234", address: "123 N 1st Ave"})
          contacts.has('Jessie') // true
          contacts.get('Hilary') // undefined
          contacts.set('Hilary', {phone: "617-555-4321", address: "321 S 2nd St"})
          contacts.get('Jessie') // {phone: "213-555-1234", address: "123 N 1st Ave"}
          contacts.delete('Raymond') // false
          contacts.delete('Jessie') // true
          console.log(contacts.size) // 1

          3) const map1 = new Map();
            map1.set('bar', 'foo');

         console.log(map1.get('bar'));
          // expected output: "foo"

        console.log(map1.get('baz'));
          // expected output: undefined
     //get only checks if there is key or not 


     ==================================================================== SET in JAVASCRIPT==================================================
     1) set is array but has only unique elements 
     2) set.has("name") ==> true or false 
     3)set.clear()==> empty the whole set 
     4) set.size =======> 1 // gives the length of the set 
     5) set.add(name) ===> // add the object to the set  
         mySet.add(5).add('some text'); // chainable ( what could be the time space complexity of add in set ==> )
     6) The following is the typical example how the set is implemented in the javascript 
       class MySet {
          constructor() {
            this.hashMap = new HashMap();
          }

          add(value) {
            this.hashMap.set(value);
          }

          has(value) {
            return this.hashMap.has(value);
          }

          get size() {
            return this.hashMap.size;
          }

          delete(value) {
            return this.hashMap.delete(value);
          }

          entries() {
            return this.hashMap.keys.reduce((acc, key) => {
              if(key !== undefined) {
                acc.push(key.content);
              }
              return acc
            }, []);
          }
        }

       ============================================================= Linked LIst ==========================================
       1) Node list  
         a)Although NodeList is not an Array, it is possible to iterate over it with forEach(). It can also be converted to a real Array using Array.from().
         b) linked list is just a object nested inside an object 

       
         =============================================================Class in the javascript ========================================================
         1) In javascript the class is the special function and the class is declared with writing the class and class name
              a) class Rectangle {
                  constructor(height, width) {
                    this.height = height;
                    this.width = width;
                   }
                }

              b) one difference of the normal function and the class is that class is hoisted but the function is not hoisted 
                  const p = new Rectangle(); // ReferenceError

                      class Rectangle {}
              c) class Polygon {
                  constructor(...sides) {
                    this.sides = sides;
                  }
                  // Method
                  *getSides() {
                    for(const side of this.sides){
                      yield side;
                    }
                  }
                }

                const pentagon = new Polygon(1,2,3,4,5);

                console.log([...pentagon.getSides()]); // [1,2,3,4,5]
              d) The class constant or the class variable and also the class function is written in the javascript by adding the static in front of the then 
                class Point {
                      constructor(x, y) {
                        this.x = x;
                        this.y = y;
                      }

                      static displayName = "Point";
                      static distance(a, b) {
                        const dx = a.x - b.x;
                        const dy = a.y - b.y;

                        return Math.hypot(dx, dy);
                      }
                    }

                    const p1 = new Point(5, 5);
                    const p2 = new Point(10, 10);
                    p1.displayName; // undefined
                    p1.distance;    // undefined
                    p2.displayName; // undefined
                    p2.distance;    // undefined

                    console.log(Point.displayName);      // "Point"
                    console.log(Point.distance(p1, p2)); // 7.0710678118654755

      ============================================================================  Double Linked List =======================================================
    1) The double linked list has the collection of the nodes connected to each other 
    2) usually the node is the class that contains the value and next and previous node 
    3) the another class named the double linked list is the class that holds the general property of the whole data structure like length head and tail and
       also all the instance function  that helps us manipulate and change the data structures 

       class Node {
         constructor(val){
          this.val = val
          this.next = null; 
          this.previous = null 
         }
       }

       class DoubleLinkedList {
         constructor() {
           this.head = null;
           this.tail = null;
           this.length = null 
         }
         push(val){
           let newNode = new Node(val)
           if(this.length == 0 ){
             this.head = newNode; 
             this.tail = newNode;
           } else {
             this.tail.next = newNode 
             newNode.prev = this.tail
             this.tail = newNode
           }
           this.length++
           return this

         }

         Pop(){
           if(!head ) return undefined;
            let poppedHead = this.tail
            if( this.length == 1){
              this.head = null; 
              this.tail = null;
            } else {
              this.tail = poppedHead.prev 
              this.tail.next = null;
            }
            this.length--; 
            return poppedHead; 
           }

           Shift(){ // the shift will just take the things form forward
              if( this.length== 0 ) return undefined; 
              let oldHead = this.head; 
              if( this.head == this.tail){
                this.head = null; 
                this.tail = null; 
              }else {
                let newHead = oldHead.next; 
                this.head = newHead 
                newHead.prev = null;
                oldHead.next = null; // one thing to note is that when we are breaking the chain we are as if we are deleting the node
              }
             this.length--
             return oldHead
         }
       // Important:: we are mostly concerned with breaking chain of the nodes with in the instance of the main class called the double linked list
       // so we are not concerned about the isolated nodes they will be removed during garbage collection 
        // again the head and tail are always in the instance of the DDL instance 
        Unshift(val) { // we are adding a node before the head of the ddl class instance again it is all about chaining the node to the instance of the class
          // but we are not concerned about the isolated nodes left after removing the chain from the instance of dll 
        let newHead  = new Node ( val); 

        if(this.length == 0 ){
          this.head = this.tail = newHead;
        } else {
            newHead.prev = null
        let oldHead  = this.head; 
         this.head =  newHead 
         this.head.next = oldHead;
        }
        this.length++;
        return newHead;
        }
        Get(index){
        if( index < 0 || index > this.length ) return undefined;
        let i = 0;
        let current = this.head
        while ( index !=  i){
          current = current.next; 
          i++
        }
        return current;
        }
        set(index, value) {
          let indexNode = this.get(index)
          if(indxeNode != null){
            indexNode.val = value; 
            return true 
          }else {
            return false;
          }
        }


      }

   =============================================================================Binary Search Tree==========================================================
   1) Binary Search tree is the data structure that contains the sorted nodes  
     and nodes are the instance of a class 
       class Node  {
         constructor(val){
           this.left = null; 
           this.right= null; 
           this.value = val
         }
       }
    2) In the above the value is the value held by the node and left and right are the instance of the class node that are linked to the current node 
    3) Binary in the sense that it has at most two branching left and right 
    4) when we start from the current  root then smaller value is kept left and the larger value is kept at the right 
    class Node {
      constructor(val){
        this.value = val;
        this.left = null;
        this.right = null;
      }

    class binarySearchTree {
      constructor(){
        this.root = null;

      }
    }
     
    
      Insert(val){
      let newNode = new Node(val);
      if( this.root == null){
        this.root = newNode;
        return this
      } else {
        let current = this.root 
        while( true){
         if( current.left == null){
           current.left = newNode
           return this
         }else {
           current = current.left
         }
        } else if( value > current.value ){
          if(current.right === null){
            current.right = newNode; 
            return this;
          } else {
            current.right;
          }
        }

      }
      }

      BFS() {
        let node = this.root; 
        data = []; 
        queue = []; 
        queue.push(node);
        while(queue.length){
          node = queue.shift(); 
          data.push(node);
          if(node.left) queue.push(node.left); 
          if(node.right) queue.push(node.right);
        }
        return data;
      }
    }
    