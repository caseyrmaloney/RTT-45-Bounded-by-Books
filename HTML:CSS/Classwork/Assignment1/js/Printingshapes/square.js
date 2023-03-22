//PART A 
var width = prompt("Please enter a width: "); 
var height= prompt("Please enter a height: "); 

let shape = ""; 
console.log("Shape: ")
for(var i =0; i<height; i++){ 
    for (var j = 0; j<width; j++){ 
        shape += '*'; 
    }
    shape += "\n"; 
}

console.log(shape); 


//PART B - CHECKERBOAD 

