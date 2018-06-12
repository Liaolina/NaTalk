package net.lln.natalk.common.widget.recycler;


/**
 * Created by Alva on 2018/6/12.
 * 适配器需要实现的功能
 */

public interface AdapterCallback<Data> {
    void update(Data data,RecyclerAdapter.ViewHolder<Data> holder);
}
