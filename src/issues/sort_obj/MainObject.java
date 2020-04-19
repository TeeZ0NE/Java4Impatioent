package issues.sort_obj;

public class MainObject {
    public int id, parent_id;
    public String title;

    public MainObject(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public MainObject(int id, String title, int parent_id) {
        this(id, title);
        this.parent_id = parent_id;
    }

    public MainObject(MainObject mainObject) {
        this(mainObject.id, mainObject.title, mainObject.parent_id);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", title='" + title + '\'' +
                '}';
    }
}
