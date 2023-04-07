<jsp:include page="include/header.jsp" />
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<section class="pt-5 pb-5 bg-dark-grey">
    <div class="container text-center">
        <h1> File Upload </h1>
    </div>
</section>

<section class="pt-5 pb-5 bg-light-grey">
    <div class="container">
        <div class="row  justify-content-center">
            <div class="col-5">
                <form action="/fileUpload" method="post" enctype="multipart/form-data">

                    <div class=" mb-3">
                        <label for="fileUpload" class="form-label"> File Upload  </label>
                        <input type="file" class="form-control" name="fileUpload"  id="fileUpload" >
                    </div>
                    <button type="submit" id="upload_btn" class="btn btn-primary mt-3 me-2" onclick="formSubmit()">Upload</button>
                </form>
            </div>
        </div>
    </div>

    <img src="${fileUpload}"/>
</section>


<jsp:include page="include/footer.jsp" />