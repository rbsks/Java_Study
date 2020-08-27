// javaScript is very flexible
// flexible == dangerous
// 내가 선언하지 않은 것들을 사용하면 console에 에러가 나옴
'use strict';

// 1. function
// function name(param1, param2){body...return;}
// one function === one thing
// function is object in JS

function printHello(){
	console.log('Hello');
}

printHello();

function log(message){
	console.log(message);
}

log('hi');

function changeName(obj){
	obj.name = 'hhhhhh';
}

// 2. parameters
const ggg = {name : 'gggg'};
changeName(ggg);
console.log(ggg);

// 3. default parameters (added in ES6)
function showMessage(message, from){
	if(from === undefined){
		from = 'unknown';
	}
	console.log(`${message} by ${from}`);
}

showMessage('hi');


// 4. rest parameters (added in ES6) 배열형태로 저장
function printAll(...args){
	for(let i = 0; i < args.length; i++){
		console.log(args[i]);
	}
	
	for(const arg of args){
		console.log(arg);
	}
	
	args.forEach((arg) => console.log(arg));
}

printAll('aaa', 'bbb', 'ccc');

// 5. local scope

let glovalMessage = 'global'; // global
function printMessage(){
	let message = 'aaa';
	console.log(message); // local 
	console.log(glovalMessage);
}

printMessage();


// 6. return a value
function sum(a,b){
	return a+b;
}

const result = sum(7,5);
console.log(result);

// 7. Early return, early exit
// bad
function upgradeUser(user){
	if(user.point > 10 ){
		// long upgrade logic
	}
}

// good
function upgradeUser(user){
	if(user.point <= 10 ){
		return;
	}
	// long upgrade logic
}

// function expression
// 

const print = function(){ // anonymous function
	console.log('print');
};

print();

const printAgain = print;
printAgain();

const sumAgain = sum;
console.log(sumAgain(1,2));


// callback function using function expression
function randomQuiz(answer, printYes, printNo){
	if(answer === 'ssss'){
		printYes();
	}else{
		printNo();
	}
	
}

// anonymous function
const printYes = function (){
	console.log('Yes');
};

// named function debug 할 때 함수 이름이 나오게 하기위해 씀 
// 재귀함수로 쓰기위해서 씀
const printNo = function print(){
	console.log('No');
	//print();
};

randomQuiz('ssss',printYes, printNo);
randomQuiz('sss',printYes, printNo);

// arrow function
const simplePrint = () => console.log('simple');
const simpleAdd = (a,b) => a+b;

console.log(simpleAdd(1,2));

// IIFE : Immediately Invoked Function Expression
(function hello(){
	console.log('IIFE');
})(); // 바로 함수 호출



