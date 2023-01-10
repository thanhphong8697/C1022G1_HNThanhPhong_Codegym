function xephang() {
    let a = parseFloat(document.getElementById('1').value);
    let b = parseFloat(document.getElementById('2').value);
    let c = (a + b) / 2
    let d = ''
    if (c < 5) {
        d = 'học sinh trung bình kém điểm trung bình của kỳ là ' + c
    } else if (c >= 5 && c < 6.5) {
        d = 'học sinh trung bình điểm trung bình của kỳ là ' + c
    } else if (c >= 6.5 && c < 8) {
        d = 'học sinh khá điểm trung bình của kỳ là ' + c
    } else if (c >= 8 && c <= 10) {
        d = 'học sinh giỏi điểm trung bình của kỳ là ' + c
    } else {
        d = 'nhập sai điểm'
    }

    document.getElementById('3').innerHTML = "Xếp hạng : " + d;
}
