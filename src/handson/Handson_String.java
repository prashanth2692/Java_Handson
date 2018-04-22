package handson;

import java.lang.String; //immutable
import java.lang.StringBuilder; //mutable


// THe reason why Java String objects are immutable is, as per observation String literals are repeatedly used
// Strings will be maintained in separate memory by JVM called "String constant pool"
// When ever new String object is required, string value is looked up on the pool
// If the value exists, the existing object is returned instead of creating new one.

// For the use of extensive string manipulation, we need to use StringBuilder which allows mutation.

public class Handson_String {
    String str1 = "123"; // String in java are not mutable
    String str2; // str3 also points to the same object created by above statement
    StringBuilder strb1;

    public void main() {

    }


    Handson_String() {
        str2 = str1;
        str1.concat("456"); // new String object with value "456" will be created and is used to concat to value of str1
        // the new object created will be instantly lost
        System.out.println("before " + str1);
        str1 = str1 + "789";

        System.out.println("after " + str1);

        strb1 = new StringBuilder("abc");
        strb1.append("def");
        System.out.println(strb1);

    }


}
