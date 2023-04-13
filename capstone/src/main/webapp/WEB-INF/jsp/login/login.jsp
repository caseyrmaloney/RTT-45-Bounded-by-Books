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
        height: 600px;
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
            <h1 style="margin: 0.5em">Welcome Back!</h1>
            <p>Welcome back! Please enter your details.</p>
          </div>

          <div class="container" style="width: 50%">
            <div class="row justify-content-center">
              <!-- call form submit -->
              <form method="POST" action="/login/login">
                <div class="mb-4">
                  <label  class="form-label"
                    >Email address</label
                  >
                  <input
                          type="text"
                          name="username"
                          placeholder="Email Address"
                          class="form-control"
                          aria-describedby="Email Address"
                  />
                  <div id="emailHelp" class="form-text"></div>
                </div>

                <div class="mb-4">
                  <label  class="form-label">Password</label>
                  <input
                          type="text"
                          name="password"
                          placeholder="Password"
                          class="form-control"
                          aria-describedby="Password"
                  />
                  <div id="passwordHelp" class="form-text">
                    Minium: 8 characters, with uppercase, lowercase, and a
                    number
                  </div>
                </div>

                <div>
                  <p>Don't have an account with us? <a href="/signup">Create Account</a></p>
                </div>

                <!-- need to add the type submit for form button -->
                <button
                  type="submit"
                  class="btn btn-primary mt-3 me-3"
                  onclick="formSubmit()"
                >
                  Sign In
                </button>
                <!-- cancelClicked is a js function -->
                <button
                  class="btn btn-secondary mt-3"
                  onclick="cancelClicked()"
                >
                  Cancel
                </button>
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
