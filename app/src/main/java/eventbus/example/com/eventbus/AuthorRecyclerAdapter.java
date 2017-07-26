package eventbus.example.com.eventbus;

import android.support.v4.view.LayoutInflaterFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by wyp on 2017/7/26.
 */

public class AuthorRecyclerAdapter extends RecyclerView.Adapter<AuthorRecyclerAdapter.ViewHolder> {


    public String[] datas = null;

    public AuthorRecyclerAdapter(String[] datas){
        this.datas  = datas;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item , parent,false);
        ViewHolder viewholder= new ViewHolder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.mtextview.setText(datas[position]);
    }

    @Override
    public int getItemCount() {
        return datas.length;
    }

    public static class ViewHolder extends  RecyclerView.ViewHolder{
        public TextView mtextview;
        public ViewHolder(View viewhodler){
            super(viewhodler);
            mtextview = (TextView) viewhodler.findViewById(R.id.textView);
        }
    }
}
