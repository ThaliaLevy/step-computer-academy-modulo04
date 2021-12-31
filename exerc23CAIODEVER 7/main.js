$("#canvas").ready(()=>{

    let canvas = $("#canvas")[0];
    
    let ctx = canvas.getContext("2d");

    let pontos = 0;

    let intervalo = gerarIntervalo();

    $("#canvas").click(function(evento){

        let rect = this.getBoundingClientRect();
        
        let coord = {
            x: evento.clientX - rect.left,
            y: evento.clientY - rect.top
        }

        ctx = this.getContext("2d");

        let img = new Image();
        img.src = "img/spark.jpeg";

        img.onload = function(){
            ctx.drawImage(img, coord.x - 7,coord.y - 7, 10, 10);
        }

        setTimeout(() => {

            ctx.clearRect(coord.x - 7,coord.y - 7, 10, 10);
            
        }, 500);

        if (coord.x >= lugarX && // onde começa
            coord.x <= lugarX + tamanho && // onde começa + tamanho
            coord.y >= lugarY && // onde começa
            coord.y <= lugarY + tamanho // onde começa + tamanho
            ) {
             
            pontos += 10;
            
            $("#placar").html(`PLACAR: ${pontos} pontos`);

            console.log("Acertou!");

            ctx.clearRect(lugarX, lugarY, tamanho, tamanho); 

            clearInterval(intervalo);

            intervalo = gerarIntervalo();

        } else {
            console.log("Errou!");
        }
    })

    function gerarIntervalo() {

        tamanho = Math.floor((Math.random() * (25 - 10 + 1) + 10));
    
        lugarX = Math.floor((Math.random() * 600));
        
        lugarY = Math.floor((Math.random() * 600));
        
        ctx.fillRect(lugarX, lugarY, tamanho, tamanho);

        return setInterval(function() {

            ctx.clearRect(lugarX, lugarY, tamanho, tamanho); 
    
            tamanho = Math.floor((Math.random() * (25 - 10 + 1) + 10));
    
            lugarX = Math.floor((Math.random() * 600));
        
            lugarY = Math.floor((Math.random() * 600));
            
            ctx.fillRect(lugarX, lugarY, tamanho, tamanho);
            
        }, 3000);
    }
})
