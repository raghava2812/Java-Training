let pcount = 0;
let ccount = 0;

function rock() {
    document.getElementById("p-choice").innerHTML = "Rock";
    cplay();
}

function paper() {
    document.getElementById("p-choice").innerHTML = "Paper";
    cplay();
}

function scissor() {
    document.getElementById("p-choice").innerHTML = "Scissors";
    cplay();

}

function cplay() {
    var choice = Math.floor(Math.random() * 3);
    if (choice == 0) {
        document.getElementById("c-choice").innerHTML = "Rock";
    } else if (choice == 1) {
        document.getElementById("c-choice").innerHTML = "Paper";
    } else {
        document.getElementById("c-choice").innerHTML = "Scissors";
    }
    condicheck();
}

function cincrement() {
    ccount = ccount + 1;
    document.getElementById("computerscore").innerHTML = ccount;
}

function pincrement() {
    pcount = pcount + 1;
    document.getElementById("playerscore").innerHTML = pcount;
}

function condicheck() {
    var pinput = document.getElementById("p-choice").textContent;
    var cinput = document.getElementById("c-choice").textContent;

    if ((pinput == "Rock" && cinput == "Rock") || (pinput == "Paper" && cinput == "Paper") || (pinput == "Scissors" && cinput == "Scissors")) {
        document.getElementById("message").innerHTML = "Tie";
        document.getElementById("message").style = "color : black; text-align: center; font-size: 30px;";
    } else if ((pinput == "Scissors" && cinput == "Paper") || (pinput == "Paper" && cinput == "Rock") || (pinput == "Rock" && cinput == "Scissors")) {
        pincrement();
        pmessage();
    } else {
        cincrement();
        cmessage();
    }
}

function pmessage() {
    var pmessage = document.getElementById("message").innerHTML = "You Won";
    document.getElementById("message").style = "color : green; text-align: center; font-size: 30px;";
}

function cmessage() {
    var cmessage = document.getElementById("message").innerHTML = "You Lost";
    document.getElementById("message").style = "color : red; text-align: center; font-size: 30px;";
}

function changebg() {
    document.body.classList.toggle("bgimage1")
    if (document.body.classList.contains("bgimage1")) {
        document.body.classList.toggle("bgimage2");
    }
    if (document.body.classList.contains("bgimage2")) {
        document.body.classList.toggle("bgimage3");
    }
    if (document.body.classList.contains("bgimage3")) {
        document.body.classList.toggle("none");
    }
}

function reset() {
    pcount = 0;
    ccount = 0;
    document.getElementById("computerscore").innerHTML = ccount;
    document.getElementById("playerscore").innerHTML = pcount;
    document.getElementById("p-choice").innerHTML = "Player Choice";
    document.getElementById("message").innerHTML = "-";
    document.getElementById("c-choice").innerHTML = "Computer Choice";
}