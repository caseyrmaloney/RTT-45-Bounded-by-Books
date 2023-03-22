var width = prompt("Please enter a width: "); 
var height= prompt("Please enter a height: "); 

let shape = ""; 
console.log("Shape: "); 



//row 
for(let i =0; i< height; i++){ 
    //col
    for(let j=0; j<width; j++){ 
        //spaces are odd 
        //stars are even 
       if((i+j) % 2 ===0){ 
        shape += '*'; 
       }
       else{ 
        shape += ' '; 
       }
    }
    shape += '\n';
}
console.log(shape); 