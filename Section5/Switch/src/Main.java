public class Main {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
                break;
        }

        char charValue = 'd';

        switch (charValue) {
            case 'a':
                System.out.println("Value was a");
                break;
            case 'b':
                System.out.println("Value was b");
                break;
            case 'c':
                System.out.println("Value was c");
                break;
            case 'd':
                System.out.println("Value was d");
                break;
            case 'e':
                System.out.println("Value was e");
                break;
            default:
                System.out.println("Could not find any letter");
                break;
        }

        String month = "JanUAry";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not Shure");
        }
    }
}