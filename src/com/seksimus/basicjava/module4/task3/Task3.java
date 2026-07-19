package com.seksimus.basicjava.module4.task3;

/**
 * Ваша задача - реализовать метод который устанавливает соединение с роботом, отдает ему команду на перемещение в заданную
 * точку и затем закрывает соединение, выполняя при необходимости повтор этой последовательности до трех раз.
 *
 * При этом:
 *
 * 1. Попытка отдать команду роботу считается успешной, если удалось установить соединение и выполнить метод
 * RobotConnection.moveRobotTo() без исключений. Ошибка закрытия соединения не важна и должна игнорироваться.
 * 2. Если первая попытка подключиться и отдать команду оказалась неуспешной, то закрываем соединение и выполняем вторую
 * попытку. Если вторая тоже не удалась, то выполняется третья. После третьей неудачи метод должен бросить исключение
 * RobotConnectionException.
 * 3. Метод отвечает за открытие и закрытие соединения. Если соединение удалось установить, то оно обязательно должно быть
 * закрыто несмотря на возможные исключения, случившиеся в дальнейшем во время работы метода.
 * 4. Если во время работы метода случилось исключение любого типа, отличного от RobotConnectionException, метод должен
 * завершиться и выбросить это исключение, не выполняя повторных попыток пообщаться с роботом. Единственное, что метод
 * должен сделать перед выбросом этого исключения - закрыть открытое соединение RobotConnection.
 */

public class Task3 {

    public static void main(String[] args) {

        RobotConnectionManager manager = new TestRobotConnectionManager();
        moveRobot(manager, 10, 20);
    }

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        for (int i = 1; i <= 3; i++) {


            RobotConnection connection = null;

            try {
                connection = robotConnectionManager.getConnection();

                connection.moveRobotTo(toX, toY);
                return;

            } catch (RobotConnectionException e) {
                if (i == 3) {
                    throw e;
                }

            } finally {

                if (connection != null) {
                    connection.close();
                }
            }
        }
    }
}
