<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/header.jsp" />


<style>
    .section1{
        display: flex;
        justify-content: center;
        margin: 3em 3em;
    }
    .sec1-wrapper{
        display: flex;
        justify-content: center;
        width: 2000px;

    }
    .book-info{
        margin: 2em 3em;
    }
</style>
<section class="section1">

    <div class="sec1-wrapper">

        <div class="book-cover">
            <img style="width: 300px" src="${books.bookCover}"/>
        </div>

        <div class="book-info">
            <h1 style="margin: 1em 0px; color: #6F0964" > ${books.title} Review</h1>
            <h3 style="color: #D12468; padding-left: 15px; display: flex"> By:<p style="color: black; margin-left: 3px"> ${books.author}</p></h3>
            <p style="padding-left: 15px"> ${books.description}</p>
            <h5 style="color: #F52D3A; padding-left: 15px; display: flex"> Genre:<p style="color: black; margin-left: 3px"> ${books.genre}</p></h5>
            <h5 style="color: #fe682f; padding-left: 15px; display: flex"> Page Length: <p style="color: black; margin-left: 3px"> ${books.pageLength} pages</p></h5>
            <h5  style="color: #febe27; padding-left: 15px; display: flex"> Publish Date: <p style="color: black; margin-left: 3px"> ${books.publishDate}</p></h5>
        </div>


    </div>

    </div>

</section>

<style>
    .section2{
        text-align: center;
        display: flex;
        justify-content: center;
    }
    .title-div {
        border-top: black solid 1px;
        width: 900px;
    }

</style>

<section class="section2">

    <div class="title-div">

       <div>
           <h1 style="margin: 1em 3em"> What Did You Think? </h1>

       </div>

        <div>

            <form action="/books/commentSubmit">

                <input type="hidden" name="bookId" value="${books.id}"/>


                <div class="input-field">
                    <label for="comment"></label>
                    <textarea id="comment" name="comment" style="width: 700px" placeholder="This Book is...."
                              rows="5" cols="50"></textarea>

                </div>

                <button
                        type="submit"
                        id="commentButt"
                        class="btn btn-primary mt-3 me-3"
                        onclick="formSubmitComment()"
                >
                    Submit
                </button>

            </form>


        </div>



    </div>


</section>

<section class="section2">
    <img src="/pub/images/stripes.png" alt="" srcset="" />
</section>


<jsp:include page="../includes/footer.jsp"/>
