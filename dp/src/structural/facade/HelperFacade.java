package structural.facade;

import java.sql.Connection;

public class HelperFacade {

    public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
        Connection con = null;

        switch (dbType) {
            case MYSQL:
                con = MySqlHelper.getDBConnection();
                MySqlHelper mySqlHelper = new MySqlHelper();

                switch (reportType) {
                    case HTML:
                        mySqlHelper.generateHtmlReport(tableName, con);
                        break;
                    case PDF:
                        mySqlHelper.generatePDFReport(tableName, con);
                        break;
                }
                break;
            case ORACLE:
                con = OracleHelper.getDBConnection();
                OracleHelper oracleHelper = new OracleHelper();

                switch (reportType) {
                    case HTML:
                        oracleHelper.generateHtmlReport(tableName, con);
                        break;

                    case PDF:
                        oracleHelper.generatePDFReport(tableName, con);
                        break;
                }
                break;

        }
    }
    public static enum ReportTypes {
        HTML, PDF
    }

    public static enum DBTypes {
        MYSQL, ORACLE;
    }
}
