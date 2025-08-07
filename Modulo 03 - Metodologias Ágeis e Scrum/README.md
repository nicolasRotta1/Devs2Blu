# Sprint 1 – Planejamento Inicial e Infraestrutura
Data Inicial e Final da Sprint: 05/08/2025 - 11/08/2025  
Período de desenvolvimento: 05/08 a 08/08  
Período de testes: 09/08  
Período de revisão: 10/08  
Período de deploy: 11/08  
O que cada desenvolvedor fez:  
- Dev Adalberto: Configurou o repositório Git, criou estrutura inicial do backend com Express.  
- Dev Matheus: Iniciou o projeto frontend com React, configurou rotas básicas e layout inicial.  
- Dev Nicolas: Escreveu a visão do produto, backlog inicial e documentos de arquitetura.  
Observações: Setup inicial de projeto e arquitetura definida. Todos os ambientes foram sincronizados com sucesso. CI/CD configurado para branches principais.

# Sprint 2 – Cadastro e Login
Data Inicial e Final da Sprint: 12/08/2025 - 18/08/2025  
Período de desenvolvimento: 12/08 a 15/08  
Período de testes: 16/08  
Período de revisão: 17/08  
Período de deploy: 18/08  
O que cada desenvolvedor fez:  
- Dev Adalberto: Implementou autenticação JWT, endpoints de login e registro de usuários.  
- Dev Nicolas: Criou as telas de login e cadastro com validações.  
- Dev Matheus: Testou fluxos de autenticação, documentou requisitos e tokens.  
Observações: — Decidido uso de autenticação JWT em vez de OAuth para simplicidade. Feedback inicial de usuários indicou necessidade de feedback visual nas validações de login.

# Sprint 3 – Gerenciamento de Perfis
Data Inicial e Final da Sprint: 19/08/2025 - 25/08/2025  
Período de desenvolvimento: 19/08 a 22/08  
Período de testes: 23/08  
Período de revisão: 24/08  
Período de deploy: 25/08  
O que cada desenvolvedor fez:  
- Dev Matheus: Criou rotas para editar perfil, salvar dados no banco.  
- Dev Nicolas: Desenvolveu tela de edição/visualização de perfil com upload de imagem.  
- Dev Adalberto: Validou campos de perfil, ajustou a documentação técnica.  
Observações: — Implementação de upload de imagem enfrentou problemas de compatibilidade com navegador. Solucionado com uso de biblioteca de compressão.

# Sprint 4 – Sistema de Amizade/Seguidores - Parte 1
Data Inicial e Final da Sprint: 26/08/2025 - 01/09/2025  
Período de desenvolvimento: 26/08 a 29/08  
Período de testes: 30/08  
Período de revisão: 31/08  
Período de deploy: 01/09  
O que cada desenvolvedor fez:  
- Dev Nicolas: Desenvolveu endpoints para enviar/aceitar/remover amizades.  
- Dev Matheus: Criou interface de solicitação e lista de amigos.  
- Dev Adalberto: Escreveu casos de uso e realizou testes funcionais.  
Observações: — Discussões sobre usar modelo ‘amizade mútua’ versus ‘seguir’. Optado por sistema híbrido com opção de seguir e aceitar pedidos.

# Sprint 5 – Sistema de Amizade/Seguidores - Parte 2
Data Inicial e Final da Sprint: 02/09/2025 - 08/09/2025  
Período de desenvolvimento: 02/09 a 05/09  
Período de testes: 06/09  
Período de revisão: 07/09  
Período de deploy: 08/09  
O que cada desenvolvedor fez:  
- Dev Matheus: Desenvolveu endpoints para enviar/aceitar/remover amizades.  
- Dev Adalberto: Criou interface de solicitação e lista de amigos.  
- Dev Nicolas: Escreveu casos de uso e realizou testes funcionais.  
Observações: — Foram adicionadas sugestões automáticas de amizade com base em interesses, o que demandou ajustes no modelo de dados.

# Sprint 6 – Publicações - Parte 1
Data Inicial e Final da Sprint: 09/09/2025 - 15/09/2025  
Período de desenvolvimento: 09/09 a 12/09  
Período de testes: 13/09  
Período de revisão: 14/09  
Período de deploy: 15/09  
O que cada desenvolvedor fez:  
- Dev Nicolas: Criou modelo de publicação e endpoint para criar posts.  
- Dev Matheus: Tela de nova publicação com entrada de texto e botão de postar.  
- Dev Adalberto: Testes de criação de post e documentação da API.  
Observações: — Estrutura base de posts criada com foco em simplicidade. Decidido postergar suporte a hashtags e menções para sprint futura.

