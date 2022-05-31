package structural.proxy;

public class CommandExecutorProxy implements CommandExecutor{

    // we want to provide only admin users to have full access of above class,
    // if the user is not admin then only limited commands will be allowed

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String password) {

        if ("admin".equals(user) && "password".equals(password)) {
            isAdmin = true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {

        if (isAdmin) {
            executor.runCommand(cmd);
        } else {
            if (cmd.trim().startsWith("whoami")) {
                throw new Exception("whoami command is not allowed for non-admin users.");
            } else {
                executor.runCommand(cmd);
            }
        }
    }
}
