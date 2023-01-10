function chiso() {
    let a = parseInt(document.getElementById('1').value);
    let b = parseInt(document.getElementById('2').value);
    let c = a / (b ^ 2)
    let result = ''
    if (c < 18.5) {
        result = 'Underweight';
    } else if (18.5 <= c && c < 25.0) {
        result = 'Normal';
    } else if (25.0 <= c && c < 30) {
        result = 'Overweight';
    } else {
        result = 'Obese';
    }
    document.getElementById('BMI').innerHTML = "BMI result =" + result;

}