# Sprint 7 – Publicações - Parte 2
Data Inicial e Final da Sprint: 16/09/2025 - 22/09/2025  
Período de desenvolvimento: 16/09 a 19/09  
Período de testes: 20/09  
Período de revisão: 21/09  
Período de deploy: 22/09  
O que cada desenvolvedor fez:  
- Dev Alberto: Adicionou suporte a arquivos (imagem/vídeo) nas publicações.  
- Dev Matheus: Interface de upload e pré-visualização de mídia.  
- Dev Nicolas: Tratou exceções e validou formatos de arquivo.  
Observações: — Integração com serviço de armazenamento externo (ex: Cloudinary) gerou desafios com tokens expostos. Corrigido com variáveis de ambiente.

# Sprint 8 – Feed Inicial
Data Inicial e Final da Sprint: 23/09/2025 - 29/09/2025  
Período de desenvolvimento: 23/09 a 26/09  
Período de testes: 27/09  
Período de revisão: 28/09  
Período de deploy: 29/09  
O que cada desenvolvedor fez:  
- Dev Nicolas: Criou endpoint para recuperar posts dos amigos.  
- Dev Adalberto: Implementou componente de feed e cards de post.  
- Dev Matheus: Realizou testes de performance no carregamento.  
Observações: — Implementado feed com ordenação cronológica. Sugestão futura: adicionar algoritmo de relevância com base em engajamento.

# Sprint 9 – Curtidas e Comentários
Data Inicial e Final da Sprint: 30/09/2025 - 06/10/2025  
Período de desenvolvimento: 30/09 a 03/10  
Período de testes: 04/10  
Período de revisão: 05/10  
Período de deploy: 06/10  
O que cada desenvolvedor fez:  
- Dev Nicolas: Endpoints para curtir e comentar publicações.  
- Dev Adalberto: Botões de curtir e campo de comentário nos posts.  
- Dev Matheus: Testou interações e contabilização de curtidas/comentários.  
Observações: — Curtidas em tempo real foram prototipadas, mas adiadas para sprint 10 por problemas com sincronização entre usuários.

# Sprint 10 – Notificações - Parte 1
Data Inicial e Final da Sprint: 07/10/2025 - 13/10/2025  
Período de desenvolvimento: 07/10 a 10/10  
Período de testes: 11/10  
Período de revisão: 12/10  
Período de deploy: 13/10  
O que cada desenvolvedor fez:  
- Dev Matheus: Implementou lógica de notificações em tempo real (WebSocket).  
- Dev Nicolas: UI para exibir alertas na interface.  
- Dev Adalberto: Validou a estrutura e persistência das notificações.  
Observações: — Sistema de WebSocket implementado com sucesso. Primeiras notificações em tempo real testadas entre usuários.

# Sprint 11 – Notificações - Parte 2
Data Inicial e Final da Sprint: 14/10/2025 - 20/10/2025  
Período de desenvolvimento: 14/10 a 17/10  
Período de testes: 18/10  
Período de revisão: 19/10  
Período de deploy: 20/10  
O que cada desenvolvedor fez:  
- Dev Adalberto: Criou painel de histórico de notificações.  
- Dev Matheus: Estilizou lista de notificações e ações.  
- Dev Nicolas: Testou marcação como lida e casos de erro.  
Observações: Problemas de notificações duplicadas foram identificados e solucionados com ajustes na lógica de eventos e armazenamento. Validação adicional foi sugerida para evitar recorrência.

# Sprint 12 – Chat - Parte 1
Data Inicial e Final da Sprint: 21/10/2025 - 27/10/2025  
Período de desenvolvimento: 21/10 a 24/10  
Período de testes: 25/10  
Período de revisão: 26/10  
Período de deploy: 27/10  
O que cada desenvolvedor fez:  
- Dev Nicolas: Estruturou modelo de mensagens e endpoints de envio.  
- Dev Adalberto: Tela de chat entre dois usuários com design simples.  
- Dev Matheus: Casos de uso documentados e testes de envio.  
Observações: Ocorreram perdas de mensagens devido à ausência de persistência imediata no banco. O uso de WebSocket foi planejado para próxima sprint visando estabilidade.

# Sprint 13 – Chat - Parte 2
Data Inicial e Final da Sprint: 28/10/2025 - 03/11/2025  
Período de desenvolvimento: 28/10 a 31/10  
Período de testes: 01/11  
Período de revisão: 02/11  
Período de deploy: 03/11  
O que cada desenvolvedor fez:  
- Dev Matheus: Integração com WebSocket e banco para mensagens.  
- Dev Nicolas: Atualizações em tempo real na interface do chat.  
- Dev Adalberto: Testou estabilidade da comunicação e falhas de conexão.  
Observações: Integração com WebSocket melhorou a entrega em tempo real. Foram detectadas falhas em conexões instáveis, sinalizando a necessidade de reconexões automáticas futuras.

