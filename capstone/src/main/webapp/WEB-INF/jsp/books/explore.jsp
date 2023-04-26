<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/header.jsp" />

<style>
    .title{
        display: flex;
        justify-content: center;
        text-align: center;
        margin: 3em;
    }
    .title-color{
        background: #FEBE27;
        background: radial-gradient(circle farthest-corner at center center, #FEBE27 10%, #FE682F 28%, #F52D3A 44%, #D12468 60%, #6F0964 78%);
        -webkit-background-clip: text;
        -webkit-text-fill-color: transparent;
        padding: .5em ;
    }

</style>
<section class="title">
    <div>
        <h1> Browse Books</h1>
    </div>
</section>

<section>
    <div class="container">
        <div class="row text-center justify-content-center">
            <div class="col-5">
                <form action="/books/explore">
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


    }

    .cards-wrapper{
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


    .section2{
        display: flex;
        justify-content: center;
    }

    .img-wrapper{
        background: rgb(254, 190, 39);
        background: linear-gradient(0deg, rgba(254, 190, 39, 1) 8%, rgba(254, 104, 47, 1) 33%, rgba(245, 45, 58, 1) 51%, rgba(209, 36, 104, 1) 72%, rgba(111, 9, 100, 1) 89%);
        width: 200px;
        padding: 2em 2em;
    }

    tr:nth-child(even){
        background-color: #6f0964;
    }

    .card-wrapper{
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





</style>
<section class="section2">
    <div class="content-wrapper">
        <div class="cards-wrapper">
            <c:forEach items="${booksList}" var="book">


                <div class="card-wrapper" style="margin: 0em 3em">
                    <div class="img-wrapper" style="margin-bottom: 1em">
                        <img style="width: 150px; padding-right: 1em" src="${book.bookCover}" />
                    </div>
                    <h1 class="card-title">
                        <a class="card-link" href="/books/details/${book.id}"> ${book.title}</a>
                    </h1>

                    <p> ${book.author}</p>
                </div>

            </c:forEach>


        </div>
    </div>
</section>



<jsp:include page="../includes/footer.jsp"/>
