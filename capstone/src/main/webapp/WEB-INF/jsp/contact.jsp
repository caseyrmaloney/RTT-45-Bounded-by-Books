<jsp:include page="includes/header.jsp" />

<style>

    /* CONTACT FORM */

    .form-wrapper{
        display: flex;
        justify-content: center;
        height: 600px;


    }

    .form-left-wrapper{
        background: rgb(254, 190, 39);
        background: linear-gradient(0deg, rgba(254, 190, 39, 1) 8%, rgba(254, 104, 47, 1) 33%, rgba(245, 45, 58, 1) 51%, rgba(209, 36, 104, 1) 72%, rgba(111, 9, 100, 1) 89%);
        width: 50%;
        margin-right: 3em;
    }

    .form-right-wrapper{
        width: 50%;

    }

    .form-left-wrapper h1{
        font-size: 60px;
        margin-left: 2em;
        margin-top: 1em;

    }

    .first-last-wrapper{
        display: flex;
        justify-content: center;
    }

    .email-phone-wrapper{
        display: flex;
        justify-content: center;
    }



    .input-wrapper{
        margin: 1em;
        width: 300px;
    }

    .message-wrapper{

        display: flex;
        justify-content: center;

    }

    .message-input{
        margin-top: 1em;
        width:640px;
    }




</style>

<section class="form-wrapper" style="margin: 3em 0em">
    <section class="form-left-wrapper">
        <h1 style="color: white">
            We'd love to <br />
            hear from you
        </h1>
    </section>

    <section class="form-right-wrapper">
        <div class="mt-5">
            <h2>Contact Us</h2>

            <!-- FORM -->
            <form>
                <!-- FIRST NAME AND LAST NAME -->
                <div class="first-last-wrapper">
                    <!-- FIRST NAME -->
                    <div class="input-wrapper">
                        <label for="firstNameInput" class="form-label"
                        >First Name</label
                        >
                        <input
                                type="text"
                                placeholder="Enter your first name"
                                class="form-control"
                                id="firstNameInput"
                                aria-describedby="firstNameHelp"
                        />
                        <div id="firstNameHelp" class="form-text"></div>
                    </div>

                    <!-- LAST NAME -->
                    <div class="input-wrapper">
                        <div>
                            <label for="lastNameInput" class="form-label"
                            >Last Name</label
                            >
                            <input
                                    type="text"
                                    placeholder="Enter your last name"
                                    class="form-control"
                                    id="lastNameInput"
                                    aria-describedby="lastNameHelp"
                            />
                            <div id="lastNameHelp" class="form-text"></div>
                        </div>
                    </div>
                </div>

                <!-- EMAIL AND PHONE NUMBER DIV -->
                <div class="email-phone-wrapper">
                    <!-- EMAIL -->
                    <div class="input-wrapper">
                        <label for="emailInput" class="form-label">Email</label>
                        <input
                                type="email"
                                placeholder="Enter your email"
                                class="form-control"
                                id="emailInput"
                                aria-describedby="emailHelp"
                        />
                        <div id="emailHelp" class="form-text"></div>
                    </div>

                    <!--PHOONE -->
                    <div>
                        <div class="input-wrapper">
                            <label for="phoneInput" class="form-label"
                            >Phone Number</label
                            >
                            <input
                                    type="tel"
                                    placeholder="Enter your phone number"
                                    class="form-control"
                                    id="phoneInput"
                                    pattern="[0-9]{3}-[0-9]{3}-[0-9]{4}"
                                    aria-describedby="phoneHelp"
                            />
                            <div id="phoneHelp" class="form-text"></div>
                        </div>
                    </div>
                </div>

                <!-- MESSAGE -->

                <div class="message-wrapper">
                    <!-- FIRST NAME -->
                    <div class="message-input">
                        <label for="messageInput" class="form-label">Message</label>
                        <input
                                type="text"
                                placeholder="Enter your message"
                                class="form-control"
                                id="messageInput"
                                aria-describedby="messageHelp"
                        />
                        <div id="messageHelp" class="form-text"></div>
                    </div>
                </div>

                <!-- SUBMIT BUTTON -->
                <button style="background-color: #D12468; border: #D12468"
                        type="button"
                        class="btn btn-primary mt-3 me-3"
                        onclick="formSubmitContact()">
                    Submit
                </button>
                <!-- cancelClicked is a js function -->
                <button class="btn btn-secondary mt-3" onclick="cancelClicked()">
                    Cancel
                </button>
            </form>
        </div>
    </section>
</section>

<jsp:include page="includes/footer.jsp"/>
