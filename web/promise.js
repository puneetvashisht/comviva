function sleep(millis)
{
    var date = new Date();
    var curDate = null;
    do { curDate = new Date(); }
    while(curDate-date < millis);
}

function process(){
    return new Promise(function(resolve, reject){
        setTimeout(function(){
            sleep(3000)
            console.log('ASync function')
            resolve(4);
        },1000);
    })
    
    
}

console.log('start')

// var result = process();

// process(function(result){ console.log('callback funtion: ', result)})
process().then((result) => console.log(result))
// console.log(result)
console.log('finished')

