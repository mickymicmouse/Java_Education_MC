# HTML 정리

* 요소
  * HTML 페이지를 구성하는 각 부품
* 태그
  * 요소를 만들 때 사용하는 작성 방법

* 주석
  * 프로그램 실행에는 영향을 미치지 않고 설명용으로 사용하는 코드
* 스타일 시트
  * 마크업 언어가 표시되는 방법을 기술하는 언어
  * HTML 페이지의 스타일을 지정할 때 사용
* 자바 스크립트
  * HTML 페이지에서 사용하는 프로그래밍 언어
* html 특징
  * HTML 태그는 내부에 무언가를 꼭 포함할 필요는 없다
  * HTML 태그 내부에는 텍스트 이외의 값도 입력 가능
  * html 태그의 lang 속성은 구글 등 검색 엔진에 문서의 언어 정보를 알려줄 때 사용

```html
<img title = "바다" alt = "sea" src = "sea.png">
태그 이름 = img
속성 이름 = title, alt, src
속성 값 = "바다", "sea", "sea.png"
```

* head 태그 내부에 입력할 수 없는 태그 = header

* 기본 페이지 형태

```html
<!DOCTYPE html>
<html>
	<head>
    	<title>HTML6 Basic</title>
	</head>
    <body>

    </body>
</html>
```

* 스타일 추가 형태

```html
<!DOCTYPE html>
<html>
<head>
    <title> HTML5 Basic</title>
	<link src = "outer_stylesheet.css"></link>
	<script src = "outer_javascript.js"></script>
</head>
<body>
    
</body>
</html>
```



