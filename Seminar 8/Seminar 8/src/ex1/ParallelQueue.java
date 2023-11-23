package ex1;

import java.util.LinkedList;
import java.util.Queue;

public class ParallelQueue {

    private Queue<Integer> queue;

    public ParallelQueue() {
        this.queue = new LinkedList<>();
    }

    public synchronized boolean isEmpty(){  //synchronized - asteapta pana cand threadul curent si-a terminat sarcina
        return queue.isEmpty();
    }

    public synchronized void enqueue(int element){
        queue.add(element);
        notify();
    }

    public synchronized int dequeue() throws InterruptedException {
        while (queue.isEmpty()){
            wait();
        }
        return queue.poll();
    }
}
