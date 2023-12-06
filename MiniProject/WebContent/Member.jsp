<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:include page="./Header.jsp"></jsp:include>
 
 <form action="./MemberProcess.jsp" method="post">
 <div class="mb-3 mt-3">
    <label for="id" class="form-label">Id:</label>
    <input type="text" class="form-control" id="id" placeholder="Enter id" name="id">
  </div>
  
  <div class="mb-3 mt-3">
    <label for="name" class="form-label">Name:</label>
    <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
  </div>
  
  <div class="mb-3 mt-3">
    <label for="email" class="form-label">Email:</label>
    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
  </div>
  
  <div class="mb-3">
    <label for="pass" class="form-label">Password:</label>
    <input type="password" class="form-control" id="pass" placeholder="Enter password" name="pass">
  </div>

  <label for="comment">Comments:</label>
  <textarea class="form-control" rows="5" id="comment" name="comment"></textarea>
  <br>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>



</body>
</html>