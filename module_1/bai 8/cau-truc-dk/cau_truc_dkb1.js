function tinh() {
    let a = parseInt(document.getElementById('1').value);
    let b = parseInt(document.getElementById('2').value);
    let d = ''
    if (a % b == 0) {
        d = 'a chia hết cho b';
    } else {
        d = 'a không chia hết cho b';
    }
    document.getElementById('3').innerHTML = 'kết quả là ' + d;
}