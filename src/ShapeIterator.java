public class ShapeIterator implements Iterator{
    Size_Shapes[] type2;
    int Count = 0;

    public ShapeIterator(Size_Shapes[] type2) {
        this.type2 = type2;
    }

    //Overriding Iterator Interface Methods;
    @Override
    public boolean hasNext() {
        return Count < type2.length &&
                type2[Count] != null;
    }

    @Override
    public Object nextElement() {
        Size_Shapes s_s1 =  type2[Count];
        Count += 1;
        return s_s1;
    }
}
