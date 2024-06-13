public class TestTaker {
    public static String door(String[] door_fitting, String[] codes) {
        StringBuilder result = new StringBuilder();
        for (String door : door_fitting) {
            String correctDoorCode = "";
            correctDoorCode += String.valueOf(getLowerCaseLettersNumber(door));
            correctDoorCode += String.valueOf(doorContainsRoom(door));
            correctDoorCode += String.valueOf(getDigitsNumber(door));
            result.append(findKey(door, correctDoorCode, codes));
        }
        System.out.println(result);
        return result.toString();
    }

    public static Integer getLowerCaseLettersNumber(String door) {
        int lowerCaseLettersNumber = 0;
        for (int i = 0; i < door.length(); i++) {
            char character = door.charAt(i);
            if (Character.isLowerCase(character)) {
                lowerCaseLettersNumber++;
            }
        }
        return lowerCaseLettersNumber;
    }

    public static Integer doorContainsRoom(String door) {
        int containsRoom = 0;
        String doorLowerCase = door.toLowerCase();
        if (doorLowerCase.contains("room")) {
            containsRoom = 1;
        }
        return containsRoom;
    }

    public static Integer getDigitsNumber(String door) {
        int digitsNumber = 0;
        for (int i = 0; i < door.length(); i++) {
            char character = door.charAt(i);
            if (Character.isDigit(character)) {
                digitsNumber++;
            }
        }
        return digitsNumber;
    }

    public static String findKey(String door, String doorCode, String[] codes) {
        for (String code : codes) {
            if (doorCode.equals(code)) {
                return door + "-" + code + ";";
            }
        }
        return "";
    }
}
