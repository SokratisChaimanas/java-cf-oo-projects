package gr.aueb.cf.ch4.shapes2;

public class AbstractShape implements IShape {
    private long id;

    public AbstractShape() {}

    public AbstractShape(long id) {
        this.id = id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "AbstractShape{" +
                "id=" + id +
                '}';
    }
}
