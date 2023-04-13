<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/header.jsp" />

<section>
    <div>

        <h1> Community Reviews </h1>
        <a href="/books/comment/${books.id}"> Write a Review </a>


    </div>

    <div>

        <div>
            <h3> User name </h3>
            <h4> rating </h4>

        </div>

        <div>
            <table>
                <c:forEach items="${commentsList}" var="comments">
                    <tr>
                        <td> ${comments.userId}</td>
                        <td> ${comments.comment}</td>
                        <td> ${comments.createDate}</td>

                    </tr>

                </c:forEach>
            </table>

        </div>

        <div>
            <p> date </p>

        </div>

    </div>

</section>