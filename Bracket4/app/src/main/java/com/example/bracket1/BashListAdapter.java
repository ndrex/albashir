package com.example.bracket1;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class BashListAdapter extends ArrayAdapter<ListItemClass>
{
    Context context;
    List<ListItemClass> Lists = new ArrayList<ListItemClass>();
    int layoutResourceId;

    private Date db_date;
    private Date today;

    public BashListAdapter(Context context, int layoutResourceId,
                           List<ListItemClass> objects) {
        super(context, layoutResourceId, objects);
        this.layoutResourceId = layoutResourceId;
        this.Lists=objects;
        this.context=context;



    }
    /**This method will DEFINe what the view inside the list view will finally look like
     * Here we are going to code that the checkbox state is the status of task and
     * check box text is the task name
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowState = inflater.inflate(R.layout.mainlist, parent, false);

        TextView expense_name=(TextView)rowState.findViewById(R.id.expense_name);
        TextView expenses_id=(TextView)rowState.findViewById(R.id.expenses_id);
        TextView expenses_date=(TextView)rowState.findViewById(R.id.expenses_date);
        TextView expenses=(TextView)rowState.findViewById(R.id.expenses);
        ListItemClass state=Lists.get(position);
        expense_name.setText(state.getExpensesName());
        expenses_date.setText(state.getExpensesDate());
        expenses.setText(String.valueOf(state.getExpenses()));
        expenses_id.setText(String.valueOf(state.getExpensesId()));






        return rowState;
    }
}