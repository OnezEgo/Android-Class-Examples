package com.example.android.todolist.data;

import android.provider.BaseColumns;

/**
 * Created by Fast_Balls on 7/20/2017.
 */

public class Contract {

    public static class TABLE_TODO implements BaseColumns {
        public static final String TABLE_NAME = "todoitems";

        // was going to use a edit view to edit the done opition but did not get around to it

        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_DUE_DATE = "duedate";
        public static final String COLUMN_NAME_CATEGORY = "category";
        public static final String COLUMN_NAME_DONE = "done";

    }
}