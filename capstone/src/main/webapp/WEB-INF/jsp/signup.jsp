<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>

    <link rel="stylesheet" href="/pub/css/stylesheet.css" />

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
            href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;700&display=swap"
            rel="stylesheet"
    />

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
            href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400;700&display=swap"
            rel="stylesheet"
    />

    <!-- CDN via jsDelivr links -->
    <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
    />
    <script
            src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
            crossorigin="anonymous"
    ></script>
</head>
<body>

<!-- INTERAL STYLE SHEET -->
<style>
    .login-section {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 900px;
    }
    .left-side-wrapper {
        text-align: center;
    }
    .left-side {
        width: 60vw;

    }
    .right-side {
        width: 40vw;
    }

    .img-right{
        width: 800px;


    }

</style>



    <section class="login-section">
        <!-- LEFT SIDE -->
        <section class="left-side">
            <div class="left-side-wrapper">
                <div>
                    <img style="width: 60px" src="/pub/images/BoundedByBooks.png" />
                </div>

                <div style="margin: 2em">
                    <h1 style="margin: 0.5em">Join Our Community!</h1>
                    <p>Welcome! We're excited to have you.</p>
                </div>

    <div class="container" >
        <div class="row justify-content-center">
            <!-- call form submit -->
            <form method="POST" action="/signup">
                <div class="mb-5">
                    <label style="float: left" for="exampleInputEmail1" class="form-label"
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
                    <div style="float: left" id="emailHelp" class="form-text">
                        We'll never share your email with anyone else.
                    </div>
                </div>
                <div class="mb-3">
                    <label style="float: left" for="firstNameInput" class="form-label">First Name</label>
                    <input
                            type="text"
                            name="firstName"
                            class="form-control"
                            id="firstNameInput"
                            aria-describedby="firstNameHelp"
                    />

                </div>
                <div class="mb-3">
                    <label style="float: left" for="lastNameInput" class="form-label">Last Name</label>
                    <input
                            type="text"
                            name="lastName"
                            class="form-control"
                            id="lastNameInput"
                            aria-describedby="lastNameHelp"
                    />

                </div>
                <div class="mb-5">
                    <label style="float: left" for="password" class="form-label">Password</label>
                    <input
                            type="password"
                            class="form-control"
                            name="password"
                            id="password"
                            aria-describedby="passwordHelp"
                    />
                    <div style="float: left" id="passwordHelp" class="form-text">
                        Minimum: 8 characters, with uppercase, lowercase, and a number
                    </div>
                </div>
                <div class="mb-5">
                    <label style="float: left" for="confirmPassword" class="form-label"
                    >Confirm Password</label
                    >
                    <input
                            type="password"
                            class="form-control"
                            name="confirmPassword"
                            id="confirmPassword"
                            aria-describedby="confirmPasswordHelp"
                    />
                    <div style="float: left" id="confirmPasswordHelp" class="form-text">
                        Re-enter your password.
                    </div>
                </div>

                <div>
                    <p>Have an account with us already? <a href="/login/login">Login</a></p>
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
            </div>
        </section>



</section>
<section class="section2">
    <img src="/pub/images/stripes.png" alt="" srcset="" />
</section>

</body>
</html>
