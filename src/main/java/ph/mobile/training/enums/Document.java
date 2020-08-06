package ph.mobile.training.enums;

import java.util.Scanner;

public class Document {
    public static void main(String[] args) {
        listDoc();
        chooseDoc();

    }

    public static void listDoc(){
        DocList[] docList = DocList.values();
        for (DocList value : docList){
            System.out.println(value.getDoc() +" = "+ value);
        }
    }


    public static void chooseDoc(){

        System.out.print("Enter your Document Identification Code: ");
        Scanner a = new Scanner(System.in);
        DocList docList = DocList.valueOf(a.nextLine());
        switch (docList){
            case TIN_NUMBER:
            case PASSPORT:
            case UNIFIED_ID:
            case PRC_ID:
            case DRIVERS_LICENCE:
            case POSTAL_ID:
            case BILL_WATER:
            case HEALTH_CARD:
            case BILL_LANDLINE:
            case BANK_STATEMENT:
                System.out.println(docList.verifyDoc());
                System.out.println("Document Name: "+docList.getDoc());
                break;

        }

    }

}
