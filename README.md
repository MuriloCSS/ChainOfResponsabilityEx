# Exemplo Chain of Responsibility - Sistema de Aprovação de Reembolsos

Este projeto demonstra a implementação do padrão de projeto Chain of Responsibility (Cadeia de Responsabilidade) em Java, aplicado em um sistema de aprovação de reembolsos com diferentes níveis hierárquicos.

📌 Estrutura do Projeto

O sistema é composto por:

   + Handler (Interface): Define os métodos que devem ser implementados pelos manipuladores.

   + BaseHandler (Classe Abstrata): Fornece uma implementação base para o encadeamento de handlers.

   + ConcreteHandlers: Classes específicas que implementam a lógica de aprovação em cada nível.
