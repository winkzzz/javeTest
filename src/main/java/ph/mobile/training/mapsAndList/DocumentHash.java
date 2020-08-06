package ph.mobile.training.mapsAndList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DocumentHash {

    public static void getDoc(){
        Map <String, String> docList = new HashMap<>();
        docList.put("BANK_STATEMENT","Bank Account Statement");
        docList.put("BILL_LANDLINE","Phone Bill");
        docList.put("BILL_WATER","Water Bill");
        docList.put("DRIVERS_LICENCE","Driver's Licence ID");
        docList.put("HEALTH_CARD","Phil-Health Card");
        docList.put("PASSPORT","Passport");
        docList.put("POSTAL_ID","Postal ID (OLD Secondary)");
        docList.put("PRC_ID","Professional Regulation (PRC) ID");
        docList.put("TIN_NUMBER","Tax Identification Number (TIN)");
        docList.put("UNIFIED_ID","Unified Multi-Purpose ID");


        for(Map.Entry<String, String> entry : docList.entrySet()){
            System.out.println(entry.getKey()+ " = "+entry.getValue());
        }

        System.out.print("Enter your Document Identification Code: ");
        Scanner a = new Scanner(System.in);
        String doc = a.nextLine();

        if (doc.equals("TIN_NUMBER")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get("TIN_NUMBER"));
        }
        else if (doc.equals("PASSPORT")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get("PASSPORT"));
        }
        else if (doc.equals("UNIFIED_ID")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get("UNIFIED_ID"));
        }
        else if (doc.equals("DRIVERS_LICENCE")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get("DRIVERS_LICENCE"));
        }
        else if (doc.equals("PRC_ID")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get("PRC_ID"));
        }
        else if (doc.equals("BANK_STATEMENT")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get("BANK_STATEMENT"));
        }
        else if (doc.equals("HEALTH_CARD")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get("HEALTH_CARD"));
        }
        else if (doc.equals("BILL_LANDLINE")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get("BILL_LANDLINE"));
        }
        else if (doc.equals("POSTAL_ID")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get("POSTAL_ID"));
        }
        else{
            System.out.println("Try Again");
            getDoc();
        }

    }



    public static void main(String[] args) {
        getDoc();
    }

}
