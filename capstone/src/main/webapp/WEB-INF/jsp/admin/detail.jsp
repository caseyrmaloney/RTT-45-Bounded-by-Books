<jsp:include page="../includes/header.jsp" />

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>Book Detail</h1>
    </div>
</section>


<section class="pt-5 pb-5 bg-light-grey">
    <div class="container">
        <table class="table table-striped border">
            <tr>
                <td>Book Id</td>
                <td>${books.id}</td>
            </tr>
            <tr>
                <td>Title</td>
                <td><a href="/admin/search?title=${books.title}">${books.title}</a></td>
            </tr>
            <tr>
                <td>Author</td>
                <td><a href="/admin/search?author=${books.author}">${books.author}</a></td>
            </tr>
            <tr>
                <td>Genre</td>
                <td>${books.genre}</td>
            </tr>
            <tr>
                <td>Decription</td>
                <td>${books.description}</td>
            </tr>
            <tr>
                <td>Publish Date</td>
                <td>${books.publishDate}</td>
            </tr>
            <tr>
                <td>Page Length</td>
                <td>${books.pageLength}</td>
            </tr>
        </table>
    </div>
</section>