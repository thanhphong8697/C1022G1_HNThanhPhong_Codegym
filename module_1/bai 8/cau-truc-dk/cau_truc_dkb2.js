function kiemtra() {
    let a = parseInt(document.getElementById('1').value);
    let b = ''
    if (a >= 15) {
        b = 'đủ tuổi học lớp 10';
    } else {
        b = 'không đủ tuổi học lớp 10';
    }
    document.getElementById('2').innerHTML= 'Bạn ' + b;
}