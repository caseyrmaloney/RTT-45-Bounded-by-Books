<jsp:include page="includes/header.jsp"/>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>

<style>

    .bookcovers {
        width: 150px;
        z-index: 7;

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

    .books-wrapper {
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


        <sec:authorize access="!isAuthenticated()">
            <div class="section1-text-wrapper">
                <h1>
                    Join Our <br/>
                    Community
                </h1>
                <p>
                    Not sure what to read next? Join the world of books with us and be
                    part of the discussion! Add books to your shelves and join in on the
                    gossip of your favorite books!
                </p>

                <div class="button-divs">
                    <div class="text-div"><a href="">Join Now</a></div>
                    <div class="arrow-div">
                        <a href="/signup">
                            <img style="width: 30px" src="/pub/images/arrow-forward.png"
                            /></a>
                    </div>
                </div>
            </div>

        </sec:authorize>

        <sec:authorize access="isAuthenticated()">
            <div class="section1-text-wrapper">
                <h1>
                    Explore Our <br/>
                    Community
                </h1>
                <p>
                    Aenean lobortis et purus eu sodales. Orci varius natoque penatibus et magnis dis parturient montes,
                    nascetur ridiculus mus. Morbi rhoncus lacus justo, non pretium arcu mattis quis. Vivamus semper
                    neque in sem tempor malesuada.

                </p>

                <div class="button-divs">
                    <div class="text-div"><a href="">Explore</a></div>
                    <div class="arrow-div">
                        <a href="/books/explore">
                            <img style="width: 30px" src="/pub/images/arrow-forward.png"
                            /></a>
                    </div>
                </div>
            </div>

        </sec:authorize>

        <div class="books-wrapper">
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

    .card-img-div {
        background: rgb(254, 190, 39);
        background: linear-gradient(0deg, rgba(254, 190, 39, 1) 8%, rgba(254, 104, 47, 1) 33%, rgba(245, 45, 58, 1) 51%, rgba(209, 36, 104, 1) 72%, rgba(111, 9, 100, 1) 89%);
        padding: 2em 2em;
    }

    .card-title {
        font-size: 22px;
        padding-top: 10px;

    }

    .card-wrapper {
        margin: 2em 1em;
        text-align: center;
        width: 600px;
        border: black solid 1px;

    }


</style>

<section class="section3">

    <div class="sec3-content-wrapper">

        <div style="text-align: center" class="title-wrapper">

            <h1> Trending books </h1>

        </div>


        <div style="display: flex; justify-content: flex-start; width: 1000px " class="overflow-auto">

            <c:forEach items="${books}" var="books">
                <div class="card-wrapper">

                    <div class="card-img-div">
                        <img style="width: 200px" src="${books.bookCover}"/>
                    </div>

                    <div class="card-content-div">
                        <h1 class="card-title">
                            <a class="card-link" href="/books/details/${books.id}"> ${books.title}</a>
                        </h1>
                    </div>

                </div>
            </c:forEach>

        </div>


    </div>
</section>

</body>
</html>
