var str = "Good sunny morning!!";
var arr =  str.split(' ');
// console.log(arr);


// var outer = function(x){
//     // console.log(x)
//     x();
//     console.log('outer function')
//     return 2;
// }
// var foo = function(){console.log('foo')}
// var result = outer(foo);
// console.log(result)

// var y = 343;
var outer = function(){
    console.log('outer function...')
    var x = 2;
    var inner = function(){
        console.log('inner function...')
        console.log(x + 2)
        var x = 0;
    }
    return inner;
}
outer()();

// // Phase 1. Scope creation: 
// outerFn : [x:undefined, inner:undefined]
// innerFn: [x: undefined]
// // Phase 2. Execution
// outerFn : [x:2, inner:fn]
// innerFn: [x: undefined]

// var result = outer();
// result();
