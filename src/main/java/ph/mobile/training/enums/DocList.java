package ph.mobile.training.enums;

public enum DocList {


    TIN_NUMBER("Tax Identification Number (TIN)"){
        public String verifyDoc(){
            return "ID is eligible for loan application";
        }
    },
    PASSPORT("Passport"){
        public String verifyDoc(){
            return "ID is eligible for loan application";
        }
    },
    UNIFIED_ID("Unified Multi-Purpose ID"){
        public String verifyDoc(){
            return "ID is eligible for loan application";
        }
    },
    DRIVERS_LICENCE("Driver's Licence ID"){
        public String verifyDoc(){
            return "ID is eligible for loan application";
        }
    },
    PRC_ID("Professional Regulation (PRC) ID"){
        public String verifyDoc(){
            return "ID is eligible for loan application";
        }
    },
    BANK_STATEMENT("Bank Account Statement"){
        public String verifyDoc(){
            return "ID is not eligible for loan application";
        }
    },
    BILL_WATER("Water Bill"){
        public String verifyDoc(){
            return "ID is not eligible for loan application";
        }
    },
    HEALTH_CARD("Phil-Health Card"){
        public String verifyDoc(){
            return "ID is not eligible for loan application";
        }
    },
    BILL_LANDLINE("Phone Bill"){
        public String verifyDoc(){
            return "ID is not eligible for loan application";
        }
    },
    POSTAL_ID("Postal ID (OLD Secondary)"){
        public String verifyDoc(){
            return "ID is eligible for loan application";
        }
    };

    private String doc;

    DocList(String doc){
        this.doc = doc;
    }

    public String getDoc(){
        return this.doc;
    }
    abstract String verifyDoc();
}

