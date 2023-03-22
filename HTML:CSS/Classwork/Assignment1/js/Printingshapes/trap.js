var width = prompt("Please enter a width: "); 
var height= prompt("Please enter a height: "); 

let difference = width - height; 



let shape = ""; 

if(difference > 5){ 
    //i = row # 
    //j is how many stars we take off for each row 
    for(let i = 1, j=0; i<=height; i++, j+=2){ 

        //the offset 
        for(let x=1; x<=j/2; x++){ 
            shape+=" "; 
        }
        //how many stars per row 
        for(let y =1; y<=width-j; y++){ 
            shape += "*"; 
     
        }
        //our new line 
        shape+='\n'; 
    }

}else { 
    console.log("impossible shape!")
}



console.log(shape); 