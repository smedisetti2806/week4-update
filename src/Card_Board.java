public class Card_Board {
    Shape_Sizes type;

    public Card_Board(Shape_Sizes type) {
        this.type = type;
    }

    public void DisplayShapes_Sizes() {

        Iterator iterator = type.createIterator();
        while (iterator.hasNext()) {
            Size_Shapes type1 = (Size_Shapes)iterator.nextElement();
            System.out.println(
                    "==> " +
                            type1.getS_S()
                            +"\n"
            );
        }
    }
}
