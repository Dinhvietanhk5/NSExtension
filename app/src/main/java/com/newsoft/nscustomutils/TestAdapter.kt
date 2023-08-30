package com.newsoft.nscustomutils

import android.annotation.SuppressLint
import android.util.Log
import android.view.*
import androidx.recyclerview.widget.RecyclerView
import com.newsoft.nsbaseadapter.adapter.BaseAdapter
import com.newsoft.nscustomutils.databinding.ItemViewEmptyBinding

class TestAdapter :
    BaseAdapter<String, TestAdapter.ViewHolder>() {


    inner class ViewHolder(view: ItemViewEmptyBinding) : RecyclerView.ViewHolder(view.root) {
        var image = view.image
    }

    override fun onCreateHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemViewEmptyBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SetTextI18n")
    override fun onBindView(
        holder: ViewHolder?,
        item: String?,
        position: Int,
        size: Int
    ) {
        Log.e("onBindView", " ")
        holder!!.image
//        holder!!.btnChooseVideo!!.setOnClickListener {
//            positionSelector = position
//            mOnAdapterListener?.onItemClick(0, item, position)
//            notifyDataSetChanged()
//        }
//        holder!!.tvTitle.text = "test $position"
//        holder.btnChooseVideo.setBackgroundColor(
//            ContextCompat.getColor(
//                requireContextAdapter(),
//                if (positionSelector == position) R.color.colorPrimary
//                else R.color.gray3
//            )
//        )
    }

}