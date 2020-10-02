<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div id="content_wrap">
	<h2>main</h2>

	<c:forEach items="${bbslist }" var="bbs">
		<div>
			<table border="1">
				<tr>
					<th>작성자</th>
					<td>${bbs.nickname}</td>
				</tr>
				<tr>
					<th>제목</th>
					<td><a href="goBbsDetail.do?post_number=${bbs.post_number}">${bbs.title}</a></td>
				</tr>
				<tr>
					<th>지역</th>
					<td>${bbs.location}</td>
				</tr>
				<tr>
					<th colspan="2">사진</th>
				</tr>
				<tr>
					<td colspan="2">
						<div>
							<ul class="bxslider">
								<c:forEach items="${bbs.imgs}" var="img">
									<li><a href="#"><img src="image/${img}" alt="이미지 없음"></a></li>
								</c:forEach>
							</ul>
						</div>
					</td>

				</tr>

				<tr>
					<td><button type="button" onclick='getBbsLike("${bbs.post_number}","${login.email}")'>좋아요</button></td>
					<td><input id="like_count${bbs.post_number}" type="text"
						value="${bbs.likecount}"></td>
				</tr>

				<tr>
					<th colspan="2">내용</th>
				</tr>
				<tr>
					<td colspan="2">${bbs.content}</td>
				</tr>
				<tr>
					<td></td>
				</tr>
				<tr>
					<td><input type="text" name="content" id="content${bbs.post_number}" placeholder="댓글 달기"></td>
					<td><button type="button" onclick='comment_button("${bbs.post_number}","${login.email}")'>게시</button></td>
				</tr>
			</table>
		</div>
		<br>
		<br>
	</c:forEach>
</div>
<div id="chat_wrap">
	<div id="openchat">
		<h2>chat</h2>
	</div>
	<div id="chatbot">
		<h2>chatbot</h2>
	</div>
</div>
<script>
	$(document).ready(function() {
		$('.bxslider').bxSlider();

	});

	function getBbsLike(post_number, email) {
		$.ajax({
			url : 'checkLike.do',
			type : 'get',
			data : {
				'main_post_number' : post_number,
				'email' : email
			},
			success : function(data) {
				$("#like_count" + post_number).val(data);
			},
			error : function() {
				alert("error");
			}

		});
	}

	function comment_button(main_post_number, email) {
		let content = $("#content" + main_post_number).val();
	    $.ajax({
			url : 'addCmt.do',
			type : 'get',
			data : {"email" : email, "main_post_number" : main_post_number, "content" : content},
			success : function(data) {
				alert("댓글이 추가돼었습니다.");
				 $("#content" + main_post_number).val("");
			},
			error : function() {
				alert("error");
			}

		});
	   
	}
</script>