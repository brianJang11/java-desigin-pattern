package structural.proxy.tests;

import structural.proxy.CommandExecutor;
import structural.proxy.CommandExecutorProxy;

public class TestProxy {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("admin", "wrong_pwd");

        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("whoami");
        } catch (Exception e) {
            System.out.println("Exception Message: " + e.getMessage());
        }
    }
}
