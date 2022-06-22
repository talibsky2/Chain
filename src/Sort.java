abstract class Sort {
    int angle;

    public Sort(int angle) {
        this.angle = angle;
    }
    Sort nextCell;

    public void setNextCell(Sort nextCell) {
        this.nextCell = nextCell;
    }
    public void insertShape (int angles){
        if (angles == angle){
            putIt();
        }
        if (nextCell!=null){
            nextCell.insertShape(angles);
        }
    }
    abstract void putIt ();
}
