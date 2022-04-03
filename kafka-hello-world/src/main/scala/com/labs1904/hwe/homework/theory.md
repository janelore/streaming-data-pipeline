# Overview

Kafka has many moving pieces, but also has a ton of helpful resources to learn available online. In this homework, your
challenge is to write answers that make sense to you, and most importantly, **in your own words!**
Two of the best skills you can get from this class are to find answers to your questions using any means possible, and to
reword confusing descriptions in a way that makes sense to you. 

### Tips
* You don't need to write novels, just write enough that you feel like you've fully answered the question
* Use the helpful resources that we post next to the questions as a starting point, but carve your own path by searching on Google, YouTube, books in a library, etc to get answers!
* We're here if you need us. Reach out anytime if you want to ask deeper questions about a topic 
* This file is a markdown file. We don't expect you to do any fancy markdown, but you're welcome to format however you like

### Your Challenge
1. Create a new branch for your answers 
2. Complete all of the questions below by writing your answers under each question
3. Commit your changes and push to your forked repository

## Questions
#### What problem does Kafka help solve? Use a specific use case in your answer 
* Helpful resource: [Confluent Motivations and Use Cases](https://youtu.be/BsojaA1XnpM)
Various industries use Kafka to store events in real time and for an extended period of time.
Event data is stored in a scalable way. Examples include real-time fraud detection on a credit card
or bank account. Real-time e-Commerce uses Kafka to gain knowledge of the customer base.
Devices in healthcare send real-time patient data to benefit patient outcomes. 
#### What is Kafka?
* Helpful resource: [Kafka in 6 minutes](https://youtu.be/Ch5VhJzaoaI) 
Kafka is a messaging system.
#### Describe each of the following with an example of how they all fit together: 
 * Topic - the unit of event organization
 * Producer - reads updates and writes them in a queue
 * Consumer - consume updates and display them on various channels i.e. mobile devices and computers
    each one reads different records
 * Broker - each server holding 1 or more partitions
 * Partition - this is how a Topic is broken down -each queue, each item in a partition is called a record 

#### Describe Kafka Producers and Consumers
A consumer reads the messages from a Topic.
#### How are consumers and consumer groups different in Kafka? 
* Helpful resource: [Consumers](https://youtu.be/lAdG16KaHLs)
* Helpful resource: [Confluent Consumer Overview](https://youtu.be/Z9g4jMQwog0)

#### How are Kafka offsets different than partitions? 

#### How is data assigned to a specific partition in Kafka? 
A partition must have data assigned via a key:value pair. If a key is not assigned, the data will be assigned to each partition evenly in a 
round-robin style.
#### Describe immutability - Is data on a Kafka topic immutable? 
Once an event happens, it can not un-happen.
#### How is data replicated across brokers in kafka? If you have a replication factor of 3 and 3 brokers, explain how data is spread across brokers
* Helpful resource [Brokers and Replication factors](https://youtu.be/ZOU7PJWZU9w)

#### What was the most fascinating aspect of Kafka to you while learning? 
As a former healthcare worker, I thought the idea of data collection from monitors in hospitals to save lives is really interesting. I thought of the telemetry monitors
we would place on patients to collect heart rhythm data at a central location. 