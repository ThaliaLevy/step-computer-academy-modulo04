let nome = prompt("Digite seu nome");

document.writeln(nome);

localStorage.setItem('nome',nome);
//    definaItem ('nomeDoItem',variávelOuConteúdo)

class Pessoa{
    nome;
    idade;
    sexo;
}

function Pessoa2(){
    this.nome;
    this.idade;
    this.sexo;
}

let p1 = new Pessoa();
let p2 = new Pessoa2();

p1.nome = "Juca Bala";
p1.idade = 30;
p1.sexo = "Masculino";

p2.nome = "Bela Bala";
p2.idade = 20;
p2.sexo = "feminino";

sessionStorage.setItem("pessoa1", JSON.stringify(p1));
sessionStorage.setItem("pessoa2",JSON.stringify(p2));