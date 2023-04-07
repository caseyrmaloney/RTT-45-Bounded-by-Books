<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/header.jsp" />

<section>
    <div>
        <h1> Browse Books</h1>
    </div>
</section>

<section>
    <div class="container">
        <div class="row text-center justify-content-center">
            <div class="col-5">
                <form action="/books/createSubmit">
                    <div class="input-group mb-3">
                        <input
                                type="text"
                                class="form-control"
                                name="title"
                                placeholder="Search a Book Title"
                                aria-label="Book Title"
                                value="${title}"
                        />
                    </div>
                    <button class="btn btn-outline-secondary" id="search">Search</button>
                </form>
            </div>
        </div>

    </div>

</section>

<style>
    .content-wrapper{
        display: flex;
        justify-content: center;
        wrap: wrap;
        width: 600px;
    }

    .cards-wrapper{
        text-align: center;
    }

    .img-card-wrapper{
        background-color: #8e8e8c;
        padding: 10px;
    }

    .img-card-wrapper img{
        width: 70px;
    }

</style>
<section class="section2">
    <div class="content-wrapper">
        <div class="cards-wrapper">
            <c:forEach items="${booksList}" var="books">

                <div class="img-card-wrapper">
                    <img src="${books.bookCover}" />
                </div>

                <div class="card-text-wrapper">
                    <h3> ${books.title}</h3>
                    <p> ${books.author}</p>

                </div>

            </c:forEach>

        </div>
    </div>
</section>