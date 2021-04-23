# CSS 속성

### 박스 속성

* margin
  * 테두리와 다른 태그 사이의 테두리 바깥쪽 여백
* border
  * 테두리
* padding
  * 테두리와 글자 사이의 테두리 안쪽 여백, 배경색은 padding영역 까지만 사용
* width
  * 글자를 감싸는 영역의 가로 크기
* height
  * 글자를 감싸는 영역의 세로 크기



### 가시속성

* none
  * 화면에 보이지 않음
* block
  * 블록 박스 형식으로 지정
* inline
  * 인라인 박스 형식으로 지정
* inline-block
  * 블록과 인라인 중간 형식으로 지정



### 배경 속성

* background-image
  * 배경 이미지 삽입
* background-size
  * 배경 이미지의 크기 지정
* background-repeat
  * 배경 이미지의 반복 형태 지정
* background-attachment
  * 배경 이미지의 부착 형태 지정
* background-position
  * 배경 이미지의 위치 지정
* background
  * 한번에 모든 배경 속성 입력



### 글자 속성

* font-size
  * 글자 크기 지정
* font-family
  * 글꼴 지정
* font-style
  * 글자의 스타일(기울기) 지정
* font-weight
  * 글자의 두께 지정
* text-align
  * 글자 정렬 지정
* line-height
  * 글자 높이를 지정하는 속성 -> 수직 정렬에 사용
* text-decoration
  * 링크의 밑줄 제거



### 위치 속성

* position

  * 요소의 위치 지정 형식 설정

  * | 키워드   | 설명                                |
    | -------- | ----------------------------------- |
    | absolute | 절대 위치 좌표 설정                 |
    | fixed    | 화면을 기준으로 절대 위치 좌표 설정 |
    | relative | 초기 위치에서 상하좌우로 위치       |
    | static   | 위쪽에서 아래쪽으로 순서대로 배치   |

* z-index

  * 요소의 우선순위 지정
  * 큰 값일 수록 우선순위 높아짐

* overflow

  * 요소 크기를 벗어나 모두 보여주기 힘들 때 처리

  * | 키워드 | 설명                                 |
    | ------ | ------------------------------------ |
    | hidden | 영역을 벗어나는 부분 감춤            |
    | scroll | 영역을 벗어나는 부분을 스크롤로 만듦 |

* overflow-x: scroll
  * x축으로 스크롤 생성
* overflow-y: scroll
  * y축으로 스크롤 생성



### 유동 속성

* float

  * | 키워드 | 설명                 |
    | ------ | -------------------- |
    | left   | 태그를 왼쪽에 붙임   |
    | right  | 태그를 오른쪽에 붙임 |



### 그림자와 그레이디언트 속성

* text-shadow: 오른쪽 크기 아래크기 흐림도 색상
  * 글자에 그림자 부여
  * `text-shadow: 5px 5px 5px black`
* box-shadow: 오른쪽 크기 아래크기 흐림도 색상
  * 박스에 그림자 부여
  * `box-shadow: 5px 5px 5px black`

* linear-gradient(각도, 색상 위치, 색상 위치)
  * 선형 그레디언트 구성 함수
  * `linear-gradient(45deg, #f85032 0%, #e73827 100%)`
* radial-gradient()
  * 원형 그레디언트 구성 함수