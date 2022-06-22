public class Test {
    public static void main(String[] args) {
        Sort sort = new TriangleCell(Angles.triangle);
        Sort sort2 = new SquareCell(Angles.square);
        Sort sort3 = new PentagonCell(Angles.pentagon);
        sort.setNextCell(sort2);
        sort2.setNextCell(sort3);

        sort.insertShape(Angles.triangle);
        sort2.insertShape(Angles.pentagon);
        sort3.insertShape(Angles.pentagon);
    }
}