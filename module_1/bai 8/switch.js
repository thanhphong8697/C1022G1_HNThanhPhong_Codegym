function songay() {
    let a = parseInt(document.getElementById('1').value);
    switch (a) {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
            document.getElementById('2').innerHTML= "Tháng " + a + " có 31 ngày"
        break;
        case 4:
        case 6:
        case 9:
        case 11:
            document.getElementById('2').innerHTML="Tháng " + a + " có 30 ngày"
        break;
        case 2:
            document.getElementById('2').innerHTML = "Tháng " + a + " có 28 hoặc 29 ngày"
            break;
        default:
        document.getElementById('2').innerHTML="Nhập sai số tháng"
    }
}