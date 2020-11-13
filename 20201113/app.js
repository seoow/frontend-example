//배열 리터럴
const arr = [1, 2, '문자열', {}]
const [a, b] = arr
console.log(a)
console.log(b)


//객체 리터럴
const user = {
    id: 'adcdefg',
    name: 'seoow',
    data: [1, 2, 3, 4],
}

console.log('')
const{id, name, data} = user
console.log(id)
console.log(name)
console.(data)


//
function f(x) {
    console.log('호출됨!')
}

f(1)
f(1, 2, 3)



console.log('블록 이전에 호출')
    {
    console.log('블록 내부에서 호출됨')
    const x = 1
    console.log(x)
        {
        console.log('블록 내부 2에서 호출됨')
        const y = 5
        console.log(y)
        }
    }
    console.log(x)



console.log('블록 이전에 호출')
{
    const x = 10
    const block1 = '블록1이란다'
    console.log(x)
    {
        const x = '다른타입의 값'
        console.log(x)
        console.log(block1)
    }
}



function sayHelloTo(name) {
    const message = 'Hello ${name}!'
    return function () {
        console.log(mesage)
    }
}
const hello1 = sayHelloTo('seoow')
const hello2 = sayHelloTo('Test')
const hello3 = sayHelloTo('adsf!')
hello1()
hello2()
hello3()



const dd = 'ㅇㅇ'
function outer() {
    const name = '밖에 있어요' // 유효 범위
    function closure() { //클로저
        const inner = '내부에'
        console.log('${name}, ${inner}')
    }
    return closure
}

const f1 = outer()
f1()



function outer() {
    const name = '바깥임'
    function showName() {
        const n = '안쪽 데이터'
        console.log(`바깥: ${name}, 안: ${n}`)
    }
    showName()
}
outer()



function outer() {
    const name = '바깥임'
    function showName() {
        const n = '안쪽 데이터'
        console.log(`바깥: ${name}, 안: ${n}`)
    }
    return showName;
}
const f1 = outer()
f1()    // showName



function 환경이있는함수(x) {
    // 환경
    function countdown() {

    }
    return counter
}



class 클로저 {
    멤버;
    생성자(파라미터) {
        //초기화
        멤버 = 파라미터
    }
    메서드() {

    }
}

function 생성자(파라미터) {
    //초기화
    멤버 = 파라미터
    function 메서드() {
    }
    return 메서드
}


//카운트 다운 하는 함수 만들기 //

function countdown(startAt) {
    let data = startAt;
    function counter() {
        console.log(data--)
    }
    return counter
}

const c1 = countdown(10)
c1()    // 1회 호출됨
c1()    // 2회 호출됨
c1()    // 3회 호출됨



function countdown() {
    let s = 0
    function counter() {
        console.log('${++5}회 호출됨.')
    }
    return counter
}