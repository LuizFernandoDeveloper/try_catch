# try_catch
 * Solução 1 (muito ruim): logica de validação no programa principal 
      *logica de validação não delegada a reserva
 * Solução2 (ruim): metodo retornando string 

      * A semântica da operação é prejudicada
      * E se a operação tivesse que retornar um string ?
      * Ainda não e possivel tratar exceçoes em construtores
      * Ainda não há auxilio do compilador : o programador deve "lembra" de  verificar se houve erro.
      * A logica fica estruturada em condicionais aninhadas

  * Solução 3( boa ): Tratamento de exceções
///////////////////////////////////////////////////////////////////////////

* Clausula throws: propaga a exceção ao inves de trata-la 
* Clausula throw : lança a exceção / "corta " o método 

* Exxception: compilador obriga a tratar ou propagar 
* RuntimeException: compilador não obriga

* O modedlo de tratamento de exceçôes permite que erros sejam tratados  de forma consistente e flexivel , usando boas praticas 
    * Vantagens :

 
    	* Logica  delegada
	* Construtores podem ter tratamento de exceções
        * Possibilidade de auxilio do compilador (exception)
	* Código mais simple. não há aninhamento de condicionais : a qualquer momento que uma exceção for disparada, a execução é interrompida e cai no bloco catch corrspondente.
	* É possivel captar inclusive outras exceçoes de sistema


