<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>filter</title>
<script src='../lib/jquery-3.5.1.min.js'></script>
</head>
<body>
	<div id='filter'>
		<fieldset>
			<legend>filter</legend>
			<ul>
				<li>선택된 요소중 필요한 요소만을 걸러내는 방법</li>
				<li>접두사 ':' 을 사용한다.</li>
				<li>필터와 필터를 연결하여 사용할 수 있다</li>
				<li>종류 => :eq(index) , :even , :odd , :first, :last,
					:gt(index), :lt(index)</li>
			</ul>
		</fieldset>

		<ol start='0'>
			<li>백두산</li>
			<li>금강산</li>
			<li>설악산</li>
			<li>치악산</li>
			<li>내장산</li>
			<li>속리산</li>
			<li>한라산</li>
		</ol>

		<div id='items'>
			<div>hi....1</div>
			<div>hi....2</div>
			<div>hi....3</div>
			<div>hi....4</div>
			<div>hi....5</div>
			<div>hi....6</div>

		</div>
	</div>
	<script>
		//UL태그 안에 있는 첫번째 li 태그를 선택
		$('#filter>ol>li:first').css('color', '#f00');
		$('#filter>ol>li:even').css('font-weight', 'bolder'); //짝수(even/홀수는 odd) 부분만 굵게
		
		//items안에 있는 div의 바탕색을 홀짝수로 나뉘어 표시되도록 구성
		$('#filter>#items>div:odd').css({	
		'background-color': '#00f',
		'color'			  : '#ff0'
		});
		$('#filter>#items>div:even').css({
			'background-color' : '#f00',
			'color'			   : '#f01'
			});
		
	</script>
</body>
</html>