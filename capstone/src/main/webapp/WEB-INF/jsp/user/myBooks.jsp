<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="../includes/header.jsp"/>

<style>
    .content-wrapper {
        display: flex;
        justify-content: center;


    }

    .cards-wrapper {
        justify-content: center;
        text-align: center;
        display: grid;
        grid-template-columns: repeat(4, 1fr);
        grid-gap: 10px;
        grid-auto-rows: minmax(100px, auto);

        margin-top: 3em;
        margin-right: 1em;


        width: 800px;
    }


    .section1 {
        display: flex;
        justify-content: center;
        margin: 3em 3em;
    }

    .img-wrapper {
        background: rgb(254, 190, 39);
        background: linear-gradient(0deg, rgba(254, 190, 39, 1) 8%, rgba(254, 104, 47, 1) 33%, rgba(245, 45, 58, 1) 51%, rgba(209, 36, 104, 1) 72%, rgba(111, 9, 100, 1) 89%);
        width: 200px;
        padding: 2em 2em;
    }

    tr:nth-child(even) {
        background-color: #6f0964;
    }

    .card-wrapper {
        width: 200px;

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

    .card-title {
        font-size: 22px;
        padding-top: 10px;

    }

    .search-link{
        text-decoration: none;
        color: #D12468;
    }

    .search-link:hover{
        text-decoration: none;
        color: #fe682f;
    }


</style>

<c:if test="${!hasBooks}">


    <section class="section1">

        <div style="text-align: center; " class="title-wrapper">
            <h1> My Books </h1>
            <h3 style="margin: 2em 2em"> Looks like you don't have any books in your Library. <a class="search-link"
                                                                                                 href="/books/explore">
                Search for some books.</a></h3>


        </div>

    </section>

    <section class="border">
        <img src="/pub/images/stripes.png" alt="" srcset=""/>
    </section>


</c:if>

<c:if test="${hasBooks}">

    <section class="section1">

        <div>
            <h1> My Books </h1>
        </div>


    </section>

    <section class="section2">

        <div class="content-wrapper">
            <div class="cards-wrapper">
                <c:forEach items="${bookList}" var="book">


                    <div class="card-wrapper" style="margin: 0em 3em">
                        <div class="img-wrapper" style="margin-bottom: 1em">
                            <img style="width: 150px; padding-right: 1em" src="${book.book_cover_url}"/>
                        </div>
                        <h1 class="card-title">
                            <a class="card-link" href="/books/details/${book.id}"> ${book.title}</a>
                        </h1>

                        <p> ${book.author}</p>
                        <form action="/books/addBookToUserSubmit">

                            <input type="hidden" name="bookId" value="${books.id}"/>

                            <select id="bookshelf" name="bookshelf">
                                <option value=""></option>
                                <option value="Want to Read"> Want to Read</option>
                                <option value="Currently Reading"> Currently Reading</option>
                                <option value="Finished Reading"> Finished Reading</option>
                            </select>

                            <button type="submit"
                                    class="btn btn-primary mt-3 me-3">
                                Update Status
                            </button>

                        </form>
                    </div>

                </c:forEach>


            </div>
        </div>

    </section>


    <section class="border">
        <img src="/pub/images/stripes.png" alt="" srcset=""/>
    </section>

</c:if>

<c:if test="${isReading}">

    <section class="section1">

        <div>
            <h1> Currently Reading </h1>
        </div>


    </section>


    <section class="section2">

        <div class="content-wrapper">
            <div class="cards-wrapper">
                <c:forEach items="${bookList}" var="book">
                    <c:if test="${book.bookshelf eq 'Currently Reading'}">


                        <div class="card-wrapper" style="margin: 0em 3em">
                            <div class="img-wrapper" style="margin-bottom: 1em">
                                <img style="width: 150px; padding-right: 1em" src="${book.book_cover_url}"/>
                            </div>
                            <h1 class="card-title">
                                <a class="card-link" href="/books/details/${book.id}"> ${book.title}</a>
                            </h1>

                            <p> ${book.author}</p>
                        </div>

                    </c:if>

                </c:forEach>


            </div>
        </div>

    </section>


    <section class="border">
        <img src="/pub/images/stripes.png" alt="" srcset=""/>
    </section>

</c:if>


<c:if test="${wantToRead}">
    <section class="section1">

        <div>
            <h1> Want to Read </h1>
        </div>


    </section>


    <section class="section2">

        <div class="content-wrapper">
            <div class="cards-wrapper">
                <c:forEach items="${bookList}" var="book">
                    <c:if test="${book.bookshelf eq 'Want to Read'}">


                        <div class="card-wrapper" style="margin: 0em 3em">
                            <div class="img-wrapper" style="margin-bottom: 1em">
                                <img style="width: 150px; padding-right: 1em" src="${book.book_cover_url}"/>
                            </div>
                            <h1 class="card-title">
                                <a class="card-link" href="/books/details/${book.id}"> ${book.title}</a>
                            </h1>

                            <p> ${book.author}</p>
                        </div>

                    </c:if>

                </c:forEach>


            </div>
        </div>

    </section>

    <section class="border">
        <img src="/pub/images/stripes.png" alt="" srcset=""/>
    </section>
</c:if>

<c:if test="${finished}">

    <section class="section1">

        <div>
            <h1> Finished Reading </h1>
        </div>


    </section>


    <section class="section2">

        <div class="content-wrapper">
            <div class="cards-wrapper">
                <c:forEach items="${bookList}" var="book">
                    <c:if test="${book.bookshelf eq 'Finished Reading'}">


                        <div class="card-wrapper" style="margin: 0em 3em">
                            <div class="img-wrapper" style="margin-bottom: 1em">
                                <img style="width: 150px; padding-right: 1em" src="${book.book_cover_url}"/>
                            </div>
                            <h1 class="card-title">
                                <a class="card-link" href="/books/details/${book.id}"> ${book.title}</a>
                            </h1>

                            <p> ${book.author}</p>
                        </div>

                    </c:if>

                </c:forEach>


            </div>
        </div>

    </section>


</c:if>

