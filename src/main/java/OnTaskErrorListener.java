/*
Функциональный интерфейс OnTaskErrorListener нужен для того, чтобы класс Worker мог вернуть сообщение
о ошибке в результате работы.
 */
@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
