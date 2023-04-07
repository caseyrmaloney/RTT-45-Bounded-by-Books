<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/adminHeader.jsp" />

<section class="pt-5 pb-5">
  <div class="container text-center">
    <c:if test="${empty form.id}">
      <h1>Add Book</h1>
    </c:if>
    <c:if test="${not empty form.id}">
      <h1>Edit Book</h1>
    </c:if>
  </div>
</section>

<section class="pt-5 pb-5">
  <div class="container">
    <div class="row justify-content-center">
      <div class="col-5">
        <form action="/admin/createSubmit">
          <input type="hidden" name="id" value="${form.id}" />

          <div class="mb-3">
            <label for="title" class="form-label"> Title </label>
            <input
              type="text"
              class="form-control"
              name="title"
              placeholder="Employee First Name"
              aria-label="Title"
              id="title"
              value="${form.title}"
            />
          </div>
          <div class="mb-3">
            <label for="genre" class="form-label"> Genre</label>
            <input
              type="text"
              class="form-control"
              name="genre"
              placeholder="Genre"
              aria-label="genre"
              id="genre"
              value="${form.genre}"
            />
          </div>
          <div class="mb-3">
            <label for="description" class="form-label"> Description </label>
            <input
              type="text-area"
              class="form-control"
              name="description"
              placeholder="Description"
              aria-label="Description"
              id="description"
              value="${form.description}"
            />
          </div>
          <div class="mb-3">
            <label for="publishDate" class="form-label"> Publish Date</label>
            <input
              type="datetime"
              class="form-control"
              name="publishDate"
              placeholder="Publish Date"
              aria-label="Publish Date"
              id="publishDate"
              value="${form.publishDate}"
            />
          </div>
          <div class="mb-3">
            <label for="author" class="form-label"> Author</label>
            <input
              type="text"
              class="form-control"
              name="author"
              placeholder="Author"
              aria-label="Author"
              id="author"
              value="${form.author}"
            />
          </div>
          <div class="mb-3">
            <label for="pageLength" class="form-label"> Page Length</label>
            <input
              type="text"
              class="form-control"
              name="pageLength"
              placeholder="Page Length"
              aria-label="Page Length"
              id="pageLength"
              value="${form.pageLength}"
            />
          </div>

          <div class="mb-3">
            <label for="bookCover" class="form-label"> Book Cover</label>
            <input
                    type="text"
                    class="form-control"
                    name="bookCover"
                    placeholder="Book Cover"
                    aria-label="Book Cover"
                    id="bookCover"
                    value="${form.bookCover}"
            />
          </div>
          <button
            type="submit"
            id="create_btn"
            class="btn btn-primary mt-3 me-2"
            onclick="formSubmit()"
          >
            Create Account
          </button>
        </form>
      </div>
    </div>
  </div>
</section>
