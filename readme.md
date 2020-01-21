# Social Networking System
Publisher Subscriber model demostrate social networking between news Author and Subscribers.

* In the System Broker class is SocialNetworkingSystem
* Brokers handles communication between publisher and subscriber.
* To create a new publisher object.
```
IPublisher author = new Author(“Name”);
```
* To create a new subscriber object.
```
ISubscriber member = new Member(“Name”);
```
* To publish an announcement first create a list of keywords.
```
List<String> keywords = new ArrayList<String>();
To add new keyword: keywords.add(“ASU”);
```
* To publish an announcement.
```
author.publish(“Text message”, keywords);
```
* To subscribe a member to a keyword.
```
member.subscribe(“keyword”);
```
* To unsubscribe a member from a keyword.
```
member.unsubscribe(“keyword”);
```
* To fetch all the announcements received by subscribers.
```
member.get_log_entries();
```