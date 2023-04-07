<jsp:include page="includes/header.jsp" />

<style>

.bookcovers{ 
    width: 150px;
    
}

.section1{ 
   height: 550px;
    margin:5em 5em;

}

.section1-div{ 
    display: flex;
    justify-content: center;

}

.section1-text-wrapper{ 
    width: 500px;
    margin-top: 3em !important;
}

.section1-text-wrapper p{ 
    margin-top: 2em !important;
}

.book-wrapper{ 
    display:flex;
    justify-content: center;
    margin-left: 10em;
}

.book1-div{ 
    background-color: #718b7b;
    width: 250px;
    display: flex;
    justify-content: center;
    padding: 40px 10px;
    transform: rotate(15deg);
    
}
.book2-div{ 
    background-color: #febe27;
    width: 250px;
    display: flex;
    justify-content: center;
    padding: 40px 10px;
    transform: rotate(15deg) translate(9px, 15em);
    
}

.section2{ 
    height:300px
}

.section3{ 
    margin: 5em; 
    display: flex !important;
    justify-content: center !important;
}

.section3 h1{ 
    margin: 1em 0em; 
}

.cards-wrapper{ 
    display: flex;
    justify-content: center;
}

.card{ 
    width: 400px; 
    margin: 0px .5em;
}

.text2-wrapper{ 
    display: flex;
    justify-content: center;
}

.carousel .carousel-control-prev{ 
    margin-right: 25em !important;
}





</style>

    <!-- SECTION 1 -->
    <section class="section1">
      <div class="section1-div">
        <div class="section1-text-wrapper">
          <h1>
            Join Our <br />
            Community
          </h1>
          <p>
            Not sure what to read next? Join the world of books with us and be
            part of the discussion! Add books to your shelves and join in on the
            gossip of your favorite book!
          </p>

          <div class="button-divs">
            <div class="text-div"><a href="">Join Now</a></div>
            <div class="arrow-div">
              <a href="google.com" target="_blank">
                <img style="width: 30px" src="/pub/images/arrow-forward.png"
              /></a>
            </div>
          </div>
        </div>

        <div class="book-wrapper">
          <div class="book1-div">
            <img
              class="bookcovers"
              src="/pub/images/book-covers/verity.jpeg"
              alt=""
            />
          </div>
          <div class="book2-div">
            <img
              class="bookcovers"
              src="/pub/images/book-covers/a-court-of-thorns-and-roses.png"
              alt=""
            />
          </div>
        </div>
      </div>
    </section>

    <section class="section2">
      <img src="/pub/images/stripes.png" alt="" srcset="" />
    </section>

    <section class="section3">
      <div>
        <div class="text2-wrapper">
          <h1>Top Trending Books</h1>
        </div>

        <button
          class="carousel-control-prev"
          type="button"
          data-bs-target="#carouselExampleControls"
          data-bs-slide="prev"
        >
          <span class="carousel-control-prev-icon" aria-hidden="true"></span>
          <span class="visually-hidden">Previous</span>
        </button>

        <div
          id="carouselExampleControls"
          class="carousel carousel-dark"
          data-bs-ride="carousel"
        >
          <div class="carousel-inner">
            <div class="carousel-item active">
              <!-- SLIDE 1 -->
              <div class="cards-wrapper">
                <!-- CARD 1 -->
                <div class="card">
                  <img src="..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>

                <!-- CARD 2 -->
                <div class="card">
                  <img src="..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>

                <!-- CARD 3 -->
                <div class="card">
                  <img src..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>
              </div>
            </div>
            <div class="carousel-item">
              <!-- SLIDE 1 -->
              <div class="cards-wrapper">
                <!-- CARD 1 -->
                <div class="card">
                  <img src="..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>

                <!-- CARD 2 -->
                <div class="card">
                  <img src="..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>

                <!-- CARD 3 -->
                <div class="card">
                  <img src..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>
              </div>
            </div>
            <div class="carousel-item">
              <!-- SLIDE 1 -->
              <div class="cards-wrapper">
                <!-- CARD 1 -->
                <div class="card">
                  <img src="..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>

                <!-- CARD 2 -->
                <div class="card">
                  <img src="..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>

                <!-- CARD 3 -->
                <div class="card">
                  <img src..." class="card-img-top" alt="..." />
                  <div class="card-body">
                    <h5 class="card-title">Card title</h5>
                    <p class="card-text">
                      Some quick example text to build on the card title and
                      make up the bulk of the card's content.
                    </p>
                    <a href="#" class="btn btn-primary">Go somewhere</a>
                  </div>
                </div>
              </div>
            </div>
          </div>

          <button
            class="carousel-control-next"
            type="button"
            data-bs-target="#carouselExampleControls"
            data-bs-slide="next"
          >
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
            <span class="visually-hidden">Next</span>
          </button>
        </div>
      </div>
    </section>
  </body>
</html>
