<?php
// meu_endpoint.php

// Pega parâmetros da URL via GET
$nome = $_GET['nome'] ?? 'desconhecido';
$email = $_GET['email'] ?? 'desconhecido';

// Monta resposta em JSON
$response = [
    "mensagem" => "Dados recebidos com sucesso via GET!",
    "nome" => $nome,
    "email" => $email
];

// Define que a resposta é JSON
header('Content-Type: application/json');

// Retorna a resposta
echo json_encode($response);
