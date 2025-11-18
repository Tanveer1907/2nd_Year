// function func(){
//     console.log("Hello World");
//     console.log("YOOOO!!!!");
// }
// func();

// function sum(a,b){
//     let s = a+b;
//     console.log(s);
// }
// sum(1,2);

//arrow function
//const funcname = (parameter1, parameter 2)=>{
    //}

// const arrowsum = (a,b)=>{
//     console.log(a+b);
// }
// arrowsum(4,5);

//q1
// function countvowels(str){
//     let count = 0;
//     for(let char of str){
//        if(char == 'a'||char == 'e'||char == 'i'||char == 'o'||char == 'u'||char == 'A'||char == 'E'||char == 'I'||char == 'O'||char == 'U'){
//         count++;
//        } 
//     }
//     console.log(count);
// }

// const countvowels = (str)=>{
// let count = 0;
//     for(let char of str){
//        if(char == 'a'||char == 'e'||char == 'i'||char == 'o'||char == 'u'||char == 'A'||char == 'E'||char == 'I'||char == 'O'||char == 'U'){
//         count++;
//        } 
//     }
//     console.log(count);
// }
// countvowels("Hello");

//forEach loop method
// let arr = [1,2,3,4,5]; 
// arr.forEach(function printVal(val) {
//     console.log(val);
// });

//q1 - sq of each number
let arr = [1,2,3,4,5]; 
arr.forEach(function square(val){
    console.log(val * val);
});