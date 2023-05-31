/*
В классе Main происходит определение переменных типа функциональных интерфейсов и вывод работы класса Worker
 */
public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listenerError = System.out::println;
        Worker worker = new Worker(listener, listenerError);
        worker.start();
    }
}
