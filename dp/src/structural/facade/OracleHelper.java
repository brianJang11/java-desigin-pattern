package structural.facade;

import java.sql.Connection;

public class OracleHelper {
    public static Connection getDBConnection() {
        return null;
    }

    public void generateHtmlReport(String tableName, Connection con) {
        System.out.println("Oracle-html-report is crated");
    }

    public void generatePDFReport(String tableName, Connection con) {
        System.out.println("Oracle-pdf-report is crated");
    }
}
