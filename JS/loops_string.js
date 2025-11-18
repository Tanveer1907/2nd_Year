//for loop
// let n = 100;
// let sum = 0;
// for(let i = 0;i<=n;i++){
//     sum+=i;
// }
// console.log(sum);

//while loop
// let n = 5;
// let i = 1;
// while(i<=n){
//     console.log(i);
//     i++;
// }


//do while loop
// let n = 5;
// let i = 1;
// do{
//     console.log(i);
//     i++;
// }
// while(i>n);

//for-of loop
// let str ="Tanveer";
// let length = str.length;
// for(let i of str){
//     console.log(i)
// }
// console.log(length);

//for-in loop
// let student ={
//     name:"Tanveer",
//     age : 19,
//     cgpa: 9.31,
// };
// for(let i in student){
//     console.log("key =",i,"value =", student[i]);//returns key and value of objects 
// }

//even numbers
// for(let i = 0;i<=100;i++){
//     if(i%2==0){
//     console.log(i);}
// }

//guess the number
// let num = 69;
// let guess = prompt("Guess the number: ");
// while(guess != num){
//     guess = prompt("You have guessed it wrong!!!");
// }
// console.log("Your guess was right!!");


//strings
// let obj = {
//     name : "Pen",
//     price :10,
// };
// let output = `The cost of ${obj.name} is ${obj.price}.`;//template literals - way to embed expresssions in string
// console.log(output);


//string methods
// let str = "Tanveer";
// let upper = str.toUpperCase();//all letters are now in upper case 
// console.log(upper);  

// let str1 = "   Hello World!! ";
// let trimmed = str1.trim();
// console.log(trimmed);

//q1
let fullname = prompt("Enter your name: ");
// let at = "@";
// let name_length = fullname.length;
// let user = at.concat(fullname);
// let username = user + fullname.length;
let username = "@" + fullname + fullname.length;
console.log(username);