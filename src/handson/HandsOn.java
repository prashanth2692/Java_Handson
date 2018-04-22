package handson;

public class HandsOn {

    public static void main(String[] args) {
        Handson_String h_str = new Handson_String();

        Handson_Array harr1 = new Handson_Array();

        //harr1.printArray({1, 2, 3}); //not allowed, with error, "array initialized not allowed here"
        harr1.printArray(new int[]{1, 2, 3});

        Handson_ArrayList hal1 = new Handson_ArrayList();
    }
}
