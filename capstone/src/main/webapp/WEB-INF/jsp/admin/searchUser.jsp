<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../includes/adminHeader.jsp" />

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1>User search</h1>
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
                                name="firstName"
                                placeholder="First Name"
                                aria-label="First Name"
                                value="${firstName}"
                        />
                    </div>
                    <div class="input-group mb-3">
                        <input
                                type="text"
                                class="form-control"
                                name="lastName"
                                placeholder="Last Name"
                                aria-label="Last Name"
                                value="${lastName}"
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
        <h4 class="pb-2">${userList.size()} Search Results</h4>

        <table class="table table-striped border">
            <thead>
            <tr>
                <th scope="col">ID</th>
                <th scope="col">First Name</th>
                <th scope="col">Last Name</th>
                <th scope="col">Email</th>
                <th scope="col">Password</th>

            </tr>
            </thead>
            <tbody>
            <c:forEach items="${userList}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.firstName}</td>
                    <td>${user.lastName}</td>
                    <td>${user.email}</td>
                    <td>${user.password}</td>
                    <td><a href="/admin/editUser/${user.id}"> Edit </a></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</section>
