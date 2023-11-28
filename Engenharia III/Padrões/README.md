# Padrões de Projeto:

- São soluções típicas para problemas comuns em projeto de software. Cada padrão é como uma planta de construção que você pode customizar para resolver um problema de projeto particular em seu código.


# 

### Strategy: 

> Definido como encapsulamento de uma familia de algoritmos e tornar intercambiável através de polimorfismo. E é usado no JAVA para resolver problemas na Herança que duplica código


### Observer: 

> Definido como Alto acoplamento. O mesmo vai permitir definir um mecanismo de assinatura para notificar varios objetos sobre os eventos que ocorrem. Sendo assim ele evita o alto acoplamento e torna o codigo mais acoplado evitando que fiquem de certo dificil entendimento. Usado no JAVA 


### Composite: 

> Definido como codigo de grande complexidade, dificil manutenção, usado para implementar uma estrutura de objeto semelhante a uma árvore evitando duplicidade do codigo usando o polimorfismo, e usa recursão, o que é essencial para a estrura em árvore, para separar o problema em partes, e resolve cada parte chamando uma cópia de si mesma.


### Facade: 

> Seria uma unica classe ou objeto que assume diversas responsabilidade. Fornece uma interface simplificada para um conjunto de interfaces mais complexas em um subsistema. Ele atua como uma fachada ou ponto de entrada único para um conjunto de funcionalidades relacionadas, ocultando a complexidade interna do subsistema e tornando mais fácil para os clientes usarem


### Singleton

> Compartilham o mesmo estado do codigo garantindo que uma classe tenha apenas uma instancia e fornece um ponto global de acesso
