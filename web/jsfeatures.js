function sleep(millis)
{
    var date = new Date();
    var curDate = null;
    do { curDate = new Date(); }
    while(curDate-date < millis);
}

function process(fn){

    setTimeout(function(){
        sleep(3000)
        console.log('ASync function')
        console.log(fn)
        fn(4)
    },1000);
    
}

console.log('start')

// var result = process();

process(function(result){ console.log('callback funtion: ', result)})
// console.log(result)
console.log('finished')



// ajax(callback){
//  // if response correct
//  callback(response data);
// }