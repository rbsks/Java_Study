// javaScript is very flexible
// flexible == dangerous
// 내가 선언하지 않은 것들을 사용하면 console에 에러가 나옴
'use strict';

// 2. variable 변수  ,rw(read/write)가능
// mutable
// let (added in ES6) 
{
	let name = 'gyubin';
	console.log(name);
	name = 'hello';
	console.log(name);
}

// var (don't ever use this!')
// var hoisting (어디에 선언된냐 상관없이 항상 제일 위로 선언을 끌어 올려주는 현상)
// var no block scpoe
console.log(age);
age = 4;
console.log(age);
var age;

// 3. Constant ,r(read only)
// favor immutable data type always for a few reasons :
// - security
// - thread safety (어플리케이션이 실행되면 한가지 프로세스가 할당되고 그 프로세스안에서는 다양한 스레드가 돌아가면서 동시에 변수에 접근해서 값 변경하는 것 을 막음)
// - reduce human mistakes
const aaaa = 7;
const bbbb = 5;

// 4. variable types
// primitive, single item : number, string, boolean, null, undefiedn, symbol (한가지 items)
// object, box container (single item을  여러개 묶어서 한 단위로 관리 할 수 있게 해줌)
// function, first-class function (이 프로그래밍 언어에서는 function도 다른 데이터 타입처럼 변수에 할당이 가능 그렇기 때문에 함수에 파라미터로도 전달이 되고 함수에서 리턴 타입으로도 function을 리턴 할 수 있다. )

const count = 17;
const size = 17.1;
console.log(`value: ${count}, type : ${typeof count}`);
console.log(`value: ${size}, type : ${typeof size}`);

const infinity = 1/0;
const nefativeInfinity = -1/0;
const nAn = 'not a number'/2;
console.log(infinity);
console.log(nefativeInfinity);
console.log(nAn);	


// 5.Dynamic typing : dynamically typed language







