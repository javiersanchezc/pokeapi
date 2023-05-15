Ejecución
El proyecto ejecutar con IntellijIdea o usar maven para construir el proyecto y generar el jar.

Dentro de la carpeta del proyecto

cd pakeapi-demo
Para construir el proyecto ejecutar

mvn package
Ejecutar aplicación

java -jar target/pokeapi-demo-0.0.1-SNAPSHOT.jar
Para ejecutar una prueba

curl --header "content-type: text/xml" -d @request.xml http://localhost:8080/ws > output.xml
