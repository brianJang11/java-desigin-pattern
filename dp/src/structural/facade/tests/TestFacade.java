package structural.facade.tests;

import structural.facade.HelperFacade;

public class TestFacade {

    public static void main(String[] args) {
        String tableName = "Employee";

        // without using facade
        withoutFacade();

        withFacade(tableName);
    }

    private static void withFacade(String tableName) {
        HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, tableName);
        HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, tableName);
    }

    private static void withoutFacade() {

    }
}
