var pessoas = [];

class Pessoa {
    nome;
    email;
    date;
    senha;

    constructor(nome, email, date, senha) {
        this.nome = nome;
        this.email = email;
        this.date = date;
        this.senha = senha;
    }
}

function cadastrar() {
    pessoas.push(new Pessoa(
        document.getElementById("nome").value,
        document.getElementById("email").value,
        document.getElementById("date").value,
        document.getElementById("senha").value)
    );
    let aux = document.getElementById("nome").value;
    sessionStorage.setItem("aux2", aux);

    sessionStorage.setItem("pessoas", JSON.stringify(pessoas));
    console.log(pessoas);
}

function verificarLogin() {
    if (sessionStorage.getItem("aux2") != null) {
        document.getElementById("usuario-logado2").innerHTML = sessionStorage.getItem("aux2");
        document.getElementById("usuario-logado").className = "nav-link none";
        document.getElementById("aux-usuario").className = "dropdown block";
    } else {
        document.getElementById("usuario-logado").innerHTML = "Fazer login";
    }
}

function deslogar() {
    if (sessionStorage.getItem("aux2") != null) {
        sessionStorage.clear();

        document.getElementById("usuario-logado").className = "nav-link block";
        document.getElementById("aux-usuario").className = "dropdown none";
    }
}

function escolherTecido() {
    let aux = document.getElementById("opcaoTecido").value;

    switch (aux) {
        case "Decoração":
            document.getElementById("ajusteOpTecido").className = "form-group block";
            document.getElementById("ajusteOpTecido2").className = "form-group none";
            document.getElementById("ajusteOpTecido1").className = "form-group none";
            break;
        case "Artesanato":
            document.getElementById("ajusteOpTecido1").className = "form-group block";
            document.getElementById("ajusteOpTecido").className = "form-group none";
            document.getElementById("ajusteOpTecido2").className = "form-group none";
            break;
        case "Malha":
            document.getElementById("ajusteOpTecido2").className = "form-group block";
            document.getElementById("ajusteOpTecido").className = "form-group none";
            document.getElementById("ajusteOpTecido1").className = "form-group none";
            break;
    }
}

