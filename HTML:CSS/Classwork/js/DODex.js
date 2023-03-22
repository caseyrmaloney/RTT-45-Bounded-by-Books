function cancelClicked(){ 

   var items = document.querySelectorAll('.is-invalid'); 
   //i is the elements in the list items 
   for(i of items){ 
    console.log(i); 
    let item =i; 
    item.classList.remove('is-invalid'); 
   }
}

function formSubmit(){ 
    
    let emailInput = document.getElementById('exampleInputEmail1'); 
    let emailValue = emailInput.value; 
    console.log(emailValue); 

    let passwordInput = document.getElementById('password'); 
    let passwordValue = passwordInput.value; 

    let confirmPasswordInput = document.getElementById('confirmPassword'); 
    let confirmPasswordValue = passwordInput.value; 

    //CANT BE AN EMPTY STRING 
    if(emailValue == '' ){ 
        alert('Email is invalid');
        emailInput.classList.add('is-invalid'); 
        document.getElementById('emailHelp').innerText = 'Please enter your email address'; 
        document.getElementById('emailHelp').style.cssText= 'color:red;'; 

    }

    if(passwordValue == ''){ 
        document.getElementById('passwordHelp').innerText= 'Please enter a password'
        document.getElementById('passwordHelp').style.cssText= 'color:red;'; 
        passwordInput.classList.add('is-invalid');
    }

    if(confirmPasswordValue == ''){ 

        confirmPasswordInput.classList.add('is-invalid'); 
        document.getElementById('confirmPasswordHelp').innerText= 'Please enter a password'
        document.getElementById('confirmPasswordHelp').style.cssText= 'color:red;'; 
    }

    // CHECKING IF THE PASSWORDS MATC 
    if(matchPass() == false ){
        document.getElementById('confirmPasswordHelp').innerText= 'Passwords must match'
        document.getElementById('confirmPasswordHelp').style.cssText= 'color:red;'; 
        confirmPasswordInput.classList.add('is-invalid'); 
    }
    else{
        //JUST PRINTING IF THE PASSWORDS MATCH  
        alert('All Good');
    }
   
    //CHECK IF ITS A VALID PASSWORD 
    if(checkPass() == false){ 
        document.getElementById('passwordHelp').innerText= 'Please enter a valid password'; 
        document.getElementById('passwordHelp').style.cssText= 'color:red;'; 
        passwordInput.classList.add('is-invalid');
      
        
    }else{
        //JUST PRINTING IF THE PASSWORD IS VALID  
        alert('All Good');
    }
    
    
}

function checkPass(){ 
    let passwordInput = document.getElementById('password'); 
    let passwordValue = passwordInput.value; 

    //REGEX FOR PASS: SPACE DIGIT LOWERCASE UPPERCASE AND LENGTH 
    let pass=  /^(?!.* )(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{7,20}$/;

    //If it matches the pass
    if(passwordValue.match(pass)){ 
        return true; 
    }
    else { 
        return false; 
    }



}


function matchPass(){ 
    let passwordInput = document.getElementById('password'); 
    let passwordValue = passwordInput.value; 

    let confirmPasswordInput = document.getElementById('confirmPassword'); 
    let confirmPasswordValue = confirmPasswordInput.value; 

    //SIMPLE IF STATMENT IF TWO VALUES MATCH 
    if(confirmPasswordValue != passwordValue){ 
        return false;  
    }
    else{ 
        return true; 
    }

}

