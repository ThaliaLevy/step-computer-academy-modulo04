class Pessoa{
    nome;
    arrayAssinaturas;

    constructor(nome, arrayAssinaturas){
        this.nome = nome;
        this.arrayAssinaturas = arrayAssinaturas;
    }
}


$("#canvas").ready(()=>{

    // canvas e ctx para o cadastro
    let canvas = $("#canvas")[0];
    let ctx = canvas.getContext("2d");

    // outro canvas e ctx para a procura
    let canvasLeitura = $("#canvasLeitura")[0];
    let ctx2 = canvasLeitura.getContext("2d");

    let desenhando = false;

    let arrayAssinaturas = [];

    let casaArray = 0;

    $("#canvas").mousedown(function(evento) {

        let rect = this.getBoundingClientRect();

        let assinatura = {
            x: evento.clientX - rect.left,
            y: evento.clientY - rect.top,
            desenho: []
        }
        
        ctx.moveTo(assinatura.x, assinatura.y);

        desenhando = true;

        arrayAssinaturas.push(assinatura);
    })

    $("#canvas").mouseup(function() {
        desenhando = false;
        casaArray++;
    })

    $("#canvas").mousemove(function(evento) {

        if (desenhando) {

            let rect = this.getBoundingClientRect();

            let ponto = {
                x: evento.clientX - rect.left,
                y: evento.clientY - rect.top
            }

            ctx.lineTo(ponto.x, ponto.y);
            
            arrayAssinaturas[casaArray].desenho.push(ponto);
            
            ctx.stroke();

            $("#btCadastrar").removeAttr("disabled");
        }
    })


    $("#btLimpar").click(()=>{
        ctx.clearRect(0, 0, canvas.width, canvas.height);
        ctx.beginPath();
        casaArray = 0;
        arrayAssinaturas = [];
        document.formulario.reset();
        $("#btCadastrar").attr('disabled', 'disabled');
    })

    let cadastros = [];

    // cadastra o usuario com o nome e a assinatura
    $("#form").submit((e) => {

        if (localStorage.getItem("cadastros")) {
            cadastros = JSON.parse(localStorage.getItem("cadastros"));
        }

        let isValid = true;

        let nome = $("#nome").val().trim();

        for(i = 0; i < cadastros.length; i++){
            if (nome == cadastros[i].nome) {
                isValid = false;
            }
        }

        if (isValid) {

            let pessoa = new Pessoa(nome, arrayAssinaturas);

            cadastros.push(pessoa);

            localStorage.setItem("cadastros", JSON.stringify(cadastros));

            $("#msgErro").hide()
            $("#msgExito").show();

            setTimeout(() => {
                $("#msgExito").hide();
            }, 3000);

            $("#nome").val("");
            $("#btLimpar").click();

        } else {

            $("#msgExito").hide()
            $("#msgErro").show();

            setTimeout(() => {
                $("#msgErro").hide();
            }, 3000);

            $("#nome").val("");

        }

        e.preventDefault();
        
    })
    ////////////////////////////////////////////////

    // faz a busca pelo nome e passa para o formulario
    $("#btProcurar").click(() => {

        if (localStorage.getItem("cadastros") != null) {

            let cadastros = JSON.parse(localStorage.getItem("cadastros"));

            let nomeProcura = $("#nomeProcura").val().trim();

            let casa;

            for(i = 0; i < cadastros.length; i++){
                if (nomeProcura == cadastros[i].nome) {
                    casa = i;
                    break;
                } else {
                    casa = null;
                }
            }

            if (casa != null) {

                $(".btn-close").click();

                $("#canvas").hide();
                $("#canvasLeitura").show();
                
                for(i = 0; i < cadastros[casa].arrayAssinaturas.length; i++){

                    ctx2.moveTo(
                        cadastros[casa].arrayAssinaturas[i].x,
                        cadastros[casa].arrayAssinaturas[i].y
                    );

                    for(j = 0; j < cadastros[casa].arrayAssinaturas[i].desenho.length; j++){
        
                        ctx2.lineTo(
                            cadastros[casa].arrayAssinaturas[i].desenho[j].x,
                            cadastros[casa].arrayAssinaturas[i].desenho[j].y
                        );
                        ctx2.stroke();  
                    }
                }

                $("#btCadastrar").hide();
                $("#btLimpar").hide();
                $("#btLerCadastrado").hide();
                $("#btVoltar").show();
                $("#nome").val(cadastros[casa].nome);
                $("#nome").attr("disabled", "disabled");
    
            } else {
                $(".btn-close").click();
                $("#msgNaoEncontrado").show();

                setTimeout(() => {
                    $("#msgNaoEncontrado").hide();
                }, 3000);
            }
        } else {
            $(".btn-close").click();
            $("#msgNaoEncontrado").show();

            setTimeout(() => {
                $("#msgNaoEncontrado").hide();
            }, 3000);
        }

    })
    ////////////////////////////////////////////////

    $("#btVoltar").click(()=>{
        $("#canvas").show();
        $("#canvasLeitura").hide();
        $("#btCadastrar").show();
        $("#btLimpar").show();
        $("#btLerCadastrado").show();
        $("#nome").val("");
        $("#nome").removeAttr("disabled");
        $("#btVoltar").hide();
        ctx2.clearRect(0, 0, canvas.width, canvas.height);
        ctx2.beginPath();
    })

    // tratando nome
    $("#nome").change(()=>{

        let nome = $("#nome");

        if (nome.val().trim().length < 4) {

            $("#erroNome").show();
            nome.val("");
        } else {
            let regex = /[0-9]/;
            
            if (regex.test(nome.val().trim())) {
                $("#erroNome").show();
                nome.val("");
            } else {
                $("#erroNome").hide();
            }
        }
    })
    ///////////////////////////

    // vendo se escreveu no input
    $("#nomeProcura").on("input", () => {
        if($("#nomeProcura").val().trim().length > 0){
            $("#btProcurar").removeAttr("disabled");
        } else {
            $("#btProcurar").attr("disabled", "disabled");
        }
    })
    ///////////////////////////

    $(".btn-close").click(()=>{
        $("#nomeProcura").val("");
    })
})


