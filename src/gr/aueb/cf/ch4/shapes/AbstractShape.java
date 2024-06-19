package gr.aueb.cf.ch4.shapes;

public abstract class AbstractShape implements IShape {
    private long id;

    public AbstractShape() {}

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }
}
