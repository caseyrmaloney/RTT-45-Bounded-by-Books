<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="../include/header.jsp"/>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <c:if test="${empty form.id}">
            <h1>Create Employee</h1>
        </c:if>
        <c:if test="${not empty form.id}">
            <h1>Edit Employee</h1>
        </c:if>
    </div>
</section>

<section class="pt-5 pb-5 bg-light-grey">
    <div class="container">
        <div class="row  justify-content-center">
            <div class="col-5">
                <form action="/employee/createSubmit">
                    <c:if test="${success}">
                        <div class="alert alert-success" role="alert">
                            Employee Created
                        </div>

                    </c:if>
                   <input type="hidden" name="id" value="${form.id}"/>



                    <div class=" mb-3">
                        <c:if test="${not empty form.id}">
                            <label for="editEmp"  class="form-label"> Go to Details </label>
                            <a  id="editEmp" href="/employee/detail/${form.id}"> Details </a>

                        </c:if>
                    </div>



                    <div class=" mb-3">
                        <label for="employeefirstName" class="form-label"> First Name </label>
                        <input type="text" class="form-control" name="firstName" placeholder="Employee First Name"
                               aria-label="Employee First Name" id="employeefirstName"  value="${form.firstName}">
                        <c:if test="${bindingResult.hasFieldErrors('firstName')}">
                            <c:forEach items="${bindingResult.getFieldErrors('firstName')}" var="error">
                                <div style="color:red;">${error.getDefaultMessage()}</div>
                            </c:forEach>
                        </c:if>
                    </div>
                    <div class=" mb-3">
                        <label for="employeelastName" class="form-label"> Last Name </label>
                        <input type="text" class="form-control" name="lastName" placeholder="Employee Last Name"
                               aria-label="Employee First Name" id="employeelastName" value="${form.lastName}">
                        <c:if test="${bindingResult.hasFieldErrors('lastName')}">
                            <c:forEach items="${bindingResult.getFieldErrors('lastName')}" var="error">
                                <div style="color:red;">${error.getDefaultMessage()}</div>
                            </c:forEach>
                        </c:if>
                    </div>
                    <div class=" mb-3">
                        <label for="office" class="form-label"> Office </label>
                        <select id="office" name="officeId" class="form-select">
                           <c:forEach items="${offices}" var="office">
                               <tr>
                                   <option value="${office.id}"
                                           <c:if test="${office.id eq form.officeId}">
                                           selected>
                                           </c:if>

                                           ${office.city}</option>
                               </tr>
                           </c:forEach>

                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="employeeEmail" class="form-label"> Email </label>
                        <input type="text" class="form-control" name="email" placeholder="Employees Email"
                               aria-label="Employees Email" id="employeeEmail" value="${form.email}">
                        <c:if test="${bindingResult.hasFieldErrors('email')}">
                            <c:forEach items="${bindingResult.getFieldErrors('email')}" var="error">
                                <div style="color:red;">${error.getDefaultMessage()}</div>
                            </c:forEach>
                        </c:if>
                    </div>
                    <div class="mb-3">
                        <label for="employeeExtension" class="form-label"> Extension </label>
                        <input type="text" class="form-control" name="extension" placeholder="Employees Extension"
                               aria-label="Employees Extension" id="employeeExtension" value="${form.extension}">
                    </div>
                    <div class="mb-3">
                        <label for="employeeJobTitle" class="form-label"> Job Title </label>
                        <input type="text" class="form-control" name="jobTitle" placeholder="Employees Job Title"
                               aria-label="Employees Job Title" id="employeeJobTitle" value="${form.jobTitle}">
                    </div>
                    <div class="mb-3">
                        <label for="profileImg" class="form-label"> Profile Image </label>
                        <input type="text" class="form-control" name="profileImg" placeholder="Profile Image"
                               aria-label="Profile Image" id="profileImg" value="${form.profileImg}">
                    </div>
                    <div class="mb-3">
                        <label for="employeeVacationHours" class="form-label"> Vacation Hours</label>
                        <input type="text" class="form-control" name="vacationHours" placeholder="Employees Vacation Hours"
                               aria-label="Employees Vacation Hours" id="employeeVacationHours" value="${form.vacationHours}">
                        <c:if test="${bindingResult.hasFieldErrors('vacationHours')}">
                            <c:forEach items="${bindingResult.getFieldErrors('vacationHours')}" var="error">
                                <div style="color:red;">${error.getDefaultMessage()}</div>
                            </c:forEach>
                        </c:if>
                    </div>

                    <c:if test="${empty form.id}">
                        <button type="submit" id="create_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Create Employee</button>
                    </c:if>
                    <c:if test="${not empty form.id}">
                        <button type="submit" id="edit_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Edit Employee</button>
                    </c:if>


                </form>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../include/footer.jsp"/>