window.onload = function(){
    montarCanvas();
    montarOutroCanvas();
    montarCanvasEx();
}

function montarCanvas(){
    canvas = document.getElementById("quadrado");

    ctx = canvas.getContext('2d');
    //capturando o contexto do canvas em 2d para habilitar os comandos de desenhos 2d
    console.log("Montado canvas QUADRADO");

    canvas.addEventListener('click',function(e){
        var rect = this.getBoundingClientRect();

        var coor = {
            x: e.clientX - rect.left,
            y: e.clientY - rect.top
        }

        console.log("COORDS(X:Y): " + coor.x + " : " + coor.y);

        ctx = this.getContext('2d');

        ctx.fillStyle = "yellow";

        ctx.fillRect(coor.x-10,coor.y-10,20,20);
        console.log("Dentro: " + (clickRect(coor.x,coor.y) ? "sim" : "não"))
    });
    
    ctx.fillStyle = "black";
    
    ctx.fillRect(0,0,150,150);
}

function clickRect(x,y){
    var tamanho = [0,0,150,150];
    
    if( x >= tamanho[0] && //onde começa
        x <= tamanho[0] + tamanho[2] && //onde começa + largura
        y >= tamanho[1] && //onde começa
        y <= tamanho[1] + tamanho[3] //onde começa + altura
        ){
            return true;
        }
    
    return false;
}

function montarOutroCanvas(){
    let canvas2 =  document.getElementById("idCanvas2");
    let con = canvas2.getContext("2d");

    con.moveTo(20,20);
    con.lineTo(100,50);
    con.stroke();//stroke faz a linha aparecer

    con.moveTo(120,70);
    con.lineTo(10,100);
    con.stroke();
}
//crie um evento que capture 2 cliques e faça uma linha entre eles

function montarCanvasEx() {
    let canvas = document.getElementById("exercicio");
    let ctx = canvas.getContext("2d");
    var cont = 1;
    var coordX1 = 0;
    var coordY1 = 0;
    var coordX2 = 0;
    var coordY2 = 0;

    canvas.addEventListener("click", function(evento){
        var rect = this.getBoundingClientRect();

        var coordenadas = {
        x: evento.clientX - rect.left,
        y: evento.clientY - rect.top
        }

        if (cont == 1) {
            coordX1 = coordenadas.x;
            coordY1 = coordenadas.y;
            cont++;
        } else {
            coordX2 = coordenadas.x;
            coordY2 = coordenadas.y;
            ctx.moveTo(coordX1, coordY1);
            ctx.lineTo(coordX2, coordY2);
            ctx.stroke();
            cont = 1;
        }
    });
}