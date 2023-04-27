# cities-api

comando que estou utilizando dentro do projeto e alguns problemas que tive 

sudo lsof -i :5432 - para verificar oq está na porta 5432 que é onde roda o docker do postgres - usei esse comando pois quando fui rodar o docker run com o container do postgres deu erro ai tive que usar o comando abaixo para matar o processo do postgres rodando local 
sudo kill < PID > PID é o numero do processo que o linux utiliza ao dar sudo kill voce mata o processo 

docker run --name cities-db -d -p 5432:5432 -e POSTGRES_USER=postgres_user_city -e POSTGRES_PASSWORD=super_password -e POSTGRES_DB=cities postgres

banco de dados : 
\d - para rodar quais são os itens da tabela e os tipos 
select * from pais - mostra na tela todos os itens que estão na tabela pais
