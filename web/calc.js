console.log('test...')  
function sum(){
   var oper1 = parseInt(document.getElementById('oper1').value)
   var oper2 = parseInt(document.getElementById('oper2').value)
   var result = oper1 + oper2
   document.getElementById('result').innerHTML = result;
} 

function add(){
    // var oper1 = parseInt($('#oper1').val())
    // var oper2 = parseInt($('#oper2').val())
    // var result = parseInt($('#oper1').val() + parseInt($('#oper2').val()
    $('#result').html( parseInt($('#oper1').val()) + parseInt($('#oper2').val()))
 } 