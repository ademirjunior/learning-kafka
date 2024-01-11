# learning-kafka
Brief study about apache kafka

Setup the files:
create data folder in the root level of the kafka folder
server.properties - change log.dirs=/data/kafka
zookeeper.properties - dataDir=/data/zookeeper

Se receber o comando de linja longa
Go to: kafka-run-class.bat
search for: rem Classpath addition for release

Commands :
Run these commands  from root folder .
Run zookeeper:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Se receber o comando de linja longa
Go to: kafka-run-class.bat
search for: rem Classpath addition for release
Replace the for with the line above:
call :concat "%BASE_DIR%\libs\*;"

Run Kafka server
.\bin\windows\kafka-server-start.bat .\config\server.properties

Create a topic:
.\bin\windows\kafka-topics.bat --create --topic quickstart-events --bootstrap-server localhost:9092

Run Producer:
.\bin\windows\kafka-console-producer.bat --topic quickstart-events --bootstrap-server localhost:9092

Run Consumer:
.\bin\windows\kafka-console-consumer.bat --topic quickstart-events --from-beginning --bootstrap-server localhost:9092

Check all topis:
.\bin\windows\kafka-topics.bat --bootstrap-server=localhost:9092 --list
.\bin\windows\kafka-topics.bat --zookeeper localhost:2181 --list
