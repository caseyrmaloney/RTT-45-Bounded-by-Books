<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Bounded By Books</title>

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
    <header>
      <div class="nav-wrapper">
        <nav class="navbar navbar-expand-lg">
          <div class="container-fluid">
            <a class="navbar-brand" href="#"
              ><img
                class="nav-bar-logo"
                src="/pub/images/BoundedByBooksFullLogo.png"
              />
            </a>
            <button
              class="navbar-toggler"
              type="button"
              data-bs-toggle="collapse"
              data-bs-target="#navbarSupportedContent"
              aria-controls="navbarSupportedContent"
              aria-expanded="false"
              aria-label="Toggle navigation"
            >
              <span class="navbar-toggler-icon"></span>
            </button>
            <div
              class="collapse navbar-collapse nav-bar-items"
              id="navbarSupportedContent"
            >
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  <a class="nav-link active" aria-current="page" href="/index"
                    >Home</a
                  >
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="/books/explore">Explore</a>
                </li>
                <li class="nav-item dropdown">
                  <a
                    class="nav-link dropdown-toggle"
                    href="#"
                    id="navbarDropdownMenuLink1"
                    role="button"
                    data-bs-toggle="dropdown"
                    aria-expanded="false"
                  >
                    Books
                  </a>
                  <ul
                    class="dropdown-menu"
                    aria-labelledby="navbarDropdownMenuLink"
                  >
                    <li>
                      <a class="dropdown-item" href="/admin/searchBooks"
                        >Search Books</a
                      >
                    </li>
                    <li>
                      <a class="dropdown-item" href="/admin/books">Add Book</a>
                    </li>
                  </ul>
                </li>
                <li class="nav-item dropdown">
                  <a
                    class="nav-link dropdown-toggle"
                    href="#"
                    id="navbarDropdownMenuLink2"
                    role="button"
                    data-bs-toggle="dropdown"
                    aria-expanded="false"
                  >
                    Users
                  </a>
                  <ul
                    class="dropdown-menu"
                    aria-labelledby="navbarDropdownMenuLink"
                  >
                    <li>
                      <a class="dropdown-item" href="/admin/searchUser">Seacrh</a>
                    </li>
                    <li>
                      <a class="dropdown-item" href="/admin/user"
                        >Create User</a
                      >
                    </li>
                  </ul>
                </li>
              </ul>
              <form class="d-flex">
                <input
                  class="form-control me-2"
                  type="search"
                  placeholder="Search"
                  aria-label="Search"
                />
              </form>

              <div class="create-account-div">
                <a class="create-account" href="/user/login"> Sign In </a>
              </div>
            </div>
          </div>
        </nav>
      </div>
    </header>
  </body>
</html>
