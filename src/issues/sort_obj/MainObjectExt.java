package issues.sort_obj;

import java.util.ArrayList;

public class MainObjectExt extends MainObject {
    public ArrayList<MainObject> children;

    public MainObjectExt(MainObject mainObject) {
        super(mainObject);
        this.children = new ArrayList<>();
    }

    public void setChildren(MainObject children) {
        this.children.add(children);
    }

    public boolean emptyChildren() {
        return this.children.size() == 0;
    }

    @Override
    public String toString() {
        String parentid = parent_id > 0 ? Integer.toString(parent_id) : "null";
        String ID = Integer.toString(id);
        return "{" +
                "id=" + ID +
                ", parent_id=" + parentid +
                ", title='" + title + '\'' +
                ", children=" + children +
                '}';
    }
}
