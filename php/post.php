<?php
// meu_endpoint_post.php

// Pega os dados enviados via POST
// Pode ser JSON ou form-data
$contentType = $_SERVER["CONTENT_TYPE"] ?? '';

if (strpos($contentType, "application/json") !== false) {
    // POST com JSON
    $data = json_decode(file_get_contents("php://input"), true);
    $nome = $data['nome'] ?? 'desconhecido';
    $email = $data['email'] ?? 'desconhecido';
} else {
    // POST com form-data ou x-www-form-urlencoded
    $nome = $_POST['nome'] ?? 'desconhecido';
    $email = $_POST['email'] ?? 'desconhecido';
}

// Monta resposta em JSON
$response = [
    "mensagem" => "Dados recebidos com sucesso via POST!",
    "nome" => $nome,
    "email" => $email
];

// Define que a resposta é JSON
header('Content-Type: application/json');

// Retorna a resposta
echo json_encode($response);
