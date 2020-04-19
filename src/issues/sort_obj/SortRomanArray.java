package issues.sort_obj;

import java.util.ArrayList;

public class SortRomanArray {
    private static class ObjExt extends Obj{
        private Obj children;
        private ObjExt(){}
        private ObjExt(Obj children){
            super();
            this.children = children;
        }
    }


    public static void main(String[] args) {
        ArrayList<Obj> inputs = new ArrayList<>();
        Obj first = new Obj(1, "Title 1");
        inputs.add(first);
        Obj second = new Obj(2, "Title 2",1);
        inputs.add(second);
        inputs.add(new Obj(3, "Title 3", 2));
        inputs.add(new Obj(4, "Title 4"));
        ArrayList<ObjExt> output = new ArrayList<>();
        ObjExt dert1 = new ObjExt(first);
        System.out.println(dert1.toString() + "dert");
        for(Obj obj : inputs){
            System.out.println(obj);
        }
//        String[] inputArray =   {
//                {"id": "1", "parent_id": null, title: 'Title 1' }, {.id: 2, parent_id: 1, title: 'Title2' },  {  id: 3, parent_id: 2, title: "Title 3" }, {.id: 4, parent_id: null, title: 'Title 4' }  ]
//        { id: 1, parent_id: null, children: [  {.id: 2, parent_id: 1, title: 'Title2', children: [ {  id: 3, parent_id: 2, title: "Title 3" } ] }  ]  },  {id: 4, parent_id: null, title: 'Title 4' } ]
    }
}
