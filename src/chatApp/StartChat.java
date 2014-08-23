package chatApp;

import chatApp.client.Client;
import chatApp.server.Server;

import java.util.Scanner;

/**
 * Стартовая точка программы. Содержит единственный метод main
 */
public class StartChat {

    /**
     * Спрашивает пользователя о режиме работы (сервер или клиент) и передаёт
     * управление соответствующему классу
     *
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Load application as server or client? S / C)");
        try {
            char answer = Character.toLowerCase(in.nextLine().charAt(0));
            if (answer == 's') {
                new Server();

            } else if (answer == 'c') {
                new Client();
            } else {
                System.out.println("Wrong app specification. Try again.");
            }
        } catch (Exception e){
            System.out.println("Error");
        } finally {
            System.out.println("Switching off application");
        }
    }
}
