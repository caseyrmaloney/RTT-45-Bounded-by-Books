<jsp:include page="includes/header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<style>

    .bookcovers {
        width: 150px;

    }

    .section1 {
        height: 550px;
        margin: 5em 5em;

    }

    .section1-div {
        display: flex;
        justify-content: center;

    }

    .section1-text-wrapper {
        width: 500px;
        margin-top: 3em !important;
    }

    .section1-text-wrapper p {
        margin-top: 2em !important;
    }

    .book-wrapper {
        display: flex;
        justify-content: center;
        margin-left: 10em;
    }

    .book1-div {
        background-color: #718b7b;
        width: 250px;
        display: flex;
        justify-content: center;
        padding: 40px 10px;
        transform: rotate(15deg);

    }

    .book2-div {
        background-color: #febe27;
        width: 250px;
        display: flex;
        justify-content: center;
        padding: 40px 10px;
        transform: rotate(15deg) translate(9px, 15em);

    }

    .section2 {
        height: 300px
    }

    .section3 {
        margin: 5em;
        display: flex !important;
        justify-content: center !important;
    }

    .section3 h1 {
        margin: 1em 0em;
    }

    .cards-wrapper {
        display: flex;
        justify-content: center;
    }

    .card {
        width: 400px;
        margin: 0px .5em;
    }

    .text2-wrapper {
        display: flex;
        justify-content: center;
    }

    .carousel .carousel-control-prev {
        margin-right: 25em !important;
    }


</style>

<!-- SECTION 1 -->
<section class="section1">
    <div class="section1-div">
        <div class="section1-text-wrapper">
            <h1>
                Join Our <br/>
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
    <img src="/pub/images/stripes.png" alt="" srcset=""/>
</section>

<style>

    .section3 {
        display: flex;
        justify-content: center;
    }

    .title-wrapper {
        border-top: black solid 1px;
    }

    .card-link {
        text-decoration: none;
        color: black

    }

    .card-link:hover {
        background: #FEBE27;
        background: radial-gradient(circle farthest-corner at center center, #FEBE27 10%, #FE682F 28%, #F52D3A 44%, #D12468 60%, #6F0964 78%);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        padding: .5em;

    }

</style>

<section class="section3">

    <div class="sec3-content-wrapper">

        <div style="text-align: center" class="title-wrapper">

            <h1> Trending books </h1>

        </div>


        <div class="slides-wrapper">

            <div id="carouselExampleControls" class="carousel carousel-dark slide" data-bs-ride="carousel">
                <div  class="carousel-inner">

<%--                    CARDS WRAPPER IN SLIDES--%>


                        <div class="carousel-item active">
                            <%--            BOOK 1 --%>
                            <div style="text-align: center; display: flex; justify-content: center; background-color: #6F0964; padding-top: 3px"
                                 class="card" style="width: 18rem;">
                                <div>
                                    <img style="width: 200px; padding: 1em 0em;"
                                         src="/pub/images/book-covers/daisy-jones-and-the-six.png" class="card-img-top"
                                         alt="...">
                                    <div style="background-color: white" class="card-body">
                                        <p class="card-text">
                                        <h1 style="font-size: 20px; color: white;"><a class="card-link" href="/books/details/${books.id}">
                                            Daisy Jones and The Six</a></h1></p>
                                    </div>

                                </div>
                            </div>
                        </div>



                        <div class="carousel-item">
                            <%--            BOOK 2 --%>
                            <div style="text-align: center; display: flex; justify-content: center; background-color: #D12468; padding-top: 3px"
                                 class="card" style="width: 18rem;">
                                <div>
                                    <img style="width: 200px; padding: 1em 0em;" src="/pub/images/book-covers/corrupt.png"
                                         class="card-img-top" alt="...">
                                    <div style="background-color: white" class="card-body">
                                        <p class="card-text">
                                        <h1 style="font-size: 20px; color: white;"><a class="card-link" href="/books/details/${books.id}">
                                            Corrupt</a></h1></p>
                                    </div>

                                </div>
                            </div>
                        </div>




                        <div class="carousel-item">
                            <%--            BOOK 3--%>

                            <div style="text-align: center; display: flex; justify-content: center; background-color: #F52D3A; padding-top: 3px"
                                 class="card" style="width: 18rem;">
                                <div>
                                    <img style="width: 200px; padding: 1em 0em;"
                                         src="/pub/images/book-covers/court-of-mist-and-fury.png" class="card-img-top" alt="...">
                                    <div style="background-color: white;  width: 398px" class="card-body">
                                        <p class="card-text">
                                        <h1 style="font-size: 20px; color: white;"><a class="card-link" href="/books/details/${books.id}">
                                            A Court of Mist and Fury</a></h1></p>
                                    </div>

                                </div>
                            </div>
                        </div>




                        <div class="carousel-item">
                            <%--            BOOK 4 --%>
                            <div style="text-align: center; display: flex; justify-content: center; background-color: #fe682f; padding-top: 3px"
                                 class="card" style="width: 18rem;">
                                <div>
                                    <img style="width: 200px; padding: 1em 0em;" src="/pub/images/book-covers/the-score.png"
                                         class="card-img-top" alt="...">
                                    <div style="background-color: white;  width: 398px" class="card-body">
                                        <p class="card-text">
                                        <h1 style="font-size: 20px; color: white;"><a class="card-link" href="/books/details/${books.id}">
                                            The Score</a></h1></p>
                                    </div>

                                </div>
                            </div>
                        </div>



                        <div class="carousel-item">
                            <%--            BOOK 5--%>

                            <div style="text-align: center; display: flex; justify-content: center; background-color: #febe27; padding-top: 3px"
                                 class="card" style="width: 18rem;">
                                <div>
                                    <img style="width: 200px; padding: 1em 0em;"
                                         src="/pub/images/book-covers/a-court-of-thorns-and-roses.png" class="card-img-top" alt="...">
                                    <div style="background-color: white;  width: 398px" class="card-body">
                                        <p class="card-text">
                                        <h1 style="font-size: 20px; color: white;"><a class="card-link" href="/books/details/${books.id}">
                                            A Court of Thorns and Rose</a></h1></p>
                                    </div>

                                </div>
                            </div>
                        </div>



                        <div class="carousel-item">
                            <%--            BOOK 5--%>

                            <div style="text-align: center; display: flex; justify-content: center; background-color: #6F0964; padding-top: 3px"
                                 class="card" style="width: 18rem;">
                                <div>
                                    <img style="width: 200px; padding: 1em 0em;" src="/pub/images/book-covers/wonder.png"
                                         class="card-img-top" alt="...">
                                    <div style="background-color: white; width: 398px" class="card-body">
                                        <p class="card-text">
                                        <h1 style="font-size: 20px; color: white;"><a class="card-link" href="/books/details/${books.id}">
                                            Wonder</a></h1></p>
                                    </div>

                                </div>
                            </div>
                        </div>




                </div>
                <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="prev">
                    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Previous</span>
                </button>
                <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleControls" data-bs-slide="next">
                    <span class="carousel-control-next-icon" aria-hidden="true"></span>
                    <span class="visually-hidden">Next</span>
                </button>
            </div>

        </div>

    </div>


</section>

</body>
</html>
