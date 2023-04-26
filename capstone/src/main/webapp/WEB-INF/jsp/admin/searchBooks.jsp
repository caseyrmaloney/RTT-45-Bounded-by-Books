<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/header.jsp" />

<section class="pt-5 pb-5 bg-dark-grey">
  <div class="container text-center">
    <h1>Book search</h1>
  </div>
</section>

<section class="pt-5 pb-5">
  <div class="container">
    <div class="row text-center justify-content-center">
      <div class="col-5">
        <form>
          <div class="input-group mb-3">
            <input
              type="text"
              class="form-control"
              name="title"
              placeholder="Book Title"
              aria-label="Book Title"
              value="${title}"
            />
          </div>
          <div class="input-group mb-3">
            <input
              type="text"
              class="form-control"
              name="author"
              placeholder="Book Author"
              aria-label="Book Author"
              value="${author}"
            />
          </div>
          <button class="btn btn-outline-secondary" id="search">Search</button>
        </form>
      </div>
    </div>
  </div>
</section>

<section class="pt-5 pb-5 bg-dark-grey">
  <div class="container text-center">
    <h4 class="pb-2">${booksList.size()} Search Results</h4>

    <table class="table table-striped border">
      <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Title</th>
          <th scope="col">Genre</th>
          <th scope="col">Description</th>
          <th scope="col">Publish Date</th>
          <th scope="col">Author</th>
          <th scope="col">Page Length</th>
          <th scope="col">Edit</th>
        </tr>
      </thead>
      <tbody>
        <c:forEach items="${booksList}" var="book">
          <tr>
            <td>${book.id}</td>
            <td>${book.title}</td>
            <td>${book.genre}</td>
            <td>${book.description}</td>
            <td>${book.publishDate}</td>
            <td>${book.author}</td>
            <td>${book.pageLength}</td>
            <td><a href="/admin/edit/${book.id}"> Edit </a></td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</section>


<jsp:include page="../includes/footer.jsp"/>
