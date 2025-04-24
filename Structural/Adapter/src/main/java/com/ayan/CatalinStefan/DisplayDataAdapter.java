package com.ayan.catalinStefan;

import java.util.*;

public class DisplayDataAdapter implements DatabaseDataConverter {
    @Override
    public List<DisplayData3rdParty> convertData(List<DatabaseData> data) {
        List<DisplayData3rdParty> returnList = new ArrayList<>();
        for (DatabaseData datum : data) {
            float index = datum.position;
            String position = Integer.toString(datum.amount);
            DisplayData3rdParty dd = new DisplayData3rdParty(index, position);
            returnList.add(dd);
        }
        return returnList;
    }
}
