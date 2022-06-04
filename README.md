# spring-boot-kafka-producer-consumer
A Code setup and tutorial for integrating Kafka into springboot application and using application as both Consumer and Producer based on the requirement


	#These command are for docker if you are using kafka docker images
		docker exec -it broker /bin/sh
 
		kafka-topics --create --topic test-topic --bootstrap-server localhost:9092
		kafka-topics --list --bootstrap-server localhost:9092
 
 
 
 
	#For windows  OS
 
 

 
		 Commands to run zookeeper server
		 bin\windows\zookeeper-server-start.bat config\zookeeper.properties
		 
		 Commands to run kafka server
		 bin\windows\kafka-server-start.bat config\server.properties
		 
		 Creating a new Kafka Topics
		 bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic test_1
		 
		 Listing all avilable Kafka topics 
		 bin\windows\kafka-topics.bat --list --zookeeper localhost:2181
		 
		 #Note: Make sure you are inside bin\windows
		 
		 Opening kafka consumer console for straming topic data from producer
		 kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning
		 
		 Opening kafka producer console for producing(input) data to consumer
		 kafka-console-producer.bat --broker-list localhost:9092 --topic Kafka_Example
 
 
 
 
	#Swagger-UI link for endpoints
		=> http://localhost:8080/swagger-ui.html
