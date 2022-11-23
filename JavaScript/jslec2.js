// let a=5;
// alert(a);
 
// let age=prompt('what is your age',25);
// alert(`your age is ${2+2}`);

// ${} can have variable as well as expression as its parameter

// gives a boolean value in the alert
// var isStudent = 4>1;  
// confirm(isStudent);

// function myAge(){
//     console.log("my age is 25");
// }
// myAge();

//function declaration

// console.log(sum(12,35));
// function sum(a,b){
//     let s =a+b;
//     return s;
// }

// function expression
// funtion-call in function expressions should be used only after declaration

// let myage=function(a,b){
//     let sum=a+b;
//     return(sum);
// }
// console.log(myage(23,45))


//arrow functions

// let myage= (a,b)=>a+b;
// console.log(myage(12,45));

//DATATYPES

// 1. number -> float,integer
// 2. strings
// 3. bigint
// 4. boolean
// 5. objects
// 6. null          ==>special value
// 7. undefined     ==>special value

// STRINGS
// can be written in single as well as double quotes .

// let str="this is a string";
// let num=25;
// console.log(typeof str);

// // with backticks also (` `)
// str=` this is a string`;

// console.log(str);
// console.log(str[1]);
// console.log(str.length);

// for(let i=0;i<str.length;i++){
//     console.log(str[i]);
// }

// similar if, for, while as in java


// sum of all numbers input, until 0 or null is encountered

// let sum=0;
// while(true){
//     let s=prompt("enter a number");
//     sum+= +s;
//     if(s==null || s==0){
//         alert(`your sum = ${sum}`);
//         break;
//     }
// }

// reverse words in a string
let s="this is a string";
let j=0;
let str="";
for(let i=0;i<s.length;i++){
    if(s[i]==" "){
        for(let k=i-1;k>=j;k--){
            str+=s[k];
        }
        j=i+1;
        str+=" ";
    }
}
for(let k=s.length-1;k>=j;k--){
    str+=s[k];
}
console.log(str);