 //artithmetic operators
 let a = 5;
 let b = 6;
//  console.log("Sum =", a+b);
//  console.log("Diff =", a-b);
//  console.log("Product =", a*b);
//  console.log("Quotient =", a/b);
//  console.log("Remainder =", a%b);
//  console.log("Exponent =", a**b);

//unary operators
// console.log("a++ =", a++);
// console.log("++a =", ++a);


//assignment operators
//a+=5;//a = a+5
// a**=5;//a = a**5
// console.log(a);

//comparison operators
// console.log("5==5", a==b);//false print hoga
// console.log("5==2", a!=b);//true print hoga
// let c ="5";
// console.log("a==c", a==c);//true print hoga, js converts string to number then compares the numbers
// console.log("a==c", a===c);//false print hoga bcz (===) is strict, comparison is between string and number

//logical operators
// let con1 = a>b;
// let con2 = a==5;
// console.log("con1 && con2 = ",con1&&con2);//logical AND operator
// console.log("con1 || con2 = ", con1||con2);//logical OR operator
// console.log("!con1 = ", !con1);//logical NOT operator

//conditional statements
// let age = 19;
// if(age>=18){
//     console.log("Eligible to Vote");
// }
// else{
//     console.log("Not eligible");
// }

//ternary operator
//condition?true:false
// let age = 18;
// let result = age>=18?"Adult":"Not adult";
// console.log(result);

//prompt
// let num = prompt("Enter a number:");
// if(num%5==0){
//     console.log("Divisible by 5");
// }
// else{
//     console.log("Not divisble by 5");
// }

//grade system question
let marks= prompt("Enter the marks(0-100): ");
if(marks>=90 && marks<=100){
    console.log("A");
}
else if(marks>=70 && marks<=89){
    console.log("B");
}
if(marks>=60 && marks<=69){
    console.log("C");
}
if(marks>=50 && marks<=59){
    console.log("D");
}
else if(marks>=0 && marks<=49){
    console.log("F");
}