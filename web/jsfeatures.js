function sleep(millis)
{
    var date = new Date();
    var curDate = null;
    do { curDate = new Date(); }
    while(curDate-date < millis);
}

function process(){

    setTimeout(function(){
        sleep(3000)
        console.log('ASync function')
        return 4;
    },1000);
    
}

console.log('start')
process();
console.log('finished')