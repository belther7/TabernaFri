let controller = new ProdutoController();
console.log("Mapeando");
//bind: associa o controller como this. Se nao tiver, ele vai achar que a referencia é o document e não o controller
//Ou seja,quando chamarmos o carregaMotores e este chamar this._service, ele vai pensar que o this é referente ao controller e não ao document.
window.addEventListener('load',controller.carregaProdutos.bind(controller));

//bind: associa o controller como this. Se nao tiver, ele vai achar que a referencia é o document e não o controller
//Ou seja,quando chamarmos o salvar e este chamar this._service, ele vai pensar que o this é referente ao controller e não ao document.
document.querySelector("#formulario")
        .addEventListener('submit',controller.salvar.bind(controller));
document.querySelector("#formularioatualiza")
        .addEventListener('submit',controller.atualizar.bind(controller));











