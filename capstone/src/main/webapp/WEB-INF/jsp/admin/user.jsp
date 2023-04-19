<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../includes/header.jsp" />

<section class="pt-5 pb-5">
    <div class="container text-center">
        <c:if test="${empty form.id}">
            <h1>Add User</h1>
        </c:if>
        <c:if test="${not empty form.id}">
            <h1>Edit User</h1>
        </c:if>
    </div>
</section>

<section class="pt-5 pb-5">
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-5">
                <form action="/admin/createSubmitUser">
                    <input type="hidden" name="id" value="${form.id}" />

                    <div class="mb-3">
                        <label for="firstName" class="form-label"> First Name </label>
                        <input
                                type="text"
                                class="form-control"
                                name="firstName"
                                placeholder="Employee First Name"
                                aria-label="First Name"
                                id="firstName"
                                value="${form.firstName}"
                        />
                    </div>
                    <div class="mb-3">
                        <label for="lastName" class="form-label"> Last Name</label>
                        <input
                                type="text"
                                class="form-control"
                                name="lastName"
                                placeholder="Last Name"
                                aria-label="Last Name"
                                id="lastName"
                                value="${form.lastName}"
                        />
                    </div>
                    <div class="mb-3">
                        <label for="email" class="form-label"> Email </label>
                        <input
                                type="text-area"
                                class="form-control"
                                name="email"
                                placeholder="Email"
                                aria-label="Email"
                                id="email"
                                value="${form.email}"
                        />
                    </div>


                    <c:if test="${not empty form.id}">
                        <button
                                type="submit"
                                id="create_btn"
                                class="btn btn-primary mt-3 me-2"
                                onclick="formSubmit()"
                        >
                            Edit User
                        </button>
                    </c:if>


                </form>
            </div>
        </div>
    </div>
</section>
