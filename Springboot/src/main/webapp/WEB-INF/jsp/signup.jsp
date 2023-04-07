<jsp:include page="include/header.jsp" />
<style>
    body{
        background-color: rgb(209, 231, 255);
    }

</style>


<section class="pt-5 pb-5" style="background-color: rgb(163, 215, 255)">
    <div class="container text-center">
        <h2>Create New Account</h2>
    </div>
</section>
<section class="pt-4 pb-5">
    <div class="container" style="width: 50%">
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
                    <label for="fullNameInput" class="form-label">Full Name</label>
                    <input
                            type="text"
                            name="fullName"
                            class="form-control"
                            id="fullNameInput"
                            aria-describedby="fullNameHelp"
                    />
                    <div id="firstNameHelp" class="form-text">
                        Let us know who you are.
                    </div>
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

<jsp:include page="include/footer.jsp" />