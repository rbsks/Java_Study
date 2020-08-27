// javaScript is very flexible
// flexible == dangerous
// 내가 선언하지 않은 것들을 사용하면 console에 에러가 나옴
'use strict';

console.log('my'+ 'cat');
console.log("gg's dqwd");

// increment operator
let c = 2;
const preC = ++c;
// c = c + 1;
// preC = c;

let d = 2;
const postD = d++;
// postD = d;
// d = d + 1; 

// logical operators || && !
const value1 = true;
const value2 = 4<2;

console.log( `or : ${value1 || value2|| check()}`); 
// or는 value1이 ture이면 value2, check()를 실행하지 않고 바로 다음 줄로 넘어감 그래서 연산이많은 check를 맨 앞에 오는 경우가 없도록 해야함(AND도 마찬가지)

function check(){
	for (let i = 0; i < 10; i++){
		console.log('${i}');
	}
	return true;
}