package issues.sort_obj;

public class Obj {
    private int id, parent_id;
    private String title;

    public Obj(int id, String title){
        this.id = id;
        this.title = title;
    }
    public Obj(int id, String title, int parent_id){
        this(id, title);
        this.parent_id = parent_id;
    }

    public Obj() {}

    @Override
    public String toString() {
        return "Obj{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", title='" + title + '\'' +
                '}';
    }
}
