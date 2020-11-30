# jQuery

 # 특징 
 1. html + CSS + javascript 를 통합한 하나의 라이브러리
 2. 굉장히 쉬운 접근 방법을 제공한다. -> 전체 처리 속도 감소.
 3. 모든 javascript 문법은 그대로 사용 가능.
 4. 대소문자 구별.
 5. 'or' 은 구별하지 않음.
 6. 라이브러리를  사용하는 방법
    1. CDN
    2. 라이브러리를 해당 프로젝트내에 복사해서 사용.
 7. jQuery는 모든것이 함수화되어 있기 때문에 함수에 대한 이해가 좋을수록 jQuery의 이해도가 높아질 수 있다.
 ex) id='adb'인 요소를 선택
 
        ```javascript : var id = document.getElementByld('abc');
        javascript :
        var getID = function(id){
            return document.getElementByid(id);
        } 
        ```
        var id = getID('abc');
        jquery : var id = $('#abc');

 8. https://jquery.com
    
# eclipse EE 버전 설치 후 환경 설정
    1. 한글 인코딩 : utf-8
    2. 자바 연결 확인
    3. 웹서버 설정 : JSP 컨테이너(톰캣)
    4. 현재 프로젝트에 웹서버 설정

# CSS
    id : #ele {...} --> $(ele).css(key, value)
    class : .ele

    #ele > ele
    #ele ele
    #ele []

# DOM ? 
        - selectors, Attributes, Travrsing, Manipulation, CSS,
        - Event, Effects, Ajax

# JOSN표기방법

    1. KEY:VALUE => {KEY : VALUE, KEY:VALUE, ...}
    2. 배열 => [v1, v2, v3, ...]
    3. 혼합형 : 배열안에 map\
        [ {  }, {  }, ...]
          map 안에 배열
          {Key : [,,,,] }


    <script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>