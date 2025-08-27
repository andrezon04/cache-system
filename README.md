Instruções:
Crie uma classe Pessoa:

Atributos:
int id
String nome
Int idade
Construtor
Métodos getters e setters
Método toString() para imprimir a pessoa.

Na Main, crie duas listas:

List<Pessoa> banco: representa o banco de dados.
List<Pessoa> cache: representa os dados mais acessados recentemente.

Funcionalidade:
Peça para o usuário digitar um ID de pessoa.
Primeiro verifique se a pessoa já está no cache.
Se estiver, imprima: Pessoa encontrada no cache: ...
Se não estiver, busque no banco:
Se encontrar, adicione ao cache e imprima: Pessoa buscada no banco e adicionada ao cache: ...

Obs:
Crie o banco com pelo menos 5 dados mockados

Desafio 
Se o cache estiver cheio (10 pessoas), remova a pessoa mais antiga antes de adicionar a nova.
