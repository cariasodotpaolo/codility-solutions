package future.skill.shoesizes;

import java.util.ArrayList;
import java.util.List;

public class ShoeSizesAPI {


    private List<ShoeSizesEntity> records;

    public ShoeSizesAPI() {
        populateValues();
    }

    private void populateValues() {

        records = new ArrayList<>();
        records.add(new ShoeSizesEntity(45, "Mich"));
        records.add(new ShoeSizesEntity(41, "Marry"));
        records.add(new ShoeSizesEntity(46, "Mich"));
        records.add(new ShoeSizesEntity(42, "Larry"));
        records.add(new ShoeSizesEntity(44, "Bob"));
        records.add(new ShoeSizesEntity(40, "Neo"));
        //records.add(new ShoeSizesEntity(44, "Bob"));
        records.add(new ShoeSizesEntity(45, "Mich"));

    }

    public int getListLength() {
        return records.size();
    }

    public int getSize(int index) {
        return records.get(index).getSize();
    }

    public String getName(int index) {
        return records.get(index).getName();
    }

}
