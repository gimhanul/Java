package collection_framework.queue;

import java.util.*;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<Message>();

        messageQueue.offer(new Message("sendMail", "김한울"));
        messageQueue.offer(new Message("sendSMS", "김마늘"));
        messageQueue.offer(new Message("sendKakaoTalk", "김갈릭"));

        while(!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + " 님에게 메일을 보냅ㄴ디ㅏ.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + " 님에게 SMS를 보냅ㄴ디ㅏ.");
                    break;
                case "sendKakaoTalk":
                    System.out.println(message.to + " 님에게 카카오톡을 보냅ㄴ디ㅏ.");
                    break;
            }
        }
    }
}
