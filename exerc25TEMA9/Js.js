//=============================================
/*
SINTAXE

 new Promise ((resolve: Function, reject:Function) => void);
    resolve -> função caso retorne a promisse
    reject -> função caso dê erro no retonor
 */

var contador = (duration) => {
    return new Promise((resolve, reject) => {
        setTimeout(resolve, duration);
    })
}

contador(3000).then(function() {
    console.log("3 segundos se passaram.")
})

///Exemplo de Promise não cumprida

function getAll() {
    return new Promise((resolve, reject) => {
        resolve([1, 2, 3, 4]);
        reject(new Error("Não encontrado usuários"));
    })
}

//getAll().catch(err => console.log(err)) //causa erro na promessa do getAll

function getById(id) {
    return new Promise((resolve, reject) => {
        resolve({ id, nome: "Juca Bala" })
    })
}


getAll().then(identidade => { // identidade é o resultado do getAll
    console.log("O id tem o valor: " + identidade);
    identidade.forEach(element => {
        console.log("Valor do element à cada volta: " + element);
    });
    getById(identidade[1]).then(usuarioAchado => { console.log(usuarioAchado) });
}); //usuarioAchado é o resultado do getById

/////////////////////////////////////////////////////////////
// function getAllSemPromise(){
//     return ([1,2,3,4]);
// }

// function getByIdSemPromise(id){
//     return ({id, nome: "Juca Bala"})
// }


// let ids = getAllSemPromise();
// let usuario = getByIdSemPromise(ids);

// console.log(usuario);

////////Melhorando o quadro acima

function getAll2() {
    return new Promise((resolve, reject) => {
        resolve([
            { id: 1, nome: "Juca Bala" },
            { id: 2, nome: "Bela Bala" },
            { id: 3, nome: "Tião Bala" },
            { id: 4, nome: "Ana Bala" },
            { id: 5, nome: "Zeca Bala" }
        ]);
        reject(new Error("Não encontrado usuários"));
    })
}


function getById2(id, lista) {
    let user = ""
    lista.forEach(usuario => {
        if (usuario.id == id) {
            user = usuario;
        }
    });
    return new Promise((resolve, reject) => {
        resolve(user)
    })
}

getAll2()
    .then(result => {
        getById2(2, result).then(usr => console.log(usr));
    })