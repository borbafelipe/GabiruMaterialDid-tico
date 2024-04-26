public class Casa{
    
    //GABIRU SOFTHOUSE BIZÚ DE JAVA
    //NOSFERATU BORBA
    
    
    /* caracteristicas: aqui é onde a gente coloca as caracteristicas, segue o teatro: 
     * vamos ter em mente o seguinte a CLASSE não é um objeto é um blueprint uma planta.
     * veja a imagem [blueprint](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTNFYT7vc1wQVl4yx85yHSTD96Ua5EL3z4l6ybTd6NPYg&s)
     * ou seja é uma abstraçao do que seria uma casa.
     * Assim a Classe nao é o objeto em si, mas um conjunto de instruçoes para a "criaçao" da casa.
     * em POO chamamos essa "criação" de instanciar.
     */
    
    // aqui temos as atributos/ caracteristicas, essas declaradas aqui sao para todas as instancias futuras
    //pensa assim se eu fizer 10 casas ou n casas todas vao ter essas mesmas caracteristicas.
    //essas são inerentes a uma casa.
   
   //(1*)
    String logradouro; 
    int numero;
    int numComodos;

/*
 * aqui aliado, temos o construtor, repara so. o construtor tem o mesmo nome da classe, geralmente é publico.
 * é publico pq imagina que eu quera "construir"/instaniar um objeto da classe casa. essa requisição de instancia
 * essa requisiçao acontece de fora de um objeto, afinal o objeto ainda nao foi instanciado, portanto publico
 */

/*
*CONSTRUTOR, esse aqui recebe tres parametros, e vai fazer a casa com os parametros.
*pega a visao, nesse exemplo aqui eu coloquei os nomes usando a palavra "parametro" nos parametros
*mas com frequencia tu vai ver o mesmo nome duas vezes.
*no proximo construtor eu vou usar o mesmo nome duas vezes, pq o paramentro nao existe dentro do {}
*do construtor.
N
*/
public Casa (String parametroLogradouro, int parametroNumero, int parametroNumComodos){
    //a palavra reservada "this" junto com o "." servem para fazer referencia a os atributos da classe 
    //la encima (1*)
    this.logradouro= parametroLogradouro;
    this.numero = parametroNumero;
    this.numComodos = parametroNumComodos;
    //ou seja o objeto vai ser criado nesse construtor aqui com os valores que voce  passa
    //Casa casa1 = new Casa(rua,3,5); cria um objeto que ja contem esses valores nele

}

/*
 * repara que eu posso ter mais de um construtor por clase, eles so nao podem ser exatamente iguais.
 * o que vai mudar são os parametros que serao passados
 * aqui eu vou fazer usando o mesmo nome no parametro do costrutor e no atributo da classe(1*)
 */

public Casa(String logradouro, int numero){
    this.logradouro= logradouro;
    this.numero= numero;
    // aqui como eu nao tenho o numero de comodos eu vou iniciar essa criaçao aqui com o valor de zero
    this.numero = 0;
}
//pra usar essa daqui seria Casa casa2 = new Casa(rua,2);

//metodos

/*
 * pega a webvisao aqui aliado,
 * esses metodos de set e get servem pra respectivamente atribuir um valor a um atributo do objeto e retornar
 * esse valor. 
 */

 //repara que o set nome parece muito com o constructor, mas tem a palavra void pq nao retorna nada.
 //o uso disso aqui numa main seria carro1.setLogradouro(novo nome da rua);
 //repara que tem a palavra this pq ta fazendo a caracteristica do objeto
private void setLogradouro(String parametroLogradouro){
    this.logradouro = parametroLogradouro;
}

private void setNumero(int parametroNumero){
    this.numero = parametroNumero;
}
//aqui eu usei o mesmo nome pra exemplificar que o this. faz a diferença e que o nome do parametro so existe aqui dentro.
private void setLogradouro(int numComodos){
    this.numComodos = numComodos;
}

//repara que o get tem a palavra String pq esse atributo que vai ser retornado é string
//mesma coisa pra o this aqui
//carro1.getLogradouro();
private String getLogradouro(){
    return this.logradouro;
}
//repara que aqui o retorno nao é mais string e sim int.
private int getNumero(){
    return this.numero;
}
private int getNumComodos(){
    return this.numComodos;
}

}
