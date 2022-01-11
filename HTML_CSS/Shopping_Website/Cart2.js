let countnos = 1;

function increment() {
    countnos = countnos + 1;
    document.getElementById('countno').innerHTML = countnos;
}

function decrement() {
    if (countnos < 1) {
        alert('Sorry..! Quantity cannot be Nill in Cart');
        countnos = 1;
    } else {
        document.getElementById('countno').innerHTML = countnos;
        countnos = countnos - 1;
    }
}

let countnos1 = 1;

function increment1() {
    countnos1 = countnos1 + 1;
    document.getElementById('countno1').innerHTML = countnos1;
}

function decrement1() {
    if (countnos1 < 1) {
        alert('Sorry..! Quantity cannot be Nill in Cart');
        countnos1 = 1;
    } else {
        document.getElementById('countno1').innerHTML = countnos1;
        countnos1 = countnos1 - 1;
    }
}

let countnos2 = 1;

function increment2() {
    countnos2 = countnos2 + 1;
    document.getElementById('countno2').innerHTML = countnos2;
}

function decrement2() {
    if (countnos2 < 1) {
        alert('Sorry..! Quantity cannot be Nill in Cart');
        countnos2 = 1;
    } else {
        document.getElementById('countno2').innerHTML = countnos2;
        countnos2 = countnos2 - 1;
    }
}

let countnos3 = 1;

function increment3() {
    countnos3 = countnos3 + 1;
    document.getElementById('countno3').innerHTML = countnos3;
}

function decrement3() {
    if (countnos3 < 1) {
        alert('Sorry..! Quantity cannot be Nill in Cart');
        countnos3 = 1;
    } else {
        document.getElementById('countno3').innerHTML = countnos3;
        countnos3 = countnos3 - 1;
    }
}

function checkout() {
    if (confirm('Do you want to Proceed?\nPlease Press OK to Confirm')) {
        window.location.href = "/HTML_CSS/Shopping_Website/checkout.html";
    } else {
        window.location.href = "/HTML_CSS/Shopping_Website/Cart2.html";
        alert('Cancelled...');
    }
}