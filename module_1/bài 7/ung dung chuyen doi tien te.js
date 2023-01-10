function doitien() {
    let a = document.getElementById('1').value;
    let b = document.getElementById('2').value;
    let c = document.getElementById('3').value;
    let result
    if (b == "VN" && c == "USD"){
        result = a/23000
    }
    else if (b == "USD" && c == "VN"){
        result =a*23000
    }
    else if (b == "VN" && c == "VN"){
        result = a
    }
    else if (b == "USD" && c == "USD"){
        result = a
    }
    document.getElementById('result').innerHTML ='Result = ' + result ;

}