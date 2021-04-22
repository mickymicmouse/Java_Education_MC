# HTML 태그 정리

* 글자 태그

  * h1~h6

    * 제목 글자 생성
    * heading

  * p

    * 본문 생성
    * paragraph

  * br

    * 본문 생성
    * break(줄바꿈)

  * hr

    * horizontal rule(수평줄)

  * a

    * 하이퍼 링크 생성

    * anchor

    * ```html
      <a href = "이동할 웹페이지">출력글자</a>
      ```

    * href

      * hyper reference
      * 빈 링크는 #을 사용

  * b

    * 볼드체
    * bold

  * i

    * 이탤릭체
    * italic

  * small

    * 작은 글자

  * sub

    * 아래첨자
    * subscript

  * sup

    * 위첨자
    * superscript

  * ins

    * 밑줄 글자
    * insert

  * del

    * 취소선이 그어진 글자
    * delete

* 목록 태그

  * ul
    * 순서가 없는 목록 생성
    * unordered list
  * ol
    * 순서가 있는 목록 생성
    * ordered list
  * li
    * 목록 요소 생성
    * list item

* 테이블 태그

  * table
    * 표삽입
    * 속성 - border
      * 표의 두께 지정
  * tr
    * 표에 행 삽입
    * table row
  * th
    * 표에 제목 셀 삽입
    * table heading
    * 속성 - rowspan, colspan
      * 셀의 너비와 높이 지정
  * td
    * 표에 일반 셀 생성
    * table data
    * 속성 - rowspan, colspan
      * 셀의 너비와 높이 지정

* 미디어 태그

  * img 는 내용물을 가질 수 없다
  * video, audio 는 내용물을 가질 수 있다

<table border = "2">
    <tr>
        <th>태그</th>
        <th>속성</th>
        <th>설명</th>
    </tr>
    <tr>
    	<td rowspan = "4">img</td>
        <td>src</td>
        <td>이미지 경로 지정</td>
    </tr>
    <tr>
    	<td>alt</td>
        <td>이미지가 없을 때 나오는 글자 지정</td>
    </tr>
    <tr>
    	<td>width</td>
        <td>이미지의 너비 지정</td>
    </tr>
        <tr>
    	<td>height</td>
        <td>이미지의 높이 지정</td>
    </tr>
        <tr>
    	<td rowspan = "5">audio, video</td>
        <td>src</td>
        <td>음악 비디오 파일의 경로 지정</td>
    </tr>
    <tr>
    	<td>preload</td>
        <td>음악, 비디오를 준비 중일 때 데이터를 모두 불러올지 여부 결정</td>
    </tr>
    <tr>
    	<td>autoplay</td>
        <td>음악, 비디오의 자동 재생 여부 결정</td>
    </tr>
        <tr>
    	<td>loop</td>
        <td>음악, 비디오의 반복 재생 여부 결정</td>
    </tr>
        </tr>
        <tr>
    	<td>controls</td>
        <td>음악, 비디오 재생 도구 출력 여부 지정</td>
    </tr>
        <tr>
    	<td rowspan = "2">video</td>
        <td>width</td>
        <td>비디오의 너비 지정</td>
    </tr>
    <tr>
    	<td>height</td>
        <td>비디오의 높이 지정</td>
    </tr>
</table>



* 입력 양식 태그

  * 특징

    * 사용자에게 정보를 입력받는 요소

  * ```html
    <body>
    	<form>
            <input type = "text" name = "search">
            <input type = "submit">
        </form>
    </body>
    ```

    	<form>
            <input type = "text" name = "search">
            <input type = "submit">
        </form>
    ```html
    <form action = "전송 위치" method = "전송 방식">
        
    </form>
    
    전송 위치 = 데이터를 전달할 목적지
    전송 방식 종류
    1. GET - 주소에 데이터를 직접 입력해 전달
    2. POST - 별도의 방법을 사용해 해당 주소로 전달
    ```

