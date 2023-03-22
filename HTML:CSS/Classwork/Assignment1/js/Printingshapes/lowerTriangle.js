var number = prompt("Please enter a number: "); 

let shape = ""; 
for(let i = 0; i < number; i++){ 
    for(let j = 0; j<i;  j++){ 
        shape += '*'; 
    }
    shape += '\n'; 
}

console.log(shape); 