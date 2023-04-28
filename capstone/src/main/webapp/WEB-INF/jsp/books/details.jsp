<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<jsp:include page="../includes/header.jsp"/>

<style>
    .section1 {
        display: flex;
        justify-content: center;
        margin: 3em 3em;
    }

    .sec1-wrapper {
        display: flex;
        justify-content: center;
        width: 2000px;

    }

    .book-info {
        margin: 2em 3em;
    }
</style>
<section class="section1">

    <div class="sec1-wrapper">

        <div class="book-cover">
            <img style="width: 300px" src="${books.bookCover}"/>
        </div>

        <div class="book-info">
            <h1 style="margin: 1em 0px; color: #6F0964"> ${books.title}</h1>
            <h3 style="color: #D12468; padding-left: 15px; display: flex"> By:<p
                    style="color: black; margin-left: 3px"> ${books.author}</p></h3>
            <p style="padding-left: 15px"> ${books.description}</p>
            <h5 style="color: #F52D3A; padding-left: 15px; display: flex"> Genre:<p
                    style="color: black; margin-left: 3px"> ${books.genre}</p></h5>
            <h5 style="color: #fe682f; padding-left: 15px; display: flex"> Page Length: <p
                    style="color: black; margin-left: 3px"> ${books.pageLength} pages</p></h5>
            <h5 style="color: #febe27; padding-left: 15px; display: flex"> Publish Date: <p
                    style="color: black; margin-left: 3px"> <fmt:formatDate pattern = "MM/dd/yyyy" value = "${books.publishDate}" /></p></h5>

            <%--        ADD BOOK TO THEIR LIBRARY FORM --%>

            <sec:authorize access="isAuthenticated()">
                <div>


                    <form action="/books/addBookToUserSubmit">

                        <input type="hidden" name="bookId" value="${books.id}"/>
                        <input type="hidden" name="id" value="${form.id}" />
                        <input type="hidden" name="title" value="${books.title}"/>


                        <label for="bookshelf"> Would you like to add this book? </label>
                        <select id="bookshelf" name="bookshelf">



                            <option value=""></option>
                            <option value="Want to Read"> Want to Read</option>
                            <option value="Currently Reading"> Currently Reading</option>
                            <option value="Finished Reading"> Finished Reading</option>
                        </select>

                        <button
                                style="background-color: #D12468; border: #D12468"
                                type="submit"
                                class="btn btn-primary mt-3 me-3">
                            Edit Status
                        </button>




                    </form>


                </div>

            </sec:authorize>
        </div>

    </div>

</section>

<style>
    .section2 {
        margin: 4em 3em;

        text-align: center;
    }

    .title-div {
        border-top: black solid 1px;
    }

    .title-div h1 {
        margin: 1em 3em;
    }

    .button {
        text-decoration: none;
        color: black;
        border: black solid 1px;
        padding: 1em 3em;
    }

    .button:hover {
        text-decoration: none;
        color: white;
        background: rgb(254, 190, 39);
        background: radial-gradient(circle, rgba(254, 190, 39, 1) 0%, rgba(254, 104, 47, 1) 23%, rgba(245, 45, 58, 1) 43%, rgba(209, 36, 104, 1) 75%, rgba(111, 9, 100, 1) 91%);
        padding: 1em 3em;


    }


</style>


<section class="section2">

    <div class="title-div">
        <h1> Community Reviews </h1>

        <sec:authorize access="isAuthenticated()">

            <a class="button" href="/books/comment/${books.id}"> Write a Review</a>


        </sec:authorize>


    </div>

</section>

<style>
    .section2 {
        display: flex;
        justify-content: center;
        text-align: center;
        margin: 2em 2em;
    }

    .content-wrapper {
        display: flex;
        justify-content: flex-start;
        margin: 3em 5em;
        width: 900px;
    }


</style>

<section class="section2">


    <div class="sec2-div">

        <c:forEach items="${commentsList}" var="comments">
            <div class="content-wrapper">

                <div>
                    <h3> ${user.firstName} ${user.lastName} </h3>

                    <h6> ${comments.createDate}</h6>


                </div>

                <div style="margin: 0em 12em">
                    <p> ${comments.comment}</p>
                </div>


            </div>


        </c:forEach>


    </div>

</section>

<section class="section2">
    <img src="/pub/images/stripes.png" alt="" srcset=""/>
</section>



<jsp:include page="../includes/footer.jsp"/>