<table>
    <tr>
        <th>태그</th>
        <th>속성</th>
        <th>모양</th>
        <th>설명</th>
    </tr>
    <tr>
    	<td>form</td>
        <td>보이지 않음</td>
        <td></td>
        <td>입력 양식의 시작과 끝 표시</td>
    </tr>
    <tr>
    	<td rowspan = "10">input</td>
        <td>text</td>
        <td>
            <form>
                <input type = "text" value = "텍스트">
            </form>
        </td>
        <td>글자 입력 양식 생성</td>
    </tr>
    <tr>
        <td>button</td>
        <td>
            <form>
                <input type = "button" value = "버튼">
            </form>
        </td>
        <td>버튼 생성</td>
    </tr>
        <tr>
        <td>checkbox</td>
        <td>
            <form>
                <input type = "checkbox">
            </form>
        </td>
        <td>체크 박스 생성</td>
    </tr>
        <tr>
        <td>file</td>
        <td>
            <form>
                <input type = "file">
            </form>
        </td>
        <td>파일 입력 양식 생성</td>
    </tr>
        <tr>
        <td>hidden</td>
        <td>
            <form>
                <input type = "hidden">
            </form>
        </td>
        <td>해당 내용 표시 안함</td>
    </tr>
        <tr>
        <td>image</td>
        <td>
            <form>
                <input type = "image" src = "http://placehold.it/100x100">
            </form>
        </td>
        <td>이미지 형태 생성</td>
    </tr>
        <tr>
        <td>password</td>
        <td>
            <form>
                <input type = "password">
            </form>
        </td>
        <td>비밀번호 입력 양식 생성</td>
    </tr>
        <tr>
        <td>radio</td>
        <td>
            <form>
                <input type = "radio">
            </form>
        </td>
        <td>라디오 버튼 생성</td>
    </tr>
        <tr>
        <td>reset</td>
        <td>
            <form>
                <input type = "reset">
            </form>
        </td>
        <td>초기화 버튼 생성</td>
    </tr>
        <tr>
        <td>submit</td>
        <td>
            <form>
                <input type = "submit">
            </form>
        </td>
        <td>제출 버튼 생성</td>
    </tr>
    <tr>
    	<td>textarea</td>
        <td>cols/rows</td>
        <td>
            <form>
                <textarea></textarea>
            </form>
        </td>
        <td>여러행의 글자 입력 양식 생성</td>
    </tr>
    <tr>
        <td>select<br>optgroup<br>option</td>
        <td>cols/rows</td>
        <td>
            <form>
                <select>
                    <optgroup label = "HTML 5">
                    	<option>Multimedia Tag</option>
                        <option>Connectivity</option>
                        <option>Device Access</option>
                    </optgroup>
                    <optgroup label = "CSS3">
                    	<option>Animation</option>
                        <option>3D Transform</option>
                    </optgroup>
                </select>
            </form>
        </td>
        <td>선택양식 생성<br>옵션 그룹화<br>옵션 생성</td>
    </tr>
    <tr>
    	<td>fieldset<br>legend</td>
        <td></td>
        <td>
            <form>
                <fieldset>
                    <legend>입력 양식</legend>
                </fieldset>
            </form>
        </td>
        <td>입력 양식의 그룹 지정<br>입력 양식 그룹의 이름 지정</td>
    </tr>
</table>

* form 그룹화

```html
    <form>
        <fieldset>
            <legend>입력 양식</legend>
            <table>
                <tr>
                    <td><label for="name">이름</label></td>
                    <td><input id="name" type="text" /></td>
                </tr>
                <tr>
                    <td><label for="mail">이메일</label></td>
                    <td><input id="mail" type="email" /></td>
                </tr>
            </table>
            <input type="submit" />
        </fieldset>
    </form>
```

<form>
        <fieldset>
            <legend>입력 양식</legend>
            <table>
                <tr>
                    <td><label for="name">이름</label></td>
                    <td><input id="name" type="text" /></td>
                </tr>
                <tr>
                    <td><label for="mail">이메일</label></td>
                    <td><input id="mail" type="email" /></td>
                </tr>
            </table>
            <input type="submit" />
        </fieldset>
    </form>



* 특수 문자
  * \&nbsp;
    * 공백
  * \&it;
    * <
  * \&gt;
    * \>
  * \&amp;
    * &