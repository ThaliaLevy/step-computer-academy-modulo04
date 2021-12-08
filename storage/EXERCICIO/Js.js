let nome = prompt("Digite seu nome");

document.writeln(nome);

localStorage.setItem('nome',nome);
//           definaItem ('nomeDoItem',variávelOuConteúdo)

class Pessoa{
    nome;
    idade;
    sexo;
}


let p1 = new Pessoa();

p1.nome = "Juca Bala";
p1.idade = 30;
p1.sexo = "Masculino";

sessionStorage.setItem("pessoa1", JSON.stringify(p1));
