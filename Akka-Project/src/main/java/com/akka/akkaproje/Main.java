package com.mycompany.akkaproje;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

public class Main {
    public static void main(String[] args) {

        ActorSystem actorSystem = ActorSystem.create("actor-system");
        ActorRef messageActor = actorSystem.actorOf(Props.create(MessageActor.class), "messageActor");

        messageActor.tell("Hello", ActorRef.noSender());
        messageActor.tell("World", ActorRef.noSender());
        messageActor.tell("isubu", ActorRef.noSender());
        messageActor.tell(2, ActorRef.noSender());
        messageActor.tell(5, ActorRef.noSender());
        actorSystem.terminate();
    }
}