# Sprint 14 – Busca de Usuários e Hashtags
Data Inicial e Final da Sprint: 04/11/2025 - 10/11/2025  
Período de desenvolvimento: 04/11 a 07/11  
Período de testes: 08/11  
Período de revisão: 09/11  
Período de deploy: 10/11  
O que cada desenvolvedor fez:  
- Dev Adalberto: Criou queries para busca por nome de usuário e hashtags.  
- Dev Matheus: Tela de busca com resultado dinâmico.  
- Dev Nicolas: Validou relevância e desempenho das buscas.  
Observações: Resultados de busca apresentaram boa performance, mas houve feedback sobre sugestões irrelevantes. Algoritmos de relevância serão ajustados em sprints futuras.

# Sprint 15 – Privacidade e Segurança
Data Inicial e Final da Sprint: 11/11/2025 - 17/11/2025  
Período de desenvolvimento: 11/11 a 14/11  
Período de testes: 15/11  
Período de revisão: 16/11  
Período de deploy: 17/11  
O que cada desenvolvedor fez:  
- Dev Matheus: Endpoints para controle de visibilidade de perfil/posts.  
- Dev Nicolas: Interface com opções de privacidade e bloqueio.  
- Dev Adalberto: Testes com contas simuladas e validação de bloqueios.  
Observações: Funcionalidades básicas de privacidade foram bem recebidas. Testes revelaram que usuários bloqueados ainda conseguiam visualizar posts via links diretos; essa falha foi corrigida.

# Sprint 16 – Configurações de Conta
Data Inicial e Final da Sprint: 18/11/2025 - 24/11/2025  
Período de desenvolvimento: 18/11 a 21/11  
Período de testes: 22/11  
Período de revisão: 23/11  
Período de deploy: 24/11  
O que cada desenvolvedor fez:  
- Dev Nicolas: Criou rotas para atualizar senha e deletar conta.  
- Dev Adalberto: Formulários de alteração de dados pessoais.  
- Dev Matheus: Testou segurança das alterações e validações.  
Observações: Alterações sensíveis, como exclusão de conta, passaram por múltiplas validações. Usuários destacaram a importância de confirmações visuais antes de ações críticas.

# Sprint 17 – Otimizações de Front-End
Data Inicial e Final da Sprint: 25/11/2025 - 01/12/2025  
Período de desenvolvimento: 25/11 a 28/11  
Período de testes: 29/11  
Período de revisão: 30/11  
Período de deploy: 01/12  
O que cada desenvolvedor fez:  
- Dev Adalberto: Melhorias em APIs e redução de tempo de resposta.  
- Dev Matheus: Refatoração visual, responsividade e UX.  
- Dev Nicolas: Testes de acessibilidade e relatórios de melhoria.  
Observações: A responsividade foi aprimorada para múltiplos dispositivos. Análises de desempenho mostraram redução significativa no tempo de carregamento inicial.

# Sprint 18 – Testes Automatizados
Data Inicial e Final da Sprint: 02/12/2025 - 08/12/2025  
Período de desenvolvimento: 02/12 a 05/12  
Período de testes: 06/12  
Período de revisão: 07/12  
Período de deploy: 08/12  
O que cada desenvolvedor fez:  
- Dev Matheus: Escreveu testes de integração para backend.  
- Dev Adalberto: Cobertura de testes no frontend com Jest e React Testing Library.  
- Dev Nicolas: Organizou plano de testes e análise de cobertura.  
Observações: Cobertura de testes aumentou de 30% para 78%. Testes automatizados ajudaram a detectar regressões antes do deploy. Integração contínua foi refinada.

# Sprint 19 – Deploy e Monitoramento
Data Inicial e Final da Sprint: 09/12/2025 - 15/12/2025  
Período de desenvolvimento: 09/12 a 12/12  
Período de testes: 13/12  
Período de revisão: 14/12  
Período de deploy: 15/12  
O que cada desenvolvedor fez:  
- Dev Aldalberto: Preparou build final do backend e conectou com banco em produção.  
- Dev Matheus: Deploy do frontend em Vercel, ajustes finais de DNS.  
- Dev Nicolas: Monitoramento com Sentry e ajustes de logs.  
Observações: Pipeline de deploy automatizado foi concluído com sucesso. Monitoramento em tempo real identificou quedas breves de serviço que foram corrigidas rapidamente.

# Sprint 20 – Retrospectiva Geral e Roadmap Futuro
Data Inicial e Final da Sprint: 16/12/2025 - 22/12/2025  
Período de desenvolvimento: 16/12 a 19/12  
Período de testes: 20/12  
Período de revisão: 21/12  
Período de deploy: 22/12  
O que cada desenvolvedor fez:  
- Dev Matheus: Analisou bugs críticos e propôs melhorias técnicas.  
- Dev Nicolas: Coletou feedback visual e sugestões de UI.  
- Dev Adalberto: Preparou relatório final e mapeou próximas features.  
Observações: A equipe superou as metas estabelecidas. Foram mapeadas melhorias técnicas e de usabilidade. Feedback geral foi positivo, com destaque para a estabilidade do sistema.
