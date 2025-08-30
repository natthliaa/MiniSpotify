🎧 MiniSpotify — Sistema de Streaming de Mídias Sonoras

Este projeto simula uma plataforma de streaming de músicas, podcasts e audiobooks, com funcionalidades inspiradas no Spotify. Desenvolvido com foco em Programação Orientada a Objetos (POO), o sistema aplica conceitos como encapsulamento, herança, polimorfismo e tratamento de exceções.

🧠 Objetivo

Criar uma aplicação que permita ao usuário interagir com um catálogo de mídias, criar playlists personalizadas e explorar conteúdos sonoros, tudo por meio de uma interface de menus intuitiva.

🗂️ Estrutura de Menus

🔐 MenuUsuario

Este é o menu inicial, responsável por autenticação e cadastro. Aqui o usuário pode:

Criar uma conta com nome e e-mail

Fazer login em uma conta existente

Encerrar a aplicação

Após o login, o sistema redireciona automaticamente para o MenuStreaming.

🎵 MenuStreaming

Este menu é exibido após o login e oferece todas as funcionalidades do sistema de streaming:

📁 Visualizar catálogo de mídias (músicas, podcasts, audiobooks)

🔍 Buscar mídias por título, artista ou gênero

🎼 Criar, visualizar e editar playlists

➕ Adicionar ou remover mídias das playlists

⏱️ Calcular duração total de uma playlist

🚪 Fazer logout e retornar ao MenuUsuario

🧱 Estrutura do Sistema

Usuário: cadastra-se com nome e e-mail, gerencia suas playlists

Mídia: possui título, artista, duração e gênero; pode ser música, podcast ou audiobook

Playlist: pertence a um único usuário e contém uma lista de mídias

Catálogo: armazena todas as mídias disponíveis e permite buscas

Enum Genero: define os gêneros musicais disponíveis (ROCK, POP, MPB, JAZZ, CLASSICA etc.)

🛠️ Tecnologias e Conceitos

Linguagem: Java (ou outra orientada a objetos)

POO: encapsulamento, herança, polimorfismo

Estruturas de dados: List

Tratamento de exceções

Interface por menus (console)

📌 Requisitos Funcionais

Cadastro e login de usuários

Criação e gerenciamento de playlists

Adição/remoção de mídias

Visualização de catálogo e busca por filtros

Cálculo de duração de play
