let input = prompt("Input Size: "); 

shape = ""; 

for(let i =0; i<input; i++){ 
    for(let j =0; j<input; j++){ 
        //first and last position 
        if(i == j || j == (input-i-1)){ 
            shape += " *"
        } 
        else {
             shape += " "; 
        }
    }
    shape += "\n"; 
}

console.log(shape); 