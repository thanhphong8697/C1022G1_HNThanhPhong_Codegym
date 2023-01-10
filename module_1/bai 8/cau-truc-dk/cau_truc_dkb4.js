function kiemtra() {
    let a = parseInt(document.getElementById('1').value);
    let b = parseInt(document.getElementById('2').value);
    let c = parseInt(document.getElementById('3').value);
    let d =''
    if ( a >= b && a >= c){
        d = '' + a
    } else if (b >= c){
        d = '' + b
    }else {
        d = '' + c
    }
    document.getElementById('4').innerHTML= 'Giá trị lớn nhất là :' + d
}