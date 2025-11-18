// let marks = [97,98,99,100,96];
//for loop
// for(let i = 0;i<marks.length;i++){
//     console.log(marks[i]);
// } 

//for of loop
// let names = ["tanveer","bhanvi","ruhani","kartikya", "tanishq", "riya"];
// for(let i of names){
//     // console.log(i);
//     console.log(i.toUpperCase());
// }

//q1
// let marks = [85,97,44,37,76,60];
// let sum = 0;
// for(let mark of marks){
//     sum += mark;
// }
// let avg = sum/marks.length;
// console.log(`The avg marks of class = ${avg}`);

//q2
// let items = [250,645,300,900,50];
// for( let i = 0;i<items.length;i++){
//     let offer = items[i]/10;
//     items[i]= items[i]- offer;
    
// }console.log(`Value after offer = ${items}`);

//array methods
//push()
// let items = ["bat", "ball", "glove", "helmet"];
// let runs = [97,100,154,254];
// items.push("thigh pad");
// items.pop();
// items.toString();
// items.unshift("hello");//add to start
// items.shift();//deletes from start
// let sliced =items.slice(1,3);//returns a piece of array(starting, ending)
// let cricket = items.concat(runs);
// let spliced = items.splice(1,0,"l-guard");//changes the original array(add, remove, replace)->(starting index, delete count, new elements)
// console.log(items);
// console.log(sliced);
// console.log(spliced);


//q1
// let companies = ["Bloomberg", "Microsoft", "Uber", "Google", "IBM", "Netflix"];
// companies.shift();
// companies.splice(2,1,"Ola");
// companies.push("Amazon");
// console.log(companies);

