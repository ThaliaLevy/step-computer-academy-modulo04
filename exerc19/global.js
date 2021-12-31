var pessoas = [];
let indicePessoa;

class Pessoa {
    email;
    senha;

    constructor(email, senha) {
        this.email = email;
        this.senha = senha;
    }
}

$(document).ready(() => {
    if (sessionStorage.getItem("pessoas") == null) {
        $("#email").val("admin");
        $("#password").val(123);
    }
});

$("#cadastrar").click(() => {
    pessoas.push(new Pessoa(
        $("#email-admin").val(),
        $("#password-admin").val())
    );
    sessionStorage.setItem("pessoas", JSON.stringify(pessoas));
});

function deixarInputVisivel() {
    document.getElementById("bloco1").className = "form-group";
    document.getElementById("bloco2").className = "form-group";
    $("#email-editar").val("");
    $("#password-editar").val("");
}

$("#editar").click(() => {
    let aux = document.getElementById("email-admin").value;
    for (let i = 0; i < pessoas.length; i++) {
        if (pessoas[i] != "") {
            if (pessoas[i].email == aux) {
                deixarInputVisivel();
                indicePessoa = i;
                $("#email-admin").val("");
                $("#password-admin").val("");
                break;
            }
        }
    }
    console.log(pessoas);
});

$("#salvarEdicao").click(() => {
    pessoas[indicePessoa].email = $("#email-editar").val();
    pessoas[indicePessoa].senha = $("#password-editar").val();
    console.log(pessoas);
    document.getElementById("bloco1").className = "form-group none";
    document.getElementById("bloco2").className = "form-group none";
});

$("#excluir").click(() => {
    let aux = $("#email-admin").val();
    for (let i = 0; i < pessoas.length; i++) {
        if (pessoas[i] != "") {
            if (pessoas[i].email == aux) {
                pessoas[i] = "";
                $("#email-admin").val("");
                alert("Cadastro excluído!");
                break;
            }
        }
    }
});

$("#guardarPerfil").click(() => {
    let aux = $("#opcPerfil").val();
    sessionStorage.setItem("perfil", aux);
});

function validarConta() {
    let aux = JSON.parse(sessionStorage.getItem("pessoas"));

    if (sessionStorage.getItem("pessoas") != null) {
        for (let i = 0; i < aux.length; i++) {
            if (document.getElementById("email").value == aux[i].email && document.getElementById("password").value == aux[i].senha) {
                return true;
            } else {
                document.getElementById("mensagem-erro").innerHTML = "E-mail ou senha incorretos!"
            }
        }
    } else {
        if (document.getElementById("email").value == "admin") {
            if (document.getElementById("password").value == "123") {
                return true;
            } else {
                document.getElementById("mensagem-erro").innerHTML = "Senha incorreta!"
            }
        } else {
            document.getElementById("mensagem-erro").innerHTML = "E-mail incorreto!"
        }
    }
}

function redirecionar() {
    if (sessionStorage.getItem("perfil") == "Administrador") {
        if (validarConta() == true) {
            window.location.href = "homeAdmin.html";
        }
    } else {
        if (validarConta() == true) {
            window.location.href = "homeUser.html";
        }
    }
}