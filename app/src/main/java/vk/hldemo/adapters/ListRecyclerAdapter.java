package vk.hldemo.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import vk.hldemo.R;
import vk.hldemo.helpers.Fonts;

/**
 * Created by root on 14/9/15.
 */
public class ListRecyclerAdapter extends RecyclerView.Adapter<ListRecyclerAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<String> fileList;

    public ListRecyclerAdapter(Context c, ArrayList<String> fileList1) {
        fileList = fileList1;
        mContext = c;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView name;

        public ViewHolder(View v) {
            super(v);
            name = (TextView) v.findViewById(R.id.fileName);
            name.setTypeface(Fonts.get(Fonts.RobotoLight, mContext));
        }
    }

    @Override
    public ListRecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ListRecyclerAdapter.ViewHolder holder, int position) {
        holder.name.setText(fileList.get(position));
    }

    @Override
    public int getItemCount() {
        return fileList.size();
    }
}
