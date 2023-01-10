function cong() {
    let a = parseInt(document.getElementById('N1').value)
    let b = parseInt(document.getElementById('N2').value)
    let result =  a + b
    document.getElementById('R1').innerHTML ='Result Addition = ' + result
}
function tru() {
    let a = parseInt(document.getElementById('N1').value)
    let b = parseInt(document.getElementById('N2').value)
    let result =  a - b
    document.getElementById('R1').innerHTML ='Result Subtraction = ' + result
}
function nhan() {
    let a = parseInt(document.getElementById('N1').value)
    let b = parseInt(document.getElementById('N2').value)
    let result =  a * b
    document.getElementById('R1').innerHTML ='Result Multiplication = ' + result
}
function chia() {
    let a = parseInt(document.getElementById('N1').value)
    let b = parseInt(document.getElementById('N2').value)
    let result =  a / b
    document.getElementById('R1').innerHTML ='Result Division = ' + result
}