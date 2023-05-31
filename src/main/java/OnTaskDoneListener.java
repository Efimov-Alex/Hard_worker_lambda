/*
Функциональный интерфейс OnTaskDoneListener нужен для того, чтобы класс Worker мог вернуть результат своей работы.
 */
@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}