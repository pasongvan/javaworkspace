// JSON이란?
// 자바스크립트 객체를 문자열로 나타낸 것
// JSON 객체를 사용
// JSON.stringify() 객체 => 문자열
// JSON.parse(): 문자열 => 객체

var luna = {
    name: "Luna",
    age: 4,
}

var daisy = {
    name: "Daisy",
    age: '3'
}


var lunaStr = JSON.stringify(luna);
var daisyStr = JSON.stringify(daisy);
// 속성명도 문자열로 모두 표시
// 숫자에는 안 붙음

// 자바와의 차이점
// 자바스크립트에서는 '' 도 문자열 표시에 사용
