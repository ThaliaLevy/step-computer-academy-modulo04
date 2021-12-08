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

function loginAdmin() {
    if (sessionStorage.getItem("pessoas") == null) {
        document.getElementById("email").value = "admin";
        document.getElementById("password").value = 123;
    }
}

function cadastrar() {
    pessoas.push(new Pessoa(
        document.getElementById("email-admin").value,
        document.getElementById("password-admin").value)
    );
    sessionStorage.setItem("pessoas", JSON.stringify(pessoas));

    document.getElementById("email-admin").value = "";
    document.getElementById("password-admin").value = "";
    console.log(pessoas);
}

function deixarInputVisivel() {
    document.getElementById("bloco1").className = "form-group";
    document.getElementById("bloco2").className = "form-group";
    document.getElementById("email-editar").value = "";
    document.getElementById("password-editar").value = "";
}

function editar() {
    let aux = document.getElementById("email-admin").value;
    for (let i = 0; i < pessoas.length; i++) {
        if (pessoas[i] != "") {
            if (pessoas[i].email == aux) {
                deixarInputVisivel();
                indicePessoa = i;
                document.getElementById("email-admin").value = "";
                document.getElementById("password-admin").value = "";
                break;
            }
        }
    }
    console.log(pessoas);
}

function salvarEdicao() {
    pessoas[indicePessoa].email = document.getElementById("email-editar").value;
    pessoas[indicePessoa].senha = document.getElementById("password-editar").value;
    console.log(pessoas);
    document.getElementById("bloco1").className = "form-group none";
    document.getElementById("bloco2").className = "form-group none";
}

function excluir() {
    let aux = document.getElementById("email-admin").value;
    for (let i = 0; i < pessoas.length; i++) {
        if (pessoas[i] != "") {
            if (pessoas[i].email == aux) {
                pessoas[i] = "";
                document.getElementById("email-admin").value = "";
                alert("Cadastro excluído!");
                break;
            }
        }
    }
    console.log(pessoas);
}

function guardarPerfil() {
    let aux = document.getElementById("opcPerfil").value;
    sessionStorage.setItem("perfil", aux);
}

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