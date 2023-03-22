var person= { 
    firstName: "John", 
    lastName: "Doe",
    age: 50, 
    eyeColor: "blue", 
    loction: ["PA", "NJ", "CO"]
}; 

console.log(person.firstName); 

person.firstName = "Casey"; 

//  normal way to access the variables 
console.log(person.firstName); 
// acessing like its in an array 
console.log(person["firstName"]); 

person.newVar = 'New Variable'; 

console.log(person.newVar); 

console.log(person.loction[0]); 