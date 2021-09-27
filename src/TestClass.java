public class TestClass {
    public static void main(String[] args) {
        // TODO code application logic here

        //Making Object of Shape_Sizes;
        Shape_Sizes types = new Shape_Sizes();
        //Passing Object;
        Card_Board Shape_size = new Card_Board(types);
        //Calling method to Display All Available Shapes And Sizes.
        System.out.println("Shapes And Sizes Of CardBoard");
        System.out.println("\n");
        Shape_size.DisplayShapes_Sizes();
    }
}
