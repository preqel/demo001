package eventbus.example.com.eventbus;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

/**
 * Created by wyp on 2017/7/26.
 */

public class RecycleViewActivity extends Activity{


    private RecyclerView recyeview;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String[] datas = new String[]{"123dsd","dfsdfs","sdfdsf"};
        setContentView(R.layout.activity_recycle);
        this.recyeview = (RecyclerView) findViewById(R.id.recycleview);
        recyeview.setAdapter(new AuthorRecyclerAdapter(datas));
        LinearLayoutManager linearlayoutmanger = new LinearLayoutManager(this);
        recyeview.setLayoutManager(linearlayoutmanger);
        recyeview.addItemDecoration(new ItemDivider().setDividerColor(Color.BLUE).setDividerWith(2));


    }
}
