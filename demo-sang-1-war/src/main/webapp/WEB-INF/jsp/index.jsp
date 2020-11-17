<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
	<body>
		<H1>HELLO</H1>
		<input id="id"/>
		<input id="password" type="password"/>
		
		<button id="btn_get" onClick="GET()">SUBMIT</button>
		<button id="btn_post" onClick="POST()">회원가입</button>
		<button id="btn_put" onClick="PUT()">비밀번호변경</button>
		<button id="btn_delete" onClick="DELETE()">삭제</button>
		
		
		
		<script type="text/javascript">
	
			function GET(){
				var id = $("#id").val();
				var password = $("#password").val();

				
				$.ajax({
					url: "user/id",
					type: "GET",
					dataType : "json",
					data: {"id" : id,	
						   "password":password},
						   
					success: function(result){
						console.log(result);

						console.log(result["result"]);
						alert( result.result );

					},
					fail: function(result){
						console.log(result);
					}
				});

			}
				function POST(){
					var id = $("#id").val();
					var password = $("#password").val();
					
					$.ajax({
						url: "user/id",
						type: "POST",
						dataType : "json",
						data: {"id" : id,
							   "password":password},
							   
						success: function(result){
							alert(result);

							location.href="/happy";
						},
						fail: function(result){
							alert(result);
						}
					});
				}

				function PUT(){
					var id = $("#id").val();
					var password = $("#password").val();
					
					$.ajax({
						url: "user/id",
						type: "PUT",
						dataType : "json",
						data: {"id" : id,
							   "password":password},
							   
						success: function(result){
							alert(result);
						},
						fail: function(result){
							alert(result);
						}
					});

				}
					function DELETE(){
						var id = $("#id").val();
						var password = $("#password").val();
						
						$.ajax({
							url: "user/id",
							type: "DELETE",
							dataType : "json",
							data: {"id" : id,
								   "password":password},
								   
							success: function(result){
								alert(result);
							},
							fail: function(result){
								alert(result);
							}
						});
			}
		</script>
	</body>
</html>

