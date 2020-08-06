package ph.mobile.training.mapsAndList;

import java.util.*;

public class DocumentList {
    public static void getDoc(){
        List<String> docID = new ArrayList<>();
        docID.add("BANK_STATEMENT");
        docID.add("BILL_LANDLINE");
        docID.add("BILL_WATER");
        docID.add("DRIVERS_LICENCE");
        docID.add("HEALTH_CARD");
        docID.add("PASSPORT");
        docID.add("POSTAL_ID");
        docID.add("PRC_ID");
        docID.add("TIN_NUMBER");
        docID.add("UNIFIED_ID");

        List<String> docList = new ArrayList<>();
        docList.add("Bank Account Statement");
        docList.add("Phone Bill");
        docList.add("Water Bill");
        docList.add("Driver's Licence ID");
        docList.add("Phil-Health Card");
        docList.add("Passport");
        docList.add("Postal ID (OLD Secondary)");
        docList.add("Professional Regulation (PRC) ID");
        docList.add("Tax Identification Number (TIN)");
        docList.add("Unified Multi-Purpose ID");


        for (int i = 0; i < 10; i++){
            System.out.println(docID.get(i)+ " = "+docList.get(i));
        }

        System.out.print("Enter your Document Identification Code: ");
        Scanner a = new Scanner(System.in);
        String doc = a.nextLine();

        if (doc.equals("TIN_NUMBER")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get(8));
        }
        else if (doc.equals("PASSPORT")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get(5));
        }
        else if (doc.equals("UNIFIED_ID")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get(9));
        }
        else if (doc.equals("DRIVERS_LICENCE")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get(3));
        }
        else if (doc.equals("PRC_ID")){
            System.out.println("ID is eligible for loan application");
            System.out.println("Document Name: "+ docList.get(7));
        }
        else if (doc.equals("BANK_STATEMENT")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get(0));
        }
        else if (doc.equals("HEALTH_CARD")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get(4));
        }
        else if (doc.equals("BILL_LANDLINE")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get(1));
        }
        else if (doc.equals("POSTAL_ID")){
            System.out.println("ID is not eligible for loan application. Please add 1 Primary Id");
            System.out.println("Document Name: "+ docList.get(6));
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
