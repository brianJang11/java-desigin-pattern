package structural.facade;

import java.sql.Connection;

public class MySqlHelper {
    public static Connection getDBConnection() {
        return null;
    }

    public void generateHtmlReport(String tableName, Connection con) {
        System.out.println("MySql-html-report is crated");
    }

    public void generatePDFReport(String tableName, Connection con) {
        System.out.println("MySql-pdf-report is crated");
    }
}
