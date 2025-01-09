class Contatto{
    constructor(nome, numero){
        this.nome = nome;
        this.numero = numero;
    }

    getContatto() {
		return "Nome:   " + this.nome + "<br>Numero:    " + this.numero;
    }

    getNome() {
        return this.nome;
    }
}

let rubrica = [
    new Contatto("Luca", "3242356756"),
    new Contatto("Pietro", "5162846094"),
]
let print = document.getElementById("print");

function visualizza(){
    print.innerHTML = "";
    let num = 0;
    rubrica.forEach(contatto => {
        let p = "<p>Id: " + num + "<br>";
        p += contatto.getContatto()
        p += "</p>";
        print.innerHTML += p;
        num++;
    });
}

function add(){
    let nome = document.getElementById("nome").value;
    document.getElementById("nome").value = "";
    let numero = document.getElementById("numero").value;
    document.getElementById("numero").value = "";
    let c = new Contatto(nome, numero);
    rubrica.push(c);
    visualizza();
}

function elimina(index){
    index = (document.getElementById("index1").value);
    document.getElementById("index1").value = "";
    rubrica.splice(index,1);
    visualizza();
}

function modifica(){
    let index = (document.getElementById("index2").value);
    document.getElementById("index2").value = "";
    elimina(index);
    let nome = document.getElementById("name").value;
    document.getElementById("name").value = "";
    let numero = document.getElementById("number").value;
    document.getElementById("number").value = "";
    let c = new Contatto(nome, numero);
    rubrica.push(c);
    visualizza();
    compari(false);
}

function cerca(){
    let nome = document.getElementById("nome2").value;
    document.getElementById("nome2").value = "";
    let flag = 0;
    let p = "";
    print.innerHTML = "";
    rubrica.forEach(contatto => {
        if(nome==contatto.getNome()){
            flag = 1;
            p = "<p>Il nome è stato trovato<br>"
            p += contatto.getContatto()
            p += "</p>";
        }
    });
    if(flag==1){
        print.innerHTML += p;
    } else{
        let p = "<p>Il nome non è stato trovato</p>";
        print.innerHTML += p;
    }
}

function resetta(){
    print.innerHTML = "";
}

let pupop = true;

function compari(compari){
    compari = document.getElementById("modifica_pupop");
    if(pupop==true){
        compari.style.display = "flex";
        pupop = false;
    } else{
        compari.style.display = "none";
        pupop = true;
    }
}
