function getCarros(){

    let carros = [

        {
            nome: "Gol",
            marca: "Volkswagen",
            ano: 2019,
            preco: 25000
        },

        {
            nome: "Uno",
            marca: "Fiat",
            ano: 2020,
            preco: 40000
        },

        {
            nome: "Siena",
            marca: "Fiat",
            ano: 2017,
            preco: 30000
        },

        {
            nome: "HB20",
            marca: "Hyundai",
            ano: 2021,
            preco: 90500
        }
    ]

    return new Promise((resolve, reject) => {
        resolve(carros);
        reject(new Error("Não foi possível pegar a lista"));
    })
}

getCarros().then(lista => {

    let texto = "";

    for(i = 0; i < lista.length; i++){
        texto += `<tr> 
                    <td> ${lista[i].nome} </td>
                    <td> ${lista[i].marca} </td>
                    <td> ${lista[i].ano} </td>
                    <td> ${lista[i].preco} </td>
                  </tr>`;
    }

    $("#colunasCarros").html(texto);

})


function getClientes(){

    let clientes = [

        {
            nome: "Caio Araujo",
            cpf: "174.851.637-01",
            email: "caiodaluz@gmail.com",
            estado: "RJ"
        },
        {
            nome: "Carlino Júnior",
            cpf: "251.764.412-01",
            email: "carlinoJunior@gmail.com",
            estado: "RJ"
        },
        {
            nome: "Juca Bala",
            cpf: "141.643.291-02",
            email: "jucabala01@gmail.com",
            estado: "SP"
        },
        {
            nome: "Claudemiro Filho",
            cpf: "912.381.245-01",
            email: "filhoclaudemiro@gmail.com",
            estado: "AM"
        }
        
    ]

    return new Promise((resolve, reject) => {
        resolve(clientes);
        reject(new Error("Não foi possível pegar a lista"));
    })
}

getClientes().then(lista => {

    let texto = "";

    for(i = 0; i < lista.length; i++){
        texto += `<tr> 
                    <td> ${lista[i].nome} </td>
                    <td> ${lista[i].cpf} </td>
                    <td> ${lista[i].email} </td>
                    <td> ${lista[i].estado} </td>
                  </tr>`;
    }

    $("#colunasClientes").html(texto);

})