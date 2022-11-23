 // js is single-threaded language
 // single sequential flow of control
 // js is a synchronous language with asychronous capability
 // thread has - call stack 
 //            - memory heap
 // call stack: LIFO(last in first out) - manages execution context
 
 //     third()
 //     second()               
 //     first()
 //     Global EC


 
//  function first(){
//     console.log('first...')
//  }
//  function second(){
//     console.log('second...')
//  }
//  function third(){
//     console.log('third...')
//  }
//  first();
//  second();
//  third();


//  function first(){
//     console.log('first...')
//     second()
//  }
//  function second(){
//     console.log('second...')
//     third()
//  }
//  function third(){
//     console.log('third...')
//  }
//  first();


// let number;
// number = 100;

// let number =100;
var number=100;  // creates a variable (it was used in earlier times, nowadays let is used)
console.log(number);

const number1=200;
console.log(number1);

let number3;
number3=number;
console.log(number3);

let user=30,
name="john",
age=24;

alert('hello world');
[1,2].forEach(alert);