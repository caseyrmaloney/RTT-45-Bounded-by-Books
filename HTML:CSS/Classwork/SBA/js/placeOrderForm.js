//fistNameInput //fistNameHelp
//lastNameInput //lastNameHelp
//emailInput //emailHelp
//phoneInput //phoneHelp
//monthInputs //monthHelp
//dayInputs //dayHelp
//yearInputs //yearHelp
//servingInput //servingHelp
//themeInputs //themeHelp 
//budgetInput //budgetHelp 
//deliveryInput //deliveryHelp 
//flavorInput //falvorHelp 
//suggestionsInput //suggestionsHelp


//make sure flavor and icing is at least one checked 
//make sure suggestions is checked 

function formSubmit(){ 

    isEmpty(); 
    minBudget(); 
    dateCheck(); 
    selectionChecked();
    flavors(); 
   
 
 }

//VALUES CANT BE AN EMPTY STRING 
function isEmpty(){
    //FIRST NAME
    let firstNameInput = document.getElementById('firstNameInput'); 
    let firstNameValue = firstNameInput.value;

    if(firstNameValue == ''){ 
        firstNameInput.classList.add('is-invalid'); 
        document.getElementById('firstNameHelp').innerText = 'Please enter your first name.'
        document.getElementById('firstNameHelp').style.cssText='color:red;'
    }

    //LAST NAME 
    let lastNameInput = document.getElementById('lastNameInput'); 
    let lastNameValue = lastNameInput.value; 

    if(lastNameValue == ''){ 
        lastNameInput.classList.add('is-invalid'); 
        document.getElementById('lastNameHelp').innerText = 'Please enter your last name.'
        document.getElementById('lastNameHelp').style.cssText='color:red;'
    }

    //EMAIL
    let emailInput = document.getElementById('emailInput'); 
    let emailValue = emailInput.value; 

    if(emailValue == ''){ 
        emailInput.classList.add('is-invalid'); 
        document.getElementById('emailHelp').innerText = 'Please enter your email.'
        document.getElementById('emailHelp').style.cssText='color:red;'
    }

    //PHONE
    let phoneInput = document.getElementById('phoneInput'); 
    let phoneValue = phoneInput.value; 

    if(phoneValue == ''){ 
        phoneInput.classList.add('is-invalid'); 
        document.getElementById('phoneHelp').innerText = 'Please enter your email.'
        document.getElementById('phoneHelp').style.cssText='color:red;'
    }


    //SERVING 
    let servingInput = document.getElementById('servingInput'); 
    let servingValue = servingInput.value; 

    if(servingValue == ''){ 
        servingInput.classList.add('is-invalid'); 
        document.getElementById('servingHelp').innerText = 'Please enter a serving'
        document.getElementById('servingHelp').style.cssText='color:red;'
    }

    //THEMES 
    let themeInput = document.getElementById('themeInput'); 
    let themeValue = themeInput.value; 

    if(themeValue == ''){ 
        themeInput.classList.add('is-invalid'); 
        document.getElementById('themeHelp').innerText = 'Please enter a theme'
        document.getElementById('themeHelp').style.cssText='color:red;'
    }

    //BUDGET 
    let budgetInput = document.getElementById('budgetInput'); 
    let budgetValue = budgetInput.value; 

    if(budgetValue == ''){ 
        budgetInput.classList.add('is-invalid'); 
        document.getElementById('budgetHelp').innerText = 'Please enter your budget'
        document.getElementById('budgetHelp').style.cssText='color:red;'
    }

    //DELIVERY 
    let deliveryInput = document.getElementById('deliveryInput'); 
    let deliveryValue = deliveryInput.value; 

    if(deliveryValue == ''){ 
        deliveryInput.classList.add('is-invalid'); 
        document.getElementById('deliveryHelp').innerText = 'Please enter where you are getting the delivery'
        document.getElementById('deliveryHelp').style.cssText='color:red;'
    }

}


//CHECKING IF BUDGET IS OVER 100
function minBudget(){ 
    let budgetInput = document.getElementById('budgetInput'); 
    let budgetValue = budgetInput.value; 

    if(budgetValue < 100){ 
        budgetInput.classList.add('is-invalid'); 
        document.getElementById('budgetHelp').innerText = 'Budget Needs to be above $100.00'
        document.getElementById('budgetHelp').style.cssText='color:red;'
    }
}

function dateCheck(){ 
    let monthInput= document.getElementById('monthInputs'); 
    let monthValue = monthInput.value;


    if(monthValue == ''){ 
        console.log('here')
        monthInput.classList.add('is-invalid'); 
        document.getElementById('monthHelp').innerText = 'Month is required'
        document.getElementById('monthHelp').style.cssText='color:red;'
    }

    let dayInput= document.getElementById('dayInputs'); 
    let dayValue = dayInput.value;

    if(dayValue == ''){ 
        console.log('here')
        monthInput.classList.add('is-invalid'); 
        document.getElementById('dayHelp').innerText = 'Month is required'
        document.getElementById('dayHelp').style.cssText='color:red;'
    }
    
    let yearInput= document.getElementById('yearInputs'); 
    let yearValue = yearInput.value;

    if(yearValue == ''){ 
        
        yearInput.classList.add('is-invalid'); 
        document.getElementById('yearHelp').innerText = 'Year is required'
        document.getElementById('yearHelp').style.cssText='color:red;'
    }
    
    
}

function selectionChecked(){ 
    let yes = document.getElementById('yes'); 
    let no = document.getElementById('no'); 

    if(!yes.checked && !no.checked){ 

        document.getElementById('suggestionsHelp').innerText = 'Please select an option'
        document.getElementById('suggestionsHelp').style.cssText='color:red;'
    }
}


function flavors(){ 

    var flavors = []
    var checkboxes = document.querySelectorAll('input[type=checkbox]:checked')
    
    for (var i = 0; i < checkboxes.length; i++) {
      flavors.push(checkboxes[i].value)
    }

    console.log(flavors); 


}


