function formSubmitContact(){

    isEmpty();

}

function cancelClicked(){

    var items = document.querySelectorAll('.is-invalid');
    //i is the elements in the list items
    for(i of items){
        console.log(i);
        let item =i;
        item.classList.remove('is-invalid');
    }
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

    //MESSAGE
    let messageInput = document.getElementById('messageInput');
    let messageValue = messageInput.value;

    if(messageValue == ''){
        messageInput.classList.add('is-invalid');
        document.getElementById('messageHelp').innerText = 'Please enter your message.'
        document.getElementById('messageHelp').style.cssText='color:red;'
    }

}
