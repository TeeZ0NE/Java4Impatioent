package issues.sort_obj;

import java.util.ArrayList;
import java.util.Collection;

public class ObjExt extends Obj {
    public ArrayList<Obj> children;
    public ObjExt(Obj obj){
        super(obj);
        this.children = new ArrayList<>();
    }

    public void setChildren(Obj children) {
        this.children.add(children);
    }

    @Override
    public String toString() {
        return "ObjExt{" +
                "id=" + id +
                ", parent_id=" + parent_id +
                ", title='" + title + '\'' +
                "children=" + children +
                '}';
    }
}