function calcularPreco() {
    if (document.getElementById("ajusteOpTecido").className == "form-group block") {
        let aux = document.getElementById("opcaoTecido1").value;
        
        console.log(aux);
        switch (aux) {
            case "Tecido Matelado Liso Preto/Cinza 1,00mt de Largura": {
                let qntd = document.getElementById("quantidadeMetros").value;
                var valorFinal = parseFloat(qntd) * 43.90;
                document.getElementById("valorCompra").innerHTML = valorFinal;
                console.log("oiiiiiiiii");
                break;
            }
            case "Jacquard Tema Litúrgico Branco 1,00mt de Largura": {
                let qntd = document.getElementById("quantidadeMetros").value;
                var valorFinal = parseFloat(qntd) * 31.90;
                document.getElementById("valorCompra").innerHTML = valorFinal;
                break;
            }
            case "Tecido Matelado Liso Bege/Rosé 1,00mt de Largura": {
                let qntd = document.getElementById("quantidadeMetros").value;
                var valorFinal = parseFloat(qntd) * 43.90;
                document.getElementById("valorCompra").innerHTML = valorFinal;
                break;
            }
            case "Jacquard Floral Marsala 1,00mt de Largura": {
                let qntd = document.getElementById("quantidadeMetros").value;
                var valorFinal = parseFloat(qntd) * 31.90;
                document.getElementById("valorCompra").innerHTML = valorFinal;
                break;
            }
        }
    } else {
        if (document.getElementById("ajusteOpTecido1").className == "form-group block") {
            let aux = document.getElementById("opcaoTecido2").value;
            switch (aux) {
                case "Atoalhado Microfibra Preto 1,00mt de Largura": {
                    let qntd = document.getElementById("quantidadeMetros").value;
                    var valorFinal = parseFloat(qntd) * 22.90;
                    document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                    break;
                }
                case "Atoalhado Microfibra Laranja 1,00mt de Largura": {
                    let qntd = document.getElementById("quantidadeMetros").value;
                    var valorFinal = parseFloat(qntd) * 22.90;
                    document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                    break;
                }
                case "Tricoline Estampado Xadrez 1,00mt de Largura": {
                    let qntd = document.getElementById("quantidadeMetros").value;
                    var valorFinal = parseFloat(qntd) * 24.90;
                    document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                    break;
                }
                case "Tricoline Estampado 1,00mt Doces & Cupcakes": {
                    let qntd = document.getElementById("quantidadeMetros").value;
                    var valorFinal = parseFloat(qntd) * 19.00;
                    document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                    break;
                }
            }
        } else {
            if (document.getElementById("ajusteOpTecido2").className == "form-group block") {
                let aux = document.getElementById("opcaoTecido3").value;
                switch (aux) {
                    case "Malha Canelada Estampada 1,00mt de Largura": {
                        let qntd = document.getElementById("quantidadeMetros").value;
                        var valorFinal = parseFloat(qntd) * 28.90;
                        document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                        break;
                    }
                    case "Malha Canelada Floral 1,00mt de Largura": {
                        let qntd = document.getElementById("quantidadeMetros").value;
                        var valorFinal = parseFloat(qntd) * 28.90;
                        document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                        break;
                    }
                    case "Malha Canelada Listrada Lurex 1,00mt de Largura": {
                        let qntd = document.getElementById("quantidadeMetros").value;
                        var valorFinal = parseFloat(qntd) * 25.90;
                        document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                        break;
                    }
                    case "Malha Canelada Cor Verde Lima 1,00mt de Largura": {
                        let qntd = document.getElementById("quantidadeMetros").value;
                        var valorFinal = parseFloat(qntd) * 27.90;
                        document.getElementById("valorCompra").innerHTML = valorFinal.toFixed(2);
                        break;
                    }
                }
            }
        }
    }













    /*   let aux = document.getElementById("opcaoTecido1").value;
       let aux1 = document.getElementById("opcaoTecido2").value;
       let aux2 = document.getElementById("opcaoTecido3").value;
       console.log(aux)
       switch (aux) {
           case "Tecido Matelado Liso Preto/Cinza 2,40mt de Largura":
               let valorFinal = (document.getElementById("quantidadeMetros").value);
          //     console.log(valorFinal)
        //       let valorFinal = (document.getElementById("quantidadeMetros").value)*(43,90);
               document.getElementById("valorCompra").innerHTML = valorFinal;
               break;
           case "Jacquard Tema Litúrgico Branco 2,80mt de Largura":
               break;
           case "Tecido Matelado Liso Bege/Rosé 2,40mt de Largura":
               break;
           case "Jacquard Floral Marsala 2,80mt de Largura":
               break;
       } */
}



/*
function inserirDados(){
   // document.getElementById("dados-usuario").innerHTML = sessionStorage.getItem("aux2");
    console.log(sessionStorage.getItem("aux2"))
}


function alterarClasses(){

    if(auxClasses == 0){
        document.getElementById("usuario-logado").className = "nav-link none";
    document.getElementById("aux-usuario").className = "dropdown block";
    }else{
        console.log("e ai");
    }

}

//mexer aqui amanha
function inserirDados() {
    if (sessionStorage.getItem("pessoas") != null) {
        pessoas = JSON.parse(sessionStorage.getItem("pessoas"));
        console.log(pessoas);

     //   let texto = "";

     //   for (let i = 0; i < pessoas.length; i++) {
     //       texto += "Nome: " + pessoas[i].nome + "<br>" +
    //            "E-mail: " + pessoas[i].idade + "<br>" +
    //            "Data nascimento: " + pessoas[i].sexo + "<br><hr>";
     //   }

   //     document.getElementById("dados-usuario").innerHTML = texto;
   }

}    */





