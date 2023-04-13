<jsp:include page="includes/header.jsp" />

<style>
    .title{
        display: flex;
        justify-content: center;
        text-align: center;
        font-family: Emporio-Hotel;
        margin:3em;
    }

</style>
<section class="title">
    <div>
        <h2>Create New Account</h2>
    </div>
</section>

<style>
    .section2{
        display: flex;
        justify-content: center;
    }

    .container{
        width: 50vw;

    }

</style>
<section class="section2">
    <div class="container" >
        <div class="row justify-content-center">
            <!-- call form submit -->
            <form method="POST" action="/signup">
                <div class="mb-3">
                    <label for="exampleInputEmail1" class="form-label"
                    >Email address</label
                    >
                    <input
                            type="email"
                            name="email"
                            placeholder="Email Address"
                            class="form-control"
                            id="exampleInputEmail1"
                            aria-describedby="emailHelp"
                    />
                    <div id="emailHelp" class="form-text">
                        We'll never share your email with anyone else.
                    </div>
                </div>
                <div class="mb-3">
                    <label for="firstNameInput" class="form-label">First Name</label>
                    <input
                            type="text"
                            name="firstName"
                            class="form-control"
                            id="firstNameInput"
                            aria-describedby="firstNameHelp"
                    />

                </div>
                <div class="mb-3">
                    <label for="lastNameInput" class="form-label">Last Name</label>
                    <input
                            type="text"
                            name="lastName"
                            class="form-control"
                            id="lastNameInput"
                            aria-describedby="lastNameHelp"
                    />

                </div>
                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input
                            type="password"
                            class="form-control"
                            name="password"
                            id="password"
                            aria-describedby="passwordHelp"
                    />
                    <div id="passwordHelp" class="form-text">
                        Minium: 8 characters, with uppercase, lowercase, and a number
                    </div>
                </div>
                <div class="mb-3">
                    <label for="confirmPassword" class="form-label"
                    >Confirm Password</label
                    >
                    <input
                            type="password"
                            class="form-control"
                            name="confirmPassword"
                            id="confirmPassword"
                            aria-describedby="confirmPasswordHelp"
                    />
                    <div id="confirmPasswordHelp" class="form-text">
                        Re-enter your password.
                    </div>
                </div>
                <!-- need to add the type submit for form button -->
                <button
                        type="submit"
                        class="btn btn-primary mt-3 me-3"
                        onclick="formSubmit()"
                >
                    Create Account
                </button>
                <!-- cancelClicked is a js function -->

            </form>
        </div>
    </div>
</section>