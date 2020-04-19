package issues.sort_obj;

import java.util.ArrayList;
import static ch.AssertionCheck.*;

public class SortRomanArray {
    private static ArrayList<MainObject> inputs;
    private static ArrayList<MainObjectExt> outputs;

    public static void main(String[] args) {
        String[][] startData = {
                {"1", "Title 1", "0"},
                {"2", "Title 2", "1"},
                {"3", "Title 3", "2"},
                {"4", "Title 4", "0"}
        };
        inputs = new ArrayList<>();
        outputs = new ArrayList<>();
        fillInputs(startData);
        for (MainObject mainObject : inputs) {
            if (mainObject.parent_id > 0) setChildrenExt(mainObject);
        }
        outputs.removeIf(MainObjectExt -> MainObjectExt.parent_id > 0 && MainObjectExt.emptyChildren());

        assertion(outputs.get(0).children.contains(inputs.get(1)), "Elem one not contains elem 2");
        assertion(!outputs.contains(inputs.get(2)), "Elem 3 still in Collection");

        System.out.println(outputs);
    }

    public static void fillInputs(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            int id = Integer.parseUnsignedInt(data[i][0]);
            int parent_id = Integer.parseUnsignedInt(data[i][2]);
            MainObject mainObject = new MainObject(id, data[i][1], parent_id);
            inputs.add(mainObject);
            outputs.add(new MainObjectExt(mainObject));
        }
    }

    public static void setChildrenExt(MainObject mainObject) {
        for (MainObjectExt mainObjectExt : outputs) {
            if (mainObjectExt.id == mainObject.parent_id)
                mainObjectExt.setChildren(mainObject);

        }
    }
}
