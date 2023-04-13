<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/header.jsp" />



</script>


<section>
    <div>
        <h1> Title Review </h1>
    </div>
</section>

<section>

    <div>

        <div>
<%--            book cover image goes here --%>
        </div>

        <div>
            <h3> Title </h3>
            <p> Author </p>
        </div>

        <div>
            <h3> My rating </h3>
            <h3> Add to shelf </h3>

        </div>

    </div>

</section>


<section>

    <div>
        <h4> What did you think? </h4>
    </div>

    <div>

         <form action="/books/commentSubmit">

             <input type="hidden" name="bookId" value="${books.id}"/>


             <div class="input-field">
                 <label for="comment">Additional Infomation</label>
                 <input type="textarea" id="comment" name="comment" />
             </div>

             <button
                     type="submit"
                     id="commentButt"
                     class="btn btn-primary mt-3 me-3"
                     onclick="formSubmit()"
             >
                Submit
             </button>

         </form>
    </div>


    </div>


</section>