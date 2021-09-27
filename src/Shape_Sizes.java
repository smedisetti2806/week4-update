public  class Shape_Sizes implements Iterator_Call {
    int count = 0;
    final int item = 6;
    Size_Shapes[] types;

    public Shape_Sizes() {
        types= new Size_Shapes[item];
        addProperties("Single Face Board");
        addProperties("Single Wall Board");
        addProperties("Double Wall Board");
        addProperties("Triple Wall Board");
        addProperties("A Flute Cardboard");
        addProperties("B Flute Cardboard");
    }

    public void addProperties(String sizeShapes) {
        Size_Shapes s_s = new Size_Shapes(sizeShapes);
        if (count >= item){
            System.out.println("Now Factory Load is Full, no More Inventory Needed");
        }

        else {
            types[count] =  s_s;
            count++;
        }
    }

    public Iterator createIterator() {
        return new ShapeIterator(types);
    }

    @Override
    public Iterator getIterator() {
        return null;
    }
}

