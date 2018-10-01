package com.passport.venkatgonuguntala.passportapp.util;

import com.passport.venkatgonuguntala.passportapp.model.PersonProfile;

import java.util.Comparator;

/**
 * Created by venkatgonuguntala on 9/20/18.
 */

public class SortByNameAscending implements Comparator<PersonProfile> {
    @Override
    public int compare(PersonProfile o1, PersonProfile o2) {

        if (o1.getName().equals(o2.getName())){
            return 0;
        } if (o1.getName() == null) {
            return -1;
        } if (o2.getName() == null) {
            return 1;
        }
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
